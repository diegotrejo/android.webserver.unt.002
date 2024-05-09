B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=9.9
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private webSocket As HttpServer
End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	webSocket.Initialize("webSocket")
End Sub

Sub Service_Start (StartingIntent As Intent)
	Service.StopAutomaticForeground 'Starter service can start in the foreground state in some edge cases.
	webSocket.Start(8080)
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
	webSocket.Stop
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy

End Sub

Private Sub webSocket_HandleRequest (Request As ServletRequest, Response As ServletResponse)
	Dim html As String
	
	Select Request.RequestURI
		Case "/"
			Dim ph As Phone
			
			
			html = File.ReadString( File.DirAssets, "index.html")
			html = html.Replace("{marca}", ph.Manufacturer)
			html = html.Replace("{modelo}", ph.Model)
			html = html.Replace("{cantidadDatos}", 90)
			
			Response.Status = 200
			Response.SendString(html)
			
		Case "/data"
			Dim lista As List
			lista.Initialize
			
			For i = 1 To 5
				Dim registro As Map
				registro.Initialize
			
				registro.Put("id", i)
				registro.Put("zona", i+9)
				registro.Put("tempC", 90)
				registro.Put("lat", 0.89989 * i)
				registro.Put("long", -2.89801923 * i)
			
				lista.Add(registro)
			Next
			
			Dim jsonGenerator As JSONGenerator
			jsonGenerator.Initialize2( lista )
			
			Dim json As String = jsonGenerator.ToPrettyString(5)
			
			Response.Status = 200
			Response.SendString(json)
			
		Case "/otro"
			Response.Status = 501
		
		Case "/secure"
			Dim user As String = Request.GetHeader("user")
			Dim pwd As String = Request.GetHeader("pwd")
			
			If Request.Method <> "POST" Then
				Response.Status = 404
				
			Else if Request.RemoteAddress <> "172.90.80.12" Then
				Response.Status = 410
				
			Else
			
				If user = "yo" And pwd = "1234" Then
					Response.Status = 200
					Response.SendString("acceso permitido, bienvenido !!!")
				Else
					Response.Status = 405
				End If
				
			End If
			
		Case Else			
			Response.Status = 404
			
	End Select
	
End Sub

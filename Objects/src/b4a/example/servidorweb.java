package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class servidorweb extends android.app.Service{
	public static class servidorweb_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (servidorweb) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, servidorweb.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static servidorweb mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return servidorweb.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.example", "b4a.example.servidorweb");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.servidorweb", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, true) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (servidorweb) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			if (ServiceHelper.StarterHelper.runWaitForLayouts() == false) {
                BA.LogInfo("stopping spontaneous created service");
                stopSelf();
            }
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (servidorweb) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (servidorweb) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (servidorweb) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (servidorweb) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.HttpServer _websocket = null;
public b4a.example.main _main = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="servidorweb";
if (Debug.shouldDelegate(processBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return false;
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="servidorweb";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="webSocket.Initialize(\"webSocket\")";
_websocket.Initialize(processBA,"webSocket");
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="servidorweb";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="servidorweb";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="webSocket.Start(8080)";
_websocket.Start((int) (8080));
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
RDebugUtils.currentModule="servidorweb";
if (Debug.shouldDelegate(processBA, "service_taskremoved", false))
	 {return ((String) Debug.delegate(processBA, "service_taskremoved", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Service_TaskRemoved";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="webSocket.Stop";
_websocket.Stop();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="End Sub";
return "";
}
public static String  _websocket_handlerequest(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper _request,anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper _response) throws Exception{
RDebugUtils.currentModule="servidorweb";
if (Debug.shouldDelegate(processBA, "websocket_handlerequest", false))
	 {return ((String) Debug.delegate(processBA, "websocket_handlerequest", new Object[] {_request,_response}));}
String _html = "";
anywheresoftware.b4a.phone.Phone _ph = null;
anywheresoftware.b4a.objects.collections.List _lista = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _registro = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
String _json = "";
String _user = "";
String _pwd = "";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub webSocket_HandleRequest (Request As Se";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim html As String";
_html = "";
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Select Request.RequestURI";
switch (BA.switchObjectToInt(_request.getRequestURI(),"/","/data","/otro","/secure")) {
case 0: {
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Dim ph As Phone";
_ph = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="html = File.ReadString( File.DirAssets, \"index.";
_html = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"index.html");
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="html = html.Replace(\"{marca}\", ph.Manufacturer)";
_html = _html.replace("{marca}",_ph.getManufacturer());
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="html = html.Replace(\"{modelo}\", ph.Model)";
_html = _html.replace("{modelo}",_ph.getModel());
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="html = html.Replace(\"{cantidadDatos}\", 90)";
_html = _html.replace("{cantidadDatos}",BA.NumberToString(90));
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="Response.Status = 200";
_response.setStatus((int) (200));
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="Response.SendString(html)";
_response.SendString(_html);
 break; }
case 1: {
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="lista.Initialize";
_lista.Initialize();
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="For i = 1 To 5";
{
final int step14 = 1;
final int limit14 = (int) (5);
_i = (int) (1) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="Dim registro As Map";
_registro = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="registro.Initialize";
_registro.Initialize();
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="registro.Put(\"id\", i)";
_registro.Put((Object)("id"),(Object)(_i));
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="registro.Put(\"zona\", i+9)";
_registro.Put((Object)("zona"),(Object)(_i+9));
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="registro.Put(\"tempC\", 90)";
_registro.Put((Object)("tempC"),(Object)(90));
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="registro.Put(\"lat\", 0.89989 * i)";
_registro.Put((Object)("lat"),(Object)(0.89989*_i));
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="registro.Put(\"long\", -2.89801923 * i)";
_registro.Put((Object)("long"),(Object)(-2.89801923*_i));
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="lista.Add(registro)";
_lista.Add((Object)(_registro.getObject()));
 }
};
RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="Dim jsonGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=786466;
 //BA.debugLineNum = 786466;BA.debugLine="jsonGenerator.Initialize2( lista )";
_jsongenerator.Initialize2(_lista);
RDebugUtils.currentLine=786468;
 //BA.debugLineNum = 786468;BA.debugLine="Dim json As String = jsonGenerator.ToPrettyStri";
_json = _jsongenerator.ToPrettyString((int) (5));
RDebugUtils.currentLine=786470;
 //BA.debugLineNum = 786470;BA.debugLine="Response.Status = 200";
_response.setStatus((int) (200));
RDebugUtils.currentLine=786471;
 //BA.debugLineNum = 786471;BA.debugLine="Response.SendString(json)";
_response.SendString(_json);
 break; }
case 2: {
RDebugUtils.currentLine=786474;
 //BA.debugLineNum = 786474;BA.debugLine="Response.Status = 501";
_response.setStatus((int) (501));
 break; }
case 3: {
RDebugUtils.currentLine=786477;
 //BA.debugLineNum = 786477;BA.debugLine="Dim user As String = Request.GetHeader(\"user\")";
_user = _request.GetHeader("user");
RDebugUtils.currentLine=786478;
 //BA.debugLineNum = 786478;BA.debugLine="Dim pwd As String = Request.GetHeader(\"pwd\")";
_pwd = _request.GetHeader("pwd");
RDebugUtils.currentLine=786480;
 //BA.debugLineNum = 786480;BA.debugLine="If Request.Method <> \"POST\" Then";
if ((_request.getMethod()).equals("POST") == false) { 
RDebugUtils.currentLine=786481;
 //BA.debugLineNum = 786481;BA.debugLine="Response.Status = 404";
_response.setStatus((int) (404));
 }else 
{RDebugUtils.currentLine=786483;
 //BA.debugLineNum = 786483;BA.debugLine="Else if Request.RemoteAddress <> \"172.90.80.12\"";
if ((_request.getRemoteAddress()).equals("172.90.80.12") == false) { 
RDebugUtils.currentLine=786484;
 //BA.debugLineNum = 786484;BA.debugLine="Response.Status = 410";
_response.setStatus((int) (410));
 }else {
RDebugUtils.currentLine=786488;
 //BA.debugLineNum = 786488;BA.debugLine="If user = \"yo\" And pwd = \"1234\" Then";
if ((_user).equals("yo") && (_pwd).equals("1234")) { 
RDebugUtils.currentLine=786489;
 //BA.debugLineNum = 786489;BA.debugLine="Response.Status = 200";
_response.setStatus((int) (200));
RDebugUtils.currentLine=786490;
 //BA.debugLineNum = 786490;BA.debugLine="Response.SendString(\"acceso permitido, bienve";
_response.SendString("acceso permitido, bienvenido !!!");
 }else {
RDebugUtils.currentLine=786492;
 //BA.debugLineNum = 786492;BA.debugLine="Response.Status = 405";
_response.setStatus((int) (405));
 };
 }}
;
 break; }
default: {
RDebugUtils.currentLine=786498;
 //BA.debugLineNum = 786498;BA.debugLine="Response.Status = 404";
_response.setStatus((int) (404));
 break; }
}
;
RDebugUtils.currentLine=786502;
 //BA.debugLineNum = 786502;BA.debugLine="End Sub";
return "";
}
}
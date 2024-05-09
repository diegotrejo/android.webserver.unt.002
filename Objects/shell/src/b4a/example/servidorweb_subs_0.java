package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class servidorweb_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (servidorweb) ","servidorweb",1,servidorweb.processBA,servidorweb.mostCurrent,29);
if (RapidSub.canDelegate("application_error")) { return b4a.example.servidorweb.remoteMe.runUserSub(false, "servidorweb","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 29;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return servidorweb.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private webSocket As HttpServer";
servidorweb._websocket = RemoteObject.createNew ("anywheresoftware.b4a.objects.HttpServer");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (servidorweb) ","servidorweb",1,servidorweb.processBA,servidorweb.mostCurrent,12);
if (RapidSub.canDelegate("service_create")) { return b4a.example.servidorweb.remoteMe.runUserSub(false, "servidorweb","service_create");}
 BA.debugLineNum = 12;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(2048);
 BA.debugLineNum = 15;BA.debugLine="webSocket.Initialize(\"webSocket\")";
Debug.ShouldStop(16384);
servidorweb._websocket.runVoidMethod ("Initialize",servidorweb.processBA,(Object)(RemoteObject.createImmutable("webSocket")));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (servidorweb) ","servidorweb",1,servidorweb.processBA,servidorweb.mostCurrent,33);
if (RapidSub.canDelegate("service_destroy")) { return b4a.example.servidorweb.remoteMe.runUserSub(false, "servidorweb","service_destroy");}
 BA.debugLineNum = 33;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (servidorweb) ","servidorweb",1,servidorweb.processBA,servidorweb.mostCurrent,18);
if (RapidSub.canDelegate("service_start")) { return b4a.example.servidorweb.remoteMe.runUserSub(false, "servidorweb","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 18;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
Debug.ShouldStop(262144);
servidorweb.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 20;BA.debugLine="webSocket.Start(8080)";
Debug.ShouldStop(524288);
servidorweb._websocket.runVoidMethod ("Start",(Object)(BA.numberCast(int.class, 8080)));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (servidorweb) ","servidorweb",1,servidorweb.processBA,servidorweb.mostCurrent,23);
if (RapidSub.canDelegate("service_taskremoved")) { return b4a.example.servidorweb.remoteMe.runUserSub(false, "servidorweb","service_taskremoved");}
 BA.debugLineNum = 23;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="webSocket.Stop";
Debug.ShouldStop(16777216);
servidorweb._websocket.runVoidMethod ("Stop");
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_handlerequest(RemoteObject _request,RemoteObject _response) throws Exception{
try {
		Debug.PushSubsStack("webSocket_HandleRequest (servidorweb) ","servidorweb",1,servidorweb.processBA,servidorweb.mostCurrent,37);
if (RapidSub.canDelegate("websocket_handlerequest")) { return b4a.example.servidorweb.remoteMe.runUserSub(false, "servidorweb","websocket_handlerequest", _request, _response);}
RemoteObject _html = RemoteObject.createImmutable("");
RemoteObject _ph = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _registro = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _user = RemoteObject.createImmutable("");
RemoteObject _pwd = RemoteObject.createImmutable("");
Debug.locals.put("Request", _request);
Debug.locals.put("Response", _response);
 BA.debugLineNum = 37;BA.debugLine="Private Sub webSocket_HandleRequest (Request As Se";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Dim html As String";
Debug.ShouldStop(32);
_html = RemoteObject.createImmutable("");Debug.locals.put("html", _html);
 BA.debugLineNum = 40;BA.debugLine="Select Request.RequestURI";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(_request.runMethod(true,"getRequestURI"),BA.ObjectToString("/"),BA.ObjectToString("/data"),BA.ObjectToString("/otro"),BA.ObjectToString("/secure"))) {
case 0: {
 BA.debugLineNum = 42;BA.debugLine="Dim ph As Phone";
Debug.ShouldStop(512);
_ph = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("ph", _ph);
 BA.debugLineNum = 45;BA.debugLine="html = File.ReadString( File.DirAssets, \"index.";
Debug.ShouldStop(4096);
_html = servidorweb.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(servidorweb.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("index.html")));Debug.locals.put("html", _html);
 BA.debugLineNum = 46;BA.debugLine="html = html.Replace(\"{marca}\", ph.Manufacturer)";
Debug.ShouldStop(8192);
_html = _html.runMethod(true,"replace",(Object)(BA.ObjectToString("{marca}")),(Object)(_ph.runMethod(true,"getManufacturer")));Debug.locals.put("html", _html);
 BA.debugLineNum = 47;BA.debugLine="html = html.Replace(\"{modelo}\", ph.Model)";
Debug.ShouldStop(16384);
_html = _html.runMethod(true,"replace",(Object)(BA.ObjectToString("{modelo}")),(Object)(_ph.runMethod(true,"getModel")));Debug.locals.put("html", _html);
 BA.debugLineNum = 48;BA.debugLine="html = html.Replace(\"{cantidadDatos}\", 90)";
Debug.ShouldStop(32768);
_html = _html.runMethod(true,"replace",(Object)(BA.ObjectToString("{cantidadDatos}")),(Object)(BA.NumberToString(90)));Debug.locals.put("html", _html);
 BA.debugLineNum = 50;BA.debugLine="Response.Status = 200";
Debug.ShouldStop(131072);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 200));
 BA.debugLineNum = 51;BA.debugLine="Response.SendString(html)";
Debug.ShouldStop(262144);
_response.runVoidMethod ("SendString",(Object)(_html));
 break; }
case 1: {
 BA.debugLineNum = 54;BA.debugLine="Dim lista As List";
Debug.ShouldStop(2097152);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 55;BA.debugLine="lista.Initialize";
Debug.ShouldStop(4194304);
_lista.runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="For i = 1 To 5";
Debug.ShouldStop(16777216);
{
final int step14 = 1;
final int limit14 = 5;
_i = 1 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 58;BA.debugLine="Dim registro As Map";
Debug.ShouldStop(33554432);
_registro = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("registro", _registro);
 BA.debugLineNum = 59;BA.debugLine="registro.Initialize";
Debug.ShouldStop(67108864);
_registro.runVoidMethod ("Initialize");
 BA.debugLineNum = 61;BA.debugLine="registro.Put(\"id\", i)";
Debug.ShouldStop(268435456);
_registro.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(RemoteObject.createImmutable((_i))));
 BA.debugLineNum = 62;BA.debugLine="registro.Put(\"zona\", i+9)";
Debug.ShouldStop(536870912);
_registro.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("zona"))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(9)}, "+",1, 1))));
 BA.debugLineNum = 63;BA.debugLine="registro.Put(\"tempC\", 90)";
Debug.ShouldStop(1073741824);
_registro.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tempC"))),(Object)(RemoteObject.createImmutable((90))));
 BA.debugLineNum = 64;BA.debugLine="registro.Put(\"lat\", 0.89989 * i)";
Debug.ShouldStop(-2147483648);
_registro.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lat"))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.89989),RemoteObject.createImmutable(_i)}, "*",0, 0))));
 BA.debugLineNum = 65;BA.debugLine="registro.Put(\"long\", -2.89801923 * i)";
Debug.ShouldStop(1);
_registro.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("long"))),(Object)(RemoteObject.createImmutable((-2.89801923*(double) (0 + _i)))));
 BA.debugLineNum = 67;BA.debugLine="lista.Add(registro)";
Debug.ShouldStop(4);
_lista.runVoidMethod ("Add",(Object)((_registro.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 70;BA.debugLine="Dim jsonGenerator As JSONGenerator";
Debug.ShouldStop(32);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jsonGenerator", _jsongenerator);
 BA.debugLineNum = 71;BA.debugLine="jsonGenerator.Initialize2( lista )";
Debug.ShouldStop(64);
_jsongenerator.runVoidMethod ("Initialize2",(Object)(_lista));
 BA.debugLineNum = 73;BA.debugLine="Dim json As String = jsonGenerator.ToPrettyStri";
Debug.ShouldStop(256);
_json = _jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 75;BA.debugLine="Response.Status = 200";
Debug.ShouldStop(1024);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 200));
 BA.debugLineNum = 76;BA.debugLine="Response.SendString(json)";
Debug.ShouldStop(2048);
_response.runVoidMethod ("SendString",(Object)(_json));
 break; }
case 2: {
 BA.debugLineNum = 79;BA.debugLine="Response.Status = 501";
Debug.ShouldStop(16384);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 501));
 break; }
case 3: {
 BA.debugLineNum = 82;BA.debugLine="Dim user As String = Request.GetHeader(\"user\")";
Debug.ShouldStop(131072);
_user = _request.runMethod(true,"GetHeader",(Object)(RemoteObject.createImmutable("user")));Debug.locals.put("user", _user);Debug.locals.put("user", _user);
 BA.debugLineNum = 83;BA.debugLine="Dim pwd As String = Request.GetHeader(\"pwd\")";
Debug.ShouldStop(262144);
_pwd = _request.runMethod(true,"GetHeader",(Object)(RemoteObject.createImmutable("pwd")));Debug.locals.put("pwd", _pwd);Debug.locals.put("pwd", _pwd);
 BA.debugLineNum = 85;BA.debugLine="If Request.Method <> \"POST\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",_request.runMethod(true,"getMethod"),BA.ObjectToString("POST"))) { 
 BA.debugLineNum = 86;BA.debugLine="Response.Status = 404";
Debug.ShouldStop(2097152);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 404));
 }else 
{ BA.debugLineNum = 88;BA.debugLine="Else if Request.RemoteAddress <> \"172.90.80.12\"";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("!",_request.runMethod(true,"getRemoteAddress"),BA.ObjectToString("172.90.80.12"))) { 
 BA.debugLineNum = 89;BA.debugLine="Response.Status = 410";
Debug.ShouldStop(16777216);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 410));
 }else {
 BA.debugLineNum = 93;BA.debugLine="If user = \"yo\" And pwd = \"1234\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_user,BA.ObjectToString("yo")) && RemoteObject.solveBoolean("=",_pwd,BA.ObjectToString("1234"))) { 
 BA.debugLineNum = 94;BA.debugLine="Response.Status = 200";
Debug.ShouldStop(536870912);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 200));
 BA.debugLineNum = 95;BA.debugLine="Response.SendString(\"acceso permitido, bienve";
Debug.ShouldStop(1073741824);
_response.runVoidMethod ("SendString",(Object)(RemoteObject.createImmutable("acceso permitido, bienvenido !!!")));
 }else {
 BA.debugLineNum = 97;BA.debugLine="Response.Status = 405";
Debug.ShouldStop(1);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 405));
 };
 }}
;
 break; }
default: {
 BA.debugLineNum = 103;BA.debugLine="Response.Status = 404";
Debug.ShouldStop(64);
_response.runVoidMethod ("setStatus",BA.numberCast(int.class, 404));
 break; }
}
;
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
package presentation;

public class HTMLStrings {
	
	public String titleLocalTime = "<title> Local Time </title>";
	public String titleLogin = "<title> Login </title>";
	public String titleSignUp = "<title> Sign Up </title>";
	public String titleLogout = "<title> LuFlow </title>";
	public String titleClient = "<title> Client page </title>";
	public String titleAdmin = "<title> Admin page </title>";
	public String docType = "<!DOCTYPE html>" + "<html lang=\"en\">";
	public String docEnd = "</html>";
	public String hhh = "<header>" +
								"<style>" +
								"body {margin:0;}" +
								"ul.topnav {" +
								  "list-style-type: none;" +
								  "margin: 0;" +
								  "padding: 0;" +
								  "overflow: hidden;" +
								  "background-color: #333;" +
								"}" +
								
								"ul.topnav li {float: left;}" +
								
								"ul.topnav li a {" +
								  "display: inline-block;" +
								  "color: #f2f2f2;" +
								  "text-align: center;" +
								  "padding: 14px 16px;" +
								  "text-decoration: none;" +
								  "transition: 0.3s;" +
								  "font-size: 17px;" +
								"}" +
								
								"ul.topnav li a:hover {background-color: #555;}" +
							"</style>" +
					
							"<ul class=\"topnav\" id=\"myTopnav\">" +
							  "<li><a href=\"#home\">Home</a></li>" +
							  "<li><a href=\"#news\">Flights</a></li>" +
							  "<li><a href=\"client\">Profile</a></li>" +
							  "<li><a href=\"login\">Login</a></li>" +
							  "<li><a href=\"logout\">Logout</a></li>" +
							"</ul>" +
						"</header>";
	
	public String menubarHead = "<meta charset=\"utf-8\">" +
			"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">" +
			"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">" +
			"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>" +
			"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>";
	
	public String menubar = "<header>" +
			"<nav class=\"navbar navbar-inverse\">" +
				 " <div class=\"container-fluid\">" +
				   " <div class=\"navbar-header\">" +
				     " <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">" +
				      "  <span class=\"icon-bar\"></span>" +
				       " <span class=\"icon-bar\"></span>" +
				       " <span class=\"icon-bar\"></span>" +
				      "</button>" +
				     " <a class=\"navbar-brand\" href=\"index.html\">LuFlow</a>" +
				   " </div>" +
				    "<div class=\"collapse navbar-collapse\" id=\"myNavbar\">" +
				    "  <ul class=\"nav navbar-nav\">" +
				      "  <li class=\"active\"><a href=\"index.html\">Home</a></li>" +
				      "  <li class=\"dropdown\">" +
				        "  <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"flightsAvailable\">Flights <span class=\"caret\"></span></a>" +
				         " <ul class=\"dropdown-menu\">" +
				          "  <li><a href=\"flightsAvailable\">Available Flights</a></li>" +
				          "  <li><a href=\"localTime\">Local Time</a></li>" +
				        "  </ul>" +
				       " </li>" +
				      " <li><a href=\"#\">Costs</a></li>" +
				       " <li><a href=\"#\">About</a></li>" +
				     " </ul>" +
				    "  <ul class=\"nav navbar-nav navbar-right\">" +
				     "   <li><a href=\"account\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>" +
				     "   <li><a href=\"login\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>" +
				    "  </ul>" +
				  "  </div>" +
				"  </div>" +
				"</nav>"+
			"</header>";
	
	public String menubarLogin = "<header>" +
								"<nav class=\"navbar navbar-inverse\">" +
									 " <div class=\"container-fluid\">" +
									   " <div class=\"navbar-header\">" +
									     " <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">" +
									      "  <span class=\"icon-bar\"></span>" +
									       " <span class=\"icon-bar\"></span>" +
									       " <span class=\"icon-bar\"></span>" +
									      "</button>" +
									     " <a class=\"navbar-brand\" href=\"index.html\">LuFlow</a>" +
									   " </div>" +
									    "<div class=\"collapse navbar-collapse\" id=\"myNavbar\">" +
									    "  <ul class=\"nav navbar-nav\">" +
									      "  <li class=\"dropdown\"><a href=\"index.html\">Home</a></li>" +
									      "  <li class=\"dropdown\">" +
									        "  <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"flightsAvailable\">Flights <span class=\"caret\"></span></a>" +
									         " <ul class=\"dropdown-menu\">" +
									          "  <li><a href=\"flightsAvailable\">Available Flights</a></li>" +
									          "  <li><a href=\"localTime\">Local Time</a></li>" +
									        "  </ul>" +
									       " </li>" +
									      " <li><a href=\"#\">Costs</a></li>" +
									       " <li><a href=\"#\">About</a></li>" +
									     " </ul>" +
									    "  <ul class=\"nav navbar-nav navbar-right\">" +
									     "   <li class=\"dropdown\"><a href=\"account\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>" +
									     "   <li class=\"active\"><a href=\"login\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>" +
									    "  </ul>" +
									  "  </div>" +
									"  </div>" +
									"</nav>"+
								"</header>";
	
	public String menubarSignUp = "<header>" +
									"<nav class=\"navbar navbar-inverse\">" +
										 " <div class=\"container-fluid\">" +
										   " <div class=\"navbar-header\">" +
										     " <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">" +
										      "  <span class=\"icon-bar\"></span>" +
										       " <span class=\"icon-bar\"></span>" +
										       " <span class=\"icon-bar\"></span>" +
										      "</button>" +
										     " <a class=\"navbar-brand\" href=\"index.html\">LuFlow</a>" +
										   " </div>" +
										    "<div class=\"collapse navbar-collapse\" id=\"myNavbar\">" +
										    "  <ul class=\"nav navbar-nav\">" +
										      "  <li class=\"dropdown\"><a href=\"index.html\">Home</a></li>" +
										      "  <li class=\"dropdown\">" +
										        "  <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"flightsAvailable\">Flights <span class=\"caret\"></span></a>" +
										         " <ul class=\"dropdown-menu\">" +
										          "  <li><a href=\"flightsAvailable\">Available Flights</a></li>" +
										          "  <li><a href=\"localTime\">Local Time</a></li>" +
										        "  </ul>" +
										       " </li>" +
										      " <li><a href=\"#\">Costs</a></li>" +
										       " <li><a href=\"#\">About</a></li>" +
										     " </ul>" +
										    "  <ul class=\"nav navbar-nav navbar-right\">" +
										     "   <li class=\"active\"><a href=\"account\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>" +
										     "   <li class=\"dropdown\"><a href=\"login\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>" +
										    "  </ul>" +
										  "  </div>" +
										"  </div>" +
										"</nav>"+
									"</header>";
							
	public String menubarClient = "<header>" +
								"<nav class=\"navbar navbar-inverse\">" +
									 " <div class=\"container-fluid\">" +
									   " <div class=\"navbar-header\">" +
									     " <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">" +
									      "  <span class=\"icon-bar\"></span>" +
									       " <span class=\"icon-bar\"></span>" +
									       " <span class=\"icon-bar\"></span>" +
									      "</button>" +
									     " <a class=\"navbar-brand\" href=\"client\">LuFlow</a>" +
									   " </div>" +
									    "<div class=\"collapse navbar-collapse\" id=\"myNavbar\">" +
									    "  <ul class=\"nav navbar-nav\">" +
									      "  <li class=\"active\"><a href=\"client\">Home</a></li>" +
									      "  <li class=\"dropdown\">" +
									        "  <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"flightsAvailable\">Flights <span class=\"caret\"></span></a>" +
									         " <ul class=\"dropdown-menu\">" +
									          "  <li><a href=\"flightsAvailable\">Available Flights</a></li>" +
									          "  <li><a href=\"flightsClient\">My Flights</a></li>" +
									          "  <li><a href=\"localTime\">Local Time</a></li>" +
									        "  </ul>" +
									       " </li>" +
									      " <li><a href=\"#\">Costs</a></li>" +
									       " <li><a href=\"#\">About</a></li>" +
									     " </ul>" +
									    "  <ul class=\"nav navbar-nav navbar-right\">" +
									     "   <li><a href=\"logout\"><span class=\"glyphicon glyphicon-user\"></span> Logout</a></li>";
	
	public String menubarClientFlights = "<header>" +
										"<nav class=\"navbar navbar-inverse\">" +
										 " <div class=\"container-fluid\">" +
										   " <div class=\"navbar-header\">" +
										     " <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">" +
										      "  <span class=\"icon-bar\"></span>" +
										       " <span class=\"icon-bar\"></span>" +
										       " <span class=\"icon-bar\"></span>" +
										      "</button>" +
										     " <a class=\"navbar-brand\" href=\"client\">LuFlow</a>" +
										   " </div>" +
										    "<div class=\"collapse navbar-collapse\" id=\"myNavbar\">" +
										    "  <ul class=\"nav navbar-nav\">" +
										      "  <li class=\"drodown\"><a href=\"client\">Home</a></li>" +
										      "  <li class=\"active\">" +
										        "  <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"flightsAvailable\">Flights <span class=\"caret\"></span></a>" +
										         " <ul class=\"dropdown-menu\">" +
										         "  <li><a href=\"flightsAvailable\">Available Flights</a></li>" +
										          "  <li><a href=\"flightsClient\">My Flights</a></li>" +
										          "  <li><a href=\"localTime\">Local Time</a></li>" +
										        "  </ul>" +
										       " </li>" +
										      " <li><a href=\"#\">Costs</a></li>" +
										       " <li><a href=\"#\">About</a></li>" +
										     " </ul>" +
										    "  <ul class=\"nav navbar-nav navbar-right\">" +
										     "   <li><a href=\"logout\"><span class=\"glyphicon glyphicon-user\"></span> Logout</a></li>";
			
	
	public String menubarAdmin = "<header>" +
										"<nav class=\"navbar navbar-inverse\">" +
											 " <div class=\"container-fluid\">" +
											   " <div class=\"navbar-header\">" +
											     " <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">" +
											      "  <span class=\"icon-bar\"></span>" +
											       " <span class=\"icon-bar\"></span>" +
											       " <span class=\"icon-bar\"></span>" +
											      "</button>" +
											     " <a class=\"navbar-brand\" href=\"admin\">LuFlow</a>" +
											   " </div>" +
											    "<div class=\"collapse navbar-collapse\" id=\"myNavbar\">" +
											    "  <ul class=\"nav navbar-nav\">" +
											      "  <li class=\"active\"><a href=\"admin\">Home</a></li>" +
											      "  <li class=\"dropdown\">" +
											        "  <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"flightsAvailable\">Actions <span class=\"caret\"></span></a>" +
											         " <ul class=\"dropdown-menu\">" +
											          "  <li><a href=\"flightsAdmin\">Actions Flights</a></li>" +
											          "  <li><a href=\"citiesAdmin\">Actions Cities</a></li>" +
											          "  <li><a href=\"usersAdmin\">Actions Users</a></li>" +
											          "  <li><a href=\"localTime\">Local Time</a></li>" +
											        "  </ul>" +
											       " </li>" +
											      " <li><a href=\"#\">Costs</a></li>" +
											       " <li><a href=\"#\">About</a></li>" +
											     " </ul>" +
											    "  <ul class=\"nav navbar-nav navbar-right\">" +
											     "   <li><a href=\"logout\"><span class=\"glyphicon glyphicon-user\"></span> Logout</a></li>";
	
	public String menubarAdminActions = "<header>" +
										"<nav class=\"navbar navbar-inverse\">" +
											 " <div class=\"container-fluid\">" +
											   " <div class=\"navbar-header\">" +
											     " <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">" +
											      "  <span class=\"icon-bar\"></span>" +
											       " <span class=\"icon-bar\"></span>" +
											       " <span class=\"icon-bar\"></span>" +
											      "</button>" +
											     " <a class=\"navbar-brand\" href=\"admin\">LuFlow</a>" +
											   " </div>" +
											    "<div class=\"collapse navbar-collapse\" id=\"myNavbar\">" +
											    "  <ul class=\"nav navbar-nav\">" +
											      "  <li class=\"dropdown\"><a href=\"admin\">Home</a></li>" +
											      "  <li class=\"active\">" +
											        "  <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"flightsAdmin\">Actions <span class=\"caret\"></span></a>" +
											         " <ul class=\"dropdown-menu\">" +
											          "  <li><a href=\"flightsAdmin\">Actions Flights</a></li>" +
											          "  <li><a href=\"citiesAdmin\">Actions Cities</a></li>" +
											          "  <li><a href=\"usersAdmin\">Actions Users</a></li>" +
											          "  <li><a href=\"localTime\">Local Time</a></li>" +
											        "  </ul>" +
											       " </li>" +
											      " <li><a href=\"#\">Costs</a></li>" +
											       " <li><a href=\"#\">About</a></li>" +
											     " </ul>" +
											    "  <ul class=\"nav navbar-nav navbar-right\">" +
											     "   <li><a href=\"logout\"><span class=\"glyphicon glyphicon-user\"></span> Logout</a></li>";
								
	public String usernameSession =  "  </ul>" +
									  "  </div>" +
									"  </div>" +
									"</nav>"+
								"</header>";
	
	public String flightImg = "<body backgound-color=#000> <br> <div backgound-color=#fff> <img src=\"images/flight.jpg\" width=\"1532px\"> </img> </div></body>";
	
	public String formLogin = "<style>" + 
									"input[type=text], input[type=password] {" +
								    "width: 100%;" + 
								    "padding: 12px 20px;" +
								    "margin: 8px 0;" +
								    "display: inline-block;" +
								    "border: 1px solid #ccc;" +
								    "box-sizing: border-box;" +
								"}" +
								
								"button {" +
								    "background-color: #4CAF50;" +
								    "color: white;" +
								    "padding: 14px 20px;" +
								    "margin: 8px 0;" +
								    "border: none;" +
								    "cursor: pointer;" +
								    "width: 100%;" +
								"}" +
								
								".cancelbtn {" +
								    "width: auto;" +
								    "padding: 10px 18px;" +
								    "background-color: #f44336;" +
								"}" +
								
								".imgcontainer {" +
								    "text-align: center;" +
								    "margin: 24px 0 12px 0;" +
								"}" +
								
								"img.avatar {" +
								    "width: 20%;" +
								    "border-radius: 50%;" +
								"}" +
								
								".container {" +
								    "padding: 16px;" +
								"}" +
								
								"span.psw {" +
								    "float: right;" +
								    "padding-top: 16px;" +
								"}" +
								    
								".modal {" +
								    "display: none;" +
								    "position: fixed; " +
								    "z-index: 1;" +
								    "left: 0;" +
								    "top: 0;" +
								    "width: 100%; " +
								    "height: 100%; " +
								    "overflow: auto;" +
								    "background-color: rgb(0,0,0); " +
								    "background-color: rgba(0,0,0,0.4); " +
								    "padding-top: 60px;" +
								"}"+
								    
								
								".modal-content {" +
								    "background-color: #fefefe;" +
								    "margin: 5% auto 15% auto; " +
								    "border: 1px solid #888;" +
								    "width: 80%; " +
								"}" +
								
								".close {" +
								    "position: absolute;" +
								    "right: 25px;" +
								    "top: 0;" +
								    "color: #000;" +
								    "font-size: 35px;" +
								    "font-weight: bold;" +
								"}" +
								
								".close:hover," +
								".close:focus {" +
								    "color: red;" +
								    "cursor: pointer;" +
								"}" +
								
								".animate {" +
								    "-webkit-animation: animatezoom 0.6s;" +
								    "animation: animatezoom 0.6s" +
								"}" +
								
								"@-webkit-keyframes animatezoom {" +
								    "from {-webkit-transform: scale(0)}" +
								    "to {-webkit-transform: scale(1)}" +
								"}" +
								    
								"@keyframes animatezoom {" +
								    "from {transform: scale(0)}" +
								    "to {transform: scale(1)}" +
								"}" +
								
								
								"@media screen and (max-width: 300px) {" +
								    "span.psw {" +
								       "display: block;" +
								       "float: none;" +
								    "}" +
								    ".cancelbtn {" +
								       "width: 100%;" +
								    "}" +
								"}" +
								"</style>" +
								"<body background-color:#000>" + 
								
								"<form class=\"modal-content animate\" action=\"login\" method=\"POST\">" +
								  "<div class=\"imgcontainer\">" +
								  	"<span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>"+
								    "<img src=\"images/img_avatar.png\" alt=\"Avatar\" class=\"avatar\">" +
								  "</div>" +
								
								  "<div class=\"container\">" +
								    "<label><b>Username</b></label>" +
								    "<input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required>" +
								
								    "<label><b>Password</b></label>" +
								    "<input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>" +
								        
								    "<button type=\"submit\">Login</button>" +
								    "<input type=\"checkbox\"> Remember me" +
								  "</div>" +
								
								  "<div class=\"container\" style=\"background-color:#f1f1f1\">" +
								    " <button type=\"button\" onclick=\"index.html\" class=\"cancelbtn\">Cancel</button>" +
								    "<span class=\"psw\">Forgot <a href=\"#\">password?</a></span>" +
								  "</div>" +
								"</form>" + 
								  
								"<script>" +
								"var modal = document.getElementById('id01');" +
						
								"window.onclick = function(event) {" +
								    "if (event.target == modal) {" +
								        "modal.style.display = \"none\"; " +
								    "}" +
								"}" +
								"</script>" +
							"</body>";
	
	public String tableHead = "<link rel=\"stylesheet\" href=\"css/table.css\" />"+
						"<script src=\"js/table.js\"></script>";
	
	public String tableFirstCities = "<body>"+
							"<div class=\"main_bg\">"+
								"<div class=\"wrap\">"+
									"<br/> <br/> <br/>"+
											"<table class=\"flatTable\" id=\"htmlTable\">"+
											  "<tr class=\"titleTr\">"+
											    "<td class=\"titleTd\">Cities</td>"+
											    "<td colspan=\"4\"></td>"+
											   " <td class=\"plusTd button\"></td>"+
											 " </tr>";
	
	public String tableHeadingCities = " <tr class=\"headingTr\">"+
								    "<td>Name</td>"+
								   " <td>Country</td>"+
								    "<td>Latitude</td>"+
								   " <td>Longitude</td>"+
								   " <td></td>"+
								 " </tr>";
	
	public String tdAdd1 = "<td class=\"controlTd\">"+
				     " <div class=\"settingsIcons\">"+
				      "  <span class=\"settingsIcon\"><img src=\"images/settings.jpg\" alt=\"X\" /></span>";
	public String tdAdd2 = "<span class=\"settingsIcon\">"+
				        	"	<input type=\"image\" name=\"submit\" src=\"images/delete.jpg\" border=\"0\" alt=\"Submit\" />"+
				        	"</span>"+
				        "</form>";
 	public String tdAdd3 ="	<span class=\"settingsIcon\">"+
				        	"	<input type=\"image\" name=\"submit\" src=\"images/update.png\" border=\"0\" alt=\"Submit\" />"+
				        "	</span>"+
				     " </div>  "+
				   " </td>"+
				  "</tr>"+
 	"  </form>";
	
	public String citiesAdd = "<br/> <br/> <br/>" +
						"<div id=\"sForm\" class=\"sForm sFormPadding\">" +
						   " <span class=\"button close\"><img src=\"images/close.png\" alt=\"X\"  class=\"\" /></span>" +
						   " <h2 class=\"title\">Add a New Record</h2>  " +
							"<form class=\"form-horizontal\" action=\"citiesAdmin\" method=\"POST\">" +
						    "  <br/>" +
						
						      "<label for=\"name\">Name</label>" +
						     "	<br/>" +
						     "<input type=\"text\"  name=\"name\" required>"+
						       " <div class=\"bar\"></div>" +
								"<br/> <br/>" +
						     
						     	"<label for=\"country\">Country</label>" +
						     	" <br/>" +
						       " <input type=\"text\" id=\"country\" required=\"required\"  name=\"country\"/>" +
						       " <div class=\"bar\"></div>" +
								"<br/> <br/>" +
								
						        " <label for=\"latitude\">Latitude</label>" +
						        " <br/>" +
						       " <input type=\"text\" id=\"latitude\" required=\"required\" name=\"latitude\"/>" +
						     	"<div class=\"bar\"></div>" +
						     	"<br/> <br/>" +
						     	
						     	"<label for=\"longitude\">Longitude</label>" +
						     	 "<br/>" +
						        "<input type=\"text\" id=\"longitude\" required=\"required\"  name=\"longitude\"/>" +
						        "<div class=\"bar\"></div>" +
								"<br/> <br/>" +
						      
						      	"<button type=\"submit\" name=\"button\"><span>Add City</span></button>" +
						
								"<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css' />" +
				    			"<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>" +
				
				        		"<script src=\"js/table.js\"></script>" +
							"</form>" +
						"</div>"+
						"<br/> <br/> <br/> <br/> <br/> <br/>"+
						"</body>";
	
	public String formUpdate1 = "<style>" + 
										"input[type=text] {" +
									    "width: 100%;" + 
									    "padding: 12px 20px;" +
									    "margin: 8px 0;" +
									    "display: inline-block;" +
									    "border: 1px solid #ccc;" +
									    "box-sizing: border-box;" +
									"}" +
									
									"button {" +
									    "background-color: #4CAF50;" +
									    "color: white;" +
									    "padding: 14px 20px;" +
									    "margin: 8px 0;" +
									    "border: none;" +
									    "cursor: pointer;" +
									    "width: 100%;" +
									"}" +
									
									".cancelbtn {" +
									    "width: auto;" +
									    "padding: 10px 18px;" +
									    "background-color: #f44336;" +
									"}" +
									
									".imgcontainer {" +
									    "text-align: center;" +
									    "margin: 24px 0 12px 0;" +
									"}" +
									
									".container {" +
									    "padding: 16px;" +
									"}" +
									
									"span.psw {" +
									    "float: right;" +
									    "padding-top: 16px;" +
									"}" +
									    
									".modal {" +
									    "display: none;" +
									    "position: fixed; " +
									    "z-index: 1;" +
									    "left: 0;" +
									    "top: 0;" +
									    "width: 100%; " +
									    "height: 100%; " +
									    "overflow: auto;" +
									    "background-color: rgb(0,0,0); " +
									    "background-color: rgba(0,0,0,0.4); " +
									    "padding-top: 60px;" +
									"}"+
									    
									
									".modal-content {" +
									    "background-color: #fefefe;" +
									    "margin: 5% auto 15% auto; " +
									    "border: 1px solid #888;" +
									    "width: 80%; " +
									"}" +
									
									".close {" +
									    "position: absolute;" +
									    "right: 25px;" +
									    "top: 0;" +
									    "color: #000;" +
									    "font-size: 35px;" +
									    "font-weight: bold;" +
									"}" +
									
									".close:hover," +
									".close:focus {" +
									    "color: red;" +
									    "cursor: pointer;" +
									"}" +
									
									".animate {" +
									    "-webkit-animation: animatezoom 0.6s;" +
									    "animation: animatezoom 0.6s" +
									"}" +
									
									"@-webkit-keyframes animatezoom {" +
									    "from {-webkit-transform: scale(0)}" +
									    "to {-webkit-transform: scale(1)}" +
									"}" +
									    
									"@keyframes animatezoom {" +
									    "from {transform: scale(0)}" +
									    "to {transform: scale(1)}" +
									"}" +
									"input[type=text], select {" +
									   "     width: 100%;" +
									    "    padding: 12px 20px;" +
									   "     margin: 8px 0;" +
									   "     display: inline-block;" +
									   "     border: 1px solid #ccc;" +
									   "     border-radius: 4px;" +
									   "     box-sizing: border-box;" +
									  "  }" +
									
									"@media screen and (max-width: 300px) {" +
									    "span.psw {" +
									       "display: block;" +
									       "float: none;" +
									    "}" +
									    ".cancelbtn {" +
									       "width: 100%;" +
									    "}" +
									"}" +
									"</style>" +
									"<body background-color:#fff>";
									
	public String formUpdate2 =	   "<button type=\"submit\">Update</button>" +
								  "</div>" +
								"</form>" + 
									"<script>" +
									"var modal = document.getElementById('id01');" +
							
									"window.onclick = function(event) {" +
									    "if (event.target == modal) {" +
									        "modal.style.display = \"none\"; " +
									    "}" +
									"}" +
									"</script>" +
								"</body>";
								
	public String tableFirstFlights = "<body>"+
									"<div class=\"main_bg\">"+
										"<div class=\"wrap\">"+
											"<br/> <br/> <br/>"+
													"<table class=\"flatTable\" id=\"htmlTable\">"+
													  "<tr class=\"titleTr\">"+
													    "<td class=\"titleTd\">Flights</td>"+
													    "<td colspan=\"4\"></td>"+
													   " <td class=\"plusTd button\"></td>"+
													 " </tr>";
	
	public String tableFirstFlightsAv = "<body>"+
										"<div class=\"main_bg\">"+
											"<div class=\"wrap\">"+
												"<br/> <br/> <br/>"+
														"<table class=\"flatTable\" id=\"htmlTable\">"+
														  "<tr class=\"titleTr\">"+
														    "<td class=\"titleTd\">Flights</td>"+
														    "<td colspan=\"5\"></td>"+
														 " </tr>";
	
	public String tableHeadingFlights = " <tr class=\"headingTr\">"+
										    "<td>Number</td>"+
										   " <td>Airplane Type</td>"+
										    "<td>Departure City</td>"+
										   " <td>Arrival City</td>"+
										   "<td>Departure Date</td>"+
										   " <td>Arrival Date</td>"+
										   " <td></td>"+
										 " </tr>";
	
	public String tableHeadingFlightsAv = " <tr class=\"headingTr\">"+
										    "<td>Number</td>"+
										   " <td>Airplane Type</td>"+
										    "<td>Departure City</td>"+
										   " <td>Arrival City</td>"+
										   "<td>Departure Date</td>"+
										   " <td>Arrival Date</td>"+
										 " </tr>";
	
	public String flightsAdd1 = "<br/> <br/> <br/>" +
								"<div id=\"sForm\" class=\"sForm sFormPadding\">" +
								   " <span class=\"button close\"><img src=\"images/close.png\" alt=\"X\"  class=\"\" /></span>" +
								   " <h2 class=\"title\">Add a New Record</h2>  " +
									"<form class=\"form-horizontal\" action=\"flightsAdmin\" method=\"POST\">" +
								    "  <br/>" +
								
								      "<label for=\"number\">Number</label>" +
								     "	<br/>" +
								     "<input type=\"text\"  name=\"number\" required>"+
								       " <div class=\"bar\"></div>" +
										"<br/> <br/>" +
								     
								     	"<label for=\"airplaneType\">Airplane type</label>" +
								     	" <br/>" +
								       " <input type=\"text\" id=\"airplaneType\" required=\"required\"  name=\"airplaneType\"/>" +
								       " <div class=\"bar\"></div>" +
										"<br/> <br/>";
	
	public String flightsAdd2 =	"<label for=\"departureDate\">Departure Date</label>" +
										 "<br/>" +
										"<input type=\"text\" id=\"departureDate\" required=\"required\"  name=\"departureDate\"/>" +
										"<div class=\"bar\"></div>" +
										"<br/> <br/>" +
										
										"<label for=\"arrivalDate\">Arrival Date</label>" +
										 "<br/>" +
										"<input type=\"text\" id=\"arrivalDate\" required=\"required\"  name=\"arrivalDate\"/>" +
										"<div class=\"bar\"></div>" +
										"<br/> <br/>" +
								      
								      	"<button type=\"submit\" name=\"button\"><span>Add Flight</span></button>" +
								
										"<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css' />" +
						    			"<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>" +
						
						        		"<script src=\"js/table.js\"></script>" +
									"</form>" +
								"</div>"+
								"<br/> <br/> <br/> <br/> <br/> <br/>"+
								"</body>";
	
	
	public String formSignUp = "<style>" + 
									"input[type=text], input[type=password] {" +
								    "width: 100%;" + 
								    "padding: 12px 20px;" +
								    "margin: 8px 0;" +
								    "display: inline-block;" +
								    "border: 1px solid #ccc;" +
								    "box-sizing: border-box;" +
								"}" +
								
								"button {" +
								    "background-color: #4CAF50;" +
								    "color: white;" +
								    "padding: 14px 20px;" +
								    "margin: 8px 0;" +
								    "border: none;" +
								    "cursor: pointer;" +
								    "width: 100%;" +
								"}" +
								
								".cancelbtn {" +
								    "width: auto;" +
								    "padding: 10px 18px;" +
								    "background-color: #f44336;" +
								"}" +
								
								".imgcontainer {" +
								    "text-align: center;" +
								    "margin: 24px 0 12px 0;" +
								"}" +
								
								"img.avatar {" +
								    "width: 20%;" +
								    "border-radius: 50%;" +
								"}" +
								
								".container {" +
								    "padding: 16px;" +
								"}" +
								
								"span.psw {" +
								    "float: right;" +
								    "padding-top: 16px;" +
								"}" +
								    
								".modal {" +
								    "display: none;" +
								    "position: fixed; " +
								    "z-index: 1;" +
								    "left: 0;" +
								    "top: 0;" +
								    "width: 100%; " +
								    "height: 100%; " +
								    "overflow: auto;" +
								    "background-color: rgb(0,0,0); " +
								    "background-color: rgba(0,0,0,0.4); " +
								    "padding-top: 60px;" +
								"}"+
								    
								
								".modal-content {" +
								    "background-color: #fefefe;" +
								    "margin: 5% auto 15% auto; " +
								    "border: 1px solid #888;" +
								    "width: 80%; " +
								"}" +
								
								".close {" +
								    "position: absolute;" +
								    "right: 25px;" +
								    "top: 0;" +
								    "color: #000;" +
								    "font-size: 35px;" +
								    "font-weight: bold;" +
								"}" +
								
								".close:hover," +
								".close:focus {" +
								    "color: red;" +
								    "cursor: pointer;" +
								"}" +
								
								".animate {" +
								    "-webkit-animation: animatezoom 0.6s;" +
								    "animation: animatezoom 0.6s" +
								"}" +
								
								"@-webkit-keyframes animatezoom {" +
								    "from {-webkit-transform: scale(0)}" +
								    "to {-webkit-transform: scale(1)}" +
								"}" +
								    
								"@keyframes animatezoom {" +
								    "from {transform: scale(0)}" +
								    "to {transform: scale(1)}" +
								"}" +
								
								
								"@media screen and (max-width: 300px) {" +
								    "span.psw {" +
								       "display: block;" +
								       "float: none;" +
								    "}" +
								    ".cancelbtn {" +
								       "width: 100%;" +
								    "}" +
								"}" +
								"</style>" +
								"<body background-color:#000>" + 
								
								"<form class=\"modal-content animate\" action=\"account\" method=\"POST\">" +
								  "<div class=\"imgcontainer\">" +
								  	"<span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>"+
								    "<img src=\"images/img_avatar.png\" alt=\"Avatar\" class=\"avatar\">" +
								  "</div>" +
								
								  "<div class=\"container\">" +
								  	"<label><b>First name</b></label>" +
								    "<input type=\"text\" placeholder=\"Enter First name\" name=\"firstname\" required>" +
								
									"<label><b>Last name</b></label>" +
									"<input type=\"text\" placeholder=\"Enter Last name\" name=\"lastname\" required>" +

								    "<label><b>Username</b></label>" +
								    "<input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required>" +
								
								    "<label><b>Password</b></label>" +
								    "<input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>" +
								        
								    "<button type=\"submit\">Login</button>" +
								    "<input type=\"checkbox\"> Remember me" +
								  "</div>" +
								
								  "<div class=\"container\" style=\"background-color:#f1f1f1\">" +
								    " <button type=\"button\" onclick=\"index.html\" class=\"cancelbtn\">Cancel</button>" +
								    "<span class=\"psw\">Forgot <a href=\"#\">password?</a></span>" +
								  "</div>" +
								"</form>" + 
								  
								"<script>" +
								"var modal = document.getElementById('id01');" +
						
								"window.onclick = function(event) {" +
								    "if (event.target == modal) {" +
								        "modal.style.display = \"none\"; " +
								    "}" +
								"}" +
								"</script>" +
							"</body>";
	
	
	public String formLocalTime = "<style>"+
									"input[type=text], select {"+
									    "width: 100%;"+
									   " padding: 12px 20px;"+
									   " margin: 8px 0;"+
									   " display: inline-block;"+
									   " border: 1px solid #ccc;"+
									   " border-radius: 4px;"+
									   " box-sizing: border-box;"+
									   " size: 500;"+
									"}"+
								
									"input[type=submit] {"+
									   " width: 100%;"+
									   " background-color: #4CAF50;"+
									   " color: white;"+
									   " padding: 14px 20px;"+
									   " margin: 8px 0;"+
									   " border: none;"+
									   " border-radius: 4px;"+
									   " cursor: pointer;"+
									"}"+
								
									"input[type=submit]:hover {"+
									    "background-color: #45a049;"+
									"}"+
								
									
									"</style>"+
									"<body>"+
									"<br>"+"<br>"+
									"<h3>Local Time Zone</h3>";

}

package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.UserController;

public class LocalTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HTMLStrings html = new HTMLStrings();
	private UserController userController = new UserController();
      
    public LocalTime() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session=request.getSession(false);  
		PrintWriter out = response.getWriter();
		
		if( session!=null ){ 
			String cities = userController.cities();
			String usernameS = "<li><a href=#><span></span>" +  session.getAttribute("username") + "</a></li>";
			if ( session.getAttribute("role").equals("admin") ){
				out.println(html.docType + html.titleLocalTime + html.menubarHead + html.menubarAdminActions + usernameS + 
						html.usernameSession + html.formLocalTime + cities + html.docEnd);
			}
			else{
				out.println(html.docType + html.titleLocalTime + html.menubarHead + html.menubarClientFlights + usernameS + 
						html.usernameSession + html.formLocalTime + cities + html.docEnd);
			}
		}  
		else{  
			out.print("Please login first");  
			response.sendRedirect("login");
		}  
		out.close();  
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session=request.getSession(false);  
		PrintWriter out = response.getWriter();
		
		if( session!=null ){ 
			String localTime = userController.localTime(request.getParameter("city"));
			String usernameS = "<li><a href=#><span></span>" +  session.getAttribute("username") + "</a></li>";
			if ( session.getAttribute("role").equals("admin") ){
				out.println(html.docType + html.titleLocalTime + html.menubarHead + html.menubarAdminActions + usernameS + 
						html.usernameSession + html.formLocalTime + localTime + html.docEnd);
			}
			else{
				out.println(html.docType + html.titleLocalTime + html.menubarHead + html.menubarClientFlights + usernameS + 
					html.usernameSession + html.formLocalTime + localTime + html.docEnd);
			}
		}  
		else{  
			out.print("Please login first");  
			response.sendRedirect("login");
		}  
		out.close();  
	}

}

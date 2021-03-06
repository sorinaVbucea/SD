package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Admin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private HTMLStrings html = new HTMLStrings();
       
    public Admin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session=request.getSession(false);  
		PrintWriter out = response.getWriter();
		
		if( session!=null && session.getAttribute("role").equals("admin")){  
			String usernameS = "<li><a href=\"admin\"><span></span>" +  session.getAttribute("username") + "</a></li>";
			out.println(html.docType + html.titleAdmin + html.menubarHead + html.menubarAdmin + usernameS +
					html.usernameSession + html.flightImg +  html.docEnd);
			System.out.println(html.docType + html.titleAdmin + html.menubarHead + html.menubarAdmin + usernameS +
					html.usernameSession + html.flightImg +  html.docEnd);
		}  
		else{  
			out.print("Please login first");  
			response.sendRedirect("login");
		}  
		out.close();  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.AdminController;

/**
 * Servlet implementation class CitiesAdminUpdate
 */
public class CitiesAdminUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HTMLStrings html = new HTMLStrings();
	private AdminController adminController = new AdminController();
       
    public CitiesAdminUpdate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session=request.getSession(false);  
		PrintWriter out = response.getWriter();
		if( session!=null && session.getAttribute("role").equals("admin") ){  
			adminController.updateCity(request.getParameter("id"), request.getParameter("name"), request.getParameter("country"), request.getParameter("latitude"), request.getParameter("longitude"));
			response.sendRedirect("citiesAdmin");
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
		
		if( session!=null && session.getAttribute("role").equals("admin") ){  
			String cityUpdate = adminController.readCity(request.getParameter("id"));
			String usernameS = "<li><a href=\"admin\"><span></span>" +  session.getAttribute("username") + "</a></li>";
			out.println(html.docType + html.titleAdmin + html.menubarHead + html.tableHead +
					html.menubarAdminActions + usernameS + html.usernameSession + html.formUpdate1 +  
					cityUpdate + html.formUpdate2 + html.docEnd);
		}  
		else{  
			out.print("Please login first");  
			response.sendRedirect("login");
		}  
		out.close();  
	}

}

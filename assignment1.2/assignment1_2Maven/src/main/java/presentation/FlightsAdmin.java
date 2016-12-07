package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.AdminController;

public class FlightsAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HTMLStrings html = new HTMLStrings();
	private AdminController adminController = new AdminController();
       
    public FlightsAdmin() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session=request.getSession(false);  
		PrintWriter out = response.getWriter();
		
		if( session!=null && session.getAttribute("role").equals("admin")){ 
			String flights = adminController.readFlights();
			String usernameS = "<li><a href=\"admin\"><span></span>" +  session.getAttribute("username") + "</a></li>";
			out.println(html.docType + html.titleAdmin + html.menubarHead + html.tableHead +
					html.menubarAdminActions + usernameS + html.usernameSession + html.tableFirstFlights +  
					html.tableHeadingFlights + flights);
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
		if( session!=null && session.getAttribute("role").equals("admin")){ 
			adminController.addFlight(request.getParameter("number"), request.getParameter("airplaneType"), 
					request.getParameter("departureCity"), request.getParameter("arrivalCity"),
					request.getParameter("departureDate"), request.getParameter("arrivalDate"));
			doGet(request, response);
		}  
		else{  
			out.print("Please login first");  
			response.sendRedirect("login");
		}  
		out.close();  
	}

}

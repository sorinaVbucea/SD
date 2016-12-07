package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.AdminController;

public class CitiesAdmin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private HTMLStrings html = new HTMLStrings();
	private AdminController adminController = new AdminController();
  
    public CitiesAdmin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String cities = adminController.readCities();
		
		HttpSession session = request.getSession(false);  
		PrintWriter out = response.getWriter();
		
		if( session!=null && session.getAttribute("role").equals("admin") ){  
			String usernameS = "<li><a href=\"admin\"><span></span>" +  session.getAttribute("username") + "</a></li>";
			out.println(html.docType + html.titleAdmin + html.menubarHead + html.tableHead +
					html.menubarAdminActions + usernameS + html.usernameSession + html.tableFirstCities +  
					html.tableHeadingCities + cities +  html.citiesAdd);
		}  
		else{  
			out.print("Please login first");  
			response.sendRedirect("login");
		}  
		out.close();  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		adminController.addCity(request.getParameter("name"), request.getParameter("country"), request.getParameter("latitude"), request.getParameter("longitude"));
		doGet(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		adminController.updateCity(request.getParameter("id"), request.getParameter("name"), request.getParameter("country"), request.getParameter("latitude"), request.getParameter("longitude"));
		doGet(request, response);
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		adminController.deleteCity(request.getParameter("id"));
		doGet(request, response);
	}

}

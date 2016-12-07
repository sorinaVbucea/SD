package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.AdminController;

public class CitiesAdminDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminController adminController = new AdminController();
       
    public CitiesAdminDelete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session=request.getSession(false);  
		PrintWriter out = response.getWriter();
		
		if( session!=null && session.getAttribute("role").equals("admin") ){
			adminController.deleteCity(request.getParameter("id"));
			response.sendRedirect("citiesAdmin");
		}
		else{  
			out.print("Please login first");  
			response.sendRedirect("login");
		}  
		out.close(); 
		
	}

}

package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.AdminController;

public class FlightsAdminDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminController adminController = new AdminController();
       

    public FlightsAdminDelete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
		response.setContentType("text/html");
		
		HttpSession session=request.getSession(false);  
		PrintWriter out = response.getWriter();
		if( session!=null && session.getAttribute("role").equals("admin") ){
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
			adminController.deleteFlight(request.getParameter("id"));
			response.sendRedirect("flightsAdmin");
		}  
		else{  
			out.print("Please login first");  
			response.sendRedirect("login");
		}  
		out.close();
	}

}

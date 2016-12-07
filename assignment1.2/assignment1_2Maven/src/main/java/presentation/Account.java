package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.UserController;

public class Account extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HTMLStrings html = new HTMLStrings();
	private UserController userController = new UserController();
       
    public Account() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		try {
			out.println(html.docType + html.titleSignUp + html.menubarHead + html.menubarSignUp + html.formSignUp + html.docEnd);
		}finally{
			out.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();   
		PrintWriter out = response.getWriter();
		
		if ( userController.addUser(request.getParameter("username"), request.getParameter("password"), 
				request.getParameter("firstname"), request.getParameter("lastname"))){
	        session.setAttribute("username", request.getParameter("username"));  
	        session.setAttribute("role", "client");
	        session.setMaxInactiveInterval(30*60);
	        response.sendRedirect("client");
		}
		else{  
			out.print("Username allready exist!");  
			response.sendRedirect("account");
		}  
		out.close(); 
      
	}

}

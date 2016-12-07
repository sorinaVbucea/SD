package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.LoginController;

public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private HTMLStrings html = new HTMLStrings();
	private LoginController loginController = new LoginController();

	public Login() {
		super();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		try {
			out.println(html.docType + html.titleLogin + html.menubarHead + html.menubarLogin + html.formLogin + html.docEnd);
		}finally{
			out.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String role = loginController.authentification(request.getParameter("username"), request.getParameter("password"));
		
		HttpSession session = request.getSession();  
        
		switch ( role ) {
			case "admin" : 	session.setAttribute("username", request.getParameter("username"));
							session.setAttribute("role", role);
							session.setMaxInactiveInterval(30*60);
							response.sendRedirect("admin");
			break;
			case "client" : session.setAttribute("username", request.getParameter("username"));
							session.setAttribute("role", role);
							session.setMaxInactiveInterval(30*60);
							response.sendRedirect("client");
			break;
			default : response.sendRedirect("login");
		}
	}

}

package presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import producer.Producer;

public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Producer producer = new Producer();
       
    public Admin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/index.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		producer.sendDVD(request.getParameter("title"), request.getParameter("year"), request.getParameter("price"));
		doGet(request, response);
	}

}

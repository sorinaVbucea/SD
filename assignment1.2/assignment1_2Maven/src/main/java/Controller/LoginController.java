package Controller;

import org.hibernate.cfg.Configuration;

import DAO.UserDAO;

import Model.User;

public class LoginController {
	
	private UserDAO userDAO = new UserDAO(new Configuration().configure().buildSessionFactory());
	
	public String authentification(String username, String password){
		User user =  userDAO.authentification(username, password);
		if (user != null){
			return user.getRole();
		}
		else
			return "Authentification failed!";
	}
	
}

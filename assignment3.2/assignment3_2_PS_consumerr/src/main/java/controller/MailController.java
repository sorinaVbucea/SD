package controller;

import java.util.ArrayList;

import model.Customer;
import model.DVD;
import service.MailService;

public class MailController {
	
	private MailService mailService = new MailService("sorinav.bucea@gmail.com", "passsssssssssssssssssssssss");
	private static ArrayList<Customer> subsribers = new ArrayList<Customer>();
	
	static{
		subsribers.add(new Customer(0, "sorina", "sorina.bucea@gmail.com"));
		subsribers.add(new Customer(1, "alex", "alex.birla@yahoo.com"));
		subsribers.add(new Customer(1, "roxana", "roxana.jurca@gmail.com"));
		subsribers.add(new Customer(1, "maria", "maria.bihoi@gmail.com"));
		subsribers.add(new Customer(1, "bianca", "bianca.giosan@gmail.com"));
	}
	
	public void manageService(DVD message){
		for(int i = 0; i < subsribers.size(); i++)
			mailService.sendMail(subsribers.get(i).getEmail(), "New DVD added", message);
	}


}

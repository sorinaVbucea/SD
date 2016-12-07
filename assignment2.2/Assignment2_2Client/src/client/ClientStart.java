package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

import rmi.Car;
import rmi.IService;

public class ClientStart {
	
	private ClientView clientView;
	private static final String IP = "127.0.0.1";
	private static final int PORT = 1089;
	private IService service;
	
	public ClientStart(){
		clientView = new ClientView();
		clientView.setVisible(true);
		clientView.addBtnTaxActionListener(new TaxActionListener());
		clientView.addBtnPriceActionListener(new PriceActionListener());
	}
	
	public void printTax(double tax){
		clientView.printTax(tax);
	}
	
	public void printPrice(double price){
		clientView.printPrice(price);
	}
	
	public void displayErrorMessage(String message) {
		clientView.clear();
		JOptionPane.showMessageDialog(clientView, message, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void displayInfoMessage(String message) {
		clientView.clear();
		JOptionPane.showMessageDialog(clientView, message, "Success", JOptionPane.PLAIN_MESSAGE);
	}
	
	
	class TaxActionListener implements ActionListener {
		@Override
			public void actionPerformed(ActionEvent e) {
			try {
				int year = Integer.parseInt(clientView.getCarYear());
				int engine = Integer.parseInt(clientView.getCarEngine());
				double price = Double.parseDouble(clientView.getCarPrice());
			
				Registry myRegistry = LocateRegistry.getRegistry(IP, PORT);
				service = (IService) myRegistry.lookup("service");
				Car car = new Car(year, engine, price);
				printTax(service.computeTax(car));
				
			} catch (NumberFormatException ex) {
				displayErrorMessage("Please enter a number!");
			} catch (IllegalArgumentException ex){
				displayErrorMessage(ex.getMessage());
			} catch (IOException ex) {
				displayErrorMessage(ex.getMessage());
			}catch (Exception ex) {
				ex.printStackTrace();
			} 
		}
	}
	
	class PriceActionListener implements ActionListener {
		@Override
			public void actionPerformed(ActionEvent e) {
			try {
				int year = Integer.parseInt(clientView.getCarYear());
				int engine = Integer.parseInt(clientView.getCarEngine());
				double price = Double.parseDouble(clientView.getCarPrice());

				Registry myRegistry = LocateRegistry.getRegistry(IP, PORT);
				service = (IService) myRegistry.lookup("service");
				Car car = new Car(year, engine, price);
				printPrice(service.computePrice(car));
				
			} catch (NumberFormatException ex) {
				displayErrorMessage("Please enter a number!");
			} catch (IllegalArgumentException ex){
				displayErrorMessage(ex.getMessage());
			} catch (IOException ex) {
				displayErrorMessage(ex.getMessage());
			} catch (Exception ex) {
				ex.printStackTrace();
			}  
				
		}
	}

	public static void main(String[] args) {
		new ClientStart();
	}
}

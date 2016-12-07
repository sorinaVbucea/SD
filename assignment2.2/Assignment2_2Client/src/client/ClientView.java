package client;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ClientView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textYear;
	private JTextField textEngine;
	private JTextField textPrice;
	private JButton btnTax;
	private JButton btnPrice;
	private JTextArea textArea;

	public ClientView() {
		setTitle("RMI - Assignment 2.2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 600, 350);
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("img/carTaxes.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		contentPane = new ClientPanel(image);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblInsertNewCar = new JLabel("Insert car details:");
		lblInsertNewCar.setBounds(10, 11, 150, 14);
		contentPane.add(lblInsertNewCar);

		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(10, 36, 80, 14);
		contentPane.add(lblYear);

		JLabel lblEngine = new JLabel("Engine");
		lblEngine.setBounds(10, 61, 80, 14);
		contentPane.add(lblEngine);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(10, 86, 46, 14);
		contentPane.add(lblPrice);

		textYear = new JTextField();
		textYear.setBounds(60, 33, 150, 20);
		contentPane.add(textYear);
		textYear.setColumns(10);

		textEngine = new JTextField();
		textEngine.setBounds(60, 58, 150, 20);
		contentPane.add(textEngine);
		textEngine.setColumns(10);

		textPrice = new JTextField();
		textPrice.setBounds(60, 83, 150, 20);
		contentPane.add(textPrice);
		textPrice.setColumns(10);

		btnTax = new JButton("TAX");
		btnTax.setBounds(20, 150, 60, 23);
		contentPane.add(btnTax);

		btnPrice = new JButton("SELLING PRICE");
		btnPrice.setBounds(130, 150, 120, 23);
		contentPane.add(btnPrice);

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(270, 20, 200, 55);
		contentPane.add(textArea);
	
	}

	public void addBtnTaxActionListener(ActionListener e) {
		btnTax.addActionListener(e);
	}

	public void addBtnPriceActionListener(ActionListener e) {
		btnPrice.addActionListener(e);
	}
	
	public String getCarYear() {
		return textYear.getText();
	}

	public String getCarEngine() {
		return textEngine.getText();
	}

	public String getCarPrice() {
		return textPrice.getText();
	}

	public void printTax(double tax) {
		textArea.setText("Tax :\n " + tax);
	}
	
	public void printPrice(double price) {
		textArea.setText("Selling price :\n " + price);
	}

	public void clear() {
		textYear.setText("");
		textEngine.setText("");
		textPrice.setText("");
		textArea.setText("");
	}
}
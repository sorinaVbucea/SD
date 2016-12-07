package ro.tuc.dsrl.ds.handson.assig.one.client.views;

import ro.tuc.dsrl.ds.handson.assig.one.client.entities.Student;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;

/**
 * @Author: Technical University of Cluj-Napoca, Romania
 *          Distributed Systems, http://dsrl.coned.utcluj.ro/
 * @Module: assignment-one-client
 * @Since: Sep 1, 2015
 * @Description:
 *	CatalogView is a JFrame which contains the UI elements of the Client application.
 */
public class CatalogView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFirstname;
	private JTextField textLastname;
	private JTextField textMail;
	private JTextField textId;
	private JButton btnGet;
	private JButton btnPost;
	private JTextArea textArea;
	private JTextField textIdDelete;
	private JButton btnDelete, btnGetAll;

	public CatalogView() {
		setTitle("HTTP Protocol simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblInsertNewStudent = new JLabel("Insert new student");
		lblInsertNewStudent.setBounds(10, 11, 150, 14);
		contentPane.add(lblInsertNewStudent);

		JLabel lblFirstname = new JLabel("First name");
		lblFirstname.setBounds(10, 36, 80, 14);
		contentPane.add(lblFirstname);

		JLabel lblLastname = new JLabel("Last name");
		lblLastname.setBounds(10, 61, 80, 14);
		contentPane.add(lblLastname);

		JLabel lblMail = new JLabel("Mail");
		lblMail.setBounds(10, 86, 46, 14);
		contentPane.add(lblMail);

		textFirstname = new JTextField();
		textFirstname.setBounds(90, 33, 200, 20);
		contentPane.add(textFirstname);
		textFirstname.setColumns(10);

		textLastname = new JTextField();
		textLastname.setBounds(90, 58, 200, 20);
		contentPane.add(textLastname);
		textLastname.setColumns(10);

		textMail = new JTextField();
		textMail.setBounds(90, 83, 200, 20);
		contentPane.add(textMail);
		textMail.setColumns(10);

		btnPost = new JButton("POST");
		btnPost.setBounds(100, 132, 89, 23);
		contentPane.add(btnPost);

		JLabel lblFindStudentBy = new JLabel("Find student by id ");
		lblFindStudentBy.setBounds(370, 11, 145, 14);
		contentPane.add(lblFindStudentBy);

		JLabel lblId = new JLabel("Id");
		lblId.setBounds(370, 36, 46, 14);
		contentPane.add(lblId);

		textId = new JTextField();
		textId.setBounds(430, 33, 86, 20);
		contentPane.add(textId);
		textId.setColumns(10);

		btnGet = new JButton("GET");
		btnGet.setBounds(400, 77, 89, 23);
		contentPane.add(btnGet);

		textArea = new JTextArea();
		textArea.setBounds(360, 131, 200, 120);
		contentPane.add(textArea);
		
		JLabel lblDeleteStudentBy = new JLabel("Delete student by id ");
		lblDeleteStudentBy.setBounds(10, 180, 170, 14);
		contentPane.add(lblDeleteStudentBy);

		JLabel lblDelete = new JLabel("Id");
		lblDelete.setBounds(10, 200, 46, 14);
		contentPane.add(lblDelete);

		textIdDelete = new JTextField();
		textIdDelete.setBounds(80, 200, 110, 20);
		contentPane.add(textIdDelete);
		textIdDelete.setColumns(10);

		btnDelete = new JButton("DELETE");
		btnDelete.setBounds(100, 240, 89, 23);
		contentPane.add(btnDelete);
		
		btnGetAll = new JButton("");
		btnGetAll.setBounds(300, 270, 20, 23);
		contentPane.add(btnGetAll);
	}

	public void addBtnGetActionListener(ActionListener e) {
		btnGet.addActionListener(e);
	}

	public void addBtnPostActionListener(ActionListener e) {
		btnPost.addActionListener(e);
	}
	
	public void addBtnDeleteActionListener(ActionListener e) {
		btnDelete.addActionListener(e);
	}
	
	public void addBtnGetAllActionListener(ActionListener e) {
		btnGetAll.addActionListener(e);
	}
	
	public String getStudentIdDelete() {
		return textIdDelete.getText();
	}

	public String getStudentId() {
		return textId.getText();
	}

	public String getFirstname() {
		return textFirstname.getText();
	}

	public String getLastname() {
		return textLastname.getText();
	}

	public String getMail() {
		return textMail.getText();
	}

	public void printStudent(Student student) {
		textArea.setText(student.toString());
	}
	
	public void printStudentDeleted(Student student) {
		textArea.setText(student.toString() + "\n DELETED");
	}

	public void clear() {
		textId.setText("");
		textFirstname.setText("");
		textLastname.setText("");
		textMail.setText("");
		textIdDelete.setText("");
		textArea.setText("");
	}
}

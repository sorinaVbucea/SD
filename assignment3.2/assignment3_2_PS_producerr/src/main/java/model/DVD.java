package model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DVD implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String title;
	private int year;
	private double price;
	
	public DVD(){
		
	}
	
	public DVD(String title, int year, double price){
		this.title = title;
		this.year = year;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString(){
		return "DVD => title=\"" + title + "\"" + ", year=" + year + ", price=" + price;
	}
	
	public byte[] getBytes(){
		DVD dvd = new DVD(this.title, this.year, this.price);
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutput out = null;
		byte[] dvdBytes = null;
		try {
			out = new ObjectOutputStream(byteArrayOutputStream);
			out.writeObject(dvd);
			out.flush();
			dvdBytes = byteArrayOutputStream.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		  try {
			  byteArrayOutputStream.close();
		  } catch (IOException ex) {
			  ex.printStackTrace();
		  }
		}
		return dvdBytes;
	}
	
	public DVD getDVD(byte[] dvdBytes){
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(dvdBytes);
		ObjectInput in = null;
		DVD dvd = null;
		try {
			in = new ObjectInputStream(byteArrayInputStream);
			dvd = (DVD) in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return dvd;
	}
}

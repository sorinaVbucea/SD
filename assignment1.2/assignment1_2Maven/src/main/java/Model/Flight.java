package Model;

import java.sql.Timestamp;

public class Flight {
	
	private int id;
	private int number;
	private String airplaneType;
	private Timestamp departureDate;
	private Timestamp arrivalDate;
	private int departureCity;
	private int arrivalCity;
	
	public Flight(){}
	public Flight(int number, String airplaneType, int departureCity, int arrivalCity, Timestamp departureDate, Timestamp arrivalDate){
		this.number = number;
		this.airplaneType = airplaneType;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAirplaneType() {
		return airplaneType;
	}
	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}
	public Timestamp getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Timestamp departureDate) {
		this.departureDate = departureDate;
	}
	public Timestamp getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Timestamp arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public int getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(int departureCity) {
		this.departureCity = departureCity;
	}
	public int getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(int arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	
	
	
	
//	public boolean equals(Object obj) {
//		if (obj == null) return false;
//		if (!this.getClass().equals(obj.getClass())) return false;
//
//		Flight obj2 = (Flight)obj;
//		if((this.id == obj2.getId()) && (this.number == obj2.getNumber()) && 
//				(this.airplaneType.equals(obj2.getAirplaneType()) && 
//						(this.departureDate.equals(obj2.getDepartureDate())) && 
//						(this.arrivalDate.equals(obj2.getArrivalDate()))))
//			return true;
//		
//		return false;
//	}
//	public int hashCode() {
//		int tmp = 0;
//		tmp = ( id + number + airplaneType + departureDate + arrivalDate ).hashCode();
//		return tmp;
//	}
	
}

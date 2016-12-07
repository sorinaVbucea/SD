package Controller;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.cfg.Configuration;

import DAO.AdminDAO;
import Model.City;
import Model.Flight;
import presentation.HTMLStrings;

public class AdminController {

	private AdminDAO adminDAO = new AdminDAO(new Configuration().configure().buildSessionFactory());
	private HTMLStrings html = new HTMLStrings();
	
	public String readFlights(){
		List<Flight> flights = adminDAO.findFlights();
		String flightsHtml = "";
		for ( int i = 0; i < flights.size(); i++ ){
			flightsHtml += "<tr> <td id=\"number\">" + flights.get(i).getNumber() + "</td>";
			flightsHtml += "<td id=\"airplaneType\">" + flights.get(i).getAirplaneType() + "</td>";
			flightsHtml += "<td id=\"departureCity\">" + adminDAO.findCity(flights.get(i).getDepartureCity()).getName() + "</td>";
			flightsHtml += "<td id=\"arrivalCity\">" + adminDAO.findCity(flights.get(i).getArrivalCity()).getName() + "</td>";
			flightsHtml += "<td id=\"departureDate\">" + flights.get(i).getDepartureDate() + "</td>";
			flightsHtml += "<td id=\"arrivalDate\">" + flights.get(i).getArrivalDate()+ "</td>"+ html.tdAdd1;
			flightsHtml += "<form class=\"form-horizontal\" action=\"flightsAdminDelete?id=" + flights.get(i).getId() + "\" method=\"POST\">" + html.tdAdd2 + 
					"<form class=\"form-horizontal\" action=\"flightsAdminUpdate?id=" + flights.get(i).getId() + "\" method=\"POST\">" + html.tdAdd3;
			
		}
		flightsHtml += "</table>" + html.flightsAdd1;
		List<City> cities = adminDAO.findCities();
	    
		flightsHtml += "<label><b>Departure City </b></label> " +
			"<select class=\"input-container\" id=\"select-1\" name=\"departureCity\">";
				for (int j = 0; j < cities.size(); j++){
					flightsHtml += "<option>" + cities.get(j).getName() + "</option>";
				}
				
		flightsHtml += "<br><br> </select> <br> <br>";
		
		flightsHtml += "<label><b>Arrival City  </b></label> " +
				"<select class=\"input-container\" id=\"select-1\" name=\"arrivalCity\">";
					for (int j = 0; j < cities.size(); j++){
						flightsHtml += "<option>" + cities.get(j).getName() + "</option>";
					}
					
		flightsHtml += "<br><br> </select><br> <br>" + html.flightsAdd2;
		
		return flightsHtml;
	}
	
	public String readFlight(String id){
		Flight flight = adminDAO.findFlight(Integer.valueOf(id));
		String flightHtml = "";
		flightHtml += "<form class=\"modal-content animate\" action=\"flightsAdminUpdate?id=" + flight.getId() + "method=\"GET\">" + 
		"<div class=\"imgcontainer\">" +
		  	"<span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>"+
		  "</div>" +
		  	
		  "<div class=\"container\">" +
		    "<input type=\"hidden\" name=\"id\" value=" + flight.getId() + ">" +
		    "<label><b>Number</b></label>" +
		    "<input type=\"text\" name=\"number\" value=" + flight.getNumber() + ">" +
		
		    "<label><b>Airplane Type</b></label>" +
		    "<input type=\"text\" name=\"airplaneType\" value=" + flight.getAirplaneType() + ">";
		    
		List<City> cities = adminDAO.findCities();
		City cityDeparture = adminDAO.findCity(flight.getDepartureCity());
		City cityArrival = adminDAO.findCity(flight.getArrivalCity());
		    
		flightHtml += "<label><b>Departure City </b></label> " +
			"<select class=\"input-container\" id=\"select-1\" name=\"departureCity\">";
				for (int i = 0; i < cities.size(); i++){
					if ( cities.get(i).getName().equals(cityDeparture.getName()) ){
						flightHtml += "<option selected=\"selected\">" + cities.get(i).getName() + "</option>";
					}else{
						flightHtml += "<option>" + cities.get(i).getName() + "</option>";
					}
				}
				
		flightHtml += "<br><br> </select> <br> <br>";
		
		flightHtml += "<label><b>Arrival City  </b></label> " +
				"<select class=\"input-container\" id=\"select-1\" name=\"arrivalCity\">";
					for (int i = 0; i < cities.size(); i++){
						if ( cities.get(i).getName().equals(cityArrival.getName()) ){
							flightHtml += "<option selected=\"selected\">" + cities.get(i).getName() + "</option>";
						}else{
							flightHtml += "<option>" + cities.get(i).getName() + "</option>";
						}
					}
					
		flightHtml += "<br><br> </select><br> <br>"+
						
			"<label><b>Departure Date</b></label>" +
			"<input type=\"text\"  name=\"departureDate\" value=" + flight.getDepartureDate() + ">" +
			
			"<label><b>Arrival Date</b></label>" +
			"<input type=\"text\"  name=\"arrivalDate\" value=" + flight.getArrivalDate() + ">";
		    
		return flightHtml;
	}
	
	public boolean addFlight(String number, String airplaneType, String departureCity, 
			String arrivalCity, String departureDate, String arrivalDate){
		Flight flight = new Flight(Integer.valueOf(number), airplaneType, adminDAO.findCityName(departureCity).getId(), 
					adminDAO.findCityName(arrivalCity).getId(), Timestamp.valueOf(departureDate), Timestamp.valueOf(arrivalDate));
		if ( adminDAO.addFlight(flight) != null ){
			return true;
		};
		return false;
	}
	
	public boolean updateFlight(String id, String number, String airplaneType, String departureCity, 
			String arrivalCity, String departureDate, String arrivalDate){
		Flight flight = new Flight(Integer.valueOf(number), airplaneType, adminDAO.findCityName(departureCity).getId(), 
				adminDAO.findCityName(arrivalCity).getId(), Timestamp.valueOf(departureDate), Timestamp.valueOf(arrivalDate));
		flight.setId(Integer.valueOf(id));
		if ( adminDAO.updateFlight(flight) != null){
			return true;
		};
		return false;
	}
	
	public boolean deleteFlight(String id){
		if ( adminDAO.deleteFlight(Integer.valueOf(id)) != null){
			return true;
		};
		return false;
	}
	
	public String readCities(){
		List<City> cities = adminDAO.findCities();
		String citiesHtml = "";
		for ( int i = 0; i < cities.size(); i++ ){
			citiesHtml += "<tr> <td id=\"name\">" + cities.get(i).getName() + "</td>";
			citiesHtml += "<td id=\"country\">" + cities.get(i).getCountry() + "</td>";
			citiesHtml += "<td id=\"latitude\">" + cities.get(i).getLatitude() + "</td>";
			citiesHtml += "<td id=\"longitude\">" + cities.get(i).getLongitude() + "</td>" + html.tdAdd1;
			citiesHtml += "<form class=\"form-horizontal\" action=\"citiesAdminDelete?id=" + cities.get(i).getId() + "\" method=\"POST\">" + html.tdAdd2 + 
					"<form class=\"form-horizontal\" action=\"citiesAdminUpdate?id=" + cities.get(i).getId() + "\" method=\"POST\">" + html.tdAdd3;
		}
		
		citiesHtml += "</table>";
		
		return citiesHtml;
	}
	
	public String readCity(String id){
		City city = adminDAO.findCity(Integer.valueOf(id));
		String cityHtml = "";
		cityHtml += "<form class=\"modal-content animate\" action=\"citiesAdminUpdate?id=" + city.getId() + "method=\"GET\">" + 
		"<div class=\"imgcontainer\">" +
		  	"<span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>"+
		  "</div>" +
		  	
		  "<div class=\"container\">" +
		    "<input type=\"hidden\" name=\"id\" value=" + city.getId() + ">" +
		    "<label><b>Name</b></label>" +
		    "<input type=\"text\" name=\"name\" value=" + city.getName() + ">" +
		
		    "<label><b>Country</b></label>" +
		    "<input type=\"text\" name=\"country\" value=" + city.getCountry() + ">" +
		    
			"<label><b>Latitude</b></label>" +
			"<input type=\"text\"  name=\"latitude\" value=" + city.getLatitude() + ">" +
			
			"<label><b>Longitude</b></label>" +
			"<input type=\"text\"  name=\"longitude\" value=" + city.getLongitude() + ">";
		return cityHtml;
	}
	
	public boolean addCity(String name, String country, String latitude, String longitude){
		City city = new City(name, country, Float.valueOf(latitude), Float.valueOf(longitude));
		if ( adminDAO.addCity(city) != null){
			return true;
		};
		return false;
	}
	
	public boolean updateCity(String id, String name, String country, String latitude, String longitude){
		City city = new City(name, country, Float.valueOf(latitude), Float.valueOf(longitude));
		city.setId(Integer.valueOf(id));
		if ( adminDAO.updateCity(city) != null){
			return true;
		};
		return false;
	}
	
	public boolean deleteCity(String id){
		if ( adminDAO.deleteCity(Integer.valueOf(id)) != null){
			return true;
		};
		return false;
	}
	
}

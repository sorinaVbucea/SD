package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.hibernate.cfg.Configuration;

import DAO.UserDAO;
import Model.City;
import Model.Flight;
import Model.User;

public class UserController {
	
	private UserDAO userDAO = new UserDAO(new Configuration().configure().buildSessionFactory());
	
	public String readFlights(){
		List<Flight> flights = userDAO.findFlights();
		String flightsHtml = "";
		for ( int i = 0; i < flights.size(); i++ ){
			flightsHtml += "<tr> <td id=\"number\">" + flights.get(i).getNumber() + "</td>";
			flightsHtml += "<td id=\"airplaneType\">" + flights.get(i).getAirplaneType() + "</td>";
			flightsHtml += "<td id=\"departureCity\">" + userDAO.findCity(flights.get(i).getDepartureCity()).getName() + "</td>";
			flightsHtml += "<td id=\"arrivalCity\">" + userDAO.findCity(flights.get(i).getArrivalCity()).getName() + "</td>";
			flightsHtml += "<td id=\"departureDate\">" + flights.get(i).getDepartureDate() + "</td>";
			flightsHtml += "<td id=\"arrivalDate\">" + flights.get(i).getArrivalDate()+ "</td></tr>";
			
		}
		
		flightsHtml += "</table>";
		
		return flightsHtml;
	}
	
	public boolean addUser(String username, String password, String firstname, String lastname){
		User user = new User(username, password, firstname, lastname, "client");
		if ( userDAO.addUser(user) != null){
			return true;
		}
		return false;
	}
	
	public String cities(){
		String citiesHtml = "";
		List<City> cities = userDAO.findCities();
		citiesHtml += "<div> <br> <br> <form action=\"localTime\" method=\"POST\"> <label for=\"city\">City</label> <select id=\"city\" name=\"city\">";
		for (int j = 0; j < cities.size(); j++){
			citiesHtml += "<option>" + cities.get(j).getName() + "</option>";
		}
		citiesHtml += "</select> <br> <br> <br> <br> <input type=\"submit\" value=\"Get Time Zone\"></form></div>";
		return citiesHtml;
	}

	public String localTime(String cityName){
		String citiesHtml = "";
		try {
			City city = userDAO.findCityName(cityName);
			String urlPath = "http://new.earthtools.org/timezone/" + city.getLatitude() + "/" + city.getLongitude();
			
			URL url = new URL(urlPath);
			HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
			httpConnection.setRequestMethod("GET");
			int responseCode = httpConnection.getResponseCode();
			
			System.out.println("GET Response Code :: " + responseCode);
			
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader in = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				
				in.close();
				
				String[] responseSlpit = response.toString().split("<localtime>");
			    String[] time = responseSlpit[1].split("</localtime>");
			    System.out.println(time[0]);
				
				List<City> cities = userDAO.findCities();
				citiesHtml += "<div> <br> <br> <form action=\"localTime\" method=\"POST\"> <label for=\"city\">City</label> <select id=\"city\" name=\"city\">";
				for (int j = 0; j < cities.size(); j++){
					if( cities.get(j).getName().equals(cityName) ){
						citiesHtml += "<option selected=\"selected\">" + cities.get(j).getName() + "</option>";
					}
					else{
						citiesHtml += "<option>" + cities.get(j).getName() + "</option>";
					}
				}
				citiesHtml += "</select> <br> <br><label for=\"time\">Local Time</label> <br> <p id=\"time\" name=\"time\" >"
						+ time[0] + "</p> <input type=\"submit\" value=\"Get Time Zone\"></form></div>";
			} else {
				System.out.println("GET request not worked");
			}
			
			} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return citiesHtml;
	}
	
}

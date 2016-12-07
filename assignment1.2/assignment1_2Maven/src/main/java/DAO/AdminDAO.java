package DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Model.City;
import Model.Flight;
import Model.User;

public class AdminDAO {
	
	private SessionFactory factory;

	public AdminDAO(SessionFactory factory) {
		this.factory = factory;
	}

	public Flight addFlight(Flight flight) {
		int flightId = -1;
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			flightId = (Integer) session.save(flight);
			flight.setId(flightId);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return flight;
	}

	@SuppressWarnings("unchecked")
	public List<Flight> findFlights() {
		Session session = factory.openSession();
		Transaction tx = null;
		List<Flight> flights = null;
		try {
			tx = session.beginTransaction();
			flights = session.createQuery("FROM Flight").list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return flights;
	}

	@SuppressWarnings("unchecked")
	public Flight findFlight(int id) {
		Session session = factory.openSession();
		Transaction tx = null;
		List<Flight> flights = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM Flight WHERE id = :id");
			query.setParameter("id", id);
			flights = query.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return flights != null && !flights.isEmpty() ? flights.get(0) : null;
	}
	
	public Flight updateFlight(Flight flight) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(flight);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return flight;
	}
	
	public Flight deleteFlight(int id) {
		Flight flight = new Flight();
		flight.setId(id);
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			flight = (Flight) session.get(Flight.class, id);
			if (flight != null){
				tx = session.beginTransaction();
				session.delete(flight);
				tx.commit();
			}
			else
				return null;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return flight;
	}
	
	public City addCity(City city) {
		int cityId = -1;
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			cityId = (Integer) session.save(city);
			city.setId(cityId);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return city;
	}

	@SuppressWarnings("unchecked")
	public List<City> findCities() {
		Session session = factory.openSession();
		Transaction tx = null;
		List<City> cities = null;
		try {
			tx = session.beginTransaction();
			cities = session.createQuery("FROM City ORDER BY name ASC").list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return cities;
	}

	@SuppressWarnings("unchecked")
	public City findCity(int id) {
		Session session = factory.openSession();
		Transaction tx = null;
		List<City> cities = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM City WHERE id = :id");
			query.setParameter("id", id);
			cities = query.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return cities != null && !cities.isEmpty() ? cities.get(0) : null;
	}
	
	@SuppressWarnings("unchecked")
	public City findCityName(String name) {
		Session session = factory.openSession();
		Transaction tx = null;
		List<City> cities = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM City WHERE name = :name");
			query.setParameter("name", name);
			cities = query.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return cities != null && !cities.isEmpty() ? cities.get(0) : null;
	}
	
	public City updateCity(City city) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(city);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return city;
	}
	
	public City deleteCity(int id) {
		City city = new City();
		city.setId(id);
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			city = (City) session.get(City.class, id);
			if (city != null){
				tx = session.beginTransaction();
				session.delete(city);
				tx.commit();
			}
			else
				return null;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return city;
	}
	
	public User addUser(User user) {
		int userId = -1;
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			userId = (Integer) session.save(user);
			user.setId(userId);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return user;
	}

	@SuppressWarnings("unchecked")
	public List<User> findUsers() {
		Session session = factory.openSession();
		Transaction tx = null;
		List<User> users = null;
		try {
			tx = session.beginTransaction();
			users = session.createQuery("FROM User").list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return users;
	}

	@SuppressWarnings("unchecked")
	public User findUser(int id) {
		Session session = factory.openSession();
		Transaction tx = null;
		List<User> users = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM User WHERE id = :id");
			query.setParameter("id", id);
			users = query.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return users != null && !users.isEmpty() ? users.get(0) : null;
	}
	
	public User updateUser(User user) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(user);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return user;
	}
	
	public User deleteUser(int id) {
		User user = new User();
		user.setId(id);
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			user = (User) session.get(User.class, id);
			if (user != null){
				tx = session.beginTransaction();
				session.delete(user);
				tx.commit();
			}
			else
				return null;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return user;
	}
	
}

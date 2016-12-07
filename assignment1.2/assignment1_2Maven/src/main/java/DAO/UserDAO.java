package DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Model.City;
import Model.Flight;
import Model.User;

import java.util.List;

public class UserDAO {
	
	private SessionFactory factory;

	public UserDAO(SessionFactory factory) {
		this.factory = factory;
	}
	
	@SuppressWarnings("unchecked")
	public User authentification(String username, String password) {
		Session session = factory.openSession();
		Transaction tx = null;
		List<User> user = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM User WHERE username = :username AND password = :password");
			query.setParameter("username", username);
			query.setParameter("password", password);
			user = query.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return user != null && !user.isEmpty() ? user.get(0) : null;
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
	public List<Flight> findFlightsUser(int id) {
		Session session = factory.openSession();
		Transaction tx = null;
		List<Flight> flights = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM Flight WHERE idUser = :id");
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
		return flights;
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
	public User findUsername(String username) {
		Session session = factory.openSession();
		Transaction tx = null;
		List<User> users = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM User WHERE username = :username");
			query.setParameter("username", username);
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
	
	public User addUser(User user) {
		if ( findUsername(user.getUsername()) != null ){
			return null;
		}
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
}

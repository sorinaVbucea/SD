package ro.tuc.dsrl.ds.handson.assig.one.server.dao;

import ro.tuc.dsrl.ds.handson.assig.one.server.entities.Student;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.*;

/**
 * @Author: Technical University of Cluj-Napoca, Romania
 *          Distributed Systems, http://dsrl.coned.utcluj.ro/
 * @Module: assignment-one-server
 * @Since: Sep 1, 2015
 * @Description:
 * 	Uses Hibernate for CRUD operations on the underlying database.
 * 	The Hibernate configuration files can be found in the src/main/resources folder
 */
public class IntegerDAO {
	private static final Log LOGGER = LogFactory.getLog(StudentDAO.class);

	private SessionFactory factory;

	public IntegerDAO(SessionFactory factory) {
		this.factory = factory;
	}
	
	public Student deleteId(int id) {
		Session session = factory.openSession();
		Transaction tx = null;
		Student student = new Student();
		try {
			student = (Student) session.get(Student.class, id);
			if (student != null){
				tx = session.beginTransaction();
				session.delete(student);
				tx.commit();
			}
			else
				return null;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			LOGGER.error("Can't delete student by id! ", e);
		} finally {
			session.close();
		}
		return student;
	}
}

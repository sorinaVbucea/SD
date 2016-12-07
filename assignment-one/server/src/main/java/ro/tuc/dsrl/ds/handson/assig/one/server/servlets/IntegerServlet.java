package ro.tuc.dsrl.ds.handson.assig.one.server.servlets;

import ro.tuc.dsrl.ds.handson.assig.one.protocol.servlets.AbstractServlet;
import ro.tuc.dsrl.ds.handson.assig.one.server.dao.IntegerDAO;
import ro.tuc.dsrl.ds.handson.assig.one.protocol.encoders.ResponseMessageEncoder;
import ro.tuc.dsrl.ds.handson.assig.one.server.entities.Student;
import ro.tuc.dsrl.ds.handson.assig.one.protocol.enums.StatusCode;
import ro.tuc.dsrl.ds.handson.assig.one.protocol.message.RequestMessage;

import org.hibernate.cfg.Configuration;

/**
 * @Author: Technical University of Cluj-Napoca, Romania
 *          Distributed Systems, http://dsrl.coned.utcluj.ro/
 * @Module: assignment-one-server
 * @Since: Sep 1, 2015
 * @Description:
 *  Serves for generating a response for the student related requests
 */
public class IntegerServlet extends AbstractServlet {
    private IntegerDAO integerDao;

    public IntegerServlet() {
    	integerDao = new IntegerDAO(new Configuration().configure().buildSessionFactory());
    }

    @Override
    public String doDelete(RequestMessage message) {
        String response;

        Integer id = message.getDeserializedObject(Integer.class);
        if (id != null) {
            try {
                Student student = integerDao.deleteId(id);

                if (student == null) {
                    response = ResponseMessageEncoder.encode(StatusCode.NOT_FOUND);
                } else {
                    response = ResponseMessageEncoder.encode(StatusCode.OK, student);
                }
            } catch (NumberFormatException e) {
                response = ResponseMessageEncoder.encode(StatusCode.BAD_REQUEST);
            }
        }
        else {
            response = ResponseMessageEncoder.encode(StatusCode.BAD_REQUEST);
        }

        return response;
    }

	@Override
	public String doPost(RequestMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String doGet(RequestMessage message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String doGetAll(RequestMessage message) {
		// TODO Auto-generated method stub
		return null;
	}
    
}

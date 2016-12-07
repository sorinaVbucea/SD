package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Service extends UnicastRemoteObject implements IService{
	private static final long serialVersionUID = 1L;

	public Service() throws RemoteException {
		 super();
	}
	
	@Override
	public double computeTax(ICar c) throws RemoteException{
		if (c.getEngineCapacity() <= 0) {
			throw new IllegalArgumentException("Engine capacity must be positive.");
		}
		int sum = 8;
		if(c.getEngineCapacity() > 1601) sum = 18;
		if(c.getEngineCapacity() > 2001) sum = 72;
		if(c.getEngineCapacity() > 2601) sum = 144;
		if(c.getEngineCapacity() > 3001) sum = 290;
		return c.getEngineCapacity() / 200.0 * sum;
	}
	     
	@Override
	public double computePrice(ICar c) throws RemoteException{
		if (c.getPrice() <= 0) {
			throw new IllegalArgumentException("Purchasing price must be positive.");
		}
		double sellingPrice = c.getPrice() - c.getPrice()/7 * ( 2016 - c.getYear());
		return sellingPrice;
	}

}

package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IService extends Remote{
	double computeTax(ICar c) throws RemoteException;
	double computePrice(ICar c) throws RemoteException;

}

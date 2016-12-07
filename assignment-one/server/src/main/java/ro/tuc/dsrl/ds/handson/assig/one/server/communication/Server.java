package ro.tuc.dsrl.ds.handson.assig.one.server.communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: Technical University of Cluj-Napoca, Romania
 *          Distributed Systems, http://dsrl.coned.utcluj.ro/
 * @Module: assignment-one-server
 * @Since: Sep 1, 2015
 * @Description:
 * 	Serves for creating a socket that listens, accepts connections and creates
 *	a thread that deals with the communication with the client
 */

/*
 * Runnable should be implemented by any class whose instances are intended to be executed by a thread. 
 * The class must define a method of no arguments called run. 
 * This interface is designed to provide a common protocol for objects that wish to execute code while they are active. 
 * For example, Runnable is implemented by class Thread. Being active simply means that a thread has been started and 
 * has not yet been stopped.
 * A class that implements Runnable can run without subclassing Thread by instantiating a Thread instance and passing 
 * itself in as the target.
 */
public class Server implements Runnable {
	private static final Log LOGGER = LogFactory.getLog(Server.class);

	private ServerSocket serverSocket;

	/**
	 * Create a socket object from the ServerSocket to listen to and accept connections
	 * @param port the port on which the ServerSocket will be bound to
	 * @throws IOException
	 */
	public Server(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		new Thread(this).start();
	}

	/**
	 * Accepts connections from clients and assigns a thread to deal with the messages from and to the client
	 */
	public void run() {
		while (true) {
			try {
				synchronized (this) {
					Socket clientSocket;
					clientSocket = serverSocket.accept();
					Session cThread = new Session(clientSocket);
					cThread.start();
				}
			} catch (IOException e) {
				LOGGER.error("Server can't accept this conection! ", e);
			}
		}
	}

}
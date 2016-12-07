package server;

import rmi.Service;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StartServer {
	
	private static final int PORT = 1089;
	
	private void startServer(){
		try {
			System.setProperty("java.security.policy", "security.policy");
			System.setProperty("java.rmi.server.codebase", "file:/D:/faculta/An%204-2016-2017/SD/workspace/Assignment2_2Client/RMIClient.jar");
			
			System.setSecurityManager(new SecurityManager());
			Registry registry = LocateRegistry.createRegistry(PORT);
			registry.rebind("service", new Service());
		} catch (Exception e) {
			e.printStackTrace();
		}     
		System.out.println("Let's start!");
	}

	public static void main(String[] args) {
		StartServer main = new StartServer();
		main.startServer();
	}

}

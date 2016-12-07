package ro.tuc.dsrl.ds.handson.assig.two.client.communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ro.tuc.dsrl.ds.handson.assig.two.common.entities.Car;
import ro.tuc.dsrl.ds.handson.assig.two.common.serviceinterfaces.IPriceService;
import ro.tuc.dsrl.ds.handson.assig.two.common.serviceinterfaces.ITaxService;
import ro.tuc.dsrl.ds.handson.assig.two.rpc.Naming;

import java.io.IOException;

/**
 * @Author: Technical University of Cluj-Napoca, Romania Distributed Systems,
 *          http://dsrl.coned.utcluj.ro/
 * @Module: assignment-two-client
 * @Since: Sep 24, 2015
 * @Description: Starting point of the Client application.
 */
public class ClientStart { //Sonar - verifica calitatea codului
	private static final Log LOGGER = LogFactory.getLog(ClientStart.class);

	private ClientStart() {
	}

	public static void main(String[] args) throws IOException {
		ITaxService taxService = null;
		IPriceService priceService = null;
		try {
			taxService = Naming.lookup(ITaxService.class, ServerConnection.getInstance());
			System.out.println("Tax value: " + taxService.computeTax(new Car(2009, 2000)));
			
			priceService = Naming.lookup(IPriceService.class, ServerConnection.getInstance());
			System.out.println("Selling price value: " + priceService.computePrice(new Car(2011, 2000, 756.25)));
			ServerConnection.getInstance().closeAll();
			
		} catch (IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
			ServerConnection.getInstance().closeAll();
		} catch (Exception e) {
			LOGGER.error("",e);
			ServerConnection.getInstance().closeAll();
		}
	}
}

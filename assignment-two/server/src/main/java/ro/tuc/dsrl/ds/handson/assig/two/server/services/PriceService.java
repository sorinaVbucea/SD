package ro.tuc.dsrl.ds.handson.assig.two.server.services;

import ro.tuc.dsrl.ds.handson.assig.two.common.entities.Car;
import ro.tuc.dsrl.ds.handson.assig.two.common.serviceinterfaces.IPriceService;

public class PriceService implements IPriceService{
	
	public double computePrice(Car c) {
		
		if (c.getPrice() <= 0) {
			throw new IllegalArgumentException("Purchasing price must be positive.");
		}
		double sellingPrice = c.getPrice() - c.getPrice()/7 * ( 2016 - c.getYear());
		return sellingPrice;
	}
}

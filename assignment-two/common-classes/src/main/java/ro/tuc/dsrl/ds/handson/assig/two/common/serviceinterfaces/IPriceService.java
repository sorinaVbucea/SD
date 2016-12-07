package ro.tuc.dsrl.ds.handson.assig.two.common.serviceinterfaces;

import ro.tuc.dsrl.ds.handson.assig.two.common.entities.Car;

public interface IPriceService {
	/**
	 * Computes the selling price of the Car.
	 *
	 * @param c Car for which to compute the selling price
	 * @return selling price for the car
	 */
	double computePrice(Car c);
}

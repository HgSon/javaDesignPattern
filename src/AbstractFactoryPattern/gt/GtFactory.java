package AbstractFactoryPattern.gt;

import AbstractFactoryPattern.abst.BikeFactory;
import AbstractFactoryPattern.abst.Body;
import AbstractFactoryPattern.abst.Wheel;

public class GtFactory implements BikeFactory {
	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}
}

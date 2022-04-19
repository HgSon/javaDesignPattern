package AbstractFactoryPattern;

import AbstractFactoryPattern.abst.BikeFactory;
import AbstractFactoryPattern.abst.Body;
import AbstractFactoryPattern.abst.Wheel;
import AbstractFactoryPattern.gt.GtFactory;
import AbstractFactoryPattern.samcheonri.SamFactory;

public class Main {
	public static void main(String[] args) {
//		BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtFactory();

		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();

		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}
}

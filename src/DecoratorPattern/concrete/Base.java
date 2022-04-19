package DecoratorPattern.concrete;

import DecoratorPattern.abst.IBeverage;

public class Base implements IBeverage {
	@Override
	public int getTotalPrice() {
		System.out.println("Base getTotalPrice");
		return 0;
	}
}

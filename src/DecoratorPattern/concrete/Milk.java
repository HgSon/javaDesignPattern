package DecoratorPattern.concrete;

import DecoratorPattern.abst.AbstAdding;
import DecoratorPattern.abst.IBeverage;

public class Milk extends AbstAdding {

	public Milk(IBeverage base) {
		super(base);
	}

	@Override
	public int getTotalPrice() {
		System.out.println("Milk getTotalPrice");
		return super.getTotalPrice() + 50;
	}
}

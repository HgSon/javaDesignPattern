package DecoratorPattern.concrete;

import DecoratorPattern.abst.AbstAdding;
import DecoratorPattern.abst.IBeverage;

public class Espresso extends AbstAdding {
	private static int espressoCount = 0;

	public Espresso(IBeverage base) {
		super(base);
	}

	@Override
	public int getTotalPrice(){
		System.out.println("Espresso getTotalPrice");
		return super.getTotalPrice() + getAddPrice();
	}

	public static int getAddPrice() {
		espressoCount++;

		int addPrice = 100;

		if(espressoCount > 1) {
			addPrice =  70;
		}

		return addPrice;
	}

}

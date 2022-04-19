package FactoryMethodPattern.concrete;

import FactoryMethodPattern.framework.Item;

public class HpPotion implements Item {

	@Override
	public void use() {
		System.out.println("use hp potion");
	}
}

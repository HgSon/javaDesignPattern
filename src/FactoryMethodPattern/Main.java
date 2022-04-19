package FactoryMethodPattern;

import FactoryMethodPattern.concrete.HpPotionCreator;
import FactoryMethodPattern.concrete.MpPotionCreator;
import FactoryMethodPattern.framework.Item;
import FactoryMethodPattern.framework.ItemCreator;

public class Main {
	public static void main(String[] args) {
		ItemCreator creator = new HpPotionCreator();
		Item item = creator.create();
		item.use();

		creator = new MpPotionCreator();
		item = creator.create();
		item.use();
	}
}

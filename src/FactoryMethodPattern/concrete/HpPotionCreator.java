package FactoryMethodPattern.concrete;

import FactoryMethodPattern.framework.Item;
import FactoryMethodPattern.framework.ItemCreator;

public class HpPotionCreator extends ItemCreator {
	@Override
	protected void selectItemInfo() {
		System.out.println("select hp potion info");
	}

	@Override
	protected Item createItem() {
		Item item = new HpPotion();
		return item;
	}

	@Override
	protected void saveCreateLog() {
		System.out.println("save hp potion create log");
	}
}

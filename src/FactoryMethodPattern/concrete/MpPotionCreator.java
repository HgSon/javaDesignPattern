package FactoryMethodPattern.concrete;

import FactoryMethodPattern.framework.Item;
import FactoryMethodPattern.framework.ItemCreator;

public class MpPotionCreator extends ItemCreator {
	@Override
	protected void selectItemInfo() {
		System.out.println("select mp potion info");
	}

	@Override
	protected Item createItem() {
		Item item = new MpPotion();
		return item;
	}

	@Override
	protected void saveCreateLog() {
		System.out.println("save mp potion create log");
	}
}

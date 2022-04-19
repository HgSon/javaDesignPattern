package FactoryMethodPattern.framework;

public abstract class ItemCreator {
	public Item create() {
		//아이템 정보 조회
		Item item;
		selectItemInfo();
		//아이템 생성
		item = createItem();
		//생성정보 저장
		saveCreateLog();

		return item;
	}

	protected abstract void selectItemInfo();
	protected abstract Item createItem();
	protected abstract void saveCreateLog();
}

package DecoratorPattern.abst;

public class AbstAdding implements IBeverage {
	private IBeverage base;

	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}

	@Override
	public int getTotalPrice() {
		System.out.println("AbstAdding getTotalPrice");
		return base.getTotalPrice();
	}

	protected IBeverage getBase(){
		return base;
	}

}

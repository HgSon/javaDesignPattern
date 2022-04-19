package ChainOfResponsibility.Complex;

public class Armor implements Defense {

	private int def;
	private Defense nextDefense;

	public Armor(int def) {
		this.def = def;
	}

	public Armor() {
	}

	public void setDef(int def) {
		this.def = def;
	}

	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}

	@Override
	public void defense(Attack attack) {
		process(attack);

		if(nextDefense != null) {
			nextDefense.defense(attack);
		}
	}

	public void process(Attack attack) {
		int amount = attack.getAmount() - def;
		attack.setAmount(amount);
	}
}

package BuilderPattern;

public class LgGramBluePrint extends BluePrint {
	Computer computer;

	public LgGramBluePrint() {
		computer = new Computer("default", "default", "default");
	}

	@Override
	public void setCpu() {
		computer.setCpu("i7");
	}

	@Override
	public void setRam() {
		computer.setRam("8g");
	}

	@Override
	public void setStorage() {
		computer.setStorage("225 ssd");

	}

	@Override
	public Computer getComputer() {
		return computer;
	}
}

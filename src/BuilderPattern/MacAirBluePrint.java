package BuilderPattern;

public class MacAirBluePrint extends BluePrint {
	Computer computer;

	public MacAirBluePrint() {
		computer = new Computer("default", "default", "default");
	}

	@Override
	public void setCpu() {
		computer.setCpu("mac7");
	}

	@Override
	public void setRam() {
		computer.setRam("mac 8g");
	}

	@Override
	public void setStorage() {
		computer.setStorage("mac 225 ssd");

	}

	@Override
	public Computer getComputer() {
		return computer;
	}
}

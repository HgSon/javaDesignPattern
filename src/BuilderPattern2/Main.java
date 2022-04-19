package BuilderPattern2;

public class Main {
	public static void main(String[] args) {
		Computer computer = new Computer("", "", "");

		Computer computer1 = ComputerBuilder
				.start()
				.setCpu("8g")
				.setRam("i7")
				.build();

		Computer computer2 = ComputerBuilder
				.startWithCpu("5g")
				.setRam("i6")
				.setStorage("225 ssd")
				.build();

		System.out.println(computer1.toString());
		System.out.println(computer2.toString());
	}
}

package BuilderPattern;

public class Main {
	public static void main(String[] args) {
		ComputerFactory factory = new ComputerFactory();

		factory.setBluePrint(new LgGramBluePrint());
		factory.make();
		Computer computer = factory.getComputer();
		System.out.println(computer.toString());

		factory.setBluePrint(new MacAirBluePrint());
		factory.make();
		computer = factory.getComputer();
		System.out.println(computer.toString());

	}
}

package CommandPattern.example2;

import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		PriorityQueue<Command> list = new PriorityQueue<>();

		list.add(new StringPrintCommand("B"));
		list.add(new StringPrintCommand("ABCD"));
		list.add(new StringPrintCommand("ABB"));
		list.add(new StringPrintCommand("ABCDF"));
		list.add(new StringPrintCommand("A"));

		for (Command command : list) {
			command.execute();
		}

	}
}

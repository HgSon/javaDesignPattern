package CommandPattern.example1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Command> list = new LinkedList<>();
		list.add(() -> {
				System.out.println("A");
		});

		list.add(() -> System.out.println("B"));
		list.add(() -> System.out.println("C"));

		for (Command command : list) {
			command.execute();
		}


	}
}

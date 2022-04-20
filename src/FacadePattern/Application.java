package FacadePattern;

import FacadePattern.System.Facade;

public class Application {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.process();
	}

}

package FacadePattern.system;

public class Facade {

	private HelloSystem1 helloSystem1;
	private HelloSystem2 helloSystem2;
	private HelloSystem3 helloSystem3;

	public Facade() {
		this.helloSystem1 = new HelloSystem1();
		this.helloSystem2 = new HelloSystem2();
		this.helloSystem3 = new HelloSystem3();
	}

	public void process() {
		helloSystem1.process();
		helloSystem2.process();
		helloSystem3.process();
	}
}

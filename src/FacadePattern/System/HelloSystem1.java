package FacadePattern.System;

class HelloSystem1 {

	public HelloSystem1(){
		System.out.println(this.getClass().getSimpleName());
	}

	public void process() {
		System.out.println(this.getClass().getSimpleName());
	}
}

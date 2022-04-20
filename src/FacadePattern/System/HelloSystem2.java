package FacadePattern.System;

class HelloSystem2 {

	public HelloSystem2(){
		System.out.println(this.getClass().getSimpleName());
	}

	public void process() {
		System.out.println(this.getClass().getSimpleName());
	}
}

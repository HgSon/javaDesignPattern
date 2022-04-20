package FacadePattern.System;

class HelloSystem3 {

	public HelloSystem3(){
		System.out.println(this.getClass().getSimpleName());
	}

	public void process() {
		System.out.println(this.getClass().getSimpleName());
	}
}

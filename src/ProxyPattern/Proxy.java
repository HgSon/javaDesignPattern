package ProxyPattern;

public class Proxy implements Subject {

	Subject real;

	public Proxy(Subject real) {
		this.real = real;
	}

	@Override
	public void action1() {
		System.out.println("simple action by proxy");
	}

	@Override
	public void action2() {
		//복잡한 작업은 리얼서브젝트가. 간단한건 프록시가. 프록시 여러개 생성해서 나눠서 작업하기도.
		real.action2();
	}
}

package ProxyPattern;

public class RealSubject implements Subject {
	@Override
	public void action1() {
		System.out.println("simple action by real");
	}

	@Override
	public void action2() {
		//복잡한 작업은 리얼서브젝트가. 간단한건 프록시가. 프록시 여러개 생성해서 나눠서 작업하기도.
		System.out.println("complex action by real");
	}
}

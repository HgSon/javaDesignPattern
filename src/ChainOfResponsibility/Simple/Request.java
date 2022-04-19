package ChainOfResponsibility.Simple;

public class Request {
	int a, b;
	String operator;

	public Request(int a, int b, String operator) {
		this.a = a;
		this.b = b;
		this.operator = operator;
	}
}

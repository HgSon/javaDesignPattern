package ChainOfResponsibility.Simple;

public class Application {
	public static void main(String[] args) {
		Calculator plus = new PlusCalculator();
		Calculator sub = new SubCalculator();
		Calculator multi = new MultiCalculator();

		plus.setPreCalculator(sub);
		sub.setPreCalculator(multi);

		Request request1 = new Request(1, 2, "+");
		Request request2 = new Request(5, 2, "*");
		Request request3 = new Request(10, 2, "-");
		plus.process(request1);
		plus.process(request2);
		plus.process(request3);

	}
}

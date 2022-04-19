package ChainOfResponsibility.Simple;

public class PlusCalculator extends Calculator{
	@Override
	protected boolean operator(Request request) {
		if ("+".equals(request.operator)) {
			int a = request.a;
			int b = request.b;
			int result = a+b;
			System.out.println(a + "+" + b + "=" + result);

			return true;
		}
		return false;
	}
}

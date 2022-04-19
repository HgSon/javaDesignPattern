package ChainOfResponsibility.Simple;

public abstract class Calculator {

//	Calculator nextCalculator;
//
//	public void setNextCalculator(Calculator nextCalculator){
//		this.nextCalculator = nextCalculator;
//	}
//
//	public boolean process(Request request) {
//		//내가 처리 가능할 경우
//		if(operator(request)) {
//			return true;
//		} else {
//			if (nextCalculator != null) {
//				return nextCalculator.process(request);
//			} else {
//				return false;
//			}
//		}
//	}

	Calculator preCalculator;

	public void setPreCalculator(Calculator preCalculator){
		this.preCalculator = preCalculator;
	}

	public boolean process(Request request) {
		// 남이 처리 가능할경우
		if(preCalculator != null ) {
			boolean result = preCalculator.process(request);

			return result? true : operator(request);
		} else {
			return operator(request);
		}
	}

	protected abstract boolean operator(Request request);
}

package ObserverPattern.Advanced;

public class Application {
	/** 1. 제네릭
	 *  2. 델리게이트
	 *  3. 내부에 옵저버를 넣는다
	* */
	public static void main(String[] args) {
		Button button = new Button();
		button.addObserver((Observable<String> o, String arg) -> {
			System.out.println("[advanced] " + o + " is clicked");
		});

		button.onClick();
		button.onClick();
		button.onClick();
	}
}
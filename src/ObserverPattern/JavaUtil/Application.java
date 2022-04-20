package ObserverPattern.JavaUtil;

import java.util.Observable;
import java.util.Observer;

public class Application {
	public static void main(String[] args) {
		Button button = new Button();
		button.addObserver((Observable o, Object arg) -> {System.out.println(o + " is clicked");});
		button.onClick();

	}
}

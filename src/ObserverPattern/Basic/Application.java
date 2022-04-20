package ObserverPattern.Basic;

public class Application {
	public static void main(String[] args) {
		Button button = new Button();
		button.setOnclickListener(new listener());
		button.setOnclickListener(new Button.OnclickListener() {
			@Override
			public void onClick(Button button) {
				System.out.println("[anonymous] " + button + " is clicked");
			}
		});
		button.setOnclickListener((listener1) -> {
			System.out.println("[lambda] " + listener1 + " is clicked");
		});
		button.onClick();


	}
}

class listener implements Button.OnclickListener {

	@Override
	public void onClick(Button button) {
		System.out.println("[listener] " +button + " is clicked");
	}
}
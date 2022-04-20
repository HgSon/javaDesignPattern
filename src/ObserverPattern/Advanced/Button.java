package ObserverPattern.Advanced;

import ObserverPattern.Advanced.Observable.Observer;

public class Button {
	private Observable<String> observable;

	public Button(){
		observable = new Observable();
	}

	public void addObserver(Observer<String> observer) {
		observable.addObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public void onClick() {
		observable.setChanged();
		observable.notifyObservers();
	}
}

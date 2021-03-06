package ObserverPattern.Advanced;
import java.util.Vector;

public class Observable<T> {
	private boolean changed = false;
	private Vector<Observer<T>> obs;

	public Observable() {
		obs = new Vector<>();
	}

	public synchronized void addObserver(Observer<T> o) {
		if (o == null)
			throw new NullPointerException();
		if (!obs.contains(o)) {
			obs.addElement(o);
		}
	}

	public synchronized void deleteObserver(Observer<T> o) {
		obs.removeElement(o);
	}


	public void notifyObservers() {
		notifyObservers(null);
	}


	public void notifyObservers(T arg) {

		Vector<Observer<T>> arrLocal;

		synchronized (this) {

			if (!changed)
				return;
			arrLocal = (Vector<Observer<T>>) obs.clone();
			clearChanged();
		}

//		for (Observer<T> observer : arrLocal) {
//			observer.update(this, arg);
//		}

		for (int i = arrLocal.size()-1; i>=0; i--)
			((Observer<T>)arrLocal.get(i)).update(this, arg);
	}


	public synchronized void deleteObservers() {
		obs.removeAllElements();
	}


	public synchronized void setChanged() {
		changed = true;
	}


	public synchronized void clearChanged() {
		changed = false;
	}


	public synchronized boolean hasChanged() {
		return changed;
	}

	public synchronized int countObservers() {
		return obs.size();
	}

	public interface Observer<T> {
		void update(Observable<T> o, T arg);
	}
}

package MementoPattern;

import MementoPattern.abc.Memento;
import MementoPattern.abc.Originator;

import java.util.Stack;

public class Application {
	public static void main(String[] args) {
		Stack<Memento> mementos = new Stack<>();

		Originator originator = new Originator();
		originator.setState("state 1");
		mementos.add(originator.createMemento());
		originator.setState("state 2");
		mementos.add(originator.createMemento());
		originator.setState("state 3");
		mementos.add(originator.createMemento());

		originator.restoreMemento(mementos.pop());
		originator.restoreMemento(mementos.pop());
		originator.restoreMemento(mementos.pop());

	}
}

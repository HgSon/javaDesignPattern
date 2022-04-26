package CommandPattern.example2;

public interface Command extends Comparable<Command> {
	void execute();

	//void action();
	//void undo();
}

package SingletonPattern;

public class Singleton {
	private Singleton instance;

	private Singleton() {
		this.instance = new Singleton();
	}

	public Singleton getInstance() {
		return instance;
	}
}

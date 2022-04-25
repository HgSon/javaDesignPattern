package FlyweightPattern;

public class Main {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight a = factory.getFlyweight("A");
		System.out.println(a);
		a = factory.getFlyweight("A");
		System.out.println(a);
		Flyweight b = factory.getFlyweight("B");
		System.out.println(b);
	}
}

package prototypePattern;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle1 = new Circle(1,1,3);
		Circle circle2 = circle1.clone();
		Circle circle3 = circle1.clone();
		Circle circle4 = circle2.clone();
//		System.out.println("circle1 = " + circle1);
//		System.out.println("circle2 = " + circle2);
//		System.out.println("circle1: " + circle1.getX() + " " + circle1.getY() + " " + circle1.getZ());
//		System.out.println("circle2: " + circle2.getX() + " " + circle2.getY() + " " + circle2.getZ());
//		System.out.println("circle3: " + circle3.getX() + " " + circle3.getY() + " " + circle3.getZ());
//		System.out.println("circle4: " + circle4.getX() + " " + circle4.getY() + " " + circle4.getZ());

		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2020, 2));
		Cat yao = navi.copy();
		yao.setName("yao");
		yao.getAge().setYear(2015);
		yao.getAge().setValue(5);
		System.out.println("navi: [name] " + navi.getName());
		System.out.println("navi: [year] " + navi.getAge().getYear());
		System.out.println("navi: [value] " + navi.getAge().getValue());
		System.out.println("yao: [name] " + yao.getName());
		System.out.println("yao: [year] " + yao.getAge().getYear());
		System.out.println("yao: [value] " + yao.getAge().getValue());


	}
}

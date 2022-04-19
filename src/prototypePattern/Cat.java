package prototypePattern;

public class Cat implements Cloneable{
	private Age age;
	private String name;

	public Cat(){
		this.age = new Age(0,0);
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat copy() throws CloneNotSupportedException{
		Cat cat = (Cat) this.clone();
		cat.setAge(new Age(this.age.getYear(), this.age.getValue()));
		return cat;
	}
}

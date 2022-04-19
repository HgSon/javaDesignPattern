package strategyPattern;

public class Main {
	public static void main(String[] args) {
		Character character = new Character();
		character.attack();
		character.setWeapon(new Axe());
		character.attack();
	}
}

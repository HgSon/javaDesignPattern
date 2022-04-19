package ChainOfResponsibility.Complex;

public class Main {
	public static void main(String[] args) {
		//갑옷착용
		Armor armor1 = new Armor();
		Armor armor2 = new Armor(10);
		Armor armor3 = new Armor(20);
//		armor1.setDef(10);
		armor1.setNextDefense(armor2);
		armor2.setNextDefense(armor3);

		//공격
		Attack attack = new Attack(100);
		armor1.defense(attack);
		//데미지 확인
		//point1 : 한 객체만 책임 가지지 않아도 됨
		System.out.println(attack.getAmount());

		//추가착용
		Defense defense = new Defense() {
			@Override
			public void defense(Attack attack) {
				int amount = attack.getAmount() - 50;
				attack.setAmount(amount);
			}
		};
		armor3.setNextDefense(defense);
		//공격
		attack.setAmount(100);
		armor1.defense(attack);
		//데미지 확인
		//point2: 동적인 적용 가능
		System.out.println(attack.getAmount());
	}
}

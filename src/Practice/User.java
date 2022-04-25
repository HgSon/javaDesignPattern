package Practice;

import Practice.item.Armor;
import Practice.item.Weapon;
import Practice.skill.Skill;

public class User extends Creature{
	private Bag bag;
	private Armor armor;
	private Weapon weapon;

	public User() {
		power = (int) Math.floor(Math.random() * 10);
		level = 1;
	}

	// 공격력 랜덤보정
	// 공격력 : 무기 착용시 랜덤(+, -)
	@Override
	public void attack() {

	}

	@Override
	public void defense(int power) {

	}

	@Override
	public void setTarget(Creature target) {

	}

	// 획득조건: 레벨업시 레벨에 따라 획득가능한 스킬목록에서 랜덤, 필드에서 얻기
	@Override
	public void getSkill(Skill skill) {

	}

	// 공격시 선택해서 사용
	// 스킬리스트에서 선택
	// 고려사항 : 딜레이, 쿨타임, 실패확률
	@Override
	public void useSkill(Skill skill) {

	}

	public Bag getBag() {
		return bag;
	}

	public void setBag(Bag bag) {
		this.bag = bag;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}

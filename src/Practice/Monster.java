package Practice;

import Practice.skill.Skill;

public class Monster extends Creature{

	public Monster() {
		this.level = (int) Math.floor(Math.random() * 100);
		this.power = (int) Math.floor(Math.random() * 10) * level;
	}

	// 공격력 랜덤보정
	@Override
	public void attack() {

	}

	// 방어력 랜덤보정
	// 레벨 차이 영향
	@Override
	public void defense(int power) {

	}

	// 범위 안에 들어오면 선공
	@Override
	public void setTarget(Creature target) {

	}

	// 획득조건: 생성, 레벨업시 레벨에 따라 획득가능한 스킬목록에서 랜덤
	// 생성시 레벨업한것으로 간주
	@Override
	public void getSkill(Skill skill) {

	}

	// 공격시 랜덤사용
	// 스킬리스트에서 선택
	// 고려사항 : 딜레이, 쿨타임
	@Override
	public void useSkill(Skill skill) {

	}
}

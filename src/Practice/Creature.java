package Practice;

import Practice.skill.Skill;

import java.util.List;

abstract public class Creature {
	protected int power;
	protected int level;
	protected Creature target;
	protected int hp;
	protected String id;
	protected String name;
	protected List<Skill> skillList;

	abstract public void attack();

	abstract public void defense(int power);

	public void levelUp() {
		level++;
		power += (int) Math.floor(Math.random() * 10);
	}

	public Creature getTarget() {
		return target;
	}

	abstract public void setTarget(Creature target);

	abstract public void getSkill(Skill skill);

	abstract public void useSkill(Skill skill);
}

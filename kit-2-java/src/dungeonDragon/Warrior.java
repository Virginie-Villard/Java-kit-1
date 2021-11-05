package dungeonDragon;

public class Warrior {

	private String warriorName;
	private int lifeLvl;
	private int attackForce;
	private String weapon;
	private String shield;

	public Warrior() {
		String warriorName = "unknown";
		int lifeLvl = 0;
		int attackForce = 0;
		String weapon = "unknown";
		String shield = "unknown";
	}
	
	public Warrior(String warriorName, int lifeLvl, int attackForce, String weapon, String shield) {
		this.setWarriorName(warriorName);
		this.setLifeLvl(lifeLvl);
		this.setAttackForce(attackForce);
		this.setWeapon(weapon);
		this.setShield(shield);
	}

	public String getShield() {
		return shield;
	}

	public void setShield(String shield) {
		this.shield = shield;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getAttackForce() {
		return attackForce;
	}

	public void setAttackForce(int attackForce) {
		this.attackForce = attackForce;
	}

	public int getLifeLvl() {
		return lifeLvl;
	}

	public void setLifeLvl(int lifeLvl) {
		this.lifeLvl = lifeLvl;
	}

	public String getWarriorName() {
		return warriorName;
	}

	public void setWarriorName(String warriorName) {
		this.warriorName = warriorName;
	}

}

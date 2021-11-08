package dungeonDragon;

public class Warrior {

	private String warriorName;
	private int lifeLvl;
	private int attackForce;
	private String weapon;
	private String shield;
	
	public Warrior() {
        this("undefined warrior");
    }

    public Warrior(String name) {
        this(name, 9, 10, "Rusty sword", "wooden shield");
    }
	
	public Warrior(String warriorName, int lifeLvl, int attackForce, String weapon, String shield) {
		this.setWarriorName(warriorName); // this.warriorName = warriorName;
		this.setLifeLvl(lifeLvl);
		this.setAttackForce(attackForce);
		this.setWeapon(weapon);
		this.setShield(shield);
	}
	
	public String toString() {
		return (warriorName + "\nHis Life level is : " + lifeLvl + "\nHis attack force is : " + attackForce + "\nHis weapon is : " + weapon + "\nHis shield is : " + shield);
	}

	private String getWarriorName() {
		return warriorName;
	}

	private void setWarriorName(String warriorName) {
		this.warriorName = warriorName;
	}

	private int getLifeLvl() {
		return lifeLvl;
	}

	private void setLifeLvl(int lifeLvl) {
		this.lifeLvl = lifeLvl;
	}

	private int getAttackForce() {
		return attackForce;
	}

	private void setAttackForce(int attackForce) {
		this.attackForce = attackForce;
	}

	private String getWeapon() {
		return weapon;
	}

	private void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	private String getShield() {
		return shield;
	}

	private void setShield(String shield) {
		this.shield = shield;
	}



}

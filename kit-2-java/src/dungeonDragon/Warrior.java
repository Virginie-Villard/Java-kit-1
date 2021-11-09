package dungeonDragon;

public class Warrior {

	private String warriorName;
	private int lifeLvl;
	private int attackForce;
	private Weapon weapon;
	private String shield;
	
	public Warrior() {
        this("undefined warrior");
    }

    public Warrior(String name) {
        this(name, 9, 10, "Weapon", "wooden shield");
    }
	
	public Warrior(String warriorName0, int lifeLvl0, int attackForce0, String weapon, String shield0) {
		this.setWarriorName(warriorName0); // this.warriorName = warriorName;
		this.setLifeLvl(lifeLvl0);
		this.setAttackForce(attackForce0);
		this.setWeapon(new Weapon(weapon));
		this.setShield(shield0);
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
	
	private Weapon getWeapon() {
		return weapon;
	}

	private void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	private String getShield() {
		return shield;
	}

	private void setShield(String shield) {
		this.shield = shield;
	}

}

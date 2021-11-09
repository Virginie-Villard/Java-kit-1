package dungeonDragon;

public class Weapon {

	private String weaponName;
	private int attackLvl;
	
	public Weapon() {
		this("Undefined weapon");
	}
	
	public Weapon(String name) {
		this(name, 2);
	}
	
	public Weapon(String weaponName, int attackLvl) {
		this.setWeaponName(weaponName);
		this.setAttackLvl(attackLvl);
	}

	private String getWeaponName() {
		return weaponName;
	}

	private void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	private int getAttackLvl() {
		return attackLvl;
	}

	private void setAttackLvl(int attackLvl) {
		this.attackLvl = attackLvl;
	}
}

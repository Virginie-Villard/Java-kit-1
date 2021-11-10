package dungeonDragon;

public class Weapon {

	private String weaponName;
	private int weaponAttackLvl;
	
	public Weapon() {
		this("Undefined weapon");
	}
	
	public Weapon(String name) {
		this(name, 2);
	}
	
	public Weapon(String weaponName, int weaponAttackLvl) {
		this.setWeaponName(weaponName);
		this.setWeaponAttackLvl(weaponAttackLvl);
	}
	
	public String toString() {
		return ("\nHis weapon name is : " + weaponName + "\nHis weapon attack level is : " + weaponAttackLvl);
	}

	private String getWeaponName() {
		return weaponName;
	}

	private void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	private int getWeaponAttackLvl() {
		return weaponAttackLvl;
	}

	private void setWeaponAttackLvl(int weaponAttackLvl) {
		this.weaponAttackLvl = weaponAttackLvl;
	}
}

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
	
	/** Utilisation de la méthode toString() pour mettre en forme l'objet Weapon dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	 */
	public String toString() {
		return ("\nHis weapon name is : " + this.weaponName + "\nHis weapon attack level is : " + this.weaponAttackLvl);
	}

	/** GETTEURS et SETTEURS ___________________________________________________________________________
	 * Pour pouvoir utiliser les attributs privates de la classe.
	 */
	private String getWeaponName() {
		return weaponName;
	}

	private void setWeaponName(String weaponName) {
		if(weaponName.isEmpty() || weaponName == null) {
			this.weaponName = "Épée courte";
		} else {
			this.weaponName = weaponName;
		}
		System.out.println("Set weapon name: "+this.weaponName);
	}

	private int getWeaponAttackLvl() {
		return weaponAttackLvl;
	}

	private void setWeaponAttackLvl(int weaponAttackLvl) {
		this.weaponAttackLvl = weaponAttackLvl;
	}
}

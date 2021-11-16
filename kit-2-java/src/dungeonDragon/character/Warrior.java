package dungeonDragon.character;

import dungeonDragon.attack.Weapon;
import dungeonDragon.protection.Shield;

public class Warrior {

	private Weapon weapon;
	private Shield shield;
	
	// Les 3 constructeurs :
	public Warrior() {
        this("Undefined warrior");
    }
	
    public Warrior(String name) {
        this(name, 9, 10, "Weapon", 2, "wooden shield", 2);
    }
	
	public Warrior(String warriorName, int lifeLvl, int attackForce, Weapon weapon, Shield shield) {
		this.setWarriorName(warriorName); // this.warriorName = warriorName;
		this.setLifeLvl(lifeLvl);
		this.setAttackForce(attackForce);
		this.setWeapon(weapon);
		this.setShield(shield);
	}
	
	public Warrior(String warriorName0, int lifeLvl0, int attackForce0, String weaponName, int weaponAttackLvl, String shieldName, int shieldDefenseLvl) {
		this.setWarriorName(warriorName0); // this.warriorName = warriorName;
		this.setLifeLvl(lifeLvl0);
		this.setAttackForce(attackForce0);
		this.setWeapon(new Weapon(weaponName, weaponAttackLvl));
		this.setShield(new Shield(shieldName, shieldDefenseLvl));
	}
	
	/* Utilisation de la méthode toString() pour mettre en forme l'objet Warrior dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	 */
	public String toString() {
		return ("-- " + warriorName + " --" + "\nHis Life level is : " + lifeLvl + "\nHis attack force is : " + attackForce + "\nWeapon : " + weapon + "\nShield : " + shield);
	}
	
	// GETTEURS et SETTEURS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.

	private String getWarriorName() {
		return warriorName;
	}

	private void setWarriorName(String warriorName) {
		if(warriorName.isEmpty() || warriorName == null) {
			this.warriorName = "Conan";
		} else {
			this.warriorName = warriorName;
		}
		System.out.println("Set warrior name: "+this.warriorName);
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

	private Shield getShield() {
		return shield;
	}

	private void setShield(Shield shield) {
		this.shield = shield;
	}

}

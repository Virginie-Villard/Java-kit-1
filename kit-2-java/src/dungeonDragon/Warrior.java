package dungeonDragon;

public class Warrior {

	private String warriorName;
	private int lifeLvl;
	private int attackForce;
	private Weapon weapon;
	private String shield;
	
	public Warrior() {
        this("Undefined warrior");
    }
	
	// Les 3 constructeurs :
    public Warrior(String name) {
        this(name, 9, 10, "Weapon", 2, "wooden shield");
    }
	
	public Warrior(String warriorName0, int lifeLvl0, int attackForce0, Weapon weapon, String shield0) {
		this.setWarriorName(warriorName0); // this.warriorName = warriorName;
		this.setLifeLvl(lifeLvl0);
		this.setAttackForce(attackForce0);
		this.setWeapon(weapon);
		this.setShield(shield0);
	}
	
	public Warrior(String warriorName0, int lifeLvl0, int attackForce0, String weaponName, int weaponAttackLvl, String shield0) {
		this.setWarriorName(warriorName0); // this.warriorName = warriorName;
		this.setLifeLvl(lifeLvl0);
		this.setAttackForce(attackForce0);
		this.setWeapon(new Weapon(weaponName, weaponAttackLvl));
		this.setShield(shield0);
	}
	
	/* Utilisation de la méthode toString() pour mettre en forme l'objet Warrior dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	 */
	public String toString() {
		return (warriorName + "\nHis Life level is : " + lifeLvl + "\nHis attack force is : " + attackForce + "\nWeapon : " + weapon + "\nHis shield is : " + shield);
	}
	
	// GETTEURS et SETTEURS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.

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
		// TODO class shield
		// Gestion des entrées utilisateur invalides et comportement par défaut
		this.shield = shield;
		if(shield.isEmpty() || shield == null) {
			this.shield = "Wooden shield";
		}
		else {
			this.shield = shield;
		}
		System.out.println("Set shield name: "+this.shield);
	}

}

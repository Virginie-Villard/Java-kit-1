package dungeonDragon.attack;

public abstract class AttackObject {
	
	private String attackObjectName;
	private int attackObjectLvl;

	public AttackObject() {
		this("Undefined attackObject");
	}
	
	public AttackObject(String name) {
		this(name, 2);
	}
	
	public AttackObject(String attackObjectName, int attackObjectLvl) {
		this.setAttackObjectName(attackObjectName);
		this.setAttackObjectLvl(attackObjectLvl);
	}
	
	/* Utilisation de la méthode toString() pour mettre en forme l'objet Weapon dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	*/
	public String toString() {
		return ("\nHis attack object name is : " + this.attackObjectName + "\nHis attack object level is : " + this.attackObjectLvl);
	}

	
	// GETTEURS et SETTEURS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.

	public String getAttackObjectName() {
		return attackObjectName;
	}

	protected void setAttackObjectName(String attackObjectName) {
		this.attackObjectName = attackObjectName;
	}

	public int getAttackObjectLvl() {
		return attackObjectLvl;
	}

	protected void setAttackObjectLvl(int attackObjectLvl) {
		this.attackObjectLvl = attackObjectLvl;
	}
}

package dungeonDragon;

public class Shield {
	
	private String shieldName;
	private int shieldDefenseLvl;

	public Shield() {
		this("Undefined shield");
	}
	
	public Shield(String name) {
		this(name, 2);
	}
	
	public Shield(String shieldName, int shieldDefenseLvl) {
		this.setShieldName(shieldName);
		this.setShieldDefenseLvl(shieldDefenseLvl);
	}
	
	/* Utilisation de la méthode toString() pour mettre en forme l'objet Shield dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	 */
	public String toString() {
		return ("\nHis shield name is : " + this.shieldName + "\nHis shield defense level is : " + this.shieldDefenseLvl);
	}
	
	/* GETTEURS et SETTEURS ___________________________________________________________________________
	 * Pour pouvoir utiliser les attributs privates de la classe.
	 */
	
	private String getShieldName() {
		return shieldName;
	}

	private void setShieldName(String shieldName) {
		this.shieldName = shieldName;
	}

	private int getShieldDefenseLvl() {
		return shieldDefenseLvl;
	}

	private void setShieldDefenseLvl(int shieldDefenseLvl) {
		this.shieldDefenseLvl = shieldDefenseLvl;
	}
}

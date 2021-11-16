package dungeonDragon.protection;
public abstract class Protection {
	
	private String protectionName;
	private int protectionLvl;

	public Protection() {
		this("Undefined protection");
	}
	
	public Protection(String name) {
		this(name, 2);
	}
	
	public Protection(String protectionName, int protectionLvl) {
		this.setProtectionName(protectionName);
		this.setProtectionLvl(protectionLvl);
	}
	
	/* Utilisation de la m�thode toString() pour mettre en forme l'objet Protection dans la console
	 * apr�s que l'utilisateur ait choisi les champs string et tir� au sort les champs int.
	 * Avec l'h�ritage I'm not sure...

	public String toString() {
		return ("\nHis protection name is : " + this.protectionName + "\nHis protection level is : " + this.protectionLvl);
	}
	*/
	
	// GETTEURS et SETTEURS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.
	
	public String getProtectionName() {
		return protectionName;
	}

	protected void setProtectionName(String protectionName) {
		this.protectionName = protectionName;
	}

	public int getProtectionLvl() {
		return protectionLvl;
	}

	protected void setProtectionLvl(int protectionLvl) {
		this.protectionLvl = protectionLvl;
	}
}

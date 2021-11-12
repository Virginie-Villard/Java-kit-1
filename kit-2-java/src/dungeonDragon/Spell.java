package dungeonDragon;

public class Spell {
	
	private String spellName;
	private int spellAttackLvl;

	public Spell() {
		this("Undefined spell");
	}

	public Spell(String name) {
		this(name, 2);
	}
	
	public Spell(String spellName, int spellAttackLvl) {
		this.setSpellName(spellName);
		this.setSpellAttackLvl(spellAttackLvl);
	}
	
	/** Utilisation de la méthode toString() pour mettre en forme l'objet spell  dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	 */
	public String toString() {
		return ("\nHis spell name is : " + spellName + "\nHis spell attack level is : " + spellAttackLvl);
	}
	
	/** GETTEURS et SETTEURS ___________________________________________________________________________
	 * Pour pouvoir utiliser les attributs privates de la classe.
	 */
	private String getSpellName() {
		return spellName;
	}

	private void setSpellName(String spellName) {
		this.spellName = spellName;
	}

	private int getSpellAttackLvl() {
		return spellAttackLvl;
	}

	private void setSpellAttackLvl(int spellAttackLvl) {
		this.spellAttackLvl = spellAttackLvl;
	}
}

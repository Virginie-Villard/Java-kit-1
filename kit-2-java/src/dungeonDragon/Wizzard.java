package dungeonDragon;

public class Wizzard {

	private String wizzardName;
	private int lifeLvl;
	private int attackForce;
	private Spell spell;
	private String filter;
	
	public Wizzard() {
        this("undefined wizzard");
    }

    public Wizzard(String name) {
        this(name, 9, 10, "Ice arrow", "Ice thorns");
    }
	
	public Wizzard(String wizzardName, int lifeLvl, int attackForce, String spell, String filter) {
		this.setWizzardName(wizzardName);
		this.setLifeLvl(lifeLvl);
		this.setAttackForce(attackForce);
		this.setSpell(new Spell(spell));
		this.setFilter(filter);
	}
	
	public Wizzard(String wizzardName, int lifeLvl, int attackForce, String spellName, int spellAttackLvL, String filter) {
		this.setWizzardName(wizzardName);
		this.setLifeLvl(lifeLvl);
		this.setAttackForce(attackForce);
		this.setSpell(new Spell(spellName, spellAttackLvL));
		this.setFilter(filter);
	}
	
	/** Utilisation de la méthode toString() pour mettre en forme l'objet Wizzard dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	 */
	public String toString() {
		return (wizzardName + "\nHis Life level is : " + lifeLvl + "\nHis attack force is : " + attackForce + "\nSpell : " + spell + "\nHis filter is : " + filter);
	}
	
	private String getWizzardName() {
		return wizzardName;
	}

	private void setWizzardName(String wizzardName) {
		this.wizzardName = wizzardName;
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

	private Spell getSpell() {
		return spell;
	}

	private void setSpell(Spell spell) {
		this.spell = spell;
	}

	private String getFilter() {
		return filter;
	}

	private void setFilter(String filter) {
		this.filter = filter;
	}
}

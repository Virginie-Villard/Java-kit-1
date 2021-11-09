package dungeonDragon;

public class Wizzard {

	private String wizzardName;
	private int lifeLvl;
	private int attackForce;
	private String spell;
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
		this.setSpell(spell);
		this.setFilter(filter);
	}
	
	public String toString() {
		return (wizzardName + "\nHis Life level is : " + lifeLvl + "\nHis attack force is : " + attackForce + "\nHis spell is : " + spell + "\nHis filter is : " + filter);
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

	private String getSpell() {
		return spell;
	}

	private void setSpell(String spell) {
		this.spell = spell;
	}

	private String getFilter() {
		return filter;
	}

	private void setFilter(String filter) {
		this.filter = filter;
	}
}

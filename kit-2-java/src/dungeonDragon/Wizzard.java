package dungeonDragon;

public class Wizzard {

	public Wizzard() {
		String wizzardName = "";
		int lifeLvl = 0;
		int attackForce = 0;
		String spell = "";
		String filter = "";
	}

	public Wizzard(String wizzardName, int lifeLvl, int attackForce, String spell, String filter) {
		this.wizzardName = wizzardName;
		this.lifeLvl = lifeLvl;
		this.attackForce = attackForce;
		this.spell = spell;
		this.filter = filter;
	}
}

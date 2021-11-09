package dungeonDragon;

public class Spell {
	
	private String spellName;
	private int attackLvl;
	
	public Spell(String spellName, int attackLvl) {
		this.spellName = spellName;
		this.attackLvl = attackLvl;
	}

	private String getSpellName() {
		return spellName;
	}

	private void setSpellName(String spellName) {
		this.spellName = spellName;
	}

	private int getAttackLvl() {
		return attackLvl;
	}

	private void setAttackLvl(int attackLvl) {
		this.attackLvl = attackLvl;
	}
}

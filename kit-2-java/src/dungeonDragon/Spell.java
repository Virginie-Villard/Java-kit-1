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
	
	public String toString() {
		return ("\nHis spell name is : " + spellName + "\nHis spell attack level is : " + spellAttackLvl);
	}

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

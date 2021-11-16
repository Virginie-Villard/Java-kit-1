package dungeonDragon.character;

import dungeonDragon.attack.AttackObject;
import dungeonDragon.protection.Protection;

public abstract class Character {

	protected String characterName;
	protected int lifeLvl;
	protected int attackForce;
	protected AttackObject attackObject;
	protected Protection protection;
	
	public Character() {
        this("Undefined character");
    }
	
	public Character(String characterName) {
        this(characterName, 9, 10, "attackObject", 2, "protection", 2);
    }
	
	public Character(String CharacterName, int lifeLvl, int attackForce, AttackObject attackObject, Protection protection) {
		this.setCharacterName(characterName);
		this.setLifeLvl(lifeLvl);
		this.setAttackForce(attackForce);
		this.setAttackObject(attackObject);
		this.setProtection(protection);
	}
	
	public Character(String CharacterName, int lifeLvl, int attackForce, String attackObjectName, int attackObjectLvl, String protectiondName, int protectionLvl) {
		this.setCharacterName(CharacterName); // this.warriorName = warriorName;
		this.setLifeLvl(lifeLvl);
		this.setAttackForce(attackForce);
		this.setAttackObject(new AttackObject(attackObjectName, attackObjectLvl));
		this.setProtection(new Protection(protectionName, protectionLvl));
	}
	
	/* Utilisation de la méthode toString() pour mettre en forme l'objet Character dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	 */
	public String toString() {
		return ("-- " + characterName + " --" + "\nHis Life level is : " + lifeLvl + "\nHis attack force is : " + attackForce + "\nAttackObject : " + attackObject + "\nProtection : " + protection);
	}
	
	
	// GETTEURS et SETTEURS ___________________________________________________________________________
	// Pour pouvoir utiliser les attributs privates de la classe.


	private int getLifeLvl() {
		return lifeLvl;
	}

	private void setLifeLvl(int lifeLvl) {
		this.lifeLvl = lifeLvl;
	}

	private String getCharacterName() {
		return characterName;
	}

	private void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	private int getAttackForce() {
		return attackForce;
	}

	private void setAttackForce(int attackForce) {
		this.attackForce = attackForce;
	}

	private AttackObject getAttackObject() {
		return attackObject;
	}

	private void setAttackObject(AttackObject attackObject) {
		this.attackObject = attackObject;
	}

	private Protection getProtection() {
		return protection;
	}

	private void setProtection(Protection protection) {
		this.protection = protection;
	}
}

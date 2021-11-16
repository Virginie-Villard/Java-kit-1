// D�claration du Package, n�c�ssaire.
package dungeonDragon;

// On rend disponible toutes les classes du package java.util (Scanner etc)
import java.util.*;

public class TestGame {

	// D�claration des attributs de la classe TestGame (�quivalente au menu). */
	private Warrior warrior;
	private Wizzard wizzard;

	private ArrayList<Warrior> warriorList;
	private ArrayList<Wizzard> wizzardList;

	/* D�claration des constructeurs. 
	 * Le premier, sans param�tre,
	 * le deuxi�me avec le nom comme param�tre, sera utilis� par le premier.
	 * le troisi�me et le quatri�me ont tous les param�tres 
	 * mais l'un avec un objet et l'autre avec les attributs de l'objet.
	 *  */
	public TestGame() {
		warriorList = new ArrayList();
		wizzardList = new ArrayList();
		
	}
	
	public static void main(String[] args) {
		TestGame tGame = new TestGame();
		tGame.userChoice();
	}
	
	private void userChoice() {	
		System.out.println("Dungeons and Dragons");
		
		
		/* Instance du Scanner, pour r�cup�rer les entr�es clavier de l'utilisateur
		(Nom des personnages, des armes, des sorts et boucliers). */
		Scanner clavier = new Scanner(System.in);
		
		/* D�claration d'un bool�en isPlaying pour pouvoir arr�ter le jeu. */
		boolean isPlaying = true;
		
		do {
			System.out.print("If you want to stop game choose 0, if you want a warrior choose 1, if you want a wizzard choose 2, \nif you want to see your characters choose 3, if you want to start the game choose 4 : ");
			int userChoice = clavier.nextInt();
			
			/* Prend en compte le saut de ligne du clavier fait avant l'entr�e. Merci Rick ! */
			clavier.nextLine();
			
			/* Switch pour le choix d'utilisateur
			 * 0 - Quitter le jeu.
			 * 1 - Cr�er un Guerrier
			 * 2 - Cr�er un sorcier
			 * 3 - Cr�er deux arrayList avec les diff�rents guerriers ou sorciers cr��s.
			 * 4 - Jouer au jeu (une fois un personnage cr��). 
			 * 
			 * Pour les niveaux (int), on utilise les lancers de d� (classe Dice);
			 * pour les strings on utilise les entr�es clavier, choix utilisateur.
			 * C'est possible de faire aussi les entiers en choix utilisateurs (pr�c�dents commits) 
			 * mais pour un JDR j'ai trouv� plus coh�rent de laisser le choix des niveaux au hasard des lancers de d�. */
			switch (userChoice) {
				case 0:
					isPlaying = false;
					System.out.println("You have left the game. Reload to play again.");
					break;
		
				case 1:
					System.out.println("\n \t Warrior");
					warrior(clavier);
					System.out.println("Here is your warrior.\n");
					break;
		
				case 2:
					System.out.println("\n \t Wizzard");
					wizzard(clavier);
					System.out.println("Here is your wizzard.\n");
					break;
					
				case 3:
					System.out.println("\n \t Warrior list");
					System.out.println(warriorList);
					System.out.println("\n \t Wizzards list");
					System.out.println(wizzardList);
					break;
					
				case 4:
					charactersReady();
		
				default:
					System.out.println("Invalid choice, try again...");
					break;
			}
		}
		while(isPlaying);
	}
	
	/* ___WARRIOR__lancers de d�__________________________________________________________________
	 * Pour les niveaux (int), on utilise les lancers de d� (classe Dice);
	 * pour les strings on utilise les entr�es clavier, choix utilisateur.
	 * C'est possible de faire aussi les entiers en choix utilisateurs (pr�c�dents commits) 
	 * mais pour un JDR j'ai trouv� plus coh�rent de laisser le choix des niveaux au hasard des lancers de d�.
	 */

	private void warrior(Scanner clavier) {
		System.out.print("Choose your warrior name : ");
		String warriorName = clavier.nextLine();
		
		System.out.println("Life level, press Enter to launch 5 dices : ");
		clavier.nextLine();
		int launchDice1 = Dice.dice(5);
        int lifeLvl = launchDice1;
        
        System.out.println("Attack force, press Enter to launch 1 dice : ");
        clavier.nextLine();
		int launchDice2 = Dice.dice(1);
        int attackForce = launchDice2;
        
        System.out.println("Weapon name ? ");
        String weaponName = clavier.nextLine();
        
        System.out.println("Weapon attack level, press Enter to launch 1 dice : ");
        clavier.nextLine();
		int launchDice3 = Dice.dice(1);
        int weaponAttackLvl = launchDice3;
        
        System.out.println("Shield ? ");
        String shield = clavier.nextLine();
        
        warrior = new Warrior(warriorName, lifeLvl, attackForce, weaponName, weaponAttackLvl, shield);
        
        this.warriorList.add(warrior);
        
        System.out.println(warrior);
	}
	
	/* ___WIZZARD__lancers de d�____________________________________________________________________ */

	private void wizzard(Scanner clavier) {
		System.out.print("Choose your wizzard name : ");
		String wizzardName = clavier.nextLine();
		
		System.out.println("Life level, press Enter to launch 5 dices : ");
		clavier.nextLine();
		int launchDice1 = Dice.dice(5);
        int lifeLvl = launchDice1;
        
        System.out.println("Attack force, press Enter to launch 1 dice : ");
        clavier.nextLine();
		int launchDice2 = Dice.dice(1);
        int attackForce = launchDice2;
        
        System.out.println("Spell ? ");
        String spell = clavier.nextLine();
        
        System.out.println("Spell attack level, press Enter to launch 1 dice : ");
        clavier.nextLine();
		int launchDice3 = Dice.dice(1);
        int spellAttackLvl = launchDice3;
        
        System.out.println("Filter ? ");
        String filter = clavier.nextLine();
        
        wizzard = new Wizzard(wizzardName, lifeLvl, attackForce, spell, spellAttackLvl, filter);
        
        this.wizzardList.add(wizzard);
        
        System.out.println(wizzard);
	}
	
	/* ___Functions__charactersReady__playGame_____________________________________________________ */

	public void charactersReady() {
		if(warriorList.size() == 0 && wizzardList.size() == 0) {
			System.out.println("You have to create a character to start the game...");
		}
		else {
			System.out.println("You have created your character, now roll the dice to advance :");
			System.out.println("Press enter to roll the dice : ");
			// new playGame();
		}
	} 
	
	// public void playGame(Scanner clavier) {
		// When charactersReady is ok,
		// positionne perso sur la case 1 et lance le d�
		// 1 + total du d�
		// Ajout total du d� autant de fois que n�c�ssaire
		// tant qu'on n'est pas >= 64.
		
		/** Positionne perso sur la case 1 */
		/*private int position = 1;
		
		while (position <= 64) {
			/** Lance le d� */
			/*System.out.println("Press Enter to launch 1 dice to move : ");
	        clavier.nextLine();
			int launchDice2 = Dice.dice(1);
	        int attackForce = launchDice2;
	        
			position = position + Dice.total(1);
			System.out.println("Your character is in position : " + position);
		} 
	} */

}

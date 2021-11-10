package dungeonDragon;

import java.util.*;

public class TestGame {

	private Warrior warrior;
	private Wizzard wizzard;

	private ArrayList<Warrior> warriorList;
	private ArrayList<Wizzard> wizzardList;

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

		// on crée une "instance"
		//Warrior iulian = new Warrior("Iulian", 10, 10, "Fly swatter", "His sister");
		// on appelle la méthode d'instance "
		//System.out.println(iulian);
		
		Scanner clavier = new Scanner(System.in);
		
		boolean isPlaying = true;
		
		do {
			System.out.print("If you want to stop game choose 0, if you want a warrior choose 1, if you want a wizzard choose 2, if you want to see your characters choose 3 : ");
			int userChoice = clavier.nextInt();
			
			// Prend en compte le saut de ligne du clavier fait avant l'entrée. Merci Rick !
			clavier.nextLine();
			
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
		
				default:
					System.out.println("Invalid choice...");
					break;
			}
		}
		while(isPlaying);
	}

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

}

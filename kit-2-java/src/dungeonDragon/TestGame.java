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
		// on appelle la méthode d’instance "
		//System.out.println(iulian);

		Scanner clavier = new Scanner(System.in);
		
		boolean isPlaying = true;
		
		do {
			System.out.print("If you want to stop game choose 0, if you want a warrior choose 1, if you want a wizzard choose 2, if you want to see your characters choose 3 : ");
			int userChoice = clavier.nextInt();
	
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
		String warriorName = clavier.next();
		
		System.out.println("Life level ? ");
        int lifeLvl = clavier.nextInt();
        
        System.out.println("Attack force ? ");
        int attackForce = clavier.nextInt();
        
        System.out.println("Weapon ? ");
        String weapon = clavier.next();
        
        System.out.println("Shield ? ");
        String shield = clavier.next();
        
        warrior = new Warrior(warriorName, lifeLvl, attackForce, weapon, shield);
        
        this.warriorList.add(warrior);
        
        System.out.println(warrior);
	}
	
	private void wizzard(Scanner clavier) {
		System.out.print("Choose your wizzard name : ");
		String wizzardName = clavier.next();
		
		System.out.println("Life level ? ");
        int lifeLvl = clavier.nextInt();
        
        System.out.println("Attack force ? ");
        int attackForce = clavier.nextInt();
        
        System.out.println("Spell ? ");
        String spell = clavier.next();
        
        System.out.println("Filter ? ");
        String filter = clavier.next();
        
        wizzard = new Wizzard(wizzardName, lifeLvl, attackForce, spell, filter);
        
        this.wizzardList.add(wizzard);
        
        System.out.println(wizzard);
	}

}

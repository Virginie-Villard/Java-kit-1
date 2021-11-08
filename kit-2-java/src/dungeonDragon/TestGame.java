package dungeonDragon;

import java.util.*;

public class TestGame {
	private Warrior warrior;

	public static void main(String[] args) {
		TestGame tg = new TestGame();
		tg.travail();
	}
	private void travail() {	
		System.out.println("Dungeons and Dragons");

		
		// on crée une "instance"
		//Warrior iulian = new Warrior("Iulian", 10, 10, "Fly swatter", "His sister");
		// on appelle la méthode d’instance "
		//System.out.println(iulian);

		Scanner clavier = new Scanner(System.in);
		System.out.print("If you want a warrior choose 1, if you want a wizzard1 choose 2 : ");
		int hero = clavier.nextInt();

		switch (hero) {
		case 1:
			System.out.println("Warrior");
			warrior = new Warrior();
			System.out.println(warrior);
			break;

		case 2:
			System.out.println("Wizzard");
			break;

		default:
			System.out.println("Choix incorrect");
			break;
		}
	}

}

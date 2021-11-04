package demenagementPack;

import java.util.*;

public class TestDem {
	public static void main(String[] args) {
		System.out.println("Bienvenue");
		
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saisissez le nombre de cartons que vous souhaitez que nos déménageurs déplacent : ");
		int nbCartons = clavier.nextInt();
		
		System.out.print("Saisissez la capacité du camion choisi (nombre de cartons) : ");
		int capCamion = clavier.nextInt();
		
		// on crée une "instance"
		Demenagement dem = new Demenagement("Entreprise bretonne",capCamion);
		// on appelle la méthode d’instance "auTravail()
		dem.auTravail(nbCartons); 
	}
}

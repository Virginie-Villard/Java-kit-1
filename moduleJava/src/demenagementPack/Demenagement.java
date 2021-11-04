package demenagementPack ;

import java.util.Scanner;

public class Demenagement {
	private String nom; // attributs
	private int capCamion; 
	
	public Demenagement(String nom,int capCamion) { // constructeur
		this.nom = nom;
		this.capCamion = capCamion; 
		
	}
	
	public void auTravail(int nbCartons){
		int nbVoyage = 0;
		int emport;

		System.out.println("nbVoyage \t nbCartons \t emport \t capCamion");
		
		while (nbCartons > 0) {
			
			if(nbCartons >= capCamion) {
				emport = capCamion;
			}
			else {
				emport = nbCartons;
			}
			
			nbVoyage++;

			System.out.println(nbVoyage + "\t \t " + nbCartons + "\t \t " + emport + "\t \t " + capCamion);
			nbCartons = nbCartons - emport;
		}
		
		//for(int rest = nbCartons; rest > 0; rest -= capCamion){
        //    noVoyage++;
        //    if (rest < capCamion){
        //        emport = rest;
        //    }
        //    System.out.print(noVoyage + "\t\t\t\t" + rest + "\t\t\t" + emport + "\t\t" + capCamion + "\t\n");
        //}
		
		System.out.println(nom + " possède un camion de capacité : " + capCamion + "cartons");
		System.out.println("Début du déménagement");
	}

}
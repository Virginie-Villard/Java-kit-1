package demenagementPack ;

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
		
		System.out.println(nom + " poss�de un camion de capacit� : " + capCamion + " m�");
		System.out.println("D�but du d�m�nagement");
	}

}
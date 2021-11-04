package demenagementPack;

public class TestDem {
	public static void main(String[] args) {
		System.out.println("Bienvenus");
		// on crée une "instance"
		Demenagement dem = new Demenagement("Entreprise bretonne",9);
		// on appelle la méthode d’instance "auTravail()
		dem.auTravail();
	}
}

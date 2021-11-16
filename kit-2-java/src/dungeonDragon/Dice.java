package dungeonDragon;

/*
 * @see : https://www.geeksforgeeks.org/java-program-to-emulate-n-dice-roller/
 * Utilisation de ce site pour la création d'un objet dé
 * (je remplace void par int pour que le résultat des dés soit retournés par la classe).
 */

import java.util.Random;
import java.util.Scanner;
 
public class Dice {
	/** Création d'une classe statique avec pour paramètre le nombre de dés.
	 * @param numberOfDice.
	 * @return le total des résultats des dés.
	 */
    public static int dice(int numberOfDice)
    {
    	/*
    	 * Nouvelle instance de l'objet Random
    	 */
        Random ranNum = new Random();
 
        System.out.print("You rolled: ");
        int total = 0;
        int randomNumber = 0;
 
        /*
         *  Mise en place de la boucle for qui "Lance les dés".
         *  On utilise le nombre de dés comme nombre de tours de boucle,
         *  afin d'utiliser le total des résultats de chaque dé.
         */
        for (int i = 0; i < numberOfDice; i++) {
 
            /* Generating the random number and storing it
            * in the 'randomNumber' variable */
            randomNumber = ranNum.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.print(randomNumber);
            System.out.print(". ");
        }
        
        /* Affichage des résultats des dés,
         * Les résultats de la boucle séparés d'un espace,
         * puis le total.
         */
        System.out.println(" Total: " + total +".");
        /* Return du total pour pourvoir utiliser le résultat. */
        return total;
    }

}
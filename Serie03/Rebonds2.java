package Serie03;

import java.util.Scanner;

public class Rebonds2 {

	public static void main(String[] args) {
		System.out.println("-----EPFL, exercice de programmation, Maël Imhof (SCIPER:346511)");
		System.out.println("Exercice 11, semaine 3");
		System.out.println("System] Init finished");
		
		//Demander les valeurs à l'utilisateur
		System.out.println("Ce programme va calculer combien de rebonds une balle va faire avant d'atteindre une certaine hauteur");
		Scanner scanner = new Scanner(System.in);
		
		
		//Demander la hauteur initiale et vérifier qu'elle est supérieure ou égale à 0
		System.out.print("À quelle hauteur (en m) part la balle? ");
		double hauteurInitiale = scanner.nextDouble();
		while (hauteurInitiale < 0) {
			System.out.print("Saisis une hauteur intiale valide (supérieure ou égale à 0) : ");
			hauteurInitiale = scanner.nextDouble();
		}
		
		//Demander un coefficient de rebond (EPS) et vérifier qu'il est entre 1 et 0
		System.out.print("Quel sera le coefficient de rebond de la balle? ");
		double coefficientDeRebond = scanner.nextDouble();
		while (coefficientDeRebond < 0 || coefficientDeRebond >= 1) {
			System.out.print("Saisis un coefficient de rebond valide (entre 0 compris et 1 non compris) : ");
			coefficientDeRebond = scanner.nextDouble();
		}
		
		//Demander une hauteur minimale et vérifier qu'elle soit bien supérieure 0 et inférieure à la hauteur initiale
		System.out.print("À quelle hauteur la balle doit-elle arriver? ");
		double hauteurFinale = scanner.nextDouble();
		while (hauteurFinale <= 0 || hauteurFinale > hauteurInitiale) {
			System.out.println("Saisis une hauteur finale valide (entre 0 et la hauteur initiale) : ");
			hauteurFinale = scanner.nextDouble();
		}
		
		//On n'utilise plus le scanner, on le ferme
		scanner.close();
		
		//Stocker le nombre de rebonds actuel dans une variable
		int nombreDeRebonds = 0;
		
		//Stocker la hauteur actuelle dans une variable
		double hauteurActuelle = hauteurInitiale;
		
		//Tant que la balle est plus haut que la hauteur finale, la faire rebondir
		do {
			nombreDeRebonds++;
			
			//Calculer la vitesse d'arrivée au sol
			double vitesseAuSol = Math.sqrt(2 * hauteurActuelle * 9.81);
			
			//Calculer la vitesse après le rebond
			double vitesseAuRebond = coefficientDeRebond * vitesseAuSol;
			
			//Calculer la hauteur atteinte
			hauteurActuelle = Math.pow(vitesseAuRebond, 2.0) / (2 * 9.81);
		}
		while (hauteurActuelle > hauteurFinale);

		System.out.println("La balle a atteint la hauteur de " + hauteurActuelle + "m après " + nombreDeRebonds + " rebonds");
	}

}

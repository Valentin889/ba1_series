package Serie03;

import java.util.Scanner;
import java.lang.Math;

public class Rebonds1 {

	public static void main(String[] args) {
		System.out.println("-----EPFL, exercice de programmation, Maël Imhof (SCIPER:346511)");
		System.out.println("Exercice 11, semaine 3");
		System.out.println("System] Init finished");
		
		//Demander les valeurs à l'utilisateur
		System.out.println("Ce programme va calculer la hauteur d'une balle en fonction des valeurs que tu va spécifier");
		Scanner scanner = new Scanner(System.in);
		
		
		//Demander la hauteur initiale et vérifier qu'elle est supérieure ou égale à 0
		System.out.print("À quelle hauteur (en m) part la balle? ");
		double hauteurInitiale = scanner.nextDouble();
		while (hauteurInitiale < 0) {
			System.out.print("Saisis une hauteur intiale valide (supérieure ou égale à 0) : ");
			hauteurInitiale = scanner.nextDouble();
		}
		
		//Demander un coefficient de rebond et vérifier qu'il est entre 1 et 0
		System.out.print("Quel sera le coefficient de rebond de la balle? ");
		double coefficientDeRebond = scanner.nextDouble();
		while (coefficientDeRebond < 0 || coefficientDeRebond >= 1) {
			System.out.print("Saisis un coefficient de rebond valide (entre 0 compris et 1 non compris) : ");
			coefficientDeRebond = scanner.nextDouble();
		}
		
		//Demander un nombre de rebonds et vérifier qu'il est supérieur ou égal à 0
		System.out.print("Combien de rebond(s) la balle doit-elle faire? ");
		int nombreDeRebonds = scanner.nextInt();
		while (nombreDeRebonds < 0) {
			System.out.println("Saisis un nombre de rebonds valide (supérieur ou égal à 0) : ");
			nombreDeRebonds = scanner.nextInt();
		}
		
		//On n'utilise plus le scanner, on le ferme
		scanner.close();
		
		//Stocker la hauteur actuelle dans une variable
		//C'est cette variable qui va varier au cours de l'exécution
		double hauteurActuelle = hauteurInitiale;
		
		//Autant de fois qu'il y a de rebond, calculer la vitesse puis la hauteur
		for (int rebond = 0; rebond < nombreDeRebonds; rebond++) {
			//Calculer la vitesse d'arrivée au sol
			double vitesseAuSol = Math.sqrt(2 * hauteurActuelle * 9.81);
			
			//Calculer la vitesse après le rebond
			double vitesseAuRebond = coefficientDeRebond * vitesseAuSol;
			
			//Calculer la hauteur atteinte
			hauteurActuelle = Math.pow(vitesseAuRebond, 2.0) / (2 * 9.81);
		}
		
		System.out.println("Après " + nombreDeRebonds + " rebonds, en partant de " + hauteurInitiale + "m de haut avec un coefficient de rebond de " + coefficientDeRebond + ", la balle atteindra : ");
		System.out.println(hauteurActuelle + "m de haut");
	}

}

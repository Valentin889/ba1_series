package Serie03;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		//Demander les valeurs à l'utilisateur
		System.out.println("Ce programme calcule, pour une somme et des intérêts donnés, le coût total d'un emprunt bancaire");
		Scanner scanner = new Scanner(System.in);
		
		//Demander la somme initiale et vérifier qu'elle soit supérieur à 0
		System.out.print("Quelle somme la banque prête-t-elle à la base? ");
		double sommeInitiale = scanner.nextDouble();
		while (sommeInitiale <= 0) {
			System.out.println("Saisis une somme initiale valide (supérieure à 0)");
			sommeInitiale = scanner.nextDouble();
		}
		
		//Demander le montant fixe que la personne rembourse chaque mois et vérifier qu'il soit supérieur à 0 et inférieur ou égal à la somme initiale
		System.out.println("Combien rembourse-t-on chaque mois? ");
		double remboursementMensuel = scanner.nextDouble();
		while (remboursementMensuel <= 0 || remboursementMensuel > sommeInitiale) {
			System.out.println("Saisis un remboursement mensuel valide (entre 0 et la somme initiale) : ");
			remboursementMensuel = scanner.nextDouble();
		}
		
		//Demander le taux d'intérêt mensuel et vérifier qu'il est compris entrre 0 et 1
		System.out.println("Quel est le taux d'intérêt mensuel? ");
		double tauxInteretMensuel = scanner.nextDouble();
		while (tauxInteretMensuel <= 0 || tauxInteretMensuel >= 1) {
			System.out.println("Saisis un remboursement mensuel");
			tauxInteretMensuel = scanner.nextDouble();
		}
		
		//On n'utilise plus le scanner, on le ferme
		scanner.close();
		
		//Définir la somme actuelle de la dette
		double detteActuelle = sommeInitiale;
		
		//Définir la somme gagnée par la banque
		double argentDeLaBanque = 0;

		//Enregistrer le nombre de mois
		int mois = 0;
		
		do {
			mois++;

			double interetMensuel = tauxInteretMensuel * detteActuelle;
			
			//S'il y a moins à payer que le paiement mensuel, finir le paiement
			if (remboursementMensuel > detteActuelle) {
				argentDeLaBanque += interetMensuel + detteActuelle;
				detteActuelle = 0;
			}
			//S'il y a plus à rembourser que ce mois-ci, continuer
			else {
				argentDeLaBanque += interetMensuel + remboursementMensuel;
				detteActuelle -= remboursementMensuel;	
			}
		}
		while (detteActuelle != 0);

		System.out.println("Après " + mois + " mois, la banque a gagné " + argentDeLaBanque + "CHF sur un prêt initial de " + sommeInitiale);
	}

}

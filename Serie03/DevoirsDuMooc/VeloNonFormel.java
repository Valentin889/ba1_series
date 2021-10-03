package Serie03.DevoirsDuMooc;

import java.util.Scanner;

public class VeloNonFormel {
    
    public static void main(String[] args) {
        //Petite partie pour le fun
        System.out.println("----Logiciel de l'entreprise En Roue Libre, locateur officiel de vélo pour l'EPFL");
        System.out.println("Bienvenue dans notre service informatique!");
        System.out.println();

        //On commence à être sérieux et on demande les heures à l'utilisateur
        Scanner scanner = new Scanner(System.in);
        int heureDeDebut;
        int heureDeFin;
        do {
            System.out.print("À quelle heure a commencé ta location? ");
            heureDeDebut = scanner.nextInt();
            System.out.print("À quelle heure s'est terminée ta location? ");
            heureDeFin = scanner.nextInt();

            //Implémentation des messages d'erreur demandés dans la donnée
            //Le programme devrait "s'arrêter". Cela serait possible avec un simple if,
            //Mais j'ai préféré faire une boucle, parce que dans un cas plus pratique,
            //on préfère que le programme gère l'erreur plutôt que de simplement le stopper
            if (heureDeDebut < 0 || heureDeFin > 24) {
                System.out.println("Les heures doivent être comprises entre 0 et 24 !");
            }
            if (heureDeDebut > heureDeFin) {
                System.out.println("Bizarre, le début de la location est après la fin...");
            }
            if (heureDeDebut == heureDeFin) {
                System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
            }
        }
        //Bien vérifier que les heures de début et de fin sont valides
        while (heureDeDebut < 0 || heureDeDebut > heureDeFin || heureDeDebut == heureDeFin || heureDeFin > 24);
        scanner.close();

        //Calculer le prix total
        int montant = 0;
        //On va boucler de l'heure de début jusqu'à l'heure de fin
        //Pour chaque heure, on va regarder dans quelle plage horaire elle se trouve
        //et ajouter le prix correspondant
        for (int i = heureDeDebut; i < heureDeFin; ++i) {
            if (i < 7 || i >= 17) {
                montant += 1;
            }
            else { //if (i > 7 && i < 17)
                montant += 2;
            }
        }

        System.out.println("Vous avez loué votre vélo pendant " + (heureDeFin - heureDeDebut) + "h");
        System.out.print("Le montant total à payer est de " + montant);
        System.out.println(" franc(s).");
        
    }
    
}

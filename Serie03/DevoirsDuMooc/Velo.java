package Serie03.DevoirsDuMooc;

import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        //Par choix, j'ai décidé de laisser plusieurs erreurs s'afficher d'un coup
        //le cas échéant. Il suffirait d'ajouter des "else" pour éviter plusieurs erreurs
        if (debut < 0 || fin > 24) {
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        }
        if (debut > fin) {
            System.out.println("Bizarre, le début de la location est après la fin ...");
        }
        if (debut == fin) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        }

        //Calculer le prix total
        int montant = 0;
        //On va boucler de l'heure de début jusqu'à l'heure de fin
        //Pour chaque heure, on va regarder dans quelle plage horaire elle se trouve
        //et ajouter le prix correspondant
        for (int i = debut; i < fin; ++i) {
            if (i < 7 || i >= 17) {
                montant += 1;
            }
            else { //if (i > 7 && i < 17)
                montant += 2;
            }
        }

        System.out.println("Vous avez loué votre vélo pendant " + (fin - debut) + "h");
        System.out.print("Le montant total à payer est de " + montant);
        System.out.println(" franc(s).");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}

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

        if (debut < 0 || debut > 24 || fin > 24 || fin < 0) {
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        }
        else if (debut > fin) {
            System.out.println("Bizarre, le début de la location est après la fin ...");
        }
        else if (debut == fin) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        }
        else {

            //Calculer le prix total
            int montant = 0;
            //Calculer les heures au tarif réduit
            int unFranc = 0;
            //Calculer les heures au tarif élevé
            int deuxFrancs = 0;
            //On va boucler de l'heure de début jusqu'à l'heure de fin
            //Pour chaque heure, on va regarder dans quelle plage horaire elle se trouve
            //et ajouter le prix correspondant
            for (int i = debut; i < fin; ++i) {
                if (i < 7 || i >= 17) {
                    montant += 1;
                    unFranc++;
                }
                else { //if (i > 7 && i < 17)
                    montant += 2;
                    deuxFrancs++;
                }
            }

            System.out.println("Vous avez loué votre vélo pendant");
            if (unFranc != 0) {
                System.out.println(unFranc + " heure(s) au tarif horaire de 1.0 franc(s)");
            }
            if (deuxFrancs != 0) {
                System.out.println(deuxFrancs + " heure(s) au tarif horaire de 2.0 franc(s)");
            }
            System.out.println("Le montant total à payer est de " + montant + ".0 franc(s).");
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}

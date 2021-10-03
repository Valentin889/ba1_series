package Serie03;

import java.util.Scanner;

public class Bilan {
    
    public static void main(String[] args) {
        //Demander les valeurs à l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne n : ");
        int n = scanner.nextInt();

        //Une fois n connu, boucler n fois en demandant à l'utilisateur la valeur du mois
        //Ce faisant, enregistrer la valeur minimale, la valeur maximale et additionner les montants
        double moyenne = 0;
        double minimum = -1;
        double maximum = -1;
        for (int i = 0; i < n; i++) {
            //On demande le montant du mois i
            System.out.print("Donne le montant du mois " + i + " (Frs) : ");
            double mensuel = scanner.nextDouble();

            //Ajouter le montant au total pour la moyenne
            moyenne += mensuel;

            //Si le montant donné est inférieur au minimum, changer le minimum
            if (mensuel < minimum || minimum == -1) {
                minimum = mensuel;
            }

            //Si le montant donné est supérieur au maximum ou que le maximum n'a pas encore de valeur, changer le maximum
            if (mensuel > maximum || maximum == -1) {
                maximum = mensuel;
            }
        }
        scanner.close();

        //Calculer la moyenne et afficher les résultats
        moyenne /= n;
        System.out.println("La somme mensuelle moyenne reçue est : " + moyenne);
        System.out.println("Le montant mensuel minimal reçu est : " + minimum);
        System.out.println("Le montant mensuel maximal reçu est : " + maximum);
    }

}

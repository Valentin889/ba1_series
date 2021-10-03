package Serie03;

import java.util.Scanner;

public class Parite {
    
    public static void main(String[] args) {

        //On peut utiliser plusieurs manières de faire dans cet exercice
        //Ce corrigé utilise les notions vues en cours avant de faire les exercices
        //Si ton programme marche mais que tu n'as pas utilisé cette solution et que tu désires un retour,
        //n'hésite pas à m'envoyer directement ton code

        //Demander un nombre à l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisis un nombre entier : ");
        int nombre = scanner.nextInt();
        scanner.close();

        if (nombre == 0) {
            System.out.println("Le nombre est zéro (et il est pair)");
        }
        else {
            //Commencer le résultat (remarque que j'utilise print et pas println)
            System.out.print("Le nombre est ");

            //Ajouter l'adjectif du signe
            if (nombre > 0) {
                System.out.print(" positif et");
            }
            else {
                System.out.print(" négatif et");
            }

            if (nombre % 2 == 0) {
                System.out.print(" pair");
            }
            else System.out.print(" impair");
        }

        //POUR ALLER PLUS LOIN
        //
        //Cette manière de faire n'est pas optimale,
        //mais c'est la meilleure manière, je pense, avec ce que tu as déjà vu en cours
        //Si tu désires aller plus loin dans cet exercice, tu peux essayer d'utiliser des
        //variables de type String ou des conditional lambda expressions
        //
        //Pour en savoir plus, je t'invite à consulter le dossier "AllerPlusLoin"
    }

}

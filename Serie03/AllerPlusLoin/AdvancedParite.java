package Serie03.AllerPlusLoin;

import java.util.Scanner;

public class AdvancedParite {
    
    public static void main(String[] args) {
        //Dans le fichier d'exercice normal "Parite.java", tu as vu comment réaliser l'exercice
        //avec le matériel vu en cours jusque-là
        //Il existe cependant d'autres outils que tu peux utiliser pour venir à bout du problème
        //de manière plus lisible et plus courte

        //Voici deux exemples :

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisis un nombre entier : ");
        int nombre = scanner.nextInt();
        
        //Checker si c'est 0, c'est quand même la manière la plus simple
        if (nombre == 0) {
            System.out.println("Le nombre est zéro (et il est pair)");
        }

        //Exemple 1 : utiliser une conditional lambda expression
        //Il s'agit en fait d'une notation équivalente à if ([condition]) {} mais en plus court
        System.out.println("Le nombre est "
                    + (nombre > 0 ? "positif" : "négatif")
                    + " et "
                    + (nombre % 2 == 0 ? "pair" : "impair"));
        //Comment ça marche?
        //La condition est construite comme suit :
        //([condition] ? [si la condition est vraie utilise cette valeur] : [si la condition est fausse utilise cette valeur])
        //Le ? sépare donc la condition des deux possibilités
        //Le : sépare les deux possibilités

        System.out.print("Saisis un nombre entier : ");
        nombre = scanner.nextInt();
        scanner.close();

        if (nombre == 0) {
            System.out.println("Le nombre est zéro (et il est pair)");
        }

        //Exemple 2 : utiliser des variables de type String
        //Une variable de type String est comme un double ou un int, sauf qu'au lieu d'un nombre, elle contient du texte
        //On déclare nos deux variables, sans valeur
        String parite;
        String signe;
        //Attention : comme tu l'as vu en cours, il faut déclarer tes variables dans la bonne portée
        //Si tu déclares "parite" dans le bloc if, elle n'existera pas en-dehors
        //Voilà pourquoi elle sont instanciées ci-dessus

        //On définit le texte pour la parité
        if (nombre % 2 == 0) {
            parite = "pair";
        }
        else {
            parite = "impair";
        }

        //On définit le texte pour le signe
        if (nombre > 0) {
            signe = "positif";
        }
        else {
            signe = "négatif";
        }

        System.out.println("Le nombre est " + signe + " et " + parite);
    }

}

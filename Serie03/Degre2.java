package Serie03;

import java.util.Scanner;

public class Degre2 {
    
    //On déclare notre scanner en-dehors de la fonction main
    //On n'a pas encore vu ce qu'est une propriété ni une fonction,
    //Donc pour l'instant copie juste ce code
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Déclarer nos coefficients de l'équation ax^2 + bx + c
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        //Tant que a est nul, demander une valeur à l'utilisateur
        while (a == 0.0) {
            System.out.print("Saisis une valeur non nulle pour a : ");
            a = scanner.nextDouble();
        }

        //Demander des valeurs pour b et c
        System.out.print("Saisis une valeur pour b : ");
        b = scanner.nextDouble();
        System.out.print("Saisis une valeur pour c : ");
        c = scanner.nextDouble();

        //Calculer le delta de l'équation ax^2 + bx + c = 0
        double delta = b * b - 4.0 * a * c;

        //Comme tu le sais, il y a trois cas de figure :
        //1) delta est inférieur à 0
        if (delta < 0) {
            System.out.println("Il n'existe aucune solution réelle");
        }
        //2) delta est égal à 0
        else if (delta == 0) {
            System.out.println("Il existe une solution unique : " + (-b / (2.0 * a)));
        }
        //3) delta est supérieur à 0
        //(On peut aussi simplement noter "else" sans le "if (delta > 0)")
        else if (delta > 0) {
            System.out.println("Il existe deux solutions : "
                        + (-b - Math.sqrt(delta)) / (2.0 * a)
                        + " et " + (-b + Math.sqrt(delta)) / (2.0 * a));
        }

    }

}

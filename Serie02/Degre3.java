package Serie02;

import java.util.Scanner;
//Si tu ne parviens pas à accéder à la classe Math, ajoute cette directive
import java.lang.Math;

public class Degre3 {

    public static void main(String[] args) {
        //Demander a, b, c et x à l'utilisateur, puis fermer le scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a (int) : ");
        int a = scanner.nextInt();
        System.out.print("Enter b (int) : ");
        int b = scanner.nextInt();
        System.out.print("Enter c (int) : ");
        int c = scanner.nextInt();
        System.out.print("Enter x (double) : ");
        double x = scanner.nextDouble();
        scanner.close();

        //Effectuer l'opération en étapes (attention à la priorité des opérations et surtout à la division/multiplication d'entiers)
        //Dans Eclipse, on rencontre parfois des difficultés à accéder à la classe Math
        //Il faut alors ajouter une directive import (voir ci-dessus)
        int aPlusb = a + b;
        double value = (aPlusb / 2.0) * Math.pow(x, 3.0) + Math.pow(aPlusb, 2.0) * Math.pow(x, 2.0) + a + b + c;

        System.out.println("The obtained value is : " + value);
    }

}

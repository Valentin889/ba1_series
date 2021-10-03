package Serie02;

import java.util.Scanner;

public class Permutation {
    
    public static void main(String[] args) {
        
        //Demandons deux entiers à l'utilisateur et stockons-les dans des variables
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez x : ");
        int x = scanner.nextInt();
        System.out.print("Entrez y : ");
        int y = scanner.nextInt();
        scanner.close();

        System.out.println("Avant permutation :");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //Échangeons leurs valeurs
        //Pour cela nous devons créer une variable temporaire
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("Après permutation :");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}

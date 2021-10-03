package Serie02;

import java.util.Scanner;

public class Age {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Demander son âge à l'utilisateur
        System.out.print("Quel âge as-tu? ");
        int age = scanner.nextInt();

        //On n'a plus besoin du scanner, on le ferme
        scanner.close();

        //final signifie qu'on déclare une constante
        //On ne pourra plus changer la valeur de cette fonction plus tard,
        //Cela ferait une erreur de compilation
        final int ANNE_COURANTE = 2021;
        //On pourrait obtenir l'année actuelle directement grâce à Java,
        //Mais on verra ça plus tard dans le cours

        int anneeDeNaissance = ANNE_COURANTE - age;
        System.out.println("Ton année de naissance est " + anneeDeNaissance);
    }

}

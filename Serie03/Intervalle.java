package Serie03;

import java.util.Scanner;

public class Intervalle {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisis un réel : ");
        double x = scanner.nextDouble();
        scanner.close();

        if (//On teste l'appartenance au premier intervalle
            //La condition intuitive serait : if (x >= 2 && x < 3)
            //Mais pas le droit à >=, donc on change, on trouve une solution pour contourner
            !(x < 2 || x == 3 || 3 < x) ||
            //Même chose ici, on test pour le second intervalle
            //La condition intuitive serait : if (x > 0 && x <= 1)
            //Mais pas le droit à <=
            !(x < 0 || x == 0 || 1 < x) ||
            //Pareil pour le troisième intervalle
            //La condition intuitive serait : if (x >= -10 && x <= -2)
            !(x < -10 || -2 < x)) {

            //Ce bloc de code est exécuté si x appartient à l'un des intervalles
            System.out.println("x appartient à I");
        }
        else {
            //Si x n'appartient à aucun des intervalles, on arrive ici
            System.out.println("x n'appartient pas à I");
        }
    }

}

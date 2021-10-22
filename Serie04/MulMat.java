package Serie04;

import java.util.Scanner;

public class MulMat {
    public static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args) {
        //Demander à l'utilisateur la dimension des matrices
        int mat1Lines;
        int mat1Columns;
        int mat2Lines;
        int mat2Columns;
        do
        {
            System.out.print("Quel sera le nombre de lignes de la matrice 1? ");
            mat1Lines = clavier.nextInt();
            System.out.print("Quel sera le nombre de colonnes de la matrice 1? ");
            mat1Columns = clavier.nextInt();
            System.out.print("Quel sera le nombre de lignes de la matrice 2? ");
            mat2Lines = clavier.nextInt();
            System.out.print("Quel sera le nombre de colonnes de la matrice 2? ");
            mat2Columns = clavier.nextInt();
        }
        while (mat1Lines < 1 || mat1Columns < 1 || mat2Lines < 1 || mat2Columns < 1 || mat1Columns != mat2Lines);

        //Déclarer les matrices sous forme de tableaux de tableaux
        double[][] mat1 = new double[mat1Lines][mat1Columns];
        double[][] mat2 = new double[mat2Lines][mat2Columns];

        //Juste pour le fun :)
        double[][][] matrices = new double[][][] { mat1, mat2 };


        //Demander les coefficients des matrices
        for (int matrice = 0; matrice < 2; matrice++) {
            for (int ligne = 0; ligne < matrices[matrice].length; ligne++) {
                for (int colonne = 0; colonne < matrices[matrice][ligne].length; colonne++) {
                    System.out.print("Saisis le coefficient " + colonne + " de la ligne " + ligne + " de la matrice mat" + matrice + " : ");
                    matrices[matrice][ligne][colonne] = clavier.nextDouble();
                }
            }
        }

        //Calculer et afficher le produit matriciel
        for (int ligne = 0; ligne < mat1Lines; ligne++) {
            for (int colonne = 0; colonne < mat2Columns; colonne++) {
                double value = 0;
                for (int index = 0; index < mat1Columns; index++) {
                    value += matrices[0][ligne][index] * matrices[1][index][colonne];
                }
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

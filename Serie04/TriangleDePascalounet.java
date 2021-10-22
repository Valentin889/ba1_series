package Serie04;

import java.util.Scanner;

public class TriangleDePascalounet {
    public static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args) {
        //Demander le nombre de ligne pour le triangle
        int n;
        do
        {
            System.out.print("Combien de ligne pour votre triangle ma ptite dame? ");
            n = clavier.nextInt();
        }
        while (n < 1);

        //Construire le triangle de Pascal dans un array
        int[][] triangleDePascal = new int[n][];
        triangleDePascal[0] = new int[] { 1 };
        for (int ligne = 1; ligne < n; ligne++) {
            //À chaque début de ligne, on définit la longueur du tableau de la ligne : le numéro de la ligne
            triangleDePascal[ligne] = new int[ligne + 1];

            //Dans la première case de chaque ligne, on met 1
            triangleDePascal[ligne][0] = 1;

            //Pour chaque colonne dans la ligne excepté la dernière, on calcule l'addition
            for (int colonne = 1; colonne < ligne; colonne++) {
                triangleDePascal[ligne][colonne] = triangleDePascal[ligne - 1][colonne - 1] + triangleDePascal[ligne - 1][colonne];
            }

            //Dans la dernière case de chaque ligne, on met 1
            triangleDePascal[ligne][ligne] = 1;
        }

        //Imprimer le tableau obtenu
        for (int[] ligne : triangleDePascal) {
            for (int element : ligne) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

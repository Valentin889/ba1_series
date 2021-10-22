package Serie04;

import java.util.Scanner;

public class Scalaire1 {
    public static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args) {

        //La taille maximale des vecteurs (demandé dans la donnée)
        int nMax = 10;
        
        //La taille effective des vecteurs (demandée à l'utilisateur)
        int n;

        //Demander la taille effective des vecteurs à l'utilisateur
        do
        {
            System.out.print("Quelle sera la taille des vecteurs (entre 1 et " + nMax + ")? ");
            n = clavier.nextInt();
        }
        while (n < 1 || n > nMax);

        //Déclarer les tableaux, qui seront les vecteurs. La consigne ne précise pas s'il faut utiliser des int ou des double
        double[] v1 = new double[n];
        double[] v2 = new double[n];

        //Demander les composantes des vecteurs
        for (int vecteur = 1; vecteur <= 2; vecteur++) {
            for (int composante = 1; composante <= n; composante++) {
                System.out.print("Entre la composante " + composante + " du vecteur v" + vecteur + " : ");
                if (vecteur < 2) {
                    v1[composante - 1] = clavier.nextDouble();
                }
                else {
                    v2[composante - 1] = clavier.nextDouble();
                }
            }
        }

        //On a toutes les composantes, on calcule le produit scalaire
        double produitScalaire = 0;
        for (int composante = 0; composante < n; composante++) {
            produitScalaire += v1[composante] * v2[composante];
        }

        System.out.println("Le produit scalaire de v1 et v2 est " + produitScalaire);
    }
}
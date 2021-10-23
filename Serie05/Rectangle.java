import java.util.Scanner;

public class Rectangle {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double largeur = lireDonnee("largeur");
        double hauteur = lireDonnee("hauteur");

        boolean donneesOk = testerDonnees(largeur, hauteur);
        if (donneesOk) {
            calculer(largeur, hauteur);
        }
        else {
            afficherErreur();
        }
    }

    static double lireDonnee(String message) {
        System.out.print("Entre la " + message + " du rectangle : ");
        return scanner.nextDouble();
    }

    static boolean testerDonnees(double largeur, double hauteur) {
        return largeur > 0 && hauteur > 0;
    }

    static void calculer(double largeur, double hauteur) {
        System.out.print("Surface ('s/S') ou perimètre ('p/P')?: ");
        scanner.nextLine();
        char answer = scanner.nextLine().toLowerCase().charAt(0);
        
        switch (answer)
        {
            case 'p':
                System.out.println("Le périmètre est " + (2*largeur + 2*hauteur));
                return;
            case 's':
                System.out.println("La surface est " + largeur * hauteur);
                return;
            default:
                afficherErreur("Invalide, seules les valeurs p ou s sont acceptées");
                return;
        }
    }

    static void afficherErreur(String message) {
        System.out.println(message);
    }

    static void afficherErreur() {
        afficherErreur("Erreur: vous avez introduit une largeur ou une hauteur négative!");
    }

}

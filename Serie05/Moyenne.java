import java.util.Scanner;

class Moyenne {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double note1, note2;
        System.out.println("Entrez vos deux notes :");
        note1 = scanner.nextDouble();
        note2 = scanner.nextDouble();

        // appel
        System.out.println("Votre moyenne est : " + moyenne(note1, note2));
    }

    // définition
    static double moyenne(double nombre1, double nombre2) {
        return (nombre1 + nombre2) / 2;
    }
}
package Serie02;

import java.util.Scanner;

public class RosesBlanches {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien as-tu reçu d'argent en CHF? ");
        int chf = scanner.nextInt();
        scanner.close();

        int furnitures = chf / 4 * 3;
        chf -= furnitures;

        int SAT, Flash, metro;
        SAT = Flash = metro = (chf - (chf % 3)) / 3;

        int remaining = chf % 3;
        chf = 0;

        chf = SAT % 2;
        SAT -= chf;
        remaining += chf;

        chf = Flash % 4;
        Flash -= chf;
        remaining += chf;

        chf = metro % 3;
        metro -= chf;
        remaining += chf;

        System.out.println("Livres et fournitures : " + furnitures + " Frs");
        System.out.println("Tu peux aussi acheter :");
        System.out.println(SAT / 2 + " cafés à SAT");
        System.out.println(Flash / 4 + " numéros du Flash");
        System.out.println(metro / 3 + " tickets de métro");
        System.out.println("Et il te restera " + remaining + " Frs pour les roses blanches.");

    }

}

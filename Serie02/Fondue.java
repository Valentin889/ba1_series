package Serie02;

import java.util.Scanner;

public class Fondue {
    
    public static void main(String[] args) {
        
        //Constante qui indique pour combien de personnes la recette du programme est conçue
        final int BASE = 4;

        //Combien de fromage il faut pour BASE personnes en grammes
        double fromage = 800.0;
        //Combien de décilitres d'eau il faut pour BASE personnes
        double eau = 2.0;
        //Combien de gousses d'ail il faut pour BASE personnes
        double ail = 2.0;
        //Combien de pain il faut pour BASE personnes en grammes
        double pain = 400.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pour combien de personnes fais-tu une fondue fribourgeoise? ");
        int nombreDeConvives = scanner.nextInt();
        scanner.close();

        //Adapter les quantités par règle de trois
        fromage = nombreDeConvives * fromage / BASE;
        eau = nombreDeConvives * eau / BASE;
        ail = nombreDeConvives * ail / BASE;
        pain = nombreDeConvives * pain / BASE;

        System.out.println("Pour " + nombreDeConvives + " convives, il te faudra :");
        System.out.println(" - " + fromage + "g de Vacherin fribourgeois");
        System.out.println(" - " + eau + "dl d'eau");
        System.out.println(" - " + ail + " gousse(s) d'ail");
        System.out.println(" - " + pain + "g de pain");
        System.out.println(" - Du poivre à volonté");
    }

}

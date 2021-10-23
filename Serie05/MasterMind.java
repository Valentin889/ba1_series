import java.util.Scanner;

public class MasterMind {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Définir les valeurs connues et constantes
        final int LONGUEUR_DE_LA_COMBINAISON = 4;
        final int CHIFFRE_MAXIMUM = 6;
        final int NOMBRE_MAXIMUM_DE_COUPS = 10;

        //Tirer la combinaison à deviner
        int[] combinaisonADeviner = new int[LONGUEUR_DE_LA_COMBINAISON];
        tirerCombinaison(combinaisonADeviner, CHIFFRE_MAXIMUM);

        //Instancier un tableau pour contenir la valeur de l'utilisateur
        int[] propositionDeLUtilisateur = new int[LONGUEUR_DE_LA_COMBINAISON];


        //Jusqu'à ce qu'il n'ait plus de coups, demander une combinaison à l'utilisateur
        //et lui afficher le résultat
        for (int coup = 1; coup <= NOMBRE_MAXIMUM_DE_COUPS; coup++) {

            //Demander une proposition
            demanderCoup(propositionDeLUtilisateur);

            //Comparer les combinaisons et afficher le résultat
            String compared = compare(combinaisonADeviner, propositionDeLUtilisateur);
            System.out.println(compared);
            System.out.println();

            //Si l'utilisateur a trouvé, on le félicite en affichant le nombre de coups
            //et on termine l'exécution du programme ici
            if (compared == "####") {
                System.out.println("Bravo ! Vous avez trouvé en " + coup + " coups");
                return;
            }
        }

        //Si à la fin de la boucle et des coups, l'utilisateur n'a pas trouvé,
        //afficher un message avec la solution
        System.out.println("Désolé vous n'avez pas trouvé...");
        System.out.print("La bonne réponse était");
        printCombinaison(combinaisonADeviner);
        System.out.print(".");
        
    }

    /**
     * Retourne un entier aléatoire compris entre 1 et le maximum (compris)
     * @param max Le chiffre maximum accepté
     */
    static int hasard(int max) {
        return (1 + (int)(Math.random() * max));
    }

    /**
     * Remplis le tableau donné en paramètre avec des entiers aléatoires
     * @param combinaisonADeviner Le tableau à remplir
     * @param max Le chiffre maximum accepté
     */
    static void tirerCombinaison(int[] combinaisonADeviner, int max) {
        for (int index = 0; index < combinaisonADeviner.length; index++) {
            combinaisonADeviner[index] = hasard(max);
        }
    }

    /**
     * Remplis le tableau donné avec une combinaison demandée à l'utilisateur
     * @param combinaison Le tableau à remplir
     */
    static void demanderCoup(int[] combinaison) {
        System.out.println("Entrez les " + combinaison.length + " chiffres de votre proposition :");
        for (int index = 0; index < combinaison.length; index++) {
            System.out.print(index + " : ");
            combinaison[index] = scanner.nextInt();
        }
    }

    /**
     * Compare la combinaison à deviner et la combinaison donnée
     * @param aTrouver La combinaison à deviner
     * @param proposee La combinaison de l'utilisateur
     * @return Une chaîne de caractère composée de # et de O indiquant combien d'entiers sont corrects
     */
    static String compare(int[] aTrouver, int[] proposee) {

        //Définir la variable qui sera renvoyée comme résultat
        String result = "";

        //Définir un tableau qui sauvegardera les chiffres déjà notés comme justes
        boolean[] rightValues = new boolean[aTrouver.length];

        //Checker si chaque index est juste
        for (int proposeeIndex = 0; proposeeIndex < proposee.length; proposeeIndex++) {

            //Si l'index est juste, on ajoute # à result et on enregistre que ce chiffre est compté comme juste
            if (aTrouver[proposeeIndex] == proposee[proposeeIndex]) {
                result += "#";
                rightValues[proposeeIndex] = true;
            }
        }

        //Si l'utilisateur a deviné, on peut s'arrêter là
        if (result == "####") {
            return result;
        }

        //Sinon, définir le nombre de chiffres justes mais mal placés
        for (int proposeeIndex = 0; proposeeIndex < proposee.length; proposeeIndex++) {
            for (int index = 0; index < aTrouver.length; index++) {

                /**Pour cela, on vérifie :
                 * - on ne compare pas les mêmes index (on l'a fait avant)
                 * - on cherche des valeurs pareilles
                 * - on vérifie que la valeur n'a pas été comptée comme juste avant (éviter de compter à double)
                 */
                if (proposeeIndex != index && proposee[proposeeIndex] == aTrouver[index] && !rightValues[proposeeIndex] && !rightValues[index]) {
                    result += "O";
                    break;
                }
            }
        }

        return result;
    }

    /**
     * Affiche les entiers d'une combinaison avec des espaces entre les chiffres
     * @param combinaison La combinaison à afficher
     */
    static void printCombinaison(int[] combinaison) {
        for (int index = 0; index < combinaison.length; index++) {
            System.out.print(" " + combinaison[index]);
        }
    }

}

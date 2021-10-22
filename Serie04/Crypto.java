import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        //Filtrer les caractères
        for (int charIndex = 0; charIndex < s.length(); charIndex++) {
            char character = s.charAt(charIndex);
            if (ALPHABET.contains("" + character) || character == ' ') {
                aCoder += character;
            }
        }

        //On ne crypte que si la chaîne n'est pas vide
        for (int charIndex = 0; charIndex < aCoder.length(); charIndex++) {

            //Pour chaque caractère, on check lequel c'est
            char current = aCoder.charAt(charIndex);

            //S'il s'agit d'un espace, on l'ajoute tel quel
            if (current == ' ') {
                chaineCodee += ' ';
            }
            //S'il s'agit d'une lettre (la chaîne a été filtrée, il ne reste que les espaces et les lettres)
            //Décaler l'index si nécessaire et décaler
            else {
                int indexOf = ALPHABET.indexOf(current);
                if (indexOf > ALPHABET.length() - 1 - DECALAGE) { indexOf -= ALPHABET.length(); }
                indexOf += DECALAGE;
                chaineCodee += ALPHABET.charAt(indexOf);
            }
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}

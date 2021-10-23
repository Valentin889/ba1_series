import java.util.Scanner;

class Cesure {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] phrase = lirePhrase();
        for (int i = 0; i < phrase.length; i++) {
            cesure(phrase[i]);
        }
    }

    static String[] lirePhrase() {
        // A compléter:
        // retourne un tableau de chaines de caractères
        // introduits par l'utilisateur
        System.out.print("Introduisez une phrase : ");
        String phrase = scanner.nextLine();
        return sanitizeSentenceArray(phrase.split(" "));
    }

    static String[] sanitizeSentenceArray(String[] sentenceArray) {
        //Nettoie un tableau contenant une phrase de tous les caractères autres que des lettres
        //Change les majuscules pour des minuscules
        for (int wordIndex = 0; wordIndex < sentenceArray.length; wordIndex++) {
            String oldElement = sentenceArray[wordIndex];
            String newElement = "";
            for (int letterIndex = 0; letterIndex < oldElement.length(); letterIndex++) {
                if (Character.isLetter(oldElement.charAt(letterIndex))) {
                    newElement += Character.toLowerCase(oldElement.charAt(letterIndex));
                }
            }
            sentenceArray[wordIndex] = newElement;
        }

        return sentenceArray;
    }

    static boolean voyelle(char c) {
        // A compléter:
        // teste si un caractère est une voyelle
        return "aeiouy".indexOf(c) != -1;
    }

    static boolean queVoyelles(String s) {
        // A compléter:
        // teste si une chaîne ne contient que des voyelles
        // utilise la méthode voyelle

        for (int letterIndex = 0; letterIndex < s.length(); letterIndex++) {
            if (!voyelle(s.charAt(letterIndex))) {
                return false;
            }
        }

        return true;
    }

    static void cesure(String mot) {
        // A compléter:
        // détermine la césure d'un mot donné et effectue les affichages
        // correspondants (voir exemple de déroulement)
        String word = mot;

        for (int letterIndex = 1; letterIndex < mot.length() - 2; letterIndex++) {
            char c = mot.charAt(letterIndex);
            if (letterIndex != mot.length() - 1 && voyelle(c) && !voyelle(mot.charAt(letterIndex + 1))) {
                System.out.println(mot.substring(0, letterIndex + 1) + "-");
                word = word.substring(letterIndex + 1);
            }
        }

        System.out.println(word);
    }
}
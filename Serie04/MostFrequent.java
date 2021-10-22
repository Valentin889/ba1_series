class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        int highestValue = 0;
        int minValue = 0;

        //Définir la valeur la plus élevée dans le tableau
        for (int value : tab1) {
            if (value > highestValue) {
                highestValue = value;
            }
            if (value < minValue) {
                minValue = value;
            }
        }

        //Créer un tableau pour compter les occurences
        int[] occurences = new int[-minValue + highestValue + 1];

        //Ajouter 1 à chaque occurence au bon index
        for (int value : tab1) {
            occurences[value - minValue] += 1;
        }

        int highestOccurencesCount = 0;
        int result = 0;
        for (int index = 0; index < occurences.length; index++) {
            if (occurences[index] > highestOccurencesCount) {
                highestOccurencesCount = occurences[index];
                result = index + minValue;
            }
        }

        //Afficher le résultat
        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(result + " (" + highestOccurencesCount + " x)");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
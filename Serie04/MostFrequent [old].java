class MostFrequentOld {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        int highestValue = 0;
        
        //Définir la valeur la plus élevée dans le tableau
        for (int value : tab1) {
            if (value > highestValue) {
                highestValue = value;
            }
        }

        //Créer un tableau pour compter les occurences
        int[] occurences = new int[highestValue];

        //Ajouter 1 à chaque occurence au bon index
        for (int value : tab1) {
            occurences[value - 1] += 1;
        }

        int highestOccurencesCount = 0;
        int result = 0;
        int[] mostFrequentNumbers = new int[occurences.length];
        ArrayList<Integer> mostFrequentNumbers = new ArrayList<Integer>();

        //Checker l'index de la valeur la plus élevée
        for (int index = occurences.length - 1; index > 0; index--) {
            if (highestOccurencesCount < occurences[index]) {
                mostFrequentNumbers.clear();
                mostFrequentNumbers.add(index + 1);
                highestOccurencesCount = occurences[index];
            }
            else if (highestOccurencesCount == occurences[index]) {
                mostFrequentNumbers.add(index + 1);
            }
        }

        //S'il y a plusieurs chiffres qui ont le même nombre d'occurences, regarder lequel
        //apparaît en premier dans la liste
        if (mostFrequentNumbers.size() > 1) {
            for (int candidate : mostFrequentNumbers) {
                for (int listElement : tab1) {
                    if (candidate == listElement) {
                        result = candidate;
                        break;
                    }
                }

                if (result != 0) {
                    break;
                }
            }
        }
        else {
            result = mostFrequentNumbers.get(0);
        }

        //Afficher le résultat
        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(result + " (" + highestOccurencesCount + " x)");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}

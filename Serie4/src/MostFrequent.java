class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        
        int valMax = 0;
        int nbOccurence = 0;
        
        for (int i = 0; i < taille; i++) {
        	int valTmp = tab1[i];
        	int nbOccurenceTmp = 1;
        	
        	for (int j = i+1; j < taille; j++) {
				if(valTmp == tab1[j]) {
					nbOccurenceTmp++;
				}
			}
        	if(nbOccurenceTmp > nbOccurence) {
        		nbOccurence = nbOccurenceTmp;
        		valMax= valTmp;
        	}        	
		}
        
        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(valMax+" ("+nbOccurence+" x)");


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}

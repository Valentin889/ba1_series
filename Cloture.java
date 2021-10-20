import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
        int[][] carte = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme à partir d'ici.
         *******************************************/
        
        //Vérifier que la carte ne contient que des 1 et des 0
        for (int ligne = 0; ligne < carte.length; ligne++) {
        	for (int colonne = 0; colonne < carte[ligne].length; colonne++) {
        		
        		int valeur = carte[ligne][colonne];
        		
        		//Si la valeur à la case checkée n'est ni 1 ni 0, afficher une erreur et arrêter le programme
        		if (valeur != 1 && valeur != 0) {
        			System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
        			System.out.print(valeur);
        	        System.out.print("' trouvée en position [");
        	        System.out.print(ligne);
        	        System.out.print("][");
        	        System.out.print(colonne);
        	        System.out.println("]");
        	        return;
        		}
        	}
        }
        
        //Déclarer une deuxième carte qu'on va modifier
        int[][] carteModifiee = new int[carte.length][carte[0].length];
        
        //On ne peut pas simplement définir la valeur carteModifiee sur carte à cause des pointeurs
        //Il faut donc copier la liste
        //Pendant cette copie, on va déjà modifier la carte
        //Si un 1 est trouvé, on ne fait rien
        //Si un 0 est trouvé et qu'il est entre le premier et le dernier 1 de la ligne, on remplace par 2
        //Si un 0 est hors des 1, on remplace par un 3
        //Si un 2 touche un 3, on fait savoir que la carte n'a pas le bon format
        for (int ligne = 0; ligne < carte.length; ligne++) {
        	
        	//Il nous faut d'abord définir les bords du terrain à cette ligne, donc les 1 aux extrémités
        	//On en profite pour copier les 1 de carte à carteModifiee
        	int indexDuPremierUn = carte[ligne].length;
        	int indexDuDernierUn = -1;
        	
        	for (int colonne = 0; colonne < carte[ligne].length; colonne++) {
        		if (carte[ligne][colonne] == 1) {
        			
        			//Si ce 1 est plus au début que le premier 1, c'est le premier 1
        			if (colonne < indexDuPremierUn) {
        				indexDuPremierUn = colonne;
        			}
        			//Si ce 1 est plus loin que le dernier 1, c'est le nouveau dernier 1
        			if (colonne > indexDuDernierUn) {
        				indexDuDernierUn = colonne;
        			}
        			
        			//On copie le 1 dans carteModifiee
        			carteModifiee[ligne][colonne] = 1;
        		}
        	}
        	
        	
        	//Une fois les extrémités détérminées, on va chercher et modifier les 0
        	for (int colonne = 0; colonne < carte[ligne].length; colonne++) {
        		if (carte[ligne][colonne] == 0) {
        			
        			int valeur = 0;
        			
        			//Si le 0 est compris entre les 1 des extrémités, c'est un étang
        			if (colonne > indexDuPremierUn && colonne < indexDuDernierUn) {
        				valeur = 2;
        			}
        			//Si le 0 est à l'extérieur, on le remplace par 3
        			else {
        				valeur = 3;
        			}
        			
        			/*
        			 * On va ensuite checker les voisins de la valeur pour vérifier la validité de la carte
        			 * 
        			 * Comme on traite la carte de haut en bas et de gauche à droite, les voisins de droite et du bas
        			 * n'ont pas encore été défini.
        			 * 
        			 * On va donc effectuer deux checks différents :
        			 * 1) Que la valeur et les voisins gauche/haut n'entrent pas en conflit (2 et 3 ou 3 et 2)
        			 * 2) Que la valeur ne soit pas 2 alors qu'elle est au bord (pas d'étang qui touche le bord)
        			 */
        			
        			int voisinDuHaut = ligne == 0 ? 3 : carteModifiee[ligne - 1][colonne];
        			int voisinDeGauche = colonne == 0 ? 3 : carteModifiee[ligne][colonne - 1];
        			int voisinDuBas = ligne == carteModifiee.length - 1 ? 3 : 1;
        			int voisinDeDroite = colonne == carteModifiee[ligne].length - 1 ? 3 : 1;
        			
        			//Si la case devrait être à l'intérieur mais est à l'extérieur ou vice-versa, afficher une erreur
        			if (((voisinDuHaut == 3 || voisinDeGauche == 3 || voisinDuBas == 3 || voisinDeDroite == 3) && valeur == 2) ||
        					((voisinDuHaut == 2 || voisinDeGauche == 2) && valeur == 3)) {
        				System.out.println("Votre carte du terrain n'a pas le bon format :");
        		        System.out.print("bord extérieur entrant trouvé en position [");
        		        System.out.print(ligne);
        		        System.out.print("][");
        		        System.out.print(colonne);
        		        System.out.println("]");
        		        return;
        			}
        			
        			//Si aucune erreur n'est rencontrée, simplement enregistrer la valeur et continuer
        			carteModifiee[ligne][colonne] = valeur;
        		}
        	}
        }
        	
        //Une fois la carte bien modifiée, on peut simplement compter les 3 touchant un 1 pour définir
        //combien il nous faudra de clôture
        int nombreDeClotures = 0;
        for (int ligne = 0; ligne < carteModifiee.length; ligne++) {
        	for (int colonne = 0; colonne < carteModifiee[ligne].length; colonne++) {
        		
        		//Si la case visée est un 1, on regarde ses voisins pour voir combien de clôture il nous faut
        		if (carteModifiee[ligne][colonne] == 1) {
        			int[] voisins = new int[4];
        			voisins[0] = ligne == 0 ? 3 : carteModifiee[ligne - 1][colonne];
        			voisins[1] = colonne == 0 ? 3 : carteModifiee[ligne][colonne - 1];
        			voisins[2] = ligne == carteModifiee.length - 1 ? 3 : carteModifiee[ligne + 1][colonne];
        			voisins[3] = colonne == carteModifiee[ligne].length - 1 ? 3 : carteModifiee[ligne][colonne + 1];
        			
        			//Pour chaque voisin égal à 3, on ajoute une clôture
        			for (int voisin = 0; voisin < voisins.length; voisin++) {
        				if (voisins[voisin] == 3) {
        					nombreDeClotures++;
        				}
        			}
        		}
        	}
        }

        final double METRES_PAR_CLOTURE = 2.5;
        
        System.out.print("Il vous faut ");
        System.out.print(nombreDeClotures * METRES_PAR_CLOTURE);
        System.out.println(" mètres de clôture pour votre terrain.");

        /*******************************************
         * Ne rien modifier après cette ligne.
         *******************************************/
    }
}

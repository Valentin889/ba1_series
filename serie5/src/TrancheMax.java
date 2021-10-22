import java.util.ArrayList;
import java.util.Scanner;

class TrancheMax {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // Entree de la matrice
        System.out.println("Saisie de la matrice :");
        String matrice = clavier.nextLine();
        System.out.format("Matrice saisie :\n%s\n", matrice);
        clavier.close();

        // Validation de la matrice
        if (!checkFormat(matrice)) {
            return;
        }

        // Trouver la liste des lignes avec le plus grand nombre de 1 consecutif
        // Ces numéros de lignes sont stockés dans un tableau dynamique
        ArrayList<Integer> maxConsecutifList = findConsecutiveList(matrice);

        if (maxConsecutifList.isEmpty()) {
            System.out.println("Pas de lignes avec des 1 !");
        } else {
            System.out.println("Ligne(s) avec le plus de 1 consecutifs :");
            for (Integer index : maxConsecutifList) {
                System.out.println(index);
            }
        }
    }

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/

    public static boolean checkFormat(String matrice) {
    	
    	String[] valTest=matrice.split(" {1,}");
    
    	if(matrice.length()==0) {
    		System.out.println("Matrice vide !");
    		return false;
    	}
    	
    	
    	for (String line : valTest) {
    		for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if(c!='0' && c!='1') {    	

					System.out.println("Matrice invalide : seuls '1', '0' et ' ' sont admis !");
					return false;
				}
			}
		}
    	
    	return checkLineLength(matrice);
    	
    }
    public static boolean checkLineLength(String matrice) {
    	
    	String[] lines=matrice.split(" {1,}");
    	int compteur = lines[0].length();
    	if(compteur == 0) {
    		compteur = lines[1].length();
    	}
    	
    	for (String line : lines) {
    		if(line.length()!=0)
    		{
    			
    			if (compteur != line.length()) {
    				System.out.println("Matrice invalide, lignes de longueurs differentes !");
    				return false;
    			}
    			
    		}
    		
		}
    	return true;
    }
    public static ArrayList<Integer> findConsecutiveList(String matrice){
    	
    	ArrayList<Integer> valReturn = new ArrayList<Integer>();
    	
    	String[] lines=matrice.split(" {1,}");
    	int[] compteurLine = new int[lines.length];
    	
    	int maxValue = Integer.MIN_VALUE;
    	
    	for (int i = 0; i < lines.length; i++) {
    		String line = lines[i];
		
    		int compteur = 0;
    		int max = 0;
    		for (int j = 0; j < line.length(); j++) {
    			if(line.charAt(j) == '1') {
    				compteur++;
    				if(compteur>max) {
    					max = compteur;
    				}
    			} else {
    				compteur = 0;
    			}	
    		}
    		compteurLine[i] = max;
    		if(max > maxValue) {
    			maxValue = max;
    		}
    	}
    	
    	if(maxValue != 0) {
	    	for (int i = 0; i < compteurLine.length; i++) {
				if(compteurLine[i] == maxValue) {
					if(lines[0].length() == 0) {
						valReturn.add(i-1);					
					} else {
						valReturn.add(i);					
					}
				}
	    		
			}
    	}
    	
    	
    	return valReturn;
    }


    /*******************************************
     * Ne rien modifier apres cette ligne
     *******************************************/
}

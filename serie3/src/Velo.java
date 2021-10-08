import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        if(fin<0 || fin >24 || debut<0 || debut>24) {
        	System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        	
        } else if(fin<debut) {
        	System.out.println("Bizarre, le début de la location est après la fin ...");
        	
        } else if(fin == debut) {
        	System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");     
        
        } else {
        	double somme = 0;
        	final double PRIX1 = 1;
        	final double PRIX2 = 2;
        	int somme1 =0;
        	int somme2 = 0;
        	if(debut<7) {
        		if(fin<7) {
        			somme1 += (fin-debut);
        		} else {
        			somme1 = 7-debut;
        			if(fin < 17) {
        				somme2 += (fin -7);
        			} else {
        				somme2 += 10;
        				somme1+= (fin-17);
        			}
        		}	
        	} else if ( debut < 17) {
        		if(fin < 17) {
        			somme2 += (fin -debut);
    			} else {
    				somme2 += (17-debut);
    				somme1+= (fin-17);
    			}
        	} else {
        		somme1+= (fin-debut);
        	}
        	somme = PRIX1*somme1 + PRIX2 *somme2;
        	System.out.println("Vous avez loué votre vélo pendant ");
        	if(somme1>0) {
        		System.out.print(somme1 +" heure(s) au tarif horaire de "+ PRIX1);
        		System.out.println(" franc(s)");        		
        	}
        	if(somme2 > 0) {
        		System.out.print(somme2 +" heure(s) au tarif horaire de "+PRIX2);
        		System.out.println(" franc(s)");        		
        	}
        	System.out.print("Le montant total à payer est de " + somme);
        	System.out.println(" franc(s).");
        	
        	
        }


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}

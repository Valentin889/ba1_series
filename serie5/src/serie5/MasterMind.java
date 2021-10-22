package serie5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MasterMind {
	
	static final int m = 6;
	static Scanner scanner = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
		final int n = 4;
		
		int[] laCombinaison = new int[n];
		int[] combinaison = new int[n];
		int[] reponse;
		
		laCombinaison[0] = 1;
		laCombinaison[1] = 2;
		laCombinaison[2] = 1;
		laCombinaison[3] = 4;
		
		combinaison[0] = 1;
		combinaison[1] = 0;
		combinaison[2] = 0;
		combinaison[3] = 1;
		
		tirerCombinaison(laCombinaison);
		
		do {
			
			reponse = new int[2];
			
			demanderCoup(combinaison);
			
			boolean val = compare(laCombinaison, combinaison, reponse);
			for (int i = 0; i < reponse[0]; i++) {
				System.out.print("#");
			}
			System.out.println("");
			
			for (int i = 0; i < reponse[1]; i++) {
				System.out.print("0");
			}
			System.out.println("");
				
		
		}while(reponse[0] != n);
		
		
		System.out.println("Bien joué!!!");
		
	}
	
	static void tirerCombinaison(int[] uneCombinaison) {
		for (int i = 0; i < uneCombinaison.length; i++) {
			uneCombinaison[i] = hasard(m);
		}
	}
	
	static int hasard(int max) {
		return (1 + (int)(Math.random() * max));
	}
	
	static void demanderCoup(int[] uneCombinaison) {
		System.out.println("Entrez les 4 chiffres  de votre proposition:");
		for (int i = 0; i < uneCombinaison.length; i++) {
			uneCombinaison[i] = scanner.nextInt();
		}
	}
	
	static boolean compare(int[] combinaison1, int[] combinaison2, int[] reponse) {
		
		ArrayList<Integer> toCompare = new ArrayList<Integer>();
		
		
		
		for (int i = 0; i < combinaison1.length; i++) {
			if(combinaison1[i] == combinaison2[i]) {
				reponse[0]++;
			} else {
				toCompare.add(combinaison1[i]);				
			}
		}
		
		for (int i = 0; i < combinaison2.length; i++) {
			int valTest = combinaison2[i];
			for (Integer integer : toCompare) {
				if(valTest == integer) {
					reponse[1]++;
					toCompare.remove(integer);
					break;
				}
			}
			
		}
		
		
		
		
		
		return false;
	}
	static void afficheCombinaison(int[] combinaison) {
		
	}
	static void afficheReponse(int[] reponse) {
		
	}
}

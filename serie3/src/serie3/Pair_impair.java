package serie3;
import java.util.Scanner;


public class Pair_impair {
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Entrer un nombre entier : ");
		int valeur = scanner.nextInt();
		
		if(valeur == 0){
			System.out.print("Le nombre est zéro (et il est pair)");	
		} else if(valeur % 2 == 0) {
			System.out.print("Le nombre est pair");	
		} else {
			System.out.print("Le nombre est impair");		
		}
		
		
	}
}

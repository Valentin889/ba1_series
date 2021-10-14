package Serie4;
import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez une seule lettre A..Z ou a..z : ");
		char valChar = scanner.next().charAt(0);
		
		
		int valInt = valChar;
		int valFinal = 0;
		
		if(valInt <=90 && valInt >= 65) {
			//minuscule
			valFinal = valInt + 32;
		} else if (valInt <= 122 && valInt >= 97) {
			//majuscule
			valFinal = valInt - 32 ;
		}
		
		char valFinalChar = (char)valFinal;
		
		System.out.println(valFinalChar);
		
		
	}
}

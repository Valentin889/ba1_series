package serie3;
import java.util.Scanner;

public class Intervalle {

	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entrer un nombre réel : ");
		double valeur = scanner.nextDouble();
		
		if((valeur >= 2 && valeur < 3) || (valeur > 0 && valeur <= 1) || (valeur >= -10 && valeur < -2) ) {
			
			System.out.println(valeur + " appartient à I");
			
		} else {
			System.out.println(valeur + " n'appartient pas à I");
			
		}
	}
}

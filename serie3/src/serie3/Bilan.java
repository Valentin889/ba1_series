package serie3;
import java.util.Scanner;

public class Bilan {
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int somme=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		System.out.print("Entrer le nombre de montant reçu : ");
		int valeur = scanner.nextInt();
		
		
		for (int i = 1; i <= valeur; i++) {
			System.out.print("Entrer le montant : "+i);
			int montant = scanner.nextInt();
			
			somme+=montant;
			if(montant > max) {
				max = montant;
			}
			if(montant < min ) {
				min = montant;
			}
		}
		System.out.println("La somme moyenne est : "+somme/valeur);
		System.out.println("Le montant max est : "+max);
		System.out.println("Le montant min est : "+min);
		
		
	}
}

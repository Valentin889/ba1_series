package serie2;
import java.util.Scanner;

public class Fondue {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int BASE = 4;
		double fromage = 800.0;
		double eau = 2.0;
		double ail = 2.0;
		double pain = 400.0;
		
		System.out.print("Entrez le nombre de personne(s) conviée(s) à la fondue : ");
		int nbConvives = scanner.nextInt();
		
		fromage = fromage * nbConvives / BASE;
		eau = eau * nbConvives / BASE;
		ail = ail * nbConvives / BASE;
		pain = pain * nbConvives / BASE;
		
		
		System.out.println("Pour faire une fondue fribourgeoise pour "+nbConvives+" personnes, il vous faut : \n"
				+ " - "+fromage + " gr de vacherin fribourgeois \n"
						+ " - "+eau + " dl d'eau \n"
						+ " - "+ail + " gousse(s) d'ail \n"
						+ " - "+pain + " gr de pain \n"
						+ " - du poivre à volonté"
				);
		
	}
}

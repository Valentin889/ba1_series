package serie2;
import java.util.Scanner;
public class RoseBlanches {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sommeTotal;
		int livresFournitures;
		int nbCafe;
		int nbAbonnement;
		int nbBilletsMetro;
		double reste;
		
		final int PRIX_CAFE = 2;
		final int PRIX_ABONNEMENT = 4;
		final int PRIX_METRO = 3;
		
		System.out.print("Combien avez-vous reçu d'argent (Frs)? ");
		sommeTotal = scanner.nextInt();
		
		
		livresFournitures = sommeTotal * 3 / 4;
		reste = sommeTotal - livresFournitures;
		
		nbAbonnement = (int)(reste/3/PRIX_ABONNEMENT);
		nbBilletsMetro = (int)(reste/3/PRIX_METRO);
		nbCafe = (int)(reste/3/PRIX_CAFE);
		
		reste = reste - nbAbonnement*PRIX_ABONNEMENT - nbBilletsMetro*PRIX_METRO - nbCafe*PRIX_CAFE;
		
		
		
		System.out.println(sommeTotal);
		System.out.println(livresFournitures);
		System.out.println(nbAbonnement);
		System.out.println(nbBilletsMetro);
		System.out.println(nbCafe);
		System.out.println(reste);
		
	}
}

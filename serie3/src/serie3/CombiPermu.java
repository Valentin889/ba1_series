package serie3;


public class CombiPermu {

	public static void main(String[] args) {
		/* Formule math'ematique calculant le nombre de  permutations de k
		 * 'elements parmis n: (n!)/(n-k)!
		 * Formule math'ematique calculant le nombre de combinaisons de k
		 * 'elements parmis n: (n!)/(k!*(n-k)!) 
		 */
		//valeurs à définir
		int n = 10;
		int k = 6;

		//Réaliser le calcul du nombre de permutations et de combinaisons
		//avec les deux valeurs n et k et les formules données
		
		 int factn = 1;
		 for( int i = 1; i <= n; i++ ) {
			 factn *= i;
			 
		 }

		 int factk = 1;
		 for( int i = 1; i <= k; i++ ) {
			 factk *= i;
			 
		 }
		 
		 
		 int permutation = factn / (n-k);
		 int combinaisons = factn/(factk*(n-k));
		 int combinaisonsPlusSimple = permutation/factk;
		
		System.out.println("les permutation sont : " +permutation);
		System.out.println("les combinaisons sont : " +combinaisons);
		System.out.println("les combinaisons simplifiés sont : " +combinaisonsPlusSimple);
	}
}

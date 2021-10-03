package Serie03;

public class CombiPermu {

	public static void main(String[] args) {
		/* Formule mathématique calculant le nombre de  permutations de k
		 * élements parmis n: (n!)/(n-k)!
		 * Formule mathématique calculant le nombre de combinaisons de k
		 * élements parmis n: (n!)/(k!*(n-k)!)
		 */
		//Valeurs à définir
		int n = 10;
		int k = 6;
		int soustraction = n - k;

		//Calculer n!
		int nFactoriel = 1;
		for (int i = 2; i <= n; i++) {
			nFactoriel *= i;
		}

		//Calculer k!
		int kFactoriel = 1;
		for (int i = 2; i <= k; i++) {
			kFactoriel *= i;
		}

		//Calculer (n-k)!
		int soustractionFactoriel = 1;
		for (int i = 2; i <= soustraction; i++) {
			soustractionFactoriel *= i;
		}

		int permutations = nFactoriel / soustractionFactoriel;
		int combinaisons = nFactoriel / (kFactoriel * soustractionFactoriel);
		System.out.println("Nombre de permutations possibles avec n=" + n + " et k=" + k + " : " + permutations);
		System.out.println("Nombre de combinaisons possibles avec n=" + n + " et k=" + k + " : " + combinaisons);

		//Réaliser le calcul du nombre de permutations et de combinaisons
		//avec les deux valeurs n et k et les formules données

		//POUR ALLER PLUS LOIN
		//
		//Il est clair que ce fichier de code n'est pas optimal, mais il l'est selon ce qu'on sait pour l'instant
		//À la semaine 6 du cours sur coursera, tu apprendras ce qu'est une fonction et comment les utiliser
		//À ce moment-là, tu pourras utiliser une fonction pour éviter de réecrire du code et des boucles
		//Tu pourrais utiliser une boucle pour faire trois fois la boucle for, mais j'ai préféré ne pas le faire, ce serait pas beaucoup plus optimal
	}
}

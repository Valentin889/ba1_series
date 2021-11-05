package serie7;

public class Banque2 {
	public static void main (String[] args) {
		
		// Données pour tous les comptes privés (taux d'intérêt):
		double taux1 = 0.01;
		// Données pour tous les comptes d'épargne (taux d'intérêt):
		double taux2 = 0.02;
		
		Compte compte1 = new Compte(1000.0);
		Compte compte2 = new Compte(2000.0);
		Compte compte3 = new Compte(3000.0);
		Compte compte4 = new Compte(4000.0);
		
		Client c1 = new Client("Pedro", "Geneve",compte1, compte2);
		Client c2 = new Client("Alexandra", "Lausanne", compte3, compte4);
		
		c1.afficherClient();
		c2.afficherClient();
		
		
		compte1.bouclerCompte(taux1);
		compte2.bouclerCompte(taux2);
		
		compte3.bouclerCompte(taux1);
		compte4.bouclerCompte(taux2);
		
		c1.afficherClient();
		c2.afficherClient();
		
		
	}
	
	
	
}

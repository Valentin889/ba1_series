package serie7;

public class Compte {
	
	private double solde;
	
	public Compte(double s) {
		solde = s;
	}
	
	
	public double getSolde() {
		return solde;
	}
	
	public void bouclerCompte(double taux) {
		// Cette méthode ajoute les intérêts au solde
		double interets = taux * solde;
		double nouveauSolde = solde + interets;
		solde = nouveauSolde;
	}
	
}

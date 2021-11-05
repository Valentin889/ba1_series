package serie7;

public class Client {
	
	private String nom;
	private String ville;
	private Compte compteCourant;
	private Compte compteEpargne;
	
	
	public Client(String n, String v, Compte cCourant, Compte cEpargne){
		nom = n;
		ville = v;
		compteCourant = cCourant;
		compteEpargne = cEpargne;
		
	}
	
	public void afficherClient() {
		// Cette méthode affiche les données du client
		System.out.println("Client " + nom + " de " + ville);
		System.out.println("   Compte prive:     " + compteCourant.getSolde() + " francs");
		System.out.println("   Compte d'epargne: " + compteEpargne.getSolde() + " francs");
	}
	
	
	
}

package serie8;

public class EPFLiens {

	private String prenom;
	private String nom;
	private int anneeInscription;
	private String section;
	
	public EPFLiens(String p, String n, int annee, String s) {
		prenom = p;
		nom = n;
		anneeInscription = annee;
		section = s;
	}
	
	
	@Override
	public String toString() {
		
		return prenom +" "+nom;
		
	}
	
	
	//getteur
	public String getSection() {
		return section;
	}
	
	public int getAnneeInscription() {
		return anneeInscription;
	}
	
}

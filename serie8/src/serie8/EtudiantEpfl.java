package serie8;

public class EtudiantEpfl extends EPFLiens{
	
	private double result;
	
	
	public EtudiantEpfl(String p, String n, int annee, String s, double r) {
		super(p, n, annee, s);
		result = r;
	}
	
	@Override
	public String toString() {
		return 
				"L'étudiant regulier " +
				super.toString() +
				" inscrit en " +
				super.getSection() +
				" en " + 
				super.getAnneeInscription() +
				". Son résultat au propé 1 est de " +
				result
				; 
	}
	
}

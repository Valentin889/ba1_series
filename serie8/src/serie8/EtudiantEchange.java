package serie8;

public class EtudiantEchange  extends EPFLiens{

	private String origine;
	
	public EtudiantEchange(String p, String n, int annee, String s, String o) {
		super(p, n, annee, s);
		origine = o;
	}
	
	
	@Override
	public String toString() {
		return 
				"L'étudiant d'échange " +
				super.toString() +
				" inscrit en " +
				super.getSection() +
				" en " + 
				super.getAnneeInscription() +
				". Son université d'origine s'appelle " +
				origine
				; 
	}
	
	
}

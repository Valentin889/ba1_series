package serie8;

public class Enseignant  extends EPFLiens {

	private String labo;
	private int salaire;
	
	public Enseignant(String p, String n, int annee, String s, String l, int sal) {
		super(p, n, annee, s);
		labo = l;
		salaire = sal;
	}
	
	
	@Override
	public String toString() {
		return 
				"L'enseignant " +
				super.toString() +
				" engagé au " +
				labo +
				" en " + 
				super.getAnneeInscription() +
				". Il a un salaire de " +
				salaire + 
				" francs par mois et il enseigne à la " +
				super.getSection()
				; 
	}
	
}

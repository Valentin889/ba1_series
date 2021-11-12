package serie8;

public class Secretaire extends EPFLiens{
	
	private int salaire;
	
	
	public Secretaire(String p, String n, int annee, String s, int sal) {
		super(p, n, annee, s);
		salaire = sal;
	}
	
	
	@Override
	public String toString() {
		return 
				"La secrétaire " +
				super.toString() +
				" engagé au " +
				super.getSection() +
				" en " + 
				super.getAnneeInscription() +
				". Elle a un salaire de " +
				salaire + 
				" francs par mois."
				; 
	}
	
	
	
}

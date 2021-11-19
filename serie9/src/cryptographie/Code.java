package cryptographie;

public abstract class Code {

	private String nom;
	
	
	public Code(String n) {
		nom = n;
	}
	
	
	public abstract String code(String s);
	
	public abstract String decode(String s);
	
	
	public void affiche() {
		System.out.println(nom);
	}
	
}

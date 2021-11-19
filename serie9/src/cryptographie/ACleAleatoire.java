package cryptographie;

public class ACleAleatoire extends ACle{

	
	
	public ACleAleatoire(int longueur) {
		super("a cle aleatoire");
		generateKey(longueur);
	}
	
	
	private void generateKey(int longueur) {
		
		
		String cle = "";
		
		for (int i = 0; i < longueur; i++) {
			cle += (char)(Utils.randomInt(longueur)+64);
		}
		setCle(cle);
		
	}
	
}

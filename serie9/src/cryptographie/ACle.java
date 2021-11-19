package cryptographie;

import java.util.Iterator;

public class ACle extends Code{

	
	private String cle;
	private int[] message1;
	private int[] message2;
	private int[] message3;
	
	public ACle(String nom, String c) {
		super(nom);
		cle = c;
	}
	
	public ACle(String nom) {
		super(nom);
	}
	
	
	@Override
	public String code(String s) {
		message1 = new int[s.length()];
		message2 = new int[s.length()];	
		message3 = new int[s.length()];
		String valReturn = "";

		
		for (int i = 0; i < message1.length; i++) {
			message1[i] = (int)(s.charAt(i))-64;
		}
		
		for (int i = 0; i < message2.length; i++) {
			message2[i] = (int)(cle.charAt(i%cle.length()))-64;
		}
		
		for (int i = 0; i < message3.length; i++) {

			message3[i] = message1[i] + message2[i];
			if(message3[i]>26) {
				message3[i] -= 26;
			}
			valReturn += (char)(message3[i]+64);
		}
		
		
		
		
		
		return valReturn;
		
	}	
	
	
	@Override
	public String decode(String s) {
		
		message1 = new int[s.length()];
		message2 = new int[s.length()];	
		message3 = new int[s.length()];
		String valReturn = "";

		
		for (int i = 0; i < message1.length; i++) {
			message1[i] = (int)(s.charAt(i))-64;
		}
		
		for (int i = 0; i < message2.length; i++) {
			message2[i] = (int)(cle.charAt(i%cle.length()))-64;
		}
		
		for (int i = 0; i < message3.length; i++) {

			message3[i] = message1[i] - message2[i];
			if(message3[i]<0) {
				message3[i] += 26;
			}
			valReturn += (char)(message3[i]+64);
		}
		
		
		
		
		
		return valReturn;
	}

	public void setCle(String c) {
		cle = c;
	}
	
	public void affiche() {
		System.out.println(cle);
	}

}

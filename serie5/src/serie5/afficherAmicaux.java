package serie5;

import java.util.ArrayList;

public class afficherAmicaux {
	public static void main(String[] args) {
	      int[] nombres = {1210, 45, 27, 220, 54, 284, 9890, 120, 1184};
	      System.out.println("Les paires de nombres amicaux sont : ");
	      afficherAmicaux(nombres);
	  }
	
	static void afficherAmicaux(int[] nombre) {
		ArrayList<int[]> pair = new ArrayList<int[]>();
		
		
		for (int i = 0; i < nombre.length; i++) {
			for (int j = i+1; j < nombre.length; j++) {
				int val1 = nombre[i];
				int val2 = nombre[j];
				int somme1 = 0;
				int somme2 = 0;
				
				for (int k = 1; k <= val1; k++) {
					if(val1 % k == 0) {
						somme1+=k;
					}
				}
				
				for (int k = 1; k <= val2; k++) {
					if(val2 % k == 0) {
						somme2+=k;
					}
				}
				
				
				if(somme1 == somme2 && val1+val2 == somme1) {
					pair.add(new int[] {val1, val2});
				}
			}
		}
		
		for (int[] js : pair) {
			System.out.println(js[0] +" "+js[1]);
		}
	}
}

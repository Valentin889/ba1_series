package Serie4;
import java.util.Scanner;

public class Pascal {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrer une valeur : ");
		int val = scanner.nextInt();
		
		int[][] tab = new int[val][];
		
		for (int i = 0; i < tab.length; i++) {
			
			tab[i] = new int[i+1];
			if(i== 0) {
				tab[i][0] = 1;
			} else {
				
				for (int j = 0; j < tab[i].length; j++) {
					if(j==0 || j == i) {
						tab[i][j] = 1;
						
					} else {
						tab[i][j] = tab[i-1][j-1] + tab[i-1][j];
					}
				}			
			}
		}
		
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j]+" ");
			}
			System.out.println("");
			
		}
		
	
	
	}
}

package serie3;
import java.util.Scanner;

public class PGDC {
	public static void  main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Entrer un premier nombre positif : ");
		int valInitial1 = scanner.nextInt();
		
		System.out.print("Entrer un deuxième nombre positif : ");
		int valInitial2 = scanner.nextInt();
		
		int val1 = valInitial1;
		int val2 = valInitial2;
		
		
		while(val1 != val2) {
			
			if(val2<val1) {
				int temp = val2;
				val2 = val1;
				val1 = temp;
			}
			val2 = val2 - val1;
			
		}
		
		System.out.println("le pgdc de "+valInitial1+" et de "+ valInitial2+" est de " + val1);
	}
}

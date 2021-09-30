package serie2;
import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		int y;
		int tmp;
		
		
		System.out.print("Entrer une valeur pour x : ");
		x = scanner.nextInt();
		
		System.out.print("Entrer une valeur pour y : ");
		y = scanner.nextInt();
		
		System.out.println("avant permutation : \n"
				+ "x = " +x +"\n"
				+ "y = " +y);
		tmp = y;
		y=x;
		x=tmp;
		
		System.out.println("après permutation : \n"
				+ "x = " +x +"\n"
				+ "y = " +y );
		
		
	}
}

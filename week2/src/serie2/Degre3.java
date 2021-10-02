package serie2;
import java.util.Scanner;

public class Degre3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrer a (int) : ");
		int a = scanner.nextInt();
		
		System.out.print("Entrer b (int) : ");
		int b = scanner.nextInt();
		
		System.out.print("Entrer c (int) : ");
		int c = scanner.nextInt();
		
		System.out.print("Entrer x (double) : ");
		double x = scanner.nextDouble();
		
		double poly = ((a+b)/2)*Math.pow(x, 3) + Math.pow((a+b),2)*Math.pow(x, 2) + a + b + c;
		//poly = ((a+b)/2)*x*x*x + ((a+b)*(a+b)*x*x) + a + b + c;
		
		System.out.println("la valueur du polynôme est : "+poly);
		
	}
}

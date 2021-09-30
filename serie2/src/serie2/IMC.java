package serie2;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	double poids = 74.5;
    	double taille = 1.75;
    	
    	System.out.print("Entrer un poids en kg");
    	poids = scanner.nextDouble();
  
    	System.out.print("Entrer une taille en m");
    	taille = scanner.nextDouble();
    	
    	double imc = poids / (taille * taille);
    	
    	System.out.println("Pour "+poids+" kg et "+taille+" m l'IMC est de "+imc);
    	
    }
}
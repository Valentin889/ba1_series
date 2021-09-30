package serie2;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int ANNEE = 2021;
		int age;
		int anneeNaissance;
		System.out.print("Donner votre age ");
		age = scanner.nextInt();
		
		anneeNaissance = ANNEE-age;
		
		System.out.println("votre année de naissance est : "+anneeNaissance);
	}
}

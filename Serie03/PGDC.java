package Serie03;

import java.util.Scanner;

public class PGDC {

	public static void main(String[] args) {
		//Demander à l'utilisateur d'entrer deux nombres
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ce programme va calculer le PGDC des deux entiers que tu vas lui donner");
		System.out.print("Choisis a (nombre entier) : ");
		int a = scanner.nextInt();
		int aSave = a;
		System.out.print("Choisis b (nombre entier) : ");
		int b = scanner.nextInt();
		int bSave = b;
		scanner.close();
		
		//Tant que les deux nombres ne sont pas égaux,
		//Soustraire le plus petit du plus grand
		while (a != b) {
			if (a > b) {
				a -= b;
			}
			else if (a < b) {
				b -= a;
			}
		}
		
		System.out.println("Le PGDC de " + aSave + " et de " + bSave + " est " + a);
	}

}

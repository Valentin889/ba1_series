package Serie02;

//import signifie qu'on importe du code déjà fait dans Java
//java.util est le package dans lequel est contenu le code
//Scanner est la classe qu'on importe
import java.util.Scanner;

public class IMC {
    
    public static void main(String[] args) {
        //Pour demander des inputs à l'utilisateur, on utilise un scanner
        //Le scanner s'initialise comme ceci :
        Scanner scanner = new Scanner(System.in);
        //On peut maintenant utiliser notre variable scanner
        //Il ne faudra pas oublier d'appeler scanner.close() lorsqu'on ne l'utilisera plus

        //Demander à l'utilisateur son poids en kg
        System.out.print("Please enter your body weight in kg with , as the decimal separator : ");
        double weight = scanner.nextDouble();

        //Demander à l'utilisateur sa taille en m
        System.out.print("Please enter your size in m with , as the decimal separator : ");
        double size = scanner.nextDouble();

        //Plus besoin du scanner, on le ferme
        scanner.close();

        //Calcul de l'IMC
        double imc = weight / (size * size);

        //Afficher l'IMC obtenu
        System.out.println("For " + weight + "kg and " + size + "m, your imc is " + imc);
    }

}

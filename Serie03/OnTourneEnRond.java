package Serie03;

public class OnTourneEnRond {
    
    public static void main(String[] args) {
        //Pourquoi les deux portions de code suivantes ne compilent pas en Java?

        //Numéro 1
        int i = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
        //En notant "int i" dans la boucle for, on déclare une nouvelle variable
        //Or cette variable a déjà été déclarée. Il faut utiliser un autre nom de variable ou enlever le "int"

        //Numéro 2
        for (int j = 0; j < 5; j++);
            System.out.println(j);
        //Le ";" à la fin de la ligne du for signifie la fin de la boucle. La ligne suivante n'y est pas
        //Comme la variable j n'existe que dans la boucle, elle n'existe plus à la ligne suivante
    }

}

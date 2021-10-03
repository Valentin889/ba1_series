package Serie02;

public class Transtypage {
    
    public static void main(String[] args) {
        
        int n1 = 2; //Pas de souci, un entier assigné à un entier (int)
        double r1 = 2.7; //Pas de souci, un décimal assigné à un décimal (double)

        int n2 = 2.7; //Problème : un décimal assigné à un entier (int), conversion implicite impossible
        double r2 = 5; //Pas de souci, un entier assigné à un décimal (double), conversion implicite en 5.0

        int n3 = (int) 5.6; //Pas de souci, conversion explicite "(int)" avant le décimal
        double r3 = 5.6; //Décimal pour décimal

        int n4 = 9; //Entier pour entier
        double r4 = (double) n4; //Conversion explicite "(double)" pour passer d'entier à décimal
        double r5 = (int) r4; //Conversion explicite "(int)" puis conversion implicite en double

        int n5 = 19 / 4; //Division entière : le résultat sera arrondi
        int n6 = n5 / r5; //Division contenu un décimal : division décimale, problème
        double r6 = 5.0; //Décimal pour décimal
        int n7 = (int) (n5 / r5); //Conversion explicite de la division décimale "(int)"
        double r7 = 19.0 / r6; //Division décimale pour décimal

        double r8 = 15.0 / n3; //Division décimale, car elle contient un décimal
        double r9 = 19 / 4; //Division entière, puis conversion implicite en double (=4.0)
        double r10 = (double) (19 / 4); //Division entière, puis conversion explicite en double (=4.0)
        double r11 = (double) 19 / (double) 4; //Conversions explicites en décimaux, puis division décimale

    }

}

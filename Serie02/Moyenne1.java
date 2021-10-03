package Serie02;

public class Moyenne1 {
    
    public static void main(String[] args) {
        
        double noteProgrammation = 6.0;
        double noteAlgebre = 5.0;
        System.out.println("Ma moyenne est " + (noteProgrammation++ + noteAlgebre) / 2.0);

        //Affichera "Ma moyenne est 5.5", parce que le fait de mettre les ++ APRÈS noteProgrammation
        //Fait que l'opération est réalisée après le calcul
    }

}

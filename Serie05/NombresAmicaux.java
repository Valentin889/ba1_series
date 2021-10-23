public class NombresAmicaux {
    public static void main(String[] args) {
        int[] nombres = {1210, 45, 27, 220, 54, 284, 9890, 120, 1184};
        System.out.println("Les paires de nombres amicaux sont : ");
        afficherAmicaux(nombres);
    }

    public static void afficherAmicaux(int[] nombres) {
        for (int index = 0; index < nombres.length; index++) {
            for (int index2 = index + 1; index2 < nombres.length; index2++) {
                int nombre1 = nombres[index];
                int nombre2 = nombres[index2];
                if (amicaux(nombre1, nombre2)) {
                    System.out.println(nombre1 + " " + nombre2);
                }
            }
        }
    }

    public static boolean amicaux(int nombre1, int nombre2) {
        int sum = somme(nombre1, nombre2);
        return sum == additionDesDiviseurs(nombre1) && sum == additionDesDiviseurs(nombre2);
    }

    public static int additionDesDiviseurs(int nombre) {
        int sommeDesDiviseurs = 0;

        for (int diviseurPotentiel = 1; diviseurPotentiel < Math.sqrt(nombre); diviseurPotentiel++) {
            if (nombre % diviseurPotentiel == 0) {
                sommeDesDiviseurs += diviseurPotentiel;
                sommeDesDiviseurs += nombre / diviseurPotentiel;
            }
        }

        return sommeDesDiviseurs;
    }

    public static int somme(int nombre1, int nombre2) {
        return nombre1 + nombre2;
    }
}

package Serie03;

public class BouclesEquivalentes {
    
    public static void main(String[] args) {
        System.out.println("Boucle for :");
        for (int a = 3; a <= 10; a++) {
            System.out.println("a:" + a);
        }

        int b = 3;
        while (b <= 10) {
            System.out.println("b:" + b);
        }

        int c = 3;
        do {
            System.out.println("c:" + c);
        }
        while (c <= 10);
    }

}

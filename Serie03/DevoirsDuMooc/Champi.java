package Serie03.DevoirsDuMooc;

import java.util.Scanner;

public class Champi {
    
    public static void main(String[] args) {
        //Informations sur les champignons :
        //Nom du champignon     |   Bordure     |   Lieu    |   Chapeaux    |   Anneau
        //-----------------------------------------------------------------------------
        //Agaric jaunissant     |   Lamelles    |   Prés    |   Convexe     |   Oui
        //Amanite tue-mouches   |   Lamelles    |   Forêt   |   Convexe     |   Oui
        //Cèpe de Bordeaux      |   Tubes       |   Forêt   |   Concave     |   Non
        //Coprin chevelu        |   Lamelles    |   Prés    |   Concave     |   Oui
        //Girolle               |   Lamelles    |   Forêt   |   Concave     |   Non
        //Pied bleu             |   Lamelles    |   Forêt   |   Convexe     |   Non

        System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
        System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");

        //Au vu du tableau ci-dessus, le mieux est de commencer par l'anneau ou le chapeau,
        //Continuer avec celui qu'on n'a pas utiliser et finir par le lieux
        //La bordure n'est pas un élément rentable pour le maximum de 3 questions
        Scanner clavier = new Scanner(System.in);
        System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
        boolean anneau = clavier.nextBoolean();
        System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
        boolean chapeauConvexe = clavier.nextBoolean();

        if (anneau && !chapeauConvexe) {
            System.out.print("==> Le champignon auquel vous pensez est ");
            System.out.print("le coprin chevelu");
        }
        else if (anneau) {
            System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
            boolean foret = clavier.nextBoolean();
            System.out.print("==> Le champignon auquel vous pensez est ");
            if (foret) {
                System.out.print("l'amanite tue-mouches");
            }
            else {
                System.out.print("l'agaric jaunissant");
            }
        }
        else if (!anneau && chapeauConvexe) {
            System.out.print("==> Le champignon auquel vous pensez est ");
            System.out.print("le pied bleu");
        }
        else if (!anneau) {
            System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
            boolean lamelles = clavier.nextBoolean();
            System.out.print("==> Le champignon auquel vous pensez est ");
            if (lamelles) {
                System.out.print("la Girolle");
            }
            else {
                System.out.print("le cèpe de Bordeaux");
            }
        }
        clavier.close();
    }

}

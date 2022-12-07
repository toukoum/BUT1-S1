import java.util.ArrayList;

public class PolarsEtTris {
    public static void main(String[] args) {
        ArrayList<Polar> mesPolars = CreationBib.lesPolars();
        int i = 0;



        /*while (i < mesPolars.size()) {
            System.out.println(mesPolars.get(i).toString());
            i++;
        }*/

//        if (Utilitaire.verifTri(mesPolars)) {
//            System.out.println("\nVecteur mesPolars trié");
//        }
//        else{
//            System.out.printf("\n le Vecteur mesPolars n'est pas trié");
//
//        }


//        Intermède : vérification du code de compareTo et de toString
        /*Polar p1 = new Polar(2000, "AUTEUR1", "Une oeuvre");
        Polar p2 = new Polar(2000, "AUTEUR2", "Mon oeuvre");
        Polar p3 = new Polar(1998, "AUTEUR1", "Oeuvre sans nom");
        System.out.print("Roman p1 : "); System.out.println(p1);
        System.out.print("Roman p2 : "); System.out.println(p2);
        System.out.print("Roman p3 : "); System.out.println(p3);
        System.out.println("Comparaison de p1 à p2 : " + p1.compareTo(p2));
        System.out.println("Comparaison de p1 à p1 : " + p1.compareTo(p1));
        System.out.println("Comparaison de p1 à p3 : " + p1.compareTo(p3));*/



        // TRI SELECTION
        /*Utilitaire.triSelect(mesPolars);
        System.out.println("Le vecteur mesPolars à été trié selon l'ordre (auteur, annee)");

        while (i < mesPolars.size()) {
            System.out.println(mesPolars.get(i).toString());
            i++;
        }
        System.out.println(Utilitaire.verifTri(mesPolars));*/



        // TRI BULLE OPTIMISE
        /*Utilitaire.triBulle(mesPolars);
        System.out.println("Le vecteur mesPolars à été trié selon l'ordre (auteur, annee)\n");

        while (i < mesPolars.size()) {
            System.out.println(mesPolars.get(i).toString());
            i++;
        }
        System.out.println(Utilitaire.verifTri(mesPolars));*/



        // TRI INSERTION
        Utilitaire.triInsertion(mesPolars);
        System.out.println("Le vecteur mesPolars à été trié selon l'ordre (auteur, annee)\n");

        while (i < mesPolars.size()) {
            System.out.println(mesPolars.get(i).toString());
            i++;
        }
        System.out.println(Utilitaire.verifTri(mesPolars));

    }
}

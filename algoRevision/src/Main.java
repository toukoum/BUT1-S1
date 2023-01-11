import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


//        // recherche ittérative dans liste
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(2, 4, 5, 32, 7, 3, 5, 34, 2, 9));

//        ---------------------------------------
//        Tri
//        ---------------------------------------
//
//        //tri bulle
//        System.out.println(tri.tribulle(liste));
//
//        //tri insertion
//        System.out.println(tri.triInsertion(liste));
//
        //tri selection
        System.out.println(tri.triselection(liste));
//
//        //verif tri
//        System.out.println(tri.veriftri(liste));
//
//        ---------------------------------------
//        Recherche
//        ---------------------------------------

//        System.out.println(recherche.RechercheItt(liste, 7));

//        //recherche dichotomique dans liste
//        System.out.println(recherche.indiceValDicho(liste, 3));
//        System.out.println(recherche.indiceValDicho(liste, 938));
//
//        ---------------------------------------
//        Reccursif
//        ---------------------------------------
//
//        // factorielle reccursif
//        System.out.println(reccursif.factoriellerec(3));
//
//        // est Pair
//        System.out.println(reccursif.estPair(10));
//        System.out.println(reccursif.estPair(11));
//
//        // Dicho réccursif
//        System.out.println(reccursif.indicevaldichorec(liste, 3));
//        System.out.println(reccursif.indicevaldichorec(liste, 333));
//
//        // recherche max réccursif
//        System.out.println(liste);
//        System.out.println(reccursif.maxrec(liste));

//        ---------------------------------------
//        Compare To
//        ---------------------------------------

//        Polar p1 = new Polar(2000, "AUTEUR1", "Une oeuvre");
//        Polar p2 = new Polar(2000, "AUTEUR2", "Mon oeuvre");
//        Polar p3 = new Polar(1998, "AUTEUR1", "Oeuvre sans nom");
//        System.out.print("Roman p1 : "); System.out.println(p1);
//        System.out.print("Roman p2 : "); System.out.println(p2);
//        System.out.print("Roman p3 : "); System.out.println(p3);
//        System.out.println("Comparaison de p1 à p2 : " + p1.compareTo(p2));
//        System.out.println("Comparaison de p1 à p1 : " + p1.compareTo(p1));
//        System.out.println("Comparaison de p1 à p3 : " + p1.compareTo(p3));

//        ---------------------------------------
//        Exception
//        ---------------------------------------

        Scanner lecteur = new Scanner(System.in);
        Exception.verifint(lecteur);
        Exception.verifloat(lecteur);





    }




}
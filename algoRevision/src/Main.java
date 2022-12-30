import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // recherche ittérative dans liste
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(2, 4, 5, 32, 7, 3, 5, 34, 2, 9));
        System.out.println(recherche.RechercheItt(liste, 7));

        // trie de liste
        //tri bulle
//        System.out.println(tribulle(liste));
        //tri insertion
        /*System.out.println(triInsertion(liste));*/
        //tri selection
        System.out.println(tri.triSelection(liste));

        //verif tri
        System.out.println(tri.veriftri(liste));


        //recherche dichotomique dans liste
        System.out.println(recherche.indiceValDicho(liste, 3));
        System.out.println(recherche.indiceValDicho(liste, 938));

    }
}
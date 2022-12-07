import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> vInt = new ArrayList<>();
        ArrayList<Float> vFloat = new ArrayList<>();
        ArrayList<String> vString = new ArrayList<>(Arrays.asList("banane", "fraise", "melon", "orange", "pomme"));
        ArrayList<Integer> vInt2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 11, 12, 13, 14, 15, 20, 28, 37, 45, 63, 78, 85));
        ArrayList<Polar> vPolar = new ArrayList<>();


        /*int i = 0;

        System.out.println("Hello word !");

        while (i < 10) {
            vInt.add(i);
            vFloat.add(10 - (float) i);
            i++;
        }// on initialise un vecteur composé des chiffres de 0 à 10 avec des int pour vInt et des float pour vFloat

        System.out.println(vInt);
        System.out.println("existeDansVint (9) : " + Utilitaire.existeDansVint(vInt, 9)); // algo pour vérifier qu'un nombre est présent

        System.out.println(vFloat);
        System.out.println("valMin : " + Utilitaire.valMin(vFloat)); // algo pour trouvez le plus petit nombre de vFloat

        System.out.println(vString);
        System.out.println(Utilitaire.indiceDansvStringTrie(vString, "melon"));


        //Création d'objet Polars et on les ajoute dans vPolar;

        Polar Polar1 = new Polar(2022, "Paolini", "Eragon");
        Polar Polar2 = new Polar(2002, "J-K Rowling", "Harry Potter");
        Polar Polar3 = new Polar(1998, "JUL", "Tchiquita");
        Polar Polar4 = new Polar(1998, "JUV", "Tchiquita");

        Polar3.setName("Tchikita");


        vPolar.add(Polar1);
        vPolar.add(Polar2);
        vPolar.add(Polar3);
        vPolar.add(Polar4);


        int j = 0;


        while (j < vPolar.size()) {
            System.out.println(vPolar.get(j).toString());
            j++;
        }


        System.out.println(Utilitaire.rechPremIndSeq(vPolar, 1998, "JUV"));


        // Training recherche dichotomique


        System.out.println("\n \n" + vInt2.size());
        System.out.println(vInt2);

        System.out.println("Recherche de 90 : " + Utilitaire.indiceValDichoIterative(vInt2, 90));
        System.out.println("Recherche de 10 : " + Utilitaire.indiceValDichoIterative(vInt2, 10));
        System.out.println("Recherche de 8 : " + Utilitaire.indiceValDichoIterative(vInt2, 8));
        System.out.println("Recherche de 16 : " + Utilitaire.indiceValDichoIterative(vInt2, 16));
        Test instance_test = new Test(3);
        instance_test.parle(instance_test.getValeur());
*/

        Random aleatoire = new Random();
        int size = aleatoire.nextInt(20);
        ArrayList<Integer> liste_a_trie = new ArrayList<>();
        int i = 0;

        while (i < size) {
            int a_ajoute = aleatoire.nextInt(10);
            liste_a_trie.add(a_ajoute);
            i++;

        }

        ArrayList<Integer> liste_easy = new ArrayList<>(Arrays.asList(5, 3, 1, 4, 6));


        System.out.println(liste_a_trie);

//        System.out.println(Utilitaire.TriInsertion(liste_a_trie));

        System.out.println("\n\n");

//        System.out.println(Utilitaire.TriSelection(liste_a_trie));


        System.out.println(Utilitaire.TriBulle(liste_a_trie));

    }
}

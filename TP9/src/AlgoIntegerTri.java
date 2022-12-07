import java.util.ArrayList;
import java.util.Arrays;

public class AlgoIntegerTri {


    public static int triBulleOutille(ArrayList<Integer> vInt) {
        // { vInt quelconque }
        // => { * vInt a été trié par la méthode du tri à bulles amélioré
        // * résultat = nombre de comparaisons entre deux éléments de vInt }

        boolean swap = true;
        int i = 0;
        int nb_comparaison = 0;

        while (swap) {
            swap = false;
            int j = vInt.size() - 1;

            while (j > i) {
                if (vInt.get(j - 1).compareTo(vInt.get(j)) > 0) {
                    int tempo = vInt.get(j);
                    vInt.set(j, vInt.get(j - 1));
                    vInt.set(j - 1, tempo);
                    swap = true;
                }
                j--;
                nb_comparaison++;
            }
            i++;
        }

        return nb_comparaison;

    }


    public static int triSelect(ArrayList<Integer> vInt) {
        //{} => résultat = nombre de comparaisons effectuées
        //  entre deux éléments de vInt }

        int i = 0;
        int nbcomparaison = 0;

        while (i < vInt.size() - 1) {
            int indMin = i;
            int j = i + 1;
            while (j < vInt.size()) {
                if (vInt.get(j).compareTo(vInt.get(indMin)) < 0) {
                    indMin = j;
                }
                j++;
                nbcomparaison++;
            }

            if (indMin != i) {
                int tempo = vInt.get(i);
                vInt.set(i, vInt.get(indMin));
                vInt.set(indMin, tempo);

            }

            i++;
        }

        return nbcomparaison;
    }


    public static int triInsertion(ArrayList<Integer> vInt) {
        //{} => {vInt est trié selon ORDRE(auteur, annee)
        // selon la méthode DU TRI PAR INSERTION}

        int nbcomparaison = 0;
        int i = 1;


        while (i < vInt.size()) {
            int cle = vInt.get(i);
            int j = i - 1;

            while (j >= 0 && vInt.get(j).compareTo(cle) > 0) {
                vInt.set(j + 1, vInt.get(j));
                j--;
                nbcomparaison++;
            }

            if (j > 0) {
                nbcomparaison++;
            }

            vInt.set(j + 1, cle);
            i++;
        }

        return nbcomparaison;


    }


    public static int fusionTabGTabD(ArrayList<Integer> vInt, int inf, int m, int sup) {
        //{ inf <= sup, m = (inf+sup)/2, vInt[inf..m] trié, vInt[m+1..sup] trié
        // => { VInt[inf..sup] trié }

        // étape 1
        ArrayList<Integer> temp = new ArrayList<>(vInt);


        // étape 2      faire un double indice pour parcourir avancer dans les deux partie de vecteur

        int nb_comparaison = 0;
        int i = inf;
        int j = m + 1;
        int k = inf;

        while (i <= m && j <= sup) {

            nb_comparaison++;
            if (vInt.get(i) < vInt.get(j)) {
                nb_comparaison++;
                temp.set(k, vInt.get(i));
                i++;
            } else {
                temp.set(k, vInt.get(j));
                j++;
            }
            k++;
        }


        //étape 3

        while (i <= m) {
            temp.set(k, vInt.get(i));
            k++;
            i++;
            nb_comparaison++;
        }

        while (j <= sup) {
            temp.set(k, vInt.get(j));
            k++;
            j++;
            nb_comparaison++;

        }

        // étape 4
        k = 0;
        while (k < sup) {
            vInt.set(k, temp.get(k));
            nb_comparaison++;
            k++;
        }

        return nb_comparaison;
    }


    public static int triFusion(ArrayList<Integer> vInt, int inf, int sup) {

        int nb_comparaison = 0;
        if (inf < sup) {
            nb_comparaison ++;
            int m = (inf + sup) / 2;
            triFusion(vInt, inf, m);
            triFusion(vInt, m + 1, sup);
            nb_comparaison += fusionTabGTabD(vInt, inf, m, sup);

        }

        return nb_comparaison;
    }


    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> VV = new ArrayList<>();
        ArrayList<Integer> atrier1 = new ArrayList<>(Arrays.asList(12, 7, 9, 14, 5, 17, 6, 8, 12));
        VV.add(atrier1);
        ArrayList<Integer> atrier2 = new ArrayList<>(Arrays.asList(-44, -45, 9, -12, 30, 56, 7, -3, 19, -45, 9, 23, 11, 150, 28, 34, 1, 25));
        VV.add(atrier2);
        ArrayList<Integer> atrier3 = new ArrayList<>(Arrays.asList(17, 14, 12, 12, 9, 8, 7, 6, 5));
        VV.add(atrier3);

        for (int i = 0; i < VV.size(); i++) {

            ArrayList atrier = VV.get(i);
            System.out.println("-----------\nCAS : " + (i+1) + "\n-----------");
            System.out.println("Vecteur initial: " + atrier);
            System.out.println("Nombre d'éléments: " + atrier.size());

            System.out.println("\nA- Tri à bulle amélioré");
            System.out.println(" * Vecteur initial: " + atrier);
            triBulleOutille(atrier);
            System.out.println(" * Vecteur trié: " + atrier);
            System.out.println(" * Nombre de comparaison: " + triBulleOutille(atrier));

            System.out.println("\nB- Tri par selection");
            System.out.println(" * Vecteur initial: " + atrier);
            triSelect(atrier);
            System.out.println(" * Vecteur trié: " + atrier);
            System.out.println(" * Nombre de comparaison: " + triSelect(atrier));

            System.out.println("\nC- Tri par insertion");
            System.out.println(" * Vecteur initial: " + atrier);
            triInsertion(atrier);
            System.out.println(" * Vecteur trié: " + atrier);
            System.out.println(" * Nombre de comparaison: " + triInsertion(atrier));

            System.out.println("\nD- Tri par Fusion");
            System.out.println(" * Vecteur initial: " + atrier);
            triFusion(atrier, 0, atrier.size() - 1);
            System.out.println(" * Vecteur trié: " + atrier);
            System.out.println(" * Nombre de comparaison: " + triFusion(atrier, 0, atrier.size() - 1 )+ "\n");
        }
    }
}

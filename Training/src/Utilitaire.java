import javax.naming.CompositeName;
import java.util.ArrayList;

public class Utilitaire {


    public static boolean existeDansVint(ArrayList<Integer> vInt, int unInt) {
        int i = 0;
        while (i < vInt.size() && vInt.get(i) != unInt) {
            i++;
        }

        return (i < vInt.size());
    }


    public static float valMin(ArrayList<Float> vFloat) {
        float min = vFloat.get(0);
        int i = 1;

        while (i < vFloat.size()) {
            if (vFloat.get(i) < min) {
                min = vFloat.get(i);
            }
            i++;
        }

        return min;
    }


    public static int indiceDansvStringTrie(ArrayList<String> vString, String uneString) {
        int i = 0;

        while (i < vString.size() && vString.get(i).compareTo(uneString) < 0) {
            i++;
        }

        if (i < vString.size() && vString.get(i).compareTo(uneString) == 0) {
            return i;
        } else {
            return -1;
        }
    }


    public static int rechPremIndSeq(ArrayList<Polar> vPolar, int an, String aut) {


        Polar Polartest = new Polar(an, aut, "");
        int i = 0;

        while (i < vPolar.size() && vPolar.get(i).compareTo(Polartest) > 0) {
            i++;
        }

        if (i < vPolar.size() && vPolar.get(i).compareTo(Polartest) == 0) {
            return i;
        } else {
            return -1;
        }

    }


    public static int indiceValDichoIterative(ArrayList<Integer> vInt2, int val) {
        int inf, sup, middle;

        if (val > vInt2.get(vInt2.size() - 1)) {
            return -vInt2.size();
        } else {
            inf = 0;
            sup = vInt2.size() - 1;

            while (inf < sup) {
                middle = (inf + sup) / 2;

                if (vInt2.get(middle) >= val) {
                    sup = middle;
                } else {
                    inf = middle + 1;
                }
            }
        }

        if (vInt2.get(sup) == val) {
            return sup;
        } else {
            return -sup;
        }


    }


    /*public static ArrayList<Integer> TriInsertion(ArrayList<Integer> liste) {

        int ik = 1;

        while (ik < liste.size()) {
            int i = ik - 1;
            int k = liste.get(ik);

            while (i >= 0 && liste.get(i) > k) {
                liste.set(i + 1, liste.get(i));
                i --;
            }

            liste.set(i + 1, k);
            ik++;
        }


        return liste;


    }*/


   /* public static ArrayList<Integer> TriSelection(ArrayList<Integer> liste){

        int i = 0;

        while (i < liste.size()) {
            int min = i;
            int j = i + 1;
            int temp = liste.get(i);

            while (j < liste.size()) {
                if (liste.get(j) < liste.get(min)) {
                    min = j;
                }
                j++;
            }

            if (min != i) {
                liste.set(i, liste.get(min));
                liste.set(min, temp);
            }

            i++;
        }

        return liste;
    }*/


    public static ArrayList<Integer> TriBulle(ArrayList<Integer> liste) {

        boolean swap = true;
        int i = 0;

        while (swap) {
            swap = false;
            int j = liste.size() - 1;

            while (j > i) {
                if (liste.get(j - 1) > liste.get(j)) {
                    int tempo = liste.get(j);
                    liste.set(j, liste.get(j - 1));
                    liste.set(j-1, tempo);
                    swap = true;

                }
                j--;
            }
            i++;
        }

        return liste;
    }



}






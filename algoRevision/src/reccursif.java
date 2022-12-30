import java.util.ArrayList;

public class reccursif {

    public static int factoriellerec(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return factoriellerec(n-1) * n;
        }
    }


    public static boolean estPair(int val) {
        if (val == 0) {
            return true;
        } else if (val == 1) {
            return false;
        }
        else {
            return estPair(val - 2);
        }
    }

    public static int indicevaldichorec(ArrayList<Integer> liste, int val) {
        if (liste.get(liste.size() - 1) < val) {
            return -1;
        }
        else {
            return indicevaldichorecWorker(liste, val, 0, liste.size() - 1);
        }
    }

    public static int indicevaldichorecWorker(ArrayList<Integer> liste, int val, int inf, int sup) {
        // diminuer pour régner

        if (inf == sup) {
            if (val == liste.get(sup)) {
                return sup;
            } else {
                return -sup;
            }
        } else {
            int m = (inf + sup) / 2;

            if (liste.get(m) >= val) {
                return indicevaldichorecWorker(liste, val, inf, m);
            }
            else{
                return indicevaldichorecWorker(liste, val, m + 1, sup);
            }

        }
    }


    public static int maxrec(ArrayList<Integer> liste) {
        return maxrecWorker(liste, 0, liste.size()-1);
    }


    public static int maxrecWorker(ArrayList<Integer> liste, int inf, int sup) {
        if (inf == sup) {
            return liste.get(inf);
        }
        else {
            int m = (inf+sup) / 2;

            int gauche = maxrecWorker(liste, inf, m);
            int droite = maxrecWorker(liste, m+1, sup);

            return Math.max(gauche, droite);
        }
    }





}

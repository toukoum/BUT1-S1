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

    // Cette fonction retourne l'indice de la première occurence d'une valeur donnée dans une liste triée en utilisant la recherche dichotomique récursive.
    public static int indicevaldichorec(ArrayList<Integer> liste, int val) {

        // Cas où la valeur recherchée est plus grande que tous les éléments de la liste
        if (liste.get(liste.size() - 1) < val) {
            return -1;
        }
        // Cas général
        else {
            // Appel récursif à la fonction interne pour réaliser la recherche dichotomique
            return indicevaldichorecWorker(liste, val, 0, liste.size() - 1);
        }
    }

    public static int indicevaldichorecWorker(ArrayList<Integer> liste, int val, int inf, int sup) {
        // On divise le sous-tableau d'intérêt pour régner en excluant des extrêmités inférieures ou supérieures
        // cas de base où il ne reste qu'un seul élément
        if (inf == sup) {
            // Cas où l'élément courant est égal à la valeur recherchée
            if (val == liste.get(sup)) {
                return sup;
            } else {
                // Cas où l'élément courant est différent de la valeur recherchée
                return -sup;
            }
        } else {
            int m = (inf + sup) / 2;
            // Cas où la valeur recherchée est inférieure à la valeur de l'élément central
            if (liste.get(m) >= val) {
                return indicevaldichorecWorker(liste, val, inf, m);
            }
            // Cas où la valeur recherchée est supérieure à la valeur de l'élément central
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

import java.util.ArrayList;

public class recherche {

    public static int RechercheItt(ArrayList<Integer> liste, int valeur) {

        int i = 0;

        while (i < liste.size() && liste.get(i) != valeur) {
            i++;
        }

        if (i < liste.size() && liste.get(i) == valeur) {
            return i;
        } else {
            return 0;
        }
    }


    public static int indiceValDicho(ArrayList<Integer> atrie, int val) {
        /*tu donnes un array liste et il recherche l'index de val en dicho;
        si pas trouvé, retourne -1 ou -val, array non vide*/


        int inf = 0;
        int sup = atrie.size() - 1;
        if (atrie.get(atrie.size() - 1) < val) {
            return -1;
        } else {
            while (inf < sup) {
                int m = (inf + sup) / 2;

                if (atrie.get(m) >= val) {
                    sup = m;
                } else {
                    inf = m + 1;
                }
            }
        }

        if (atrie.get(sup) == val) {
            return sup;
        } else {
            return -val;
        }
    }
}

import java.util.ArrayList;

public class recherche {

    // Cette fonction effectue une recherche séquentielle pour trouver l'indice d'une valeur spécifiée dans une liste ArrayList.
    public static int RechercheItt(ArrayList<Integer> liste, int valeur) {

        // Compteur pour parcourir la liste
        int i = 0;

        // Boucle jusqu'à ce que l'élément recherché soit trouvé ou que la fin de la liste soit atteinte
        while (i < liste.size() && liste.get(i) != valeur) {
            i++;
        }

        // Vérifie si l'élément recherché a été trouvé
        if (i < liste.size() && liste.get(i) == valeur) {
            // Retourne l'indice de l'élément
            return i;
        } else {
            // Retourne 0 si l'élément n'a pas été trouvé
            return 0;
        }
    }



    // Cette fonction retourne l'indice de la première occurence d'une valeur donnée dans une liste triée en utilisant la recherche dichotomique itérative.
    public static int indiceValDicho(ArrayList<Integer> atrie, int val) {
        // Variables pour définir la plage de recherche
        int inf = 0;
        int sup = atrie.size() - 1;

        // Cas où la valeur recherchée est plus grande que tous les éléments de la liste
        if (atrie.get(atrie.size() - 1) < val) {
            return -1;
        }
        // Cas général
        else {
            // Boucle jusqu'à ce que la limite inférieure dépasse la limite supérieure
            while (inf < sup) {
                // Trouve l'élément central de la plage en cours
                int m = (inf + sup) / 2;
                // Cas où la valeur recherchée est inférieure à la valeur de l'élément central
                if (atrie.get(m) >= val) {
                    sup = m;
                }
                // Cas où la valeur recherchée est supérieure à la valeur de l'élément central
                else {
                    inf = m + 1;
                }
            }
        }

        // Vérifie si l'élément recherché a été trouvé
        if (atrie.get(sup) == val) {
            // Retourne l'indice de l'élément
            return sup;
        }
        else {
            // Retourne -val si l'élément n'a pas été trouvé
            return -val;
        }
    }

}

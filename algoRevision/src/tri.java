import java.util.ArrayList;

public class tri {

    // Cette fonction trie une liste ArrayList d'entiers à l'aide de l'algorithme de tri à bulles
    public static ArrayList<Integer> tribulle(ArrayList<Integer> liste) {

        // drapeau pour suivre l'état de tri de la liste
        boolean swap = true;

        //compteur pour la boucle extérieure
        int i = 0;

        // boucle jusqu'à ce que la liste soit triée
        while (swap) {

            // compteur pour la boucle interne
            int j = liste.size() - 1;

            // en supposant initialement que la liste est déjà triée
            swap = false;

            // parcours de la liste
            while (j > i) {
                if (liste.get(j) < liste.get(j - 1)) {
                    // échange les éléments s'ils ne sont pas dans l'ordre correct
                    int temp = liste.get(j);
                    liste.set(j, liste.get(j - 1));
                    liste.set(j - 1, temp);

                    // la liste n'est pas triée
                    swap = true;
                }
                j -= 1;
            }
            i += 1;
        }

        // retourne la liste triée
        return liste;
    }



    // Cette fonction trie une liste ArrayList d'entiers à l'aide de l'algorithme de tri par insertion.
    public static ArrayList<Integer> triInsertion(ArrayList<Integer> liste) {

        // Compteur pour la boucle principale
        int i = 1;
        int j;

        // Boucle sur tous les éléments de la liste, à partir du 2ème élément.
        while (i < liste.size()) {
            j = i;
            // Récupère la valeur de l'élément courant
            int clé = liste.get(i);

            // Boucle à l'intérieur pour insérer l'élément courant à la bonne position
            while (j > 0 && liste.get(j - 1) > clé) {
                // Décalage des éléments vers la droite pour faire de la place pour l'élément courant
                liste.set(j, liste.get(j - 1));
                j -= 1;
            }
            // Insère l'élément courant à la bonne position
            liste.set(j, clé);
            i += 1;
        }

        // Retourne la liste triée
        return liste;
    }




    // Cette fonction trie une liste ArrayList d'entiers à l'aide de l'algorithme de tri par sélection.
    public static ArrayList<Integer> triselection(ArrayList<Integer> liste) {

        // Compteur pour la boucle principale
        int i = 0;

        // Boucle sur tous les éléments de la liste
        while (i < liste.size() - 1) {
            // Compteur pour la boucle interne
            int j = i+1;
            // Index de l'élément le plus petit trouvé jusqu'à présent
            int indmin = i;

            // Boucle à l'intérieur pour trouver l'élément le plus petit
            while (j < liste.size()) {
                // Si l'élément actuel est plus petit que l'élément minimum précédemment trouvé
                if (liste.get(indmin) > liste.get(j)) {
                    // Met à jour l'index de l'élément le plus petit
                    indmin = j;
                }
                j++;
            }
            // Si l'élément le plus petit est différent de l'élément actuel
            if (indmin != i) {
                // Echange les éléments
                int temp = liste.get(i);
                liste.set(i, liste.get(indmin));
                liste.set(indmin, temp);
            }
            i++;
        }

        // retourne la liste triée
        return liste;
    }






















    public static boolean veriftri(ArrayList<Integer> liste) {

        int i = 1;

        while (i < liste.size() && liste.get(i) >= liste.get(i - 1)) {
            i++;
        }

        return (i == liste.size());

    }

}

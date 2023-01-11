import java.util.ArrayList;

public class tri {

    public static ArrayList<Integer> tribulle(ArrayList<Integer> liste) {

        boolean swap = true;
        int i = 0;

        while (swap) {
            int j = liste.size() - 1;
            swap = false;

            while (j > i) {
                if (liste.get(j) < liste.get(j - 1)) {
                    int temp = liste.get(j);
                    liste.set(j, liste.get(j - 1));
                    liste.set(j - 1, temp);
                    swap = true;
                }
                j -= 1;
            }
            i += 1;
        }

        return liste;
    }


    public static ArrayList<Integer> triInsertion2(ArrayList<Integer> liste) {

        int i = 1;
        int j;

        while (i < liste.size()) {
            j = i;
            int clé = liste.get(i);

            while (j > 0 && liste.get(j - 1) > clé) {
                liste.set(j, liste.get(j - 1));
                j -= 1;
            }
            liste.set(j, clé);
            i += 1;
        }

        return liste;
    }

    public static ArrayList<Integer> triselection2(ArrayList<Integer> liste) {
        int i = 0;

        while (i < liste.size() - 1) {
            int indmin = i;
            int j = i + 1;

            while (j < liste.size()) {
                if (liste.get(j) < liste.get(indmin)) {
                    indmin = j;
                }
                j += 1;
            }

            if (indmin != i) {
                int temp = liste.get(i);
                liste.set(i, liste.get(indmin));
                liste.set(indmin, temp);
            }
            i += 1;

        }
        return liste;
    }


    public static ArrayList<Integer> triselection(ArrayList<Integer> liste) {


        int i = 0;

        while (i < liste.size() - 1) {
            int j = i+1;
            int indmin = i;

            while (j < liste.size()) {
                if (liste.get(indmin) > liste.get(j)) {
                    indmin = j;
                }
                j++;
            }
            if (indmin != i) {
                int temp = liste.get(i);
                liste.set(i, liste.get(indmin));
                liste.set(indmin, temp);
            }
            i++;
        }
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

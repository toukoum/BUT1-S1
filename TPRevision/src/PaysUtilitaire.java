import java.util.ArrayList;

public class PaysUtilitaire {
    public static void triBullesA(ArrayList<Pays> vPays) {

        // { } => { vPays trié par la méthode du tri à bulles amélioré }
        boolean trie = false;
        while (!trie) {
            trie = true;
            for (int i = 0; i < vPays.size() - 1; i++) {
                if (vPays.get(i).compareTo(vPays.get(i + 1)) > 0) {
                    Pays temp = vPays.get(i);
                    vPays.set(i, vPays.get(i + 1));
                    vPays.set(i + 1, temp);
                    trie = false;
                }
            }
        }


    }


    public static boolean verifTri(ArrayList<Pays> vPays) {
        // { } => { résultat = vrai si vPays est trié selon l'ordre (continent, nom) }

        int i = 1;

        while (i < vPays.size() && vPays.get(i - 1).compareTo(vPays.get(i)) <= 0) {
            i++;
        }

        return (i == vPays.size());
    }


    public static int rechSeq(ArrayList<Pays> vPays, String unCont, String unNom) {
        // { vPays trié selon l'ordre (continent, nom) } =>
        // { résultat = * indice dans vPays du pays de continent unCont et de nom
        // unNom s'il existe dans vPays
        // * -1 sinon}
        // LA RECHERCHE EST SÉQUENTIELLE


        int i = 0;

        Pays newPays = new Pays(unNom, unCont, 0, 0);

        while (i < vPays.size() && vPays.get(i).compareTo(newPays) < 0) {
            i++;
        }

        if (vPays.get(i).compareTo(newPays) == 0) {
            return i;
        } else {
            return -1;
        }
    }


    public static int rechDicho(ArrayList<Pays> vPays, String unCont, String unNom) {
        // { vPays trié selon l'ordre (continent, nom) } =>
        // { résultat = * indice dans vPays du pays de continent unCont et de nom
        // unNom s'il existe dans vPays
        // * -1 sinon}
        // LA RECHERCHE EST DICHOTOMIQUE

        Pays newPays = new Pays(unNom, unCont, 0, 0);
        int inf = 0;
        int sup = vPays.size();

        if (vPays.get(vPays.size()-1).compareTo(newPays) < 0) {
            return -vPays.size();
        } else {


            while (inf < sup) {
                int m = (inf + sup) / 2;

                if (vPays.get(m).compareTo(newPays) >= 0) {
                    sup = m;
                } else {
                    inf = m + 1;
                }
            }
            if (vPays.get(sup).compareTo(newPays) == 0) {
                return sup;
            } else {
                return -sup;
            }

        }
    }

    public static ListeChaineeBis<Pays> creeListePays(ArrayList<Pays> vPays) {
        // { vPays non vide } =>
        // { résultat = une liste chaînée dont les cellules de position x ont comme
        // attribut info, le pays d'indice x-1 dans vPays }

        ListeChaineeBis<Pays> listeMonde = new ListeChaineeBis<>();

        int i = vPays.size()-1;
        while (i >= 0) {
            listeMonde.insereTete(vPays.get(i));
            i--;
        }

        return listeMonde;

    }
}

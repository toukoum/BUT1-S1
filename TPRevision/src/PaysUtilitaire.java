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

        return (i == vPays.size() - 1);
    }


    public static int rechSeq(ArrayList<Pays> vPays, String unCont, String unNom) {
        // { vPays trié selon l'ordre (continent, nom) } =>
        // { résultat = * indice dans vPays du pays de continent unCont et de nom
        // unNom s'il existe dans vPays
        // * -1 sinon}
        // LA RECHERCHE EST SÉQUENTIELLE


        int i = 0;

        Pays newPays = new Pays(unNom, unCont, 0, 0);

        while (i < vPays.size() && vPays.get(i).compareTo(newPays) <= 0) {
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

        if (vPays.get(vPays.size()).compareTo(newPays) < 0) {
            return -vPays.size();
        } else {
            int m = (inf+sup)/2;

            if (vPays.get(m) >= vPays.get())

        }


    }
    }

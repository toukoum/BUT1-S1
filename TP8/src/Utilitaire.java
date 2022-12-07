import java.net.InetSocketAddress;
import java.util.ArrayList;

public class Utilitaire {

    public static ArrayList<Pays> TriBulle(ArrayList<Pays> vPays) {
        // { vPays non vide }
        // => { résultat = vecteur de Pays trié selon l'ORDRE(continent, nom)
        // en utilisant la méthode du TRI À BULLES AMÉLIORÉ }

        boolean swap = true;
        int i = 0;

        while (swap) {
            swap = false;
            int j = vPays.size() - 1;

            while (j > i) {
                if (vPays.get(j - 1).compareTo(vPays.get(j)) > 0) {
                    Pays tempo = vPays.get(j);
                    vPays.set(j, vPays.get(j - 1));
                    vPays.set(j - 1, tempo);
                    swap = true;
                }
                j--;
            }
            i++;
        }


        return vPays;
    }

    public static boolean verifTri(ArrayList<Pays> vPays) {
        // { } => {résultat = vrai si vPays trié selon l'ORDRE(continent, nom)}

        int i = 1;

        while (i < vPays.size() && vPays.get(i - 1).compareTo(vPays.get(i)) <= 0) {
            i++;
        }

        return (i == vPays.size());
    }


    public static int rechDichoIter(ArrayList<Pays> vPays, String contP, String nomP) {
        // { vPays trié selon l'ORDRE(continent, nom} =>
        // { résultat = * indice du pays de continent contP et de nom nomP
        // s'il existe dans le vecteur vPays
        // * -1 si non trouvé
        // LA RECHERCHE EST DICHOTOMIQUE ITÉRATIVE }

        Pays paysTest = new Pays(nomP, contP, 0, 0);
        if (vPays.get(vPays.size() - 1).compareTo(paysTest) < 0) {
            return -1;
        } else {
            int inf = 0;
            int sup = vPays.size() - 1;


            while (inf < sup) {
                int m = (inf + sup) / 2;

                if (vPays.get(m).compareTo(paysTest) <= 0) {
                    inf = m;
                } else {
                    sup = m - 1;
                }

            }

            if (vPays.get(sup).compareTo(paysTest) == 0) {
                return sup;
            } else {
                return -sup;
            }
        }
    }


    public static int rechDichoRec(ArrayList<Pays> vPays, String contP, String nomP) {
        // { vPays trié selon l'ORDRE(continent, nom) } =>
        // { résultat = * indice du pays de continent contP et de nom nomP
        // s'il existe dans le vecteur vPays
        // * -1 si non trouvé }

        Pays paysTest = new Pays(nomP, contP, 0, 0);
        if (vPays.get(vPays.size() - 1).compareTo(paysTest) < 0) {
            return -1;
        } else {
            return rechDichoWorker(vPays, contP, nomP, 0, vPays.size() - 1);
        }


    }


    public static int rechDichoWorker(ArrayList<Pays> vPays, String contP, String nomP,
                                      int inf, int sup) {
        // { vPays trié selon l'ORDRE(continent,nom) } =>
        // { résultat = indice du pays de continent contP et de nom nomP, s'il existe
        // dans le vecteur vPays[inf .. sup], ou -1 si non trouvé
        // LA RECHERCHE EST DICHOTOMIQUE RÉCURSIVE }

        Pays paysTest = new Pays(nomP, contP, 0, 0);
        if (inf == sup) {
            if (vPays.get(sup).compareTo(paysTest) == 0) {
                return sup;
            } else {
                return -sup;

            }
        } else {
            int m = (inf + sup) / 2;
            if (vPays.get(m).compareTo(paysTest) >= 0) {
                return rechDichoWorker(vPays, contP, nomP, inf, m);
            } else {
                return rechDichoWorker(vPays, contP, nomP, m + 1, sup);
            }

        }
    }

    public static Pays plusGrandPaysIter(ArrayList<Pays> vPays) {
        // {vPays non vide} => {résultat = élément de vPays ayant
        // la plus grande superficie
        // RECHERCHE ITÉRATIVE}

        int i = 1;
        int ind_max = 0;

        while (i < vPays.size()) {
            if (vPays.get(i).getSuperficie() > vPays.get(ind_max).getSuperficie()) {
                ind_max = i;
            }
            i++;
        }

        return vPays.get(ind_max);

    }


    public static Pays plusGrandPaysDPR(ArrayList<Pays> vPays) {
        // {vPays non vide} => {résultat = élément de vPays ayant
        // la plus grande superficie}

        return maxPaysDPRWorker(vPays, 0, vPays.size() - 1);


    }


    public static Pays maxPaysDPRWorker(ArrayList<Pays> vPays,
                                        int inf, int sup) {
        // {vPays non vide} => {résultat = élément de vPays[inf..sup] ayant
        // la plus grande superficie
        // RECHERCHE RÉCURSIVE }


        if (inf == sup) {
            return vPays.get(inf);

        } else {
            int m = (inf + sup) / 2;

            Pays gauche = maxPaysDPRWorker(vPays, 0, m); //doit retourner le + grand élément de la partie gauche
            Pays droite = maxPaysDPRWorker(vPays, m + 1, sup); //doit retourner le + grand élément de la partie droite

            if (gauche.getSuperficie() > droite.getSuperficie()) {
                return gauche;
            } else {
                return droite;
            }
        }
    }

}

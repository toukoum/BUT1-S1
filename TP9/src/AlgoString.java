import java.util.ArrayList;
import java.util.Arrays;

public class AlgoString {

    public static void affichVect(ArrayList<String> vString) {
        // { vString non vide } =>
        // { le contenu de vString est affiché de façon "lisible" sur un petit écran }
        System.out.println();
        System.out.println("-- VECTEUR D'INSTRUMENTS DE CUISINE --");
        System.out.print("[");
        int i = 0;
        int nb = 0;
        while (i < vString.size() - 1) {
            System.out.print(vString.get(i) + ", ");
            i++;
            nb++;
            if (nb % 7 == 0 && nb < vString.size() - 1) {
                System.out.print("\n ");
            }
        }
        System.out.println(vString.get(vString.size() - 1) + "]");
        System.out.println();
        System.out.println("Nombre d'éléments : " + vString.size());
        System.out.println("--------------------------------------");
        System.out.println();
    }

    public static PaireResCompteur<String> nbCarMinOutille(ArrayList<String> vString) {
        // { vInstruments non vide }
        // => { à la fin du traitement, min est le nombre de caractères
        // minimum d'un élément du vecteur
        //
        // résultat = variable de type PaireResCompteur avec
        // - res = min
        // - compteur = nombre de comparaisons effectuées pour
        // produire min
        // RECHERCHE SÉQUENTIELLE }

        String min = vString.get(0);
        int c = 0;
        int k = min.length();
        int i = 1;

        while (i < vString.size()) {
            if (vString.get(i).length() < k) {
                min = vString.get(i);
                k = min.length();
                c++;
            }
            i++;
            c++;
        }

        PaireResCompteur<String> resultat = new PaireResCompteur<>(min, c);
        return resultat;
    }


    public static PaireResCompteur<Integer> nbCarMinDPRO(ArrayList<String> vString) {
        //{ vString non vide }
        // => { à la fin du traitement, min est le nombre de caractères
        // minimum d'un élément de vString
        //
        // résultat = variable de type PaireResCompteur avec
        // - res = min
        // - compteur = nombre de comparaisons effectuées pour
        // produire min


        return nbCarMinDPRWorkerO(vString, 0, vString.size()-1);


    }


    public static PaireResCompteur<Integer> nbCarMinDPRWorkerO(ArrayList<String> vString,
                                                               int inf, int sup) {
        // { vString non vide }
        // => { à la fin du traitement, min est le nombre de caractères
        // minimum d'un élément de vString[inf..sup]
        //
        // résultat = variable de type PaireResCompteur avec
        // - res = min
        // - compteur = nombre de comparaisons effectuées pour
        // produire min
        // RECHERCHE RÉCURSIVE DIVISER POUR RÉGNER }

        int c = 0;
        PaireResCompteur resultat;
        if (inf == sup) {
            c++;
            resultat = new PaireResCompteur<>(inf, c);
            return resultat;
        }
        else {
            int m = (sup + inf) / 2;
            PaireResCompteur<Integer> gauche = nbCarMinDPRWorkerO(vString, 0, m);
            PaireResCompteur<Integer> droite = nbCarMinDPRWorkerO(vString, m + 1, sup);

            if (gauche.getRes() < droite.getRes()) {
                c++;
                resultat = new PaireResCompteur(gauche.getRes(), c);
                return resultat;
            }
            else {
                c++;
                resultat = new PaireResCompteur(droite.getRes(), c);
                return resultat;
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<String> vInstruments = new ArrayList<>(Arrays.asList("casserole", "fourchette",
                "cuillère", "couteau", "passoire", "tamis", "spatule", "fouet", "éplucheur", "bain-marie",
                "râpe", "presse-ail", "presse-agrumes", "ouvre-boîte", "thermomètre", "pince", "balance",
                "presse-purée", "louche", "minuteur", "ciseaux", "bol", "mandoline", "doseur", "shaker"));


        affichVect(vInstruments);
        System.out.println(nbCarMinOutille(vInstruments).getRes());
        System.out.println(nbCarMinDPRO(vInstruments).getRes());

    }


}

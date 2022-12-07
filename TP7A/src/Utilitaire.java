import java.util.ArrayList;

public class Utilitaire {
    public static boolean verifTri(ArrayList<Polar> vPolar) {
        //{ } => { résultat = vrai si vPolar est trié par titre
        // croissant au sens strict }

        int i = 1;

        while ((i < vPolar.size() && vPolar.get(i - 1).compareTo(vPolar.get(i)) <= 0)) {
            i++;

        }

        return i == vPolar.size();

    }


    public static void triSelect(ArrayList<Polar> vPolar) {
        //{} => {vPolar est trié selon l'ORDRE(auteur, annee)
        // selon la méthode DU TRI PAR SÉLECTION}

        int i = 0;

        while (i < vPolar.size() - 1) {
            int indMin = i;
            int j = i + 1;
            while (j < vPolar.size()) {
                if (vPolar.get(j).compareTo(vPolar.get(indMin)) < 0) {
                    indMin = j;
                }
                j++;
            }

            if (indMin != i) {
                Polar tempo = vPolar.get(i);
                vPolar.set(i, vPolar.get(indMin));
                vPolar.set(indMin, tempo);

            }

            i++;
        }
    }


    public static void triBulle(ArrayList<Polar> vPolar) {
        //{} => {vPolar est trié selon l'ORDRE(auteur, annee)
        // selon la méthode DU TRI À BULLES AMÉLIORÉ}


        int longueur = vPolar.size();
        boolean swap = true;

        while (swap) {
            swap = false;
            int i = 0;
            while (i < longueur - 1) {
                if (vPolar.get(i).compareTo(vPolar.get(i + 1)) > 0) {
                    Polar tempo = vPolar.get(i);
                    vPolar.set(i, vPolar.get(i + 1));
                    vPolar.set(i + 1, tempo);
                    swap = true;
                }
                i++;
            }
            longueur--;
        }
    }


    public static void triInsertion(ArrayList<Polar> vPolar) {
        //{} => {vPolar est trié selon ORDRE(auteur, annee)
        // selon la méthode DU TRI PAR INSERTION}


        int i = 1;


        while (i < vPolar.size()) {
            Polar cle = vPolar.get(i);
            int j = i - 1;

            while (j >= 0 && vPolar.get(j).compareTo(cle) > 0) {
                vPolar.set(j + 1, vPolar.get(j));
                j--;
            }

            vPolar.set(j + 1, cle);
            i++;
        }


    }


}






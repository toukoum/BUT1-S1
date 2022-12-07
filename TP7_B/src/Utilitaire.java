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


    public static int triSelect(ArrayList<Polar> vPolar) {
        //{} => résultat = nombre de comparaisons effectuées
        //  entre deux éléments de vPolar }

        int i = 0;
        int nbcomparaison = 0;

        while (i < vPolar.size() - 1) {
            int indMin = i;
            int j = i + 1;
            while (j < vPolar.size()) {
                if (vPolar.get(j).compareTo(vPolar.get(indMin)) < 0) {
                    indMin = j;
                }
                j++;
                nbcomparaison++;
            }

            if (indMin != i) {
                Polar tempo = vPolar.get(i);
                vPolar.set(i, vPolar.get(indMin));
                vPolar.set(indMin, tempo);

            }

            i++;
        }

        return nbcomparaison;
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


    public static int triInsertion(ArrayList<Polar> vPolar) {
        //{} => {vPolar est trié selon ORDRE(auteur, annee)
        // selon la méthode DU TRI PAR INSERTION}

        int nbcomparaison = 0;
        int i = 1;


        while (i < vPolar.size()) {
            Polar cle = vPolar.get(i);
            int j = i - 1;

            while (j >= 0 && vPolar.get(j).compareTo(cle) > 0) {
                vPolar.set(j + 1, vPolar.get(j));
                j--;
                nbcomparaison++;
            }

            if (j > 0) {
                nbcomparaison++;
            }

            vPolar.set(j + 1, cle);
            i++;
        }

        return nbcomparaison;


    }

    public static int rechSeqT(ArrayList<Polar> vPolar, String aut, int an) {
        // { vPolar trié selon l'ORDRE(annee, auteur) }
        // => { * résultat = indice dans vPolar du 1er élément de vPolar
        // écrit par aut, l'année an, si trouvé
        // * résultat = -1, si aucun roman écrit par aut, l'année an
        // LA RECHERCHE EST SÉQUENTIELLE }


        Polar polarTest = new Polar(an, aut, "");
        int i = 0;

        while (i < vPolar.size() && vPolar.get(i).compareTo(polarTest) < 0) {
            i++;
        }

        if (i < vPolar.size() && vPolar.get(i).compareTo(polarTest) == 0) {
            return i;
        } else {
            return -1;
        }


    }


    public static int rechDicho(ArrayList<Polar> vPolar, String aut, int an) {
        // { vPolar trié selon l'ORDRE(annee, auteur) }
        // => { * résultat = indice dans vPolar du 1er élément de vPolar
        // écrit par aut, l'année an, si trouvé
        // * résultat = -1, si aucun roman écrit par aut, l'année an
        // LA RECHERCHE EST DICHOTOMIQUE }


        Polar polarTest = new Polar(an, aut, "");
        int inf = 0;
        int sup = vPolar.size() - 1;

        if (vPolar.get(vPolar.size() - 1).compareTo(polarTest) < 0) {
            return -1;
        } else {
            while (inf < sup) {
                int m = (inf + sup) / 2;
                if (vPolar.get(m).compareTo(polarTest) >= 0) {
                    sup = m;
                } else {
                    inf = m + 1;
                }
            }
        }

        if (vPolar.get(sup).compareTo(polarTest) == 0) {
            return sup;
        } else {
            return -sup;
        }


    }


    public static PaireResultatCompteur<Integer> rechSeqTComp(ArrayList<Polar> vPolar,
                                                              String aut, int an) {
        // { vPolar trié selon l'ORDRE(annee, auteur) } =>
        // { * le premier élément de vPolar écrit par aut, l'année an a été cherché
        // à l'aide d'un algorithme de RECHERCHE SÉQUENTIELLE
        // * résultat = un objet de type PaireResCompteur dont :
        // - l'attribut res a pour valeur l'indice dans vPolar du 1er élément d'auteur
        // aut et d'année an, si trouvé / -1 si pas trouvé
        // - l'attribut compteur a pour valeur le nombre de comparaisons effectuées entre
        // un élément du vecteur et ce qui est cherché, pour produire la valeur de res }

        Polar polarTest = new Polar(an, aut, "");
        int i = 0;
        int comparaison = 1;

        while (i < vPolar.size() && vPolar.get(i).compareTo(polarTest) < 0) {
            i++;
            comparaison++;
        }


        PaireResultatCompteur<Integer> compteur = new PaireResultatCompteur<>(Utilitaire.rechSeqT(vPolar, aut, an), comparaison);

        return compteur;

    }


    public static PaireResultatCompteur<Integer> rechDichoComp(ArrayList<Polar> vPolar,
                                                               String aut, int an) {
        // { vPolar trié selon l'ORDRE(annee, auteur) } =>
        // { * le premier élément de vPolar écrit par aut, l'année an a été cherché
        // à l'aide d'un algorithme de RECHERCHE DICHOTOMIQUE
        // * résultat = un objet de type PaireResCompteur dont :
        // - l'attribut res a pour valeur l'indice dans vPolar du 1er élément d'auteur
        // aut et d'année an, si trouvé / -1 si pas trouvé
        // - l'attribut compteur a pour valeur le nombre de comparaisons effectuées entre
        // un élément du vecteur et ce qui est cherché, pour produire la valeur de res }

        Polar polarTest = new Polar(an, aut, "");
        int inf = 0;
        int sup = vPolar.size() - 1;
        int comparaison = 2;



        while (inf < sup) {
            int m = (inf + sup) / 2;
            if (vPolar.get(m).compareTo(polarTest) >= 0) {
                sup = m;
                comparaison ++;
            } else {
                inf = m + 1;
            }
            comparaison ++;
        }



        PaireResultatCompteur<Integer> compteur = new PaireResultatCompteur<>(Utilitaire.rechDicho(vPolar, aut, an), comparaison);

        return compteur;

    }


}






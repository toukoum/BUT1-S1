public class Polar implements Comparable<Polar> {

    // attributs
    private int annee; // année de première parution
    private String auteur; // auteur du roman policier
    private String titre; // titre du roman policier

    // constructeur
    public Polar(int annee, String auteur, String titre) {
        this.annee = annee;
        this.titre = titre;
        this.auteur = auteur;
    }

    // getters
    public int getAnnee() {
        return annee;
    }
    public String getAuteur() {
        return auteur;
    }
    public String getTitre() {
        return titre;
    }



    @Override
    public String toString() {
        return ("(" + auteur + ", " + annee + ", " + titre + ")");
    }

    public int compareTo(Polar o) {
        //{ } => {* résultat = -1
        // si l'auteur de cet objet précède celui de o
        // dans l'ordre lexicographique (casse prise en compte)
        // ou si l'auteur de cet objet est le même que celui de o
        // et l'année de cet objet précède strictement celle de o
        // * résultat = 0
        // si l'auteur de cet objet et celui de o sont les mêmes
        // et que l'année de cet objet est égale à celle de o
        // * résultat = 1 sinon

        if (auteur.compareTo(o.auteur) == 0) {
            if (annee > o.annee) {
                return 1;
            } else if (annee == o.annee) {
                return 0;
            }
            else {
                return -1;
            }
        }
        else {
            return (auteur.compareTo(o.auteur));
        }

    }

}

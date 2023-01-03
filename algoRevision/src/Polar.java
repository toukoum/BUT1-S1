public class Polar implements Comparable<Polar> {
    private String nom;
    private String auteur;
    private int annee;

    public Polar(int annee, String auteur, String nom) {
        this.nom = nom;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Polar{" +
                "nom='" + nom + '\'' +
                ", auteur='" + auteur + '\'' +
                ", annee=" + annee +
                '}';
    }

    @Override
    public int compareTo(Polar o) {

        if (auteur.compareTo(o.getAuteur()) < 0 || (auteur.compareTo(o.getAuteur()) == 0 && annee < o.getAnnee())) {
            return -1;
        } else if (auteur.compareTo(o.getAuteur()) == 0 && annee == o.getAnnee()) {
            return 0;
        }
        else {
            return 1;
        }
    }
}

public class Polar implements Comparable<Polar> {

    // attributs
    private int annee; // année de première parution
    private String auteur; // auteur du roman policier
    private String titre; // titre du roman policier

    // constructeur
    public Polar(int annee, String auteur, String titre) {
    	this.annee = annee;
        this.auteur = auteur;
        this.titre = titre;
	
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
    // ordre naturel sur l'année et à année égale sur l'auteur : ordre (annee, auteur)
    public int compareTo(Polar o) {
    	// À compléter (cf. ordre (ANNEE, AUTEUR) défini dans le sujet
        if (o.annee != this.annee){
            if (this.annee < o.annee){
                return -1;
            } else if (this.annee > o.annee) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            return (this.auteur.compareTo(o.auteur));
        }
	
    }

    @Override
    // traduction en chaîne de caractères
    public String toString() {
        // {} => {résultat = (annee, auteur, titre) }


        return ("\n--------------\nTitre du livre : " + titre + "\nAuteur : " + auteur + "\nAnnée de Parution : " + annee );
	
    }
}
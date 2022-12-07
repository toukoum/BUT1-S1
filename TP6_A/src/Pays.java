public class Pays implements Comparable<Pays> {

    private String nom; // nom d'un pays
    private String continent; // nom de son continent
    private int population; // nombre d'habitants recensés
    private int superficie; // superficie

    // constructeur
    public Pays(String nom, String continent, int population, int superficie) {
	    this.nom = nom;
        this.continent = continent;
        this.population = population;
        this.superficie = superficie;

    }

    // getters
    public String getNom() {
        return nom;

    }

    public String getContinent() {
        return continent;

    }

    public int getPopulation() {
        return population;

    }

    public int getSuperficie() {
	    return superficie;

    }

    // ordre sur le nom des pays
    @Override
    public int compareTo(Pays o) {
	// À compléter...
	//  	en respectant les informations relatives
	//  	à l'ordre naturel sur la classe Pays,
	//  	données dans le sujet du TP6(A)

        return (this.nom.compareTo(o.nom));


    }

    // pour l'affichage d'un pays
    @Override
    public String toString() {
        return nom + "\n - continent : " + continent
                + "\n - population : " + population + "\n - superficie : " + superficie;
    }
}
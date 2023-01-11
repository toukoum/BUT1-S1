public class Pays implements Comparable<Pays> {

    private String nom; // nom d'un pays
    private String continent; // nom de son continent
    private int population; // nombre d'habitants recensés
    private int superficie; // superficie

    // constructeur
    public Pays(String nom, String continent, int population, int superficie) {
	// À compléter...
        this.nom = nom;
        this.continent = continent;
        this.population = population;
        this.superficie = superficie;
    }

    // getters
    public String getNom() {
	// À compléter...
        return nom;
    }

    public String getContinent() {
	// À compléter...
        return continent;
    }

    public int getPopulation() {
	// À compléter...
        return population;
    }

    public int getSuperficie() {
	// À compléter...
        return superficie;
    }

    // ordre Continent, nom
    @Override
    public int compareTo(Pays o) {

        if (continent.compareTo(o.continent) > 0 || (continent.compareTo(o.continent) == 0 && nom.compareTo(o.nom) > 0)) {
            return 1;
        } else if (continent.compareTo(o.continent) == 0 && nom.compareTo(o.nom) == 0) {
            return 0;
        }
        else {
            return -1;
        }
    }

    // pour l'affichage d'un pays


    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                ", superficie=" + superficie +
                '}';
    }


}
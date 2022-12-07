public class Cercle {
    final double PI = 3.14;
    private float rayon;

    public Cercle (float rayon){
        // Constructeur du cercle

        this.rayon = rayon;

    }

    public float getRayon() {
        return rayon;
    }

    public float getPerimetre() {
        // méthode pour avoir le périmètre du cercle

        return (float) (2*PI*rayon);
    }
    public float getSurface () {
        // méthode pour avoir la surface du cercle

        return (float) (PI*(rayon)*(rayon));
    }
}

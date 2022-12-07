/**
 * Classe générique pour outiller une fonction
 * @param <R> : R est le type du résultat de la fonction outillée
 */
public class PaireResultatCompteur<R> {
    private final R res; // résultat constant de la fonction outillée
    private final int compteur; // compteur constant du code observé
    public PaireResultatCompteur(R res, int compteur) {
        this.res = res;
        this.compteur = compteur;
    }
    public R getRes () {
        return res;
    }
    public int getCompteur() {
        return compteur;
    }
}
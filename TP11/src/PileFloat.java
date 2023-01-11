public class PileFloat {
    private int sommet; // indice de la dernière valeur empilée
    private final float[] pile; // tableau pour représenter une pile de float
    // constructeur
    public PileFloat (int capacite) {
        // {capacite = nombre de niveaux de la pile à construire}
        // => {cette pile est dimensionnée, sommet = -1 (aucune valeur empilée)}
        this.pile = new float[capacite];
        this.sommet = -1;
    }
    // getters
    int getSommet() {
        return sommet;
    }
    float getValPile(int pos) {
        // {pos compris entre 0 et nombre de niveaux de la pile} =>
        // {résultat = valeur de pile à l'indice pos}
        return pile[pos];
    }
    //----- méthodes – À COMPLÉTER ------
    boolean estVide() {
        // {} => {résultat = vrai si sommet = -1}
        return (sommet == -1); // À REMPLACER
    }
    boolean estPleine() {
        //{} => {résultat = vrai si sommet = capacité}
        return (sommet == pile.length); // À REMPLACER
    }
    void empile(float val) throws EPilePleine {
        //{} => {si la pile n'est pas pleine, val a été insérée dans la pile et
        // sommet est mis à jour, sinon, l'exception EPilePleine est levée
        // avec un message approprié}


        if (!estPleine()) {
            int i = 0;
            if (estVide()) {
                pile[i] = val;
                sommet = i;
            }
            else {
                while (pile[i] < sommet) {
                    i++;
                }
                pile[i+1] = val;
                sommet = i+1;
                }
        }
        else {
            throw new EPilePleine("Désolé mais la pile est déjà pleine !");
        }

    }
    void depile() throws EPileVide {
        //{} => {si la pile n'est pas vide, la dernière valeur empilée a été retirée
        // de la pile et sommet est mis à jour, sinon, l'exception EPileVide est levée
        // avec un message approprié}

        if (!estVide()) {
            int i = 0;
            while (sommet != pile[i]) {
                i++;
            }
            sommet = i;
        }
        else {
            throw new EPileVide("Désolé, mais la pile est vide !");
        }
    }
}

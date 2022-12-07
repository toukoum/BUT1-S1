public class Test {
    private int valeur;

    public Test(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public void parle(int valeur) {

        for (int i = 0; i < valeur; i++) {
            System.out.println("Je suis le nombre : " + i);
        }
    }
}

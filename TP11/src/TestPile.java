public class TestPile {
    public static void main(String[] args) {
        PileFloat thePile = new PileFloat(4);

        System.out.println(thePile.estVide());
        System.out.println(thePile.estPleine());

        System.out.println(thePile.getSommet());
        try {
            thePile.empile(1.8f);
        } catch (EPilePleine e) {
            System.out.println("exception intercepté, ouf !");
            System.out.println(e.getMessage());
        }

        int i = 0;
        while (i < 4) {
            System.out.println(thePile.getValPile(i));
            i++;
        }

        System.out.println();
        System.out.println(thePile.getSommet());
    }
}

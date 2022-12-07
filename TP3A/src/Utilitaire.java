import java.util.Scanner;

public class Utilitaire {


    public static float arrondi2(float unFloat) {
        // {} => {résultat = valeur de unFloat après arrondi à 2 décimales}
        return (float) Math.round(100 * unFloat) / 100.0f;

    }

    public static float saisieFloatPos() {
        // {} => {résultat = un réel (float) strictement positif}
        Scanner lecteur = new Scanner(System.in);
        float pos;

        do {
            System.out.print("\nEntrez un réel (float) strictement positif : ");
            pos = lecteur.nextFloat();
            lecteur.nextLine();
            if (pos < 0) {
                System.out.println("Vous avez entrez un nombre inférieur à zéro !");
            } else if (pos == 0) {
                System.out.println("vous avec entrez un nombre null !");

            }
        } while (pos <= 0);

        return pos;
    }

    public static Rectangle saisirRectangle() {
        // {} => {résultat = un Rectangle}
        float cote1, cote2;


        cote1 = saisieFloatPos();
        cote2 = saisieFloatPos();

        Rectangle unRectangle = new Rectangle(cote1, cote2);
        return unRectangle;

    }

    public static void afficherRectangle(Rectangle unRectangle) {
        // {} => {les longueurs des côtés de unRectangle ont été affichées
        // ainsi que les valeurs arrondies à 2 décimales de son
        // périmètre et de sa surface}

        System.out.println("\n---------------------\nVoici les détails du carré :\n--------------------- ");
        System.out.println("Longueur de côté 1 : " + unRectangle.getCote1());
        System.out.println("Longueur de côté 2 : " + unRectangle.getCote2());
        System.out.println("Périmètre du carré : " + arrondi2(unRectangle.getPerimetre()));
        System.out.println("Aire du carré : " + arrondi2(unRectangle.getSurface()));

    }

    public static Cercle saisirCercle() {
        // {} => {résultat = un Cercle}

        float rayon;

        rayon = saisieFloatPos();
        Cercle unCercle = new Cercle(rayon);

        return unCercle;

    }

    public static void afficherCercle(Cercle unCercle) {
        // {} => {le rayon du cercle unCpubliercle a été affiché, ainsi que
        // les valeurs arrondies à 2 décimales de son périmètre
        // et de sa surface}

        System.out.println("\n---------------------\nVoici les détails du Cercle :\n--------------------- ");
        System.out.println("Rayon du Cercle : " + unCercle.getRayon());
        System.out.println("Périmètre du Cercle : " + arrondi2(unCercle.getPerimetre()));
        System.out.println("Surface du Cercle : " + arrondi2(unCercle.getSurface()));


    }

    public static float verifInegaliteTriangulaire(float cote1, float cote2) {
        // {cote1 et cote2 > 0} => {le résultat est un float strictement positif,
        // tel qu'un triangle dont les côtés seraient ce
        // ce float, cote1 et cote2, puisse être construit}

        float cote3;

        do {
            cote3 = saisieFloatPos();

        }while(cote1 + cote2 < cote3);

        return cote3;

    }

    public static Triangle saisirTriangle() {
        // {} => {résultat = un Triangle}

        float cote1;
        float cote2;
        float cote3;

        cote1 = saisieFloatPos();
        cote2 = saisieFloatPos();
        cote3 = verifInegaliteTriangulaire(cote1, cote2);

        Triangle unTriangle = new Triangle(cote1, cote2, cote3);

        return unTriangle;

    }

    public static void afficherTriangle(Triangle unTriangle) {
        // {} => {les longueurs des côtés de unTriangle, sa nature
        // et les valeurs arrondies à 2 décimales de son
        // périmètre et de sa surface, ont été affichées}

        System.out.println("\n---------------------\nVoici les détails du Triangle :\n--------------------- ");
        System.out.println("Longueur de côté 1 : " + unTriangle.getCote1());
        System.out.println("Longueur de côté 2 : " + unTriangle.getCote2());
        System.out.println("Longueur de côté 3 : " + unTriangle.getCote2());
        System.out.println("Périmètre du triangle : " + arrondi2(unTriangle.getPerimetre()));
        System.out.println("Aire du triangle : " + arrondi2(unTriangle.getSurface()));
        System.out.println("Nature du triangle : " + unTriangle.getNature());


    }






}
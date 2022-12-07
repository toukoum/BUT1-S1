public class TriangleUtilitaire {

    public static double arrondi2(double unDouble) {
        // {} => {résultat = valeur de unFloat après arrondi à 2 décimales}
        return (double) Math.round(100 * unDouble) / 100.0f;

    }


    public static void afficherTriangleCompose(TriangleCompose T) {
        // {} => {les longueurs des côtés de unTriangle,
        // et les valeurs arrondies à 2 décimales de son
        // périmètre et de sa surface, ont été affichées}

        System.out.println("\n---------------------\nVoici les détails du Triangle Compose de sommet A, B, C :\n--------------------- ");
        System.out.println("Point 1 : " + T.getA());
        System.out.println("Point 2 : " + T.getB());
        System.out.println("Point 3 : " + T.getC());
        System.out.println("Longueur côté 1 : " + arrondi2(T.coteAB()));
        System.out.println("Longueur côté 2 : " + arrondi2(T.coteBC()));
        System.out.println("Longueur côté 3 : " + arrondi2(T.coteAC()));
        System.out.println("Périmètre du triangle : " + arrondi2(T.perimetre()));
        System.out.println("Aire du triangle : " + arrondi2(T.surface()));



    }


    public static void afficherTriangleAgrege(TriangleAgrege T) {
        // {} => {les longueurs des côtés de unTriangle,
        // et les valeurs arrondies à 2 décimales de son
        // périmètre et de sa surface, ont été affichées}

        System.out.println("\n---------------------\nVoici les détails du Triangle Agrege de sommet A, B, C :\n--------------------- ");
        System.out.println("Point 1 : " + T.getA());
        System.out.println("Point 2 : " + T.getB());
        System.out.println("Point 3 : " + T.getC());
        System.out.println("Longueur côté 1 : " + arrondi2(T.coteAB()));
        System.out.println("Longueur côté 2 : " + arrondi2(T.coteBC()));
        System.out.println("Longueur côté 3 : " + arrondi2(T.coteAC()));
        System.out.println("Périmètre du triangle : " + arrondi2(T.perimetre()));
        System.out.println("Aire du triangle : " + arrondi2(T.surface()));



    }
}

public class Geometrie {
    public static void main(String[] args) {


        //RECTANGLE
        // Déclaration d'une variable de type Rectangle
        Rectangle unRectangle;

        // Initialisation de la variable avec la fonction de saisie de la classe Utilitaire
        unRectangle = Utilitaire.saisirRectangle();

        // Affichage de la variable avec la procédure d'affichage de la classe Utilitaire
        Utilitaire.afficherRectangle(unRectangle);


        // CERCLE
        // Déclaration d'une cariable de type Cercle
        Cercle unCercle;

        // Initialisation de la variable avec la fonction de saisie de la classe Utilitaire
        unCercle = Utilitaire.saisirCercle();

        // Affichage de la variable avec la procédure d'affichage de la classe Utilitaire
        Utilitaire.afficherCercle(unCercle);



        //  TRIANGLE
        // Déclaration d'une cariable de type Cercle
        Triangle unTriangle;

        // Initialisation de la variable avec la fonction de saisie de la classe Utilitaire
        unTriangle = Utilitaire.saisirTriangle();

        // Affichage de la variable avec la procédure d'affichage de la classe Utilitaire
        Utilitaire.afficherTriangle(unTriangle);





    }
}

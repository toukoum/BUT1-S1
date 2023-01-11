import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    //Fonction pour vérifier que l'entrée utilisateur est un entier
    public static int verifint(Scanner lecteur) {
        int val;

        try {
            // Demande à l'utilisateur de saisir un entier
            System.out.println("Veuillez saisir un entier (int) : ");
            val = lecteur.nextInt();

            // vide le buffer
            lecteur.nextLine();
            return val;
        } catch (InputMismatchException e) {
            // Gère l'exception InputMismatchException
            // Cette exception est levée lorsque l'utilisateur saisit quelque chose qui n'est pas un entier

            // vide le buffer
            lecteur.nextLine();

            // informe l'utilisateur de saisir à nouveau
            System.out.println("Veuillez recommencez, vous n'avez pas saisie un entier ! ");
            return verifint(lecteur);
        }
    }

    //Fonction pour vérifier que l'entrée utilisateur est un float
    public static Float verifloat(Scanner lecteur) {

        Float saisie;

        try {
            // Demande à l'utilisateur de saisir un float
            System.out.println("Veuillez saisir un Float : ");
            saisie = lecteur.nextFloat();

            // vide le buffer
            lecteur.nextLine();
            return saisie;
        } catch (InputMismatchException e) {
            // Gère l'exception InputMismatchException
            // Cette exception est levée lorsque l'utilisateur saisit quelque chose qui n'est pas un float

            // vide le buffer
            lecteur.nextLine();

            // informe l'utilisateur de saisir à nouveau
            System.out.println("Vous n'avez pas saisie de Float, veuillez recommencez !");
            return verifloat(lecteur);
        }

    }
}


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    public static int verifint(Scanner lecteur) {
        int val;

        try {
            System.out.println("Veuillez saisir un entier (int) : ");
            val = lecteur.nextInt();
            lecteur.nextLine();
            return val;
        } catch (InputMismatchException e) {
            lecteur.nextLine();
            System.out.println("Veuillez recommencez, vous n'avez pas saisie un entier ! ");
            return verifint(lecteur);
        }
    }

    public static Float verifloat(Scanner lecteur) {

        Float saisie;

        try {
            System.out.println("Veuillez saisir un Float : ");
            saisie = lecteur.nextFloat();
            lecteur.nextLine();
            return saisie;
        } catch (InputMismatchException e) {
            lecteur.nextLine();
            System.out.println("Vous n'avez pas saisie de Float, veuillez recommencez !");
            return verifloat(lecteur);
        }

    }
}

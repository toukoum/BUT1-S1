import jdk.jshell.execution.Util;
import java.util.Scanner;
import java.util.ArrayList;

public class Polars_Main {

    public static void main(String[] args) {
        final ArrayList<Polar> lesPolars = InitBibPolars.lesPolars();   //Array list de type Polar contenant tt les Polars
        ArrayList<Polar> vPolarsVide = new ArrayList<>();
        int i = 0;
        int anMin = lesPolars.get(0).getAnnee();
        int anMax = lesPolars.get(lesPolars.size() - 1).getAnnee();
        int anTest, indice, indice2;
        String auteurTest;
        Scanner lecteur = new Scanner(System.in);


        while (i < lesPolars.size()) {
            System.out.println(lesPolars.get(i).toString());
            i++;

        }// affichage des caractéristique de tous les polars


        /*anTest = Utilitaire.saisirIntMinMax(anMin, anMax);  //déclaration d'une année compris entre 1971 et 2018

        System.out.print("Veuillez rentrez le nom d'un auteur : ");
        auteurTest = lecteur.nextLine();

        indice = Utilitaire.rechPremIndSeq(lesPolars, anTest, auteurTest);
        if (indice != -1){
            System.out.println(indice);
            System.out.println("SEQ : Voici le titre du roman de " + auteurTest + ": " + lesPolars.get(indice).getTitre() + " écrit en " + anTest);
        }
        else {
            System.out.println("SEQ : Aucun roman de " + auteurTest + " en " + anTest);
        }



        indice2 = Utilitaire.rechPremIndDicho(lesPolars, anTest, auteurTest);
        if (indice != -1){
            System.out.println(indice);
            System.out.println("DICHO : Voici le titre du roman de " + auteurTest + ": " + lesPolars.get(indice).getTitre() + " écrit en " + anTest);
        }
        else {
            System.out.println("DICHO : Aucun roman de " + auteurTest + " en " + anTest);
        }*/

        int an1 = Utilitaire.saisirIntMinMax(anMin, anMax);
        int an2 = Utilitaire.saisirIntMinMax(an1, anMax);

        System.out.print("Donnez le nom d'un auteur : ");
        String unAuteur = lecteur.nextLine();


        Utilitaire.lesPolarsDe(lesPolars, an1, an2, unAuteur);


    }
}




























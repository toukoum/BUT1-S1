import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Scanner;

public class Comparaisons {
    public static void main(String[] args) {

        //Scanner
        Scanner lecteur = new Scanner(System.in);

        // nombre de comparaisons tri SELECTION
        ArrayList<Polar> mesPolars = CreationBib.lesPolars();
        System.out.println("tri Selection : " + Utilitaire.triSelect(mesPolars));

        System.out.println(mesPolars);

        /*// nombre de comparaisons tri INSERTION
        mesPolars = CreationBib.lesPolars();
        System.out.println("tri Insertion : " + Utilitaire.triInsertion(mesPolars));*/


        //Saisie auteur et année
        String aut;
        int annee;

        System.out.print("Veuilez saisir un auteur : ");
        aut = lecteur.nextLine();

        System.out.print("Veuillez saisir une année : ");
        annee = lecteur.nextInt();
        lecteur.nextLine();

        /*//recherche Sequentielle
        System.out.print(Utilitaire.rechSeqT(mesPolars, aut, annee));
        System.out.print(" - ");

        //recherche Dichotomique
        System.out.print(Utilitaire.rechDicho(mesPolars, aut, annee));*/



        // Partie B5
        System.out.println("\n- Recherche Sequentielle : " + Utilitaire.rechSeqTComp(mesPolars, aut, annee ).getCompteur() + " comparaisons.");
        System.out.println("L'élément recherché se situe à l'indice : " + Utilitaire.rechSeqTComp(mesPolars, aut, annee ).getRes());


        System.out.println("\n- Recherche Dichotomique : " + Utilitaire.rechDichoComp(mesPolars, aut, annee ).getCompteur() + " comparaisons.");
        System.out.println("L'élément recherché se situe à l'indice : " + Utilitaire.rechSeqTComp(mesPolars, aut, annee ).getRes());


        // L'algo dichotomique est beaucoup plus efficace que l'algo de recherche sequentielle.
    }
}

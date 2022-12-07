import java.util.Scanner;

public class Compare_Strings {


    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);

        String unChat = "chat";
        String unPetitChat = "chaton";
        String unChien = "chien";
        String toBeReplaced = "";

        // 1 - Premiers tests
        System.out.println("------------------------------------------------------");
        System.out.println("Premiers tests de comparaison de chaînes");
        System.out.println("------------------------------------------------------");
        System.out.println("Chaînes comparées...");
        System.out.println("    unChat --> \"" + unChat + "\"");
        System.out.println("    unChien --> \"" + unChien + "\"");
        System.out.println("    unPetitChat --> \"" + unPetitChat + "\"");
        System.out.println("Comparaisons entre ces chaînes (casse prise en compte)");
        System.out.println("    unChat comparé à unChien --> " + unChat.compareTo(unChien));
        System.out.println("    unChien comparé à unPetitChat --> " + unChien.compareTo(unPetitChat));
        System.out.println("    unPetitChat comparé à unChat ---> " + unPetitChat.compareTo(unChat));
        System.out.println("    unPetitChat comparé à unPetitChat ---> " + unPetitChat.compareTo(unPetitChat));
        System.out.println("------------------------------------------------------");

        // 2 - Comparaisons entre des chaînes saisies par l'utilisateur

        // chaînes à comparer
        String ch1 = "", ch2 = "";
        // résultat de la comparaison entre ch1 et ch2
        int resComp = 0;

        /*
            À COMPLÉTER...
            Initialisation par saisie des chaînes ch1 et ch2
            Les messages invitant l'utilisateur à saisir chaque chaîne doivent être clairs
       */


        /*
            À NE PAS MODIFIER !
        */
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Comparaison entre les chaînes \"" + ch1 + "\" et \"" + ch2 + "\"");
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
        /*
            À MODIFIER...
            Initialisation des variables nbCarCh1 et nbCarCh2 (cf. commentaires)
       */
        // nombre de caractères de ch1 (à initialiser)
        int nbCarCh1;
        // nombre de caractères de ch2 (à intialisiser)
        int nbCarCh2;

        /*
            À NE PAS MODIFIER !
        */
        // position du dernier caractère pouvant être comparé dans ch1 et ch2
        //int indDerCarToCompare = Math.min(nbCarCh1, nbCarCh2)-1;
        /*
            À COMPLÉTER...
            Nouvelles déclarations jugées nécessaires,
            Instructions de calcul du résultat de la comparaison entre ch1 et ch2
        */





       /*
            À NE PAS MODIFIER !
        */
        System.out.println("Résultat de la comparaison de \"" + ch1 + "\" et \"" + ch2 + "\" par programme : " + resComp);
        System.out.println();
        System.out.println("Vérification...");
        System.out.println("Résultat de la comparaison de \"" +ch1 + "\" et \"" + ch2 + "\" avec compareTo : " + ch1.compareTo(ch2));
    }
}

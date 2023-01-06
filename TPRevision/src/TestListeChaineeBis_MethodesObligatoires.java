import java.util.Scanner;

public class TestListeChaineeBis_MethodesObligatoires {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        ListeChaineeBis<Integer> listeInt = new ListeChaineeBis<>();
        // 1 - initialisation de listeInt avec 10 entiers générés aléatoirement
        //      test insereTete
        int unEnt;
        for (int i = 1; i <= 10; i++ ) {
            // entier généré : valeur comprise entre 0 et 100
            unEnt = (int) (Math.random() * 101);
            // insertion en tête de listeInt de l'entier généré
            listeInt.insereTete(unEnt);
        }
        // 1 - affichage GD de la liste
        System.out.print("listeInt : ");
        listeInt.afficheGaucheDroiteRec();
        System.out.println("Nombre de cellules : " + listeInt.getLongueur());
        // 2 - insertion en tête d'une cellule d'info (entier) 15
        //      nouveau test insereTete
        listeInt.insereTete(15);
        System.out.println();
        System.out.println("Insertion en tête d'une cellule portant l'info 15...");
        System.out.print("listeInt : ");
        listeInt.afficheGaucheDroiteRec();
        // 3 - suppression de la cellule de tête
        //      test supprimeTete
        System.out.println();
        listeInt.supprimeTete();
        System.out.println("Suppression de la cellule de tête");
        System.out.print("listeInt : ");
        listeInt.afficheGaucheDroiteRec();
        // 4 - nombre de cellules de la liste
        System.out.println();
        System.out.println("Nombre de cellules de listeInt : " + listeInt.getLongueur());
        // 5 - insertion dans listeInt d'une nouvelle cellule d'info 8 en position 3
        //      test insereAtPosit
        System.out.println();
        listeInt.insereAtPosit(3, 1000);
        System.out.println("Insertion d'une nouvelle cellule d'info 1000 en position 3");
        System.out.print("listeInt : ");
        listeInt.afficheGaucheDroiteRec();
        System.out.println("Nombre de cellules de listeInt : " + listeInt.getLongueur());
        // 6 - Suppression de la nouvelle cellule
        //      test supprimeAtPosit
        System.out.println();
        listeInt.supprimeAtPosit(3);
        System.out.println("Suppression de cette nouvelle cellule...");
        System.out.print("listeInt : ");
        listeInt.afficheGaucheDroiteRec();
        System.out.println("Nombre de cellules de listeInt : " + listeInt.getLongueur());
        // 7 - Information portée par la cellule en position saisie par l'utilisateur
        //      test getInfoAtPosit
        System.out.println();
        System.out.print("Donnez le numéro d'une cellule de la liste : ");
        int pos = lecteur.nextInt(); lecteur.nextLine();
        System.out.println("Information portée par la cellule à cette position : ");
        try {
            System.out.println("Information portée par la cellule en position " + pos + " dans listeInt : "+ listeInt.getInfoAtPosit(pos));
        } catch (ExceptionMauvaisIndice e) {
            System.out.println("Position invalide...");
            System.out.println("Poursuite de l'exécution");
        }
        // 8 - remplacement de la cellule située à la position précédemment saisie
        //      par un entier saisi par l'utilisateur
        //      test setInfoAtPosit
        System.out.println();
        System.out.print("Donnez un entier : ");
        unEnt = lecteur.nextInt(); lecteur.nextLine();
        System.out.println("Remplacement de l'information portée par la cellule en position " + pos + " dans listeInt " + " par l'entier saisi");
        if (!listeInt.setInfoAtPosit(pos, unEnt)) {
            System.out.println("La position saisie étant invalide, aucun remplacement n'a pu être effectué");
        } else {
            System.out.print("listeInt : ");
            listeInt.afficheGaucheDroiteRec();
        }
        // 9 - Insertion d'une nouvelle cellule d'info -3000 en fin de la liste
        //      Test insereFin
        System.out.println();
        listeInt.insereFin(-3000);
        System.out.println("Insertion en fin de la liste d'une cellule portant l'info -3000");
        System.out.print("listeInt : ");
        listeInt.afficheGaucheDroiteRec();
        System.out.println("Nombre de cellules de listeInt : " + listeInt.getLongueur());
        //10 - suppression de la dernière cellule de la liste
        //      test supprimeFin
        System.out.println();
        listeInt.supprimeFin();
        System.out.println("Suppression de la cellule insérée en fin de liste...");
        listeInt.afficheGaucheDroiteRec();
        System.out.println("Nombre de cellules de listeInt : " + listeInt.getLongueur());
    }
}

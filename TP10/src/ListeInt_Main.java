import jdk.jshell.execution.Util;

import java.util.Scanner;

public class ListeInt_Main {

    public static void main(String[] args) throws ExceptionMauvaisIndice {
        ListeChainee<Integer> listeInt = new ListeChainee<>();

        int i = 0;

        while (i < 15) {
            listeInt.insereTete((int) (Math.random() * 100));
            i++;
        }

        //B1 - création d'une liste chaînée de 15 éléments et affichage
        System.out.print("Affichage de la Gauche vers la Droite : ");
        listeInt.afficheGaucheDroiteIter();

//        TP10
//
//        System.out.print("\nAffichage de la Droite vers la Gauche : ");
//        listeInt.afficheDroiteGaucheRec();
//
//
//        //B2 - Somme de façon Itérative des éléments de listeInt
//        System.out.println("\nSomme de la liste de façon Itérative : " + Utilitaire.sommeListeInt(listeInt));
//
//        // Somme de façon récursive des éléments de listeInt
//        System.out.println("Somme de la liste de façon Récursive : " + Utilitaire.sommeListeIntRec(listeInt) + "\n");
//
//        // Valeur à rechercher
//        Scanner lecteur = new Scanner(System.in);
//        int valeur = Utilitaire.getInt(lecteur);
//
//        //Recherche de façon récursive d'un élément dans listeInt (true si présent)
//        if (Utilitaire.rechValListe(listeInt, valeur) == true) {
//            System.out.println("La saisie " + valeur + " que vous avez rentrez est bien présent dans la liste !");
//        } else {
//            System.out.println("La saisie " + valeur + " que vous avez rentrez n'est pas présente dans la liste !");
//        }
//
//        // Index de posVal dans listeInt
//        int posVal = Utilitaire.premPosVal(listeInt, valeur);
//        if (posVal != 0) {
//            System.out.println(valeur + " se trouve à l'index " + posVal);
//        }
//        //affichage de l'élément à l'index renvoyé par premPosVal
//        try {
//            System.out.println(listeInt.getInfoAtPosit(posVal) + " est bien présent dans la liste de base.");
//        } catch (ExceptionMauvaisIndice e) {
//            e.getMessage();
//            System.out.println("Exception interceptée, poursuite de l'execution de programme !");
//        }
//
//
//        //B3 - Insertion d'un élément dans listeInt - Déclaration d'une nouvelle liste
//        ListeChainee<Integer> listeTriee = new ListeChainee<>();
//        System.out.print("Affichage de la Gauche vers la Droite : ");
//        listeInt.afficheGaucheDroiteIter();
//        //insertion des éléments de listeInt dans listeTriee par appel de insereDansListeTriee
//        Cellule<Integer> c = listeInt.getTete();
//
//        while (c != null) {
//            Utilitaire.insereDansListeTriee(listeTriee, c.getInfo());
//            c = c.getCelluleSuivante();
//            listeTriee.afficheGaucheDroiteRec();
//        }
//
//        //affichage d'un message indiquant si listeTriee est effectivement triée par ordre croissant au sens large
//        System.out.print("\nTri le la liste par ordre croissant : ");
//        listeTriee.afficheGaucheDroiteRec();
//        if (Utilitaire.verifTri(listeTriee)) {
//            System.out.println("La liste est désormais bien triée !");
//
//        }
//
//        //affichage pour vérification du nombre d'éléments de listeTriee et des éléments de listeTriee
//        System.out.println("La liste comporte " + listeTriee.getLongueur() + " éléments.");

//        -----------------
//             TP11
//        -----------------

////       1-
//
//        System.out.println();
//        Utilitaire.afficheGDdetaille(listeInt);
//
//        int posCell = (int) (Math.random()* (listeInt.getLongueur()+1));
//        System.out.println(posCell);
//        System.out.println(Utilitaire.getCellPos(listeInt, posCell));
//
////      2-
//        Scanner lecteur = new Scanner(System.in);
//        int pos1 = Utilitaire.getInt(lecteur);
//        int pos2 = Utilitaire.getInt(lecteur);
//
//        ListeChainee<Integer> souslist ;
//        souslist = Utilitaire.sousListe(listeInt, pos1, pos2);
//        Utilitaire.afficheGDdetaille(souslist);
//        System.out.println(souslist.getLongueur());

////      3-
        int k = 0;
        ListeChainee<Integer> listeInt2 = new ListeChainee<>();
        while (k < 5) {
            listeInt2.insereTete((int) (Math.random() * 100));
            k++;
        }

        System.out.print("\nAffichage de la Gauche vers la Droite : ");
        listeInt2.afficheGaucheDroiteIter();
        System.out.println();
        Utilitaire.afficheGDdetaille(listeInt2);
//
//        Utilitaire.insereL2DansL1(listeInt, listeInt2, 1);
//
//        System.out.print("\nAffichage de la Gauche vers la Droite : ");
//        listeInt.afficheGaucheDroiteIter();
//        System.out.println();
//        Utilitaire.afficheGDdetaille(listeInt);
//
//        System.out.println();
//        System.out.println(listeInt.getLongueur());

//        4-

        ListeChainee<Integer> newListeT;
        newListeT = Utilitaire.fusionL1L2(listeInt, listeInt2);

        newListeT.afficheGaucheDroiteIter();
        System.out.println();
        System.out.println(newListeT.getLongueur());

    }
}

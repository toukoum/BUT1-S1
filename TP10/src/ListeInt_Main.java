import jdk.jshell.execution.Util;

import java.util.Scanner;

public class ListeInt_Main {

    public static void main(String[] args) throws ExceptionMauvaisIndice {
        ListeChainee<Integer> listeInt = new ListeChainee<>();

        int i = 0;

        while (i < 15) {
            listeInt.insereTete((int)(Math.random() * 100));
            i++;
        }

        //B1 - création d'une liste chaînée de 15 éléments et affichage
        System.out.print("Affichage de la Gauche vers la Droite : ");
        listeInt.afficheGaucheDroiteIter();
        System.out.print("\nAffichage de la Droite vers la Gauche : ");
        listeInt.afficheDroiteGaucheRec();


        //B2 - Somme de façon Itérative des éléments de listeInt
        System.out.println("\nSomme de la liste de façon Itérative : " + Utilitaire.sommeListeInt(listeInt));

        // Somme de façon récursive des éléments de listeInt
        System.out.println("Somme de la liste de façon Récursive : " + Utilitaire.sommeListeIntRec(listeInt) + "\n");

        // Valeur à rechercher
        Scanner lecteur = new Scanner(System.in);
        int valeur = Utilitaire.getInt(lecteur);

        //Recherche de façon récursive d'un élément dans listeInt (true si présent)
        if (Utilitaire.rechValListe(listeInt, valeur) == true) {
            System.out.println("La saisie " + valeur + " que vous avez rentrez est bien présent dans la liste !");
        }
        else {
            System.out.println("La saisie " + valeur + " que vous avez rentrez n'est pas présente dans la liste !");
        }

        // Index de posVal dans listeInt
        int posVal =  Utilitaire.premPosVal(listeInt, valeur);
        if (posVal != 0) {
            System.out.println(valeur + " se trouve à l'index " + posVal);
        }
        //affichage de l'élément à l'index renvoyé par premPosVal
        try {
            System.out.println(listeInt.getInfoAtPosit(posVal) + " est bien présent dans la liste de base.");
        } catch (ExceptionMauvaisIndice e) {
            e.getMessage();
            System.out.println("Exception interceptée, poursuite de l'execution de programme !");
        }


        //B3 - Insertion d'un élément dans listeInt - Déclaration d'une nouvelle liste
        ListeChainee<Integer> listeTriee = new ListeChainee<>();

        //insertion des éléments de listeInt dans listeTriee par appel de insereDansListeTriee
        i = 1;
        while (i < listeInt.getLongueur()) {
            Utilitaire.insereDansListeTriee(listeTriee, listeInt.getInfoAtPosit(i));
            i++;
        }

        //affichage d'un message indiquant si listeTriee est effectivement triée par ordre croissant au sens large
        System.out.print("\nTri le la liste par ordre croissant : ");
        listeTriee.afficheGaucheDroiteRec();
        if (Utilitaire.verifTri(listeTriee)) {
            System.out.println("La liste est désormais bien triée !");

        }

        //affichage pour vérification du nombre d'éléments de listeTriee et des éléments de listeTriee
        System.out.println("La liste comporte " + listeTriee.getLongueur() + " éléments.");







    }
}

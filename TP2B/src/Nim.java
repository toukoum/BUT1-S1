import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        final int MINJOUEUR = 2;
        final int MAXPRISE = 3;
        int nbJoueurs, nbAllumettes, reste;
        int numJoueur = 1;
        int i = 1;
        int nbCoups = 0;


        System.out.print("***Combien de joueur ?\n");
        System.out.print("Entrez un entier supérieur ou égal à 2 : ");
        nbJoueurs = saisieEntPosMin(2);
        System.out.print("***Combien d'allumettes' ?\n");
        System.out.print("Entrez un entier supérieur ou égal à " + nbJoueurs*3 + " : ");
        nbAllumettes = saisieEntPosMin(nbJoueurs*3);

        System.out.print("********************\n Nombre de joueurs : " + nbJoueurs + "\n Nombre d'allummetes : " + nbAllumettes + "\n********************\n");

        reste = nbAllumettes;

        while (reste>0){

            for (i = 1; i <= nbJoueurs; i++) {
                System.out.print("Joueur n°" + i + ", combien prenez vous d'alummettes ? Entrez un entier compris entre 1 et 3 : ");
                reste -= prise(reste, MAXPRISE);
                System.out.print("Il reste : " + reste + " allumettes\n");
                numJoueur = i;

                if (reste <= 0){
                    i = nbJoueurs + 1;
                }

                nbCoups += 1;


                }

            i=1;

        }

        System.out.println("Victoire du joueur n°" + numJoueur + " après " + nbCoups + " coups !");

    }

    private static int saisieEntPosMin(int min){
        //{min > 0} => {résultat = un entier supérieur ou égal à min saisi par l'utilisateur}

        int value;
        Scanner lecteur = new Scanner(System.in);

        do {
            value = lecteur.nextInt();
            lecteur.nextLine();

        } while (value < min);

        return value;
        }


    private static int prise(int reste, int max) {
        // { reste > 0, max > 0} => {résultat = entier > 0 et inférieur ou égal
        // à la plus petite valeur parmi reste et max après saisie par l'utilisateur}
        int value;
        Scanner lecteur = new Scanner(System.in);

        do {
            value = lecteur.nextInt();
            lecteur.nextLine();
        }while (value<0 | value > max);

        if (reste<value){
            return reste;
        }
        else{
            return value;
        }

        }
}

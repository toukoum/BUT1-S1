import java.util.ArrayList;
import java.util.Scanner;

public class Utilitaire {


    public static int saisirIntMinMax(int min, int max) {
        //{ min <= max } => { résultat = entier compris entre min et max ]
        Scanner lecteur = new Scanner(System.in);
        int value = 0;

        do {
            System.out.print("Veuillez rentrez un entier entre " + min + " et " + max + " : ");
            value = lecteur.nextInt();
            if (value < min | value > max) {
                System.out.println("Vous avez rentré une année trop petite ou trop grande, ré-essayer !");
            }
            lecteur.nextLine();
        } while (value < min | value > max);

        return value;

    }


    public static int rechPremIndSeq(ArrayList<Polar> vPolar, int an, String aut) {
        // {vPolar trié dans l'ordre (annee, auteur)} =>
        // {* s'il y a dans vPolar au moins un élément d'année an et d'auteur aut,
        // résultat = indice du premier de ces éléments
        // * sinon, résultat = -1}
        // LA RECHERCHE EST SÉQUENTIELLE !!!
        int i = 0;
        Polar unPolar = new Polar(an, aut, "");

        while (i < vPolar.size() && vPolar.get(i).compareTo(unPolar) < 0) {
            i++;
        }
        if (i < vPolar.size() && vPolar.get(i).compareTo(unPolar) == 0) {
            return i;
        } else {
            return -1;
        }

    }


    public static int rechPremIndDicho(ArrayList<Polar> vPolar, int an, String aut) {
        // {vPolar trié dans l'ordre (annee, auteur)} =>
        // {* s'il y a dans vPolar au moins un élément d'année an et d'auteur aut,
        // résultat = indice du premier de ces éléments
        // * sinon, résultat = -1}
        // LA RECHERCHE EST DICHOTOMIQUE !!!

        int inf = 0;
        int sup = vPolar.size() - 1;
        int milieu;
        Polar unPolar = new Polar(an, aut, "");

        while (inf < sup) {
            milieu = (inf + sup) / 2;

            if (vPolar.get(milieu).compareTo(unPolar) >= 0) {
                sup = milieu;
            } else {
                inf = milieu + 1;
            }
        }


        if (vPolar.get(sup) == unPolar) {
            return sup;
        } else {
            return -1;
        }

    }

    public static boolean existPolar(ArrayList<Polar> vPolar,
                                     int an1, int an2, String unAuteur) {
        // { * vPolar non vide et trié dans l'ordre (annee, auteur)
        // * an1 <= an2
        // * an1 est >= à la plus petite valeur de l'attribut annee dans vPolar
        // * an2 est <= à la plus grande valeur de l'attribut année dans vPolar }
        // => { résultat = vrai s'il existe dans vPolar, au moins un roman
        // dont l'année est comprise entre an1 et an2 et d'auteur unAuteur'}

        int annee = vPolar.get(0).getAnnee();
        int i = 0;

        while (i < vPolar.size() && rechPremIndSeq(vPolar, annee, unAuteur) == -1) {

            i++;
            annee += 1;
        }

        if (i < vPolar.size() && rechPremIndSeq(vPolar, annee, unAuteur) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void lesPolarsDe(ArrayList<Polar> vPolar,
                                   int an1, int an2, String unAuteur) {
        // { * vPolar non vide et trié dans l'ordre (annee, auteur)
        // * an1 <= an2
        // * an1 est >= à la plus petite valeur de l'attribut annee dans vPolar
        // * an2 est <= à la plus grande valeur de l'attribut année dans vPolar }
        // * vPolar contient au moins un roman dont l'auteur est unAuteur
        // et dont l'année est dans l'intervalle [an1, an2} }
        // => { chaque année A comprise entre an1 et an2 est affichée, suivie :
        // * d'un tiret, si aucun roman n'a été écrit l'année A par unAuteur
        // * de l'affichage ligne à ligne des titres des romans écrits par
        // unAuteur, l'année A (chaque titre précédé d'un tiret) }
        int an = an1;
        int an_indice = 0;

        System.out.println("Roman de " + unAuteur + " entre " + an1 + " et " + an2 + " : ");

        if (existPolar(vPolar, an1, an2, unAuteur)){
            while (an <= an2){
                if (rechPremIndSeq(vPolar, an, unAuteur) == -1){
                    System.out.println("*Année " + an + "\n-");

                }
                else {
                    System.out.println("*Année " + an);
                    while (vPolar.get(rechPremIndSeq(vPolar, an, unAuteur) + an_indice).getAuteur().compareTo(unAuteur) == 0){
                        System.out.println("- " + vPolar.get(rechPremIndSeq(vPolar, an, unAuteur) + an_indice).getTitre());
                        an_indice+=1;
                    }
                }

                an +=1;
                an_indice = 0;
                System.out.println("\n");
            }

        }

        else {
            System.out.println("Aucun roman de " + unAuteur + " entre " + an1 + " et " + an2);
        }

    }

    public static void lesPolarsDe2(ArrayList<Polar> vPolar,
                                   int an1, int an2, String unAuteur) {
        // { * vPolar non vide et trié dans l'ordre (annee, auteur)
        // * an1 <= an2
        // * an1 est >= à la plus petite valeur de l'attribut annee dans vPolar
        // * an2 est <= à la plus grande valeur de l'attribut année dans vPolar }
        // * vPolar contient au moins un roman dont l'auteur est unAuteur
        // et dont l'année est dans l'intervalle [an1, an2} }
        // => { chaque année A comprise entre an1 et an2 est affichée, suivie :
        // * d'un tiret, si aucun roman n'a été écrit l'année A par unAuteur
        // * de l'affichage ligne à ligne des titres des romans écrits par
        // unAuteur, l'année A (chaque titre précédé d'un tiret) }

        Polar vPolar2 = new Polar(an2, unAuteur, "");




    }

}

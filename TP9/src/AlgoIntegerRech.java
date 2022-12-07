import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlgoIntegerRech {

    public static PaireResCompteur<Integer> indRechSeqO(ArrayList<Integer> vInt,
                                                        int unInt) {
        //{ vInt non vide, trié }
        // => { à la fin du traitement, ind est l'indice de la 1ère occurrence
        // de unInt dans vInt, ou est égal à -1 si unInt n'est pas dans vInt
        //
        // résultat = variable de type PaireResCompteur avec :
        // - res = ind
        // - compteur = nombre de comparaisons effectuées
        // entre inInt et un élément de vInt
        // RECHERCHE SÉQUENTIELLE }


        int i = 0;
        int c = 1;
        while (i < vInt.size() && vInt.get(i) < unInt) {
            i++;
            c++;
        }

        if (i == vInt.size() && vInt.get(i-1) != unInt) {
            i = -1;
        }

        PaireResCompteur<Integer> resultat = new PaireResCompteur<Integer>(i, c);
        return resultat;
    }


    public static PaireResCompteur<Integer> indRechDichoItO(ArrayList<Integer> vInt,
                                                            int unInt) {
        //{ vInt non vide, trié }
        // => { à la fin du traitement, ind est l'indice de la 1ère occurrence
        // de unInt dans vInt,ou est égal à -1 si unInt n'est pas dans vInt
        //
        // résultat = variable de type PaireResCompteur avec :
        // - res = ind
        // - compteur = nombre de comparaisons effectuées
        // entre inInt et un élément de vInt
        // RECHERCHE DICHOTOMIQUE ITÉRATIVE }

        int c = 0;
        int inf = 0;
        int sup = vInt.size() - 1;
        while (inf < sup) {
            int m = (inf + sup) / 2;
            if (vInt.get(m) >= unInt) {
                sup = m;
            } else {
                inf = m + 1;
            }
            c++;
        }

        PaireResCompteur<Integer> resultat;
        if (vInt.get(inf) == unInt) {
            resultat = new PaireResCompteur<>(inf, c);
        } else {
            resultat = new PaireResCompteur<>(-1, c);
        }
        return resultat;

    }


    public static PaireResCompteur<Integer> indRDichoRecO(ArrayList<Integer> vInt,
                                                          int unInt) {
        //{ vInt non vide, trié }
        // => { à la fin du traitement, ind est l'indice de la 1ère occurrence
        // de unInt dans vInt, ou est égal à -1 si non trouvé
        //
        // résultat = variable de type PaireResCompteur avec :
        // - res = ind
        // - compteur = nombre de comparaisons effectuées
        // entre inInt et un élément de vInt[inf..sup] }

        return indRDichoRecWorkerO(vInt, unInt, 0, vInt.size() - 1);


    }


    public static PaireResCompteur<Integer> indRDichoRecWorkerO(ArrayList<Integer> vInt,
                                                                int unInt, int inf,
                                                                int sup) {
        //{ vInt[inf..sup] non vide, trié }
        // => { à la fin du traitement, ind est l'indice de la 1ère occurrence
        // de unInt dans vInt[inf..sup], ou est égal à -1 si non trouvé
        //
        // résultat = variable de type PaireResCompteur avec :
        // - res = ind
        // - compteur = nombre de comparaisons effectuées
        // entre inInt et un élément de vInt[inf..sup]
        // RECHERCHE DICHOTOMIQUE RÉCURSIVE }

        PaireResCompteur<Integer> resultat;
        int c = 0;

        if (inf == sup) {
            c++;
            if (vInt.get(inf) == unInt) {
                resultat = new PaireResCompteur<>(inf, c);
                return resultat;
            } else {
                resultat = new PaireResCompteur<>(-1, c);
                return resultat;
            }

        }
        else {
            c++;
            int m = (sup + inf) / 2;
            if (vInt.get(m) >= unInt) {
                return indRDichoRecWorkerO(vInt, unInt, inf, m);
            } else {
                return indRDichoRecWorkerO(vInt, unInt, m + 1, sup);
            }
        }
    }


    public static void main(String[] args) {
        int saisie;
        Scanner l = new Scanner(System.in);
        boolean encore = false;
        String cont;
        PaireResCompteur resultat;

        ArrayList<Integer> vInt = new ArrayList<>(Arrays.asList(-45, -45, -10, 9, 20, 30, 75));
        System.out.println("Vecteur initial: " + vInt);
        System.out.println("Nombre d'éléments: " + vInt.size());

        do{
            System.out.print("Veuillez saisir un entier quelconque: ");
            saisie = l.nextInt();
            l.nextLine();

            System.out.println("\n-------\nRECHERCHE SEQUENTIELLE\n-------");
            resultat = indRechSeqO(vInt, saisie);

            if ((int)resultat.getRes() != -1) {
                System.out.println("Votre saisie a été trouvé dans le vecteur à l'indice " + resultat.getRes());
            }
            else {
                System.out.println("Votre saisie n'a pas été trouvé dans le vecteur.");
            }
            System.out.println("La recherche à effectuer " + resultat.getCompteur() + " comparaisons.");



            System.out.println("\n\n-------\nRECHERCHE DICHOTOMIQUE ITERATIVE\n-------");
            resultat = indRechDichoItO(vInt, saisie);

            if ((int)resultat.getRes() != -1) {
                System.out.println("Votre saisie a été trouvé dans le vecteur à l'indice " + resultat.getRes());
            }
            else {
                System.out.println("Votre saisie n'a pas été trouvé dans le vecteur.");
            }
            System.out.println("La recherche à effectuer " + resultat.getCompteur() + " comparaisons.");



            System.out.println("\n\n-------\nRECHERCHE DICHOTOMIQUE RECURSIVE\n-------");
            resultat = indRDichoRecO(vInt, saisie);

            if ((int)resultat.getRes() != -1) {
                System.out.println("Votre saisie a été trouvé dans le vecteur à l'indice " + resultat.getRes());
            }
            else {
                System.out.println("Votre saisie n'a pas été trouvé dans le vecteur.");
            }
            System.out.println("La recherche à effectuer " + resultat.getCompteur() + " comparaisons.");



            System.out.print("Voulez-vous continez ? (o/n) : ");
            cont = l.nextLine();
            if (cont.compareTo("o") == 0) {
                encore = true;
            }
        }while (encore);




    }


}

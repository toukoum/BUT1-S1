import javax.swing.*;
import java.util.Scanner;

public class calculs {
    public static void main(String[] args) {

        int n, p;
        Scanner lecteur = new Scanner(System.in);

        System.out.print("Veuillez entrer la valeur d'un entier positif ou nul : ");
        n = saisieEntPos();

        System.out.print("Veuillez entrer la valeur d'un entier inférieur ou egal : ");
        p = saisieEntPosInfEgal(n);




        System.out.println("---------------\nFactorielle de " + n + " = " + factorielle(n) + "\n---------------");
        System.out.println("Nombre de sous-ensembles de " + n + " éléments parmi " + p + " éléments = " + combinaison(n, p) + "\n---------------");
        System.out.println("Nombre de n-uplets ordonnés de " + n + " éléments parmi " + p + " éléments = " + arrangement(n, p));



        trianglePascal(n);
    }

    private static int saisieEntPos() {
        //{} => {résultat = un entier positif ou nul saisi par l'utilisateur}
        int value;
        Scanner lecteur = new Scanner(System.in);

        do{
            value = lecteur.nextInt();
            lecteur.nextLine();
        }while(value<0);

        return value;
    }

    private static int saisieEntPosInfEgal(int x) {
        //{x > 0} => {résultat = entier compris entre 0 et x,
        // saisi par l'utilisateur}

        int value;
        Scanner lecteur = new Scanner(System.in);

        do {
            value = lecteur.nextInt();
            lecteur.nextLine();
        } while ((value < 0) & (value < x));

        return value;

    }

    private static int factorielle(int val) {
        // {val >= 0} => {résultat = factorielle de n (n!) }
        if (val<0){
            return 0;
        }
        else{
            int value = 1;

            for (int i = 1; i <= val; i++) {
                value *= i;
            }

            return value;
        }

    }


    private static int combinaison(int n, int p) {
        // {n >= 0, 0 <= p <= n}
        // => {résultat = nombre de sous-ensembles de p éléments que
        // l'on peut obtenir à partir d'un ensemble de n éléments
        // formule : n!/(p! * (n-p)!)


        return ((factorielle(n))/(factorielle(p)*(factorielle(n-p))));


    }


    private static int arrangement(int n, int p) {
        // {n >= 0, 0 <= p <= n}
        // => {résultat = nombre de n-uplets ordonnés de p éléments que
        // l'on peut obtenir à partir d'un ensemble de n éléments
        // formule : n!/(n-p!)}


        return ((factorielle(n))/(factorielle(n-p)));

    }


    private static void trianglePascal(int n) {
        // {n >= 0} => {les lignes 0 à n du triangle de Pascal ont été affichées
        // de façon à que sur chaque ligne, les coefficients binomiaux
        // soient séparés par un espace}

        for (int i = 0; i<=n; i++){
            for(int j = 0; j<=n; j++){
                if (factorielle(i-j)==0){
                    System.out.print(' ');
                }
                else{
                    System.out.print(((factorielle(i))/(factorielle(j)*(factorielle(i-j)))) + " ");
                }

            }
            System.out.print("\n");
        }



    }


    }

import java.util.Scanner;
import java.util.ArrayList;


public class Vecteur_de_Integer {

    public static int saisieEntPos() {
        // {} => {résultat = un entier > 0, saisi par l'utilisateur}
        Scanner lecteur = new Scanner(System.in);
        int pos;

        do{
            System.out.print("Veuillez entrez un entier positif : ");
            pos = lecteur.nextInt();
            if (pos <= 0){
                System.out.println("-> Saisie invalide, recommencez...");
            }
            lecteur.nextLine();

        }while(pos<=0);


        return pos;

    }

    public static ArrayList<Integer> lesDiviseurs(int unEnt) {
        //{unEnt > 0} => {résultat = vecteur contenant les diviseurs de unEnt
        // y compris 1 et unEnt}
        ArrayList diviseur_vecteur = new ArrayList<>();

        for (int i=1; i<=unEnt; i++ ){
            if(unEnt%i==0){
                diviseur_vecteur.add(i);

            }
        }
        return diviseur_vecteur;



    }

    public static int getSommeVectEntPos(ArrayList<Integer> unVectEntPos) {
        //{unVectEntPos non vide, tous ses éléments sont > 0}
        // => {résultat = somme des éléments de unVectEntPos}
        int somme = 0;

        for (int i = 0; i<unVectEntPos.size(); i++){
            somme += unVectEntPos.get(i);
        }

        return somme;


    }



    public static boolean nombrePremier(int unEnt) {
        //{unEnt > 0} => {résultat = vrai si unEnt est un nombre premier}

        if (lesDiviseurs(unEnt).size() == 2){
            return true;
        }

        return false;
    }

    public static boolean nombreParfait (int unEnt) {
        //{unEnt > 0} => {résultat = vrai si unEnt est un nombre parfait}

        if(getSommeVectEntPos(lesDiviseurs(unEnt))/2 == unEnt){
            return true;
        }
        return false;

    }

    public static boolean nombreSublime(int unEnt) {
        //{unEnt > 0} => {résultat = vrai si unEnt est un nombre sublime}

        if (nombreParfait(lesDiviseurs(unEnt).size()) & nombreParfait(getSommeVectEntPos(lesDiviseurs(unEnt)))){
            return true;
        }
        return false;

    }






    public static void main(String[] args) {
        int unEnt = saisieEntPos();
        ArrayList<Integer> lesdiv;
        lesdiv = lesDiviseurs(unEnt);

        System.out.println("Les diviseurs de "+ unEnt +" sont : " + lesdiv);
        System.out.println(unEnt + " est : ");
        System.out.println("Premier ? " + nombrePremier(unEnt));
        System.out.println("Parfait ? " + nombreParfait(unEnt));
        System.out.println("Sublime ? " + nombreSublime(unEnt));
        if ( !(nombreSublime(unEnt) || nombrePremier(unEnt) || nombreParfait(unEnt))){
            System.out.println(unEnt + " n'a aucune qualité !");
        }
    }













}

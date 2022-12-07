import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Vecteur_de_String {

    public static void main(String[] args) {
        String couleur;
        Scanner lecteur = new Scanner(System.in);
        Character continuer = 'o';

        ArrayList<String> couleurFR = new ArrayList<>(Arrays.asList("rouge", "orange", "jaune", "bleu", "vert", "indigo", "violet"));
        ArrayList<String> couleurEN = new ArrayList<>(Arrays.asList("red", "orange", "yellow", "blue", "green", "indigo", "purple"));

        System.out.println("Voici les couleur de l'arc en ciel en Français : " + couleurFR);
        System.out.println("Voici les couleur de l'arc en ciel en Anglais : " + couleurEN);

        do {
            System.out.print("Veuillez rentrez une couleur de l'arc en ciel en Français : ");
            couleur = lecteur.next();
            lecteur.nextLine();
            if (getIndice(couleur, couleurFR) == 7){
                System.out.println("Vous n'avez par rentrez une couleur de l'arc en ciel ! Recommencez...");
            }
            else {
                System.out.println("Voici la traductin en anglais : " + couleurEN.get(getIndice(couleur, couleurFR)));
            }
            System.out.print("voulez vous continuer ? (o/n) : ");
            continuer = lecteur.next().charAt(0);
            lecteur.nextLine();
        }while (continuer == 'o');

    }


    public static int getIndice(String ch, ArrayList<String> vString) {
        // {vString non vide, ne contenant que des chaînes différentes}
        // => {résultat = indice de ch dans vString, si ch trouvé,
        // sinon, résultat = vString.size()}

        int i = 0;
        int indice = -1;
        while (i < vString.size() && vString.get(i).compareTo(ch) != 0) {

            i+=1;
        }

        return i;
    }

}

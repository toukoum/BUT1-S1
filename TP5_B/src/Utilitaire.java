import java.util.Scanner;
import java.util.ArrayList;

public class Utilitaire {


    public static float saisieFloat(){
        // {} => { résultat = un float siasi par l'utilisateur dont la valeur est positive ou nul}

        Scanner lecteur = new Scanner(System.in);
        float pos;

        do {
            System.out.println("Veuillez entrez un float positif ou nul : ");
            pos = lecteur.nextFloat();
            lecteur.nextLine();
            if (pos<0){
                System.out.println("Vous avez mal rentrez la valeur, veuillez recommencez...");
            }
        }while (pos<0);

        return pos;
    }


    public static ArrayList<ReleveMensuel> saisieReleves(ArrayList<String> desMois) {
        // { desMois contient des chaînes représentant des mois de l'année }
        // => { résultat = un vecteur de ReleveMensuel
        // Pour chaque élément du vecteur résultat:
        // * mois est l'élément de même indice dans desMois
        // * concentration est un float >= 0 saisi par l'utilisateur }

        ArrayList<ReleveMensuel> les_mois_relevé = new ArrayList<>();

        for (int i = 0; i< desMois.size(); i++){
            les_mois_relevé.add(i, new ReleveMensuel(desMois.get(i),  saisieFloat()));
        }


        return les_mois_relevé;
    }
}

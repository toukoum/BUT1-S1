import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilitaire {


    public static int indString(ArrayList<String> vString, String uneString) {
        // {vString trié} => { résultat = -1 si uneString est déjà dans vString,
        // sinon, résultat = indice où il faudrait
        // placer uneString dans vString (en respect du tri) }

        int i = 0;
        if (vString.isEmpty()){
            return 0;
        }
        else {
            while (i < vString.size() && vString.get(i).compareTo(uneString) < 0){

                i++;

            }

            if (i<vString.size() && vString.get(i).compareTo(uneString) == 0){
                return - 1;
            }
            else {
                return i;
            }

            }

        }
    public static boolean existString(ArrayList<String> vString, String uneString) {
        // { vString trié } => { résultat = vrai si uneString appartient à vString }

        if(indString(vString, uneString) == -1){
            return true;
        }

        else {
            return false;
        }
    }

    public static String saisieCont(ArrayList<String> vCont) {
        // { vCont trié, non vide } =>
        // { résultat = nom d'un élément de vCont
        // saisi par l'utilisateur }
        Scanner lecteur = new Scanner(System.in);
        String continent;

        do {
            System.out.print("Veuillez saisir un continent : ");

            continent = lecteur.nextLine();

        }while (existString(vCont, continent) == false);

        return continent;

        }

    public static ArrayList<Pays> paysDeCont(ArrayList<Pays> vPays, String cont) {
        // { cont est le continent d'au moins un pays de vPays } =>
        // { résultat = vecteur contenant les pays de vPays
        // dont le continent est cont }

        ArrayList<Pays> lespays = new ArrayList<>();

        for (int i = 0; i < vPays.size(); i++){
            if (vPays.get(i).getContinent().compareTo(cont) == 0){
                lespays.add(vPays.get(i));


            }

        }
        return lespays;



    }

    public static int rechPaysT(ArrayList<Pays> vPays, String nomP) {
        // { vPays trié sur le nom } =>
        // { résultat = indice dans vPays du pays de nom nomP s'il existe,
        // vPays.size() si pas de pays de nom nomP dans vPays }

        int i =0;
        while (i<vPays.size() && vPays.get(i).getNom().compareTo(nomP) != 0){
            i+=1;
        }

        if (i<vPays.size() && vPays.get(i).getNom().compareTo(nomP) == 0){
            return i;
        }
        else {
            return vPays.size();
        }

    }

    public static void paysMoinsPeuples(ArrayList<Pays> vMonde) {
        //{ vMonde non vide } =>
        // {les caractéristiques du ou des pays le(s) moins peuplé(s)
        // dans vMonde ont été affichées}
        int i = 1;
        int indice_moins_peuple = 0;

        while(i<vMonde.size()){
            if (vMonde.get(i).getPopulation() < vMonde.get(indice_moins_peuple).getPopulation()){
                indice_moins_peuple = i;
            }
            i++;
        }

        System.out.println("\nVoici les cararactéristiques du pays le moins peuplé du monde : " + vMonde.get(indice_moins_peuple).getNom());
        System.out.println("\n" + vMonde.get(indice_moins_peuple));


    }

    public static void contExtremes(ArrayList<Pays> vMonde,
                                    ArrayList<String> vCont) {
        // { vMonde non vide } =>
        // { le nombre de pays et le nom du ou des continents comptant
        // le plus grand nombre, respectivement le plus petit nombre
        // de pays ont été affichés }
        int max = paysDeCont(vMonde, vCont.get(0)).size();
        int indice_max = 0;

        for (int i = 0; i<vCont.size(); i++){
            if (paysDeCont(vMonde, vCont.get(i)).size() > max){
                max = paysDeCont(vMonde, vCont.get(i)).size();
                indice_max = i;
            }
        }

        System.out.println("\nContinent contenant le plus de pays (" + max + " pays) : ");
        System.out.println(vCont.get(indice_max));


        int min = paysDeCont(vMonde, vCont.get(0)).size();
        int indice_min = 0;

        for (int i = 0; i<vCont.size(); i++){
            if (paysDeCont(vMonde, vCont.get(i)).size() < min){
                min = paysDeCont(vMonde, vCont.get(i)).size();
                indice_min = i;
            }
        }

        System.out.println("\nContinent contenant le moins de pays (" + min + " pays) : ");
        System.out.println(vCont.get(indice_min));



    }








    }

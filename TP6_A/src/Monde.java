import java.util.ArrayList;
import java.util.Scanner;

public class Monde {
    public static void main(String[] args) {

        final ArrayList<Pays> leMonde = InitMonde.creerMonde();
        ArrayList<String> lesContinents = new ArrayList<>();
        String pays;
        int index_pays;
        Scanner lecteur = new Scanner(System.in);


        for(int i = 0; i< leMonde.size(); i++){
            System.out.println(leMonde.get(i).toString());
        }// affichage des caractéristiques de chaque pays

        for(int i = 0; i< leMonde.size(); i++){

            int ipos = Utilitaire.indString(lesContinents, leMonde.get(i).getContinent());
            if (ipos!=-1) {
                lesContinents.add(ipos,leMonde.get(i).getContinent());
            }
            }



        System.out.println(lesContinents + "\n");

        String unCont = Utilitaire.saisieCont(lesContinents);
        ArrayList<Pays> tout_les_pays = new ArrayList<>(Utilitaire.paysDeCont(leMonde, unCont));

        System.out.println("- Premier Pays : " + tout_les_pays.get(0).getNom());
        System.out.println("- Dernier Pays : " + tout_les_pays.get(tout_les_pays.size()-1).getNom());
        System.out.println("- Nombre de Pays : " + tout_les_pays.size());


        System.out.print("\nDonnez le nom d'un pays : ");
        pays = lecteur.nextLine();
        index_pays = Utilitaire.rechPaysT(tout_les_pays, pays);

        if (index_pays < tout_les_pays.size() && index_pays != 0){
            System.out.println("Le pays : " + tout_les_pays.get(index_pays).getNom() + " est bien dans l'" + unCont);
            System.out.println("- Continent : " + tout_les_pays.get(index_pays).getContinent());
            System.out.println("- Population : " + tout_les_pays.get(index_pays).getPopulation());
            System.out.println("- Superficie : " + tout_les_pays.get(index_pays).getSuperficie());
        }
        else{
            System.out.println("Ce pays n'existe pas dans le continent " + unCont);
        }



        Utilitaire.paysMoinsPeuples(leMonde);
        Utilitaire.contExtremes(leMonde, lesContinents);


    }
}

import java.util.Scanner;

public class meteo {
    public static void main(String[] args) {
        boolean pluie, parapluie, tongs, chapeau, bonEquipement;

        Scanner lecteur = new Scanner(System.in);

        System.out.print("Pluie ? : ");
        pluie = lecteur.nextBoolean();
        lecteur.nextLine();

        System.out.print("Parapluie ? : ");
        parapluie = lecteur.nextBoolean();
        lecteur.nextLine() ;

        System.out.print("Tongs ? : ");
        tongs = lecteur.nextBoolean();
        lecteur.nextLine();

        System.out.print("Chapeau ? : ");
        chapeau = lecteur.nextBoolean() ;
        lecteur.nextLine();


        if( !pluie){
            bonEquipement = false;
        }
        else if ((parapluie | chapeau) & !tongs){
            bonEquipement = true;
        }
        else{
            bonEquipement = false;
        }

        if (bonEquipement){
            System.out.println("Vous êtes bien équipé !");
        }
        else{
            System.out.println("Vous n'êtes pas bien équipé !");
        }

    }
}

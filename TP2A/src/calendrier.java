import java.util.Scanner;

public class calendrier {
    public static void main(String[] args) {
        int uneAnnee, nbJours ;
        boolean bissextile;

        Scanner lecteur = new Scanner(System.in);

        System.out.print("Entrez une année : ");
        uneAnnee = lecteur.nextInt();
        lecteur.nextLine();

        if (uneAnnee%100 == 0){
            if ((uneAnnee/100)%4==0) {
                bissextile = true;
            }
            else {
                bissextile = false;
            }
        }
        else if (uneAnnee%4==0){
            bissextile = true;
        }
        else {
            bissextile = false;
        }

        if (bissextile){
            System.out.println("Cette année est bissextile et comporte 365 jours");
        }
        else{
            System.out.println("Cette année n'est pas bissextile et comporte 366 jours");
        }

    }
}

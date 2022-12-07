import java.util.Scanner;

public class compétition {
    public static void main(String[] args) {
        float temps;
        float moy = 0;
        float min = 20.0f;
        float max = 0.0f;
        float tempsMAX = 20.0f;
        int nbJuges;

        Scanner lecteur = new Scanner(System.in);

        System.out.print("Entrez le nombre de Juges : ");
        nbJuges = lecteur.nextInt();
        lecteur.nextLine();

        for (int i = 1; i<=nbJuges; i++){
            do {
                System.out.print("Temps estimé par le juge N°" + i + " : ");
                temps = lecteur.nextFloat();
                lecteur.nextLine();

            }while (temps < 0 | temps > tempsMAX);

            moy += temps;
            if (temps < min ){
                min = temps;
            }
            if (temps > max) {
                max = temps;
            }

        }

        moy /= nbJuges;
        System.out.println("Voici le récap du concours : \n - Temps max = " + max +"\n - Temps min = "+ min + "\n - Moyenne des temps = " + moy);
    }
}

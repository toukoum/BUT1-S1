import java.util.Scanner;

public class localisation {
    public static void main(String[] args) {
        int x, y;
        String position = "centre";
        char continu = 'o';

        Scanner lecteur = new Scanner(System.in);



        do {

            System.out.print("Entrez une loc pour x : ");
            x = lecteur.nextInt();
            lecteur.nextLine();

            System.out.print("Entrez une loc pour y : ");
            y = lecteur.nextInt();
            lecteur.nextLine();


            if (x>0){
                if (y>0){
                    position = "nord-est";
                }
                else if (y==0){
                    position = "est";
                }
                else{
                    position = "sud-est";
                }
            }
            else if (x<0){
                if (y>0){
                    position = "nord-ouest";
                }
                else if (y==0){
                    position = "ouest";
                }
                else{
                    position = "sud-ouest";
                }
            }
            else if (x == 0){
                if (y>0){
                    position = "nord";
                }
                else if (y<0){
                    position = "sud";
                }
            }

            System.out.println("Votre position est la suivante : " + position);

            System.out.print("Voulez-vous continuez à jouer ? (o/n) : ");
            continu = lecteur.next().charAt(0);
            lecteur.nextLine();

        } while (continu == 'o');






    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class TestPays {

    public static void main(String[] args) {
        ArrayList<Pays> leMonde = InitMonde.creerMonde();


        PaysUtilitaire.triBullesA(leMonde);


        /*for (int i = 0; i < 10; i++) {
            System.out.println(leMonde.get(i).toString());
        }

        System.out.println(PaysUtilitaire.verifTri(leMonde));
        System.out.println(PaysUtilitaire.rechSeq(leMonde, "Europe", "France"));
        System.out.println(PaysUtilitaire.rechDicho(leMonde, "Europe", "France"));


        ListeChaineeBis<Pays> listeMonde = PaysUtilitaire.creeListePays(leMonde);

        Pays paysTest = new Pays("France", "Europe", 66992699, 551695);
        Pays paysTest2 = new Pays("sfsd", "sfs", 0, 0);

        listeMonde.afficheGaucheDroiteRec();
        System.out.println(listeMonde.getLongueur());
        System.out.println(listeMonde.posVal(paysTest));
        System.out.println(listeMonde.existeVal(paysTest2));*/

        Scanner lecteur = new Scanner(System.in);
        System.out.println(ListeChaineeBis.getEntierDansIntervalle(lecteur, 0, 10));
        }

}

import java.util.ArrayList;

public class Monde {
    public static void main(String[] args) {


        ArrayList<Pays> leMonde = InitMonde.creerMonde();

        Utilitaire.TriBulle(leMonde);

        int i = 0;
        while (i < leMonde.size()) {
            System.out.println(leMonde.get(i).toString());
            i++;
        }

        System.out.println("\n" + Utilitaire.verifTri(leMonde));

        System.out.println(Utilitaire.rechDichoIter(leMonde, "Afrique", "Benin"));
        System.out.println(Utilitaire.rechDichoRec(leMonde, "Afrique", "Benin"));

        System.out.println(Utilitaire.plusGrandPaysIter(leMonde));

        System.out.println(Utilitaire.plusGrandPaysDPR(leMonde));


    }
}
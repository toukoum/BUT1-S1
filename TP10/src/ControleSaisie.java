import java.util.Scanner;

public class ControleSaisie {

    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);

        Utilitaire.getInt(lecteur);
        Utilitaire.getFloat(lecteur);

        int i = Utilitaire.getIntV2(lecteur);
        float f = Utilitaire.getFloatV2(lecteur);
    }
}

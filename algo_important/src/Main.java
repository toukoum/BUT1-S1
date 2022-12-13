import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(2, 4, 5, 32, 7, 3, 5, 34, 2, 9));
        System.out.println(RechercheItt(liste, 7));

    }

    public static int RechercheItt(ArrayList<Integer> liste, int valeur) {

        int i = 0;

        while (i < liste.size() && liste.get(i) != valeur) {
            i++;
        }

        if (i < liste.size() && liste.get(i) == valeur) {
            return i;
        }
        else{
            return 0;
        }
    }
}

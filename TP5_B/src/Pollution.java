import java.util.ArrayList;
import java.util.Arrays;

public class Pollution {
    public static void main(String[] args) {
        ArrayList<String> lesMois = new ArrayList<>(Arrays.asList("janvier","février","mars","avril","mai","juin","juillet","août",
                "septembre","octobre","novembre", "décembre"));

        ArrayList<ReleveMensuel> testReleve = new ArrayList<>();
        for (int i = 0; i<lesMois.size(); i++){
            testReleve.add(i, new ReleveMensuel(lesMois.get(i), 0));
        }

        testReleve.add(0, new ReleveMensuel(lesMois.get(0), 20));
        testReleve.add(2, new ReleveMensuel(lesMois.get(2), 40));
        testReleve.add(1, new ReleveMensuel(lesMois.get(1), 45));
        System.out.println(testReleve);

        System.out.println(Utilitaire.saisieReleves(lesMois));





    }
}

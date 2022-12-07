public class Explore_Strings {

    private static int nbOccCar(String uneChaine, char unCar) {
        //{} => {résultat = nombre de fois où le caractère unCar
        // apparaît dans la chaîne uneChaine}

        int compteur = 0;

        for(int i = 0; i<uneChaine.length(); i++){
            if (unCar == uneChaine.charAt(i)){
                compteur += 1;
            }
        }

        return compteur;

    }

    private static int nbLettresMajSansAccent(String uneChaine) {
        // {} => {résultat = nombre de lettres majuscules
        // non accentuées dans la chaîne uneChaine}

        int compteur = (int) uneChaine.chars().filter(Character::isUpperCase).count();

        return compteur;



    }

    private static int nbMots(String uneChaine) {
        // {uneChaine ne contient que :
        // * des lettres de l'alphabet (accentuées ou non)
        // * des espaces
        // * un point final}
        // => {résultat = nombre de mots dans uneChaine
        // Note: un mot est constitué de lettres de l 'alphabet}

        String[] words = uneChaine.split("\\s+");
        return words.length;

    }

    private static String longPlusLongsMots(String uneChaine) {
        // {uneChaine ne contient que :
        // * des lettres de l'alphabet (accentuées ou non)
        // * des espaces
        // * un point final}
        // => {résultat = nombre de lettres maximal des mots de uneChaine
        //Note : un mot est constitué de lettres de l'alphabet}

        String gdmot = "";
        String[] words = uneChaine.split("\\s+");

        for (int i = 0; i<words.length; i ++){
            if (words[i].length() > gdmot.length() ){
                gdmot = words[i];
            }
        }

        return gdmot;
    }

    public static void main(String[] args) {

        String lipogramme = "Un rond pas tout à fait clos, fini par un trait horizontal";
        String lesVoyellesSansAccent = "aeiouy";
        String ch1 = "il y a huit mots dans cette phrase.";
        String ch2 = "Il était une fois un petit bonhomme de Foix.";

        for (int i = 0; i<lesVoyellesSansAccent.length(); i++){
            System.out.println("Le caratère : " + lesVoyellesSansAccent.charAt(i) + " apparaît : " + nbOccCar(lipogramme, lesVoyellesSansAccent.charAt(i)) + " fois.");
        }

        System.out.println(nbMots(ch1));

        System.out.println(nbLettresMajSansAccent(ch2));

        System.out.println(longPlusLongsMots(ch2));

    }
}

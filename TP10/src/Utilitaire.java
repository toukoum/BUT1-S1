import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilitaire {

    public static int getInt(Scanner lecteur) {
        // {} => {résultat = un entier saisi par l'utilisateur, SAISIE CONTRÔLÉE }

        int val;
        try {
            System.out.print("Veuillez saisir un entier : ");
            val = lecteur.nextInt();
            lecteur.nextLine();
            return val;
        } catch (InputMismatchException e) {
            lecteur.nextLine();
            System.out.println("Vous n'avez pas saisie un entier, veuillez recommencez.");
            return getInt(lecteur);
        }

    }

    public static Float getFloat(Scanner lecteur) {
        // {} => {résultat = un réel saisi par l'utilisateur, SAISIE CONTRÔLÉE }

        Float val;
        try {
            System.out.print("Veuillez saisir un Float : ");
            val = lecteur.nextFloat();
            lecteur.nextLine();
            return val;
        } catch (InputMismatchException e) {
            lecteur.nextLine();
            System.out.println("Vous n'avez pas saisie un Float, veuillez recommencez.");
            return getFloat(lecteur);
        }
    }


    public static int getIntV2(Scanner lecteur) {
        // {} => {résultat = un entier saisi par l'utilisateur, SAISIE CONTRÔLÉE }


        try {
            String val;
            System.out.print("Veuillez saisir un entier : ");
            val = lecteur.nextLine();
            return Integer.parseInt(val);

        } catch (NumberFormatException nfe) {
            System.out.println("Vous n'avez pas saisie un entier, veuillez recommencez.");
            return getIntV2(lecteur);

        }
    }


    public static float getFloatV2(Scanner lecteur) {
        // {} => {résultat = un entier saisi par l'utilisateur, SAISIE CONTRÔLÉE }


        try {
            String val;
            System.out.print("Veuillez saisir un réel : ");
            val = lecteur.nextLine();
            return Float.parseFloat(val);

        } catch (NumberFormatException nfe) {
            System.out.println("Vous n'avez pas saisie un entier, veuillez recommencez.");
            return getFloatV2(lecteur);

        }
    }


    //    public static int sommeListeInt(ListeChainee<Integer> liste) throws ExceptionMauvaisIndice {
//        //{liste non vide} => {résultat = somme des éléments de liste
//
//        int somme = 0;
//        int i = 1;
//        while (i <= liste.getLongueur()) {
//            somme += liste.getInfoAtPosit(i);
//            i++;
//        }
//
//        return somme;
//
//
//    }
    public static int sommeListeInt(ListeChainee<Integer> liste) {
        //{liste non vide} => {résultat = somme des éléments de liste

        Cellule<Integer> c = liste.getTete();
        int somme = 0;
        while (c != null) {
            somme += c.getInfo();
            c = c.getCelluleSuivante();
        }

        return somme;


    }


    public static int sommeListeIntRec(ListeChainee<Integer> liste) {
        //{liste non vide} => {résultat = somme des éléments de liste }

        return sommeListeIntRecWorker(liste.getTete());
    }

    private static int sommeListeIntRecWorker(Cellule<Integer> cellCour) {
        //{ } => {résultat = somme des éléments de la liste de tête cellCour
        //
        int somme = 0;
        if (cellCour != null) {
            somme += cellCour.getInfo() + sommeListeIntRecWorker(cellCour.getCelluleSuivante());
        }

        return somme;
    }


    public static boolean rechValListe(ListeChainee<Integer> liste, int val) {
        //{} => {résultat = vrai si au moins un élément de liste porte l'info val}

        return rechValListeWorker(liste.getTete(), val);
    }

    private static boolean rechValListeWorker(Cellule<Integer> cellCour, int val) {
        //{} => {résultat = vrai si au moins une valeur de la liste de tête cellCour
        // porte l'info val
        // ALGORITHME RÉCURSIF}

        if (cellCour != null) {
            if (cellCour.getInfo() == val) {
                return true;
            } else {
                return rechValListeWorker(cellCour.getCelluleSuivante(), val);
            }
        } else {
            return false;
        }

    }


//    public static int premPosVal(ListeChainee<Integer> liste, int val) throws ExceptionMauvaisIndice {
//        //{liste non vide} => {résultat = position de la première cellule de liste
//        // portant l'info val, 0 si non trouvée
//        // ALGORITHME ITÉRATIF}
//
//        int i = 1;
//
//        while (i <= liste.getLongueur() && liste.getInfoAtPosit(i) != val) {
//            i++;
//        }
//
//        if (i <= liste.getLongueur() && liste.getInfoAtPosit(i) == val) {
//            return i;
//        } else {
//            return 0;
//        }
//    }

    public static int premPosVal(ListeChainee<Integer> liste, int val) {
        //{liste non vide} => {résultat = position de la première cellule de liste
        // portant l'info val, 0 si non trouvée
        // ALGORITHME ITÉRATIF}

        Cellule<Integer> c = liste.getTete();
        int i = 1;

        while (c != null && c.getInfo() != val) {
            c = c.getCelluleSuivante();
            i++;
        }

        if (c != null && c.getInfo() == val) {
            return i;
        } else {
            return 0;
        }
    }


//    public static void insereDansListeTriee(ListeChainee<Integer> liste, int val) throws ExceptionMauvaisIndice {
//        //{liste triée} => {une cellule d'info = val a été insérée dans liste,
//        // liste reste triée après insertion - FORME ITÉRATIVE}
//
//        int i = 1;
//
//        while (i <= liste.getLongueur() && liste.getInfoAtPosit(i) <= val) {
//            i++;
//        }
//        liste.insereAtPosit(i, val);
//    }

    public static void insereDansListeTriee(ListeChainee<Integer> liste, int val) {
        //{liste triée} => {une cellule d'info = val a été insérée dans liste,
        // liste reste triée après insertion - FORME ITÉRATIVE}

        Cellule<Integer> c = liste.getTete();
        Cellule<Integer> p = null;


        while (c != null && c.getInfo() < val) {
            //System.out.printf("info"+ c.getInfo());
            p = c;
            //System.out.println("c:"+c);
            c = c.getCelluleSuivante();
        }

        if (p == null) {
            liste.insereTete(val);
        } else {
            Cellule<Integer> n = new Cellule<>(val);
            //n.setCelluleSuivante(p.getCelluleSuivante());
            p.setCelluleSuivante(n);
            n.setCelluleSuivante(c);

        }


    }




/*    public static boolean verifTri(ListeChainee<Integer> liste) throws ExceptionMauvaisIndice {
        //{} => {résultat = vrai si liste est triée
        // ALGORITHME ITÉRATIF}

        int i = 2;

        while (i <= liste.getLongueur() && liste.getInfoAtPosit(i - 1) <= liste.getInfoAtPosit(i)) {
            i++;
        }

        return (i == liste.getLongueur()+1);
    }*/

    public static boolean verifTri(ListeChainee<Integer> liste) {
        //{} => {résultat = vrai si liste est triée
        // ALGORITHME ITÉRATIF}


        Cellule<Integer> c = liste.getTete();
        Cellule<Integer> s = c.getCelluleSuivante();


        while (s != null && c.getInfo() <= s.getInfo()) {
            c = s;
            s = s.getCelluleSuivante();
        }

        return (s == null);


    }


}

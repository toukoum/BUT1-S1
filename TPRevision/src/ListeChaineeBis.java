public class ListeChaineeBis <TypeInfo extends Comparable<TypeInfo>>  implements ListeInterface<TypeInfo> {
    private Cellule<TypeInfo> tete;
    private int nbCellules;
    /**
     * Constructeur d'une liste vide
     */
    public ListeChaineeBis() {
        tete = null;
        nbCellules = 0;
    }
    // cellule de tête
    public Cellule<TypeInfo> getTete() {
        return tete;
    }
    /* ------------------------------------------------------------------------------------------
        MÉTHODES OBLIGATOIRES POUR IMPLÉMENTER ListeInterface
        précédées de @Override

        VERSIONS ITÉRATIVES DANS CETTE VERSION DE L'IMPLÉMENTATION
        ----------------------------------------------------------------------------------------*/
    // test liste vide ou non
    @Override
    public boolean estVide() {
        return nbCellules == 0;
    }
    // suppression de toutes les cellules, tête comprise (hara-kiri)
    @ Override
    public void vide() {
        tete = null;
        nbCellules = 0;
    }
    // nombre de cellules (longueur de la liste)
    @Override
    public int getLongueur() {
        return nbCellules;
    }
    // insertion d'une cellule en tête de liste
    @Override
    public void  insereTete(TypeInfo uneInfo) {
        tete = new Cellule<TypeInfo> (uneInfo, tete);
        nbCellules++;
    }
    // suppression de la tête de liste
    @Override
    public void supprimeTete() {
        if (nbCellules != 0) {
            tete = tete.getCelluleSuivante();
            nbCellules--;
        }
    }
    // insertion d'une cellule à une position donnée
    @Override
    public boolean insereAtPosit(int position, TypeInfo nouvelleInfo) {
        if (position == 1) {
            insereTete(nouvelleInfo);
            return true;
        } else if (position <= nbCellules) {
            Cellule<TypeInfo> cellCour = tete;
            int pos = 1;
            while (pos < position -1) {
                cellCour = cellCour.getCelluleSuivante();
                pos++;
            } // pos = position-1
            Cellule<TypeInfo> newCell = new Cellule(nouvelleInfo, cellCour.getCelluleSuivante());
            cellCour.setCelluleSuivante(newCell);
            nbCellules++;
            return true;
        } else {
            return false;
        }
    }
    // suppression d'une cellule ayant une position donnée
    @Override
    public boolean supprimeAtPosit(int position) {
        if (position >= 1 & position <= nbCellules) {
            Cellule<TypeInfo> cellCour = tete;
            if (position == 1) {
                supprimeTete();
            } else {
                int pos = 1;
                while (pos < position - 1) {
                    cellCour = cellCour.getCelluleSuivante();
                    pos++;
                } // pos = position -1
                if (cellCour.getCelluleSuivante() != null) {
                    // chaîner la cellule en position pos à celle en position intialement pos+1
                    cellCour.setCelluleSuivante(cellCour.getCelluleSuivante().getCelluleSuivante());
                } else {
                    cellCour.setCelluleSuivante(null);
                }
                nbCellules--;
            }
            return true;
        } // else : liste vide
        return false;
    }
    // information portée par une cellule ayant une position donnée
    // ATTENTION : OBLIGATION DE PROPAGER L'EXCEPTION ExceptionMauvaisIndice
    //                     dans le cas où position est invalide (< 1 ou > à nbCellules)
    @Override
    public TypeInfo getInfoAtPosit(int position) throws ExceptionMauvaisIndice {
        if (position < 1 | position > nbCellules) {
            throw new ExceptionMauvaisIndice("Position " + position + "invalide !");
        } else {
            Cellule<TypeInfo> cellCour = tete;
            int pos = 1;
            while (pos < position) {
                cellCour = cellCour.getCelluleSuivante();
                pos++;
            } // pos = position
            return cellCour.getInfo();
        }
    }
    // remplacement de l'info portée par une cellule ayant une position donnée
    @Override
    public boolean setInfoAtPosit(int position, TypeInfo nouvelleInfo) {
        if (position >= 1 & position <= nbCellules) {
            Cellule<TypeInfo> cellCour = tete;
            int pos = 1;
            while (pos < position) {
                cellCour = cellCour.getCelluleSuivante();
                pos++;
            } // pos = position
            cellCour.setInfo(nouvelleInfo);
            return true;
        } else {
            return false;
        }
    }
    /* ------------------------------------------------------------------------------------------
        MÉTHODES UTILES POUR L'UTILISATEUR, NON REQUISES PAR
        L'IMPLÉMENTATION DE ListeInterface

        VERSIONS RÉCURSIVES ADAPTÉES DE CELLES DE ListeChainee
    -------------------------------------------------------------------------------------------*/
    // affichage des informations portées par les cellules de cetteListe :
    // de la cellule de tête à la dernière cellule (affichage GD)
    private void afficheGaucheDroiteRecWorker(Cellule<TypeInfo> celluleCourante) {
        if (celluleCourante != null) {
            System.out.print(celluleCourante.getInfo() + " -> ");
            afficheGaucheDroiteRecWorker(celluleCourante.getCelluleSuivante());
        }
    }
    public void afficheGaucheDroiteRec() {
        afficheGaucheDroiteRecWorker(tete);
        System.out.println();
    }
    //--------------------------------------------------------------------
    // affichage des informations portées par les cellules de cetteListe :
    // de la dernière cellule à la cellule de tête (affichage DG)
    private void afficheDroiteGaucheRecWorker(Cellule<TypeInfo> celluleCourante) {
        if (celluleCourante != null) {
            afficheDroiteGaucheRecWorker(celluleCourante.getCelluleSuivante());
            System.out.print(" <- " + celluleCourante.getInfo() );
        }
    }
    public void afficheDroiteGaucheRec() {
        afficheDroiteGaucheRecWorker(tete);
        System.out.println();
    }

    /* ------------------------------------------------------------------------------------------
        AUTRES MÉTHODES qui pourraient être intéressantes...
        VERSIONS ITÉRATIVES
        ---------------------------------------------------------------------------------------*/
    // ajout d'une cellule en fin de liste
    public void insereFin(TypeInfo uneInfo) {
        if (nbCellules == 0) {
            insereTete(uneInfo);
        } else {
            Cellule<TypeInfo> cellCour = tete;
            Cellule<TypeInfo> newCell = new Cellule(uneInfo, null);
            int pos = 1;
            while (pos < nbCellules) {
                cellCour = cellCour.getCelluleSuivante();
                pos++;
            } // pos = nbCellules, cellCour.getCelluleSuiante == null;
            cellCour.setCelluleSuivante(newCell);
            nbCellules++;
        }
    }
    // suppression de la cellule de fin
    public void supprimeFin() {
        if (nbCellules > 0) {
            if (nbCellules == 1) {
                supprimeTete();
            } else {
                Cellule<TypeInfo> cellCour = tete;
                int pos = 1;
                while (pos < nbCellules-1) {
                    cellCour = cellCour.getCelluleSuivante();
                    pos++;
                } // pos = nbCellules-1 (position de l'avant-dernière cellule)
                cellCour.setCelluleSuivante(null);
                nbCellules--;
            }
        }
    }
    /*------------------------------------------------------------------------------------------
        MÉTHODES UTILISABLES DANS LE CAS OÙ cetteliste est triée (ordre croissant)
        À COMPLÉTER EN TP RÉVISIONS...
     ------------------------------------------------------------------------------------------*/
    // Existence d'une valeur dans cette Liste triée
    public boolean existeVal(TypeInfo val) {
        // { cette Liste triée } =>
        //      {résultat = vrai s'il existe dans cette Liste
        //                      une cellule dont l'attribut info est égal à val }

       return true; // À REMPLACER PAR LE CODE ADÉQUAT
    }
    // Position de la 1ère occurrence d'une valeur dans cetteListe triée
    public int posVal(TypeInfo val) {
        // { cette Liste triée } =>
        //      {résultat = * position de la 1ère cellule de cette Liste dont
        //                       l'attribut info est égal à val
        //                     * 0 si aucune cellule de cette Liste a un attribut info égal à val }

        return 0; // À REMPLACER PAR LE CODE ADÉQUAT
    }
    // Insertion d'une valeur dans cette Liste triée, le tri doit être respecté
    public void insereVal(TypeInfo val) {
        // { cette Liste triée } =>
        //      { une nouvelle cellule dont l'attribut info a été insérée dans cette Liste
        //        le tri es respecté après l'insertion }

        System.out.println("COUCOU"); // À REMPLACER PAR LE CODE ADÉQUAT
    }
}

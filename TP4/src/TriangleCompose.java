public class TriangleCompose {

    private Point A;
    private Point B;
    private Point C;


    public TriangleCompose(Point A, Point B, Point C){

        this.A = new Point(A.getX(), A.getY());
        this.B = new Point(B.getX(), B.getY());
        this.C = new Point(C.getX(), C.getY());
    }


    public Point getA() {
        return A;
    }


    public Point getB() {
        return B;
    }


    public Point getC() {
        return C;
    }

    public double coteAB() {
        // résultat = longueur du côté d'extrémités A et B}

        double diffx2 = Math.pow((B.getX() - A.getX()), 2);
        double diffy2 = Math.pow((B.getY() - A.getY()), 2);

        return Math.sqrt(diffx2 + diffy2);
    }

    public double coteBC() {
        // résultat = longueur du côté d'extrémités C et B}

        double diffx2 = Math.pow((C.getX() - B.getX()), 2);
        double diffy2 = Math.pow((C.getY() - B.getY()), 2);

        return Math.sqrt(diffx2 + diffy2);
    }

    public double coteAC() {
        // résultat = longueur du côté d'extrémités A et C}

        double diffx2 = Math.pow((C.getX() - A.getX()), 2);
        double diffy2 = Math.pow((C.getY() - A.getY()), 2);

        return Math.sqrt(diffx2 + diffy2);
    }


    public double perimetre() {
        //{} => {résultat = périmètre du triangle}
        return (coteAB() + coteAC() + coteBC());

    }


    public double surface() {
        //{} => {résultat = surface du triangle}

        double p = (perimetre()/2);

        return (Math.sqrt(p*(p-coteAB())*(p-coteBC())*(p-coteAC())));

    }


    public void deplacer(int dx, int dy) {
        // {} => {A, B et C ont été déplacés horizontalement de dx
        // et verticalement de dy}

        getA().deplace(dx, dy);
        getB().deplace(dx, dy);
        getC().deplace(dx, dy);

    }







}

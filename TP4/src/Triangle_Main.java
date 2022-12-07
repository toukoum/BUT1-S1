import java.util.Scanner;

public class Triangle_Main {

    public static void main(String[] args) {

        Point A = new Point(4, -3);
        Point B = new Point(6, 1);
        Point C = new Point(8, -3);
        int dx, dy;
        Scanner lecteur = new Scanner(System.in);


        System.out.println("A : " + A.toString());
        System.out.println("B : " + B.toString());
        System.out.println("C : " + C.toString());




        dx = lecteur.nextInt();
        lecteur.nextLine();
        dy = lecteur.nextInt();
        lecteur.nextLine();

        TriangleCompose tcomp = new TriangleCompose(A, B, C);


        tcomp.deplacer(dx, dy);
        TriangleUtilitaire.afficherTriangleCompose(tcomp);


        TriangleAgrege tAgrege = new TriangleAgrege(A, B, C);
        tAgrege.deplacer(dx, dy);
        TriangleUtilitaire.afficherTriangleAgrege(tAgrege);







        System.out.println("A : " + tAgrege.getA());
        System.out.println("B : " + tAgrege.getB());
        System.out.println("C : " + tAgrege.getC());


        System.out.println("\n\nA : " + tcomp.getA());
        System.out.println("B : " + tcomp.getB());
        System.out.println("C : " + tcomp.getC());






    }


}

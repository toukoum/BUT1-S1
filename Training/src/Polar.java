public class Polar {

    private int an;
    private String aut;
    private String name;


    public Polar(int an, String aut, String name){
        this.an = an;
        this.aut = aut;
        this.name = name;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getAut() {
        return aut;
    }

    public void setAut(String aut) {
        this.aut = aut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/*public int compareTo(Polar o){

        if (o.an > this.an || (o.an == this.an & o.aut.compareTo(this.aut) == 0)){
            return 1;
        }
        else if (o.an == this.an && o.aut.compareTo(this.aut) == 0){
            return 0;
        }
        else {
            return -1;
        }

    }*/

    public int compareTo(Polar o) {
        // À compléter (cf. ordre (ANNEE, AUTEUR) défini dans le sujet
        if (o.an != this.an){
            if (this.an < o.an){
                return -1;
            } else if (this.an > o.an) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            return (o.aut.compareTo(this.aut));
        }


    }


    @Override
    public String toString() {
        return "Polar{" +
                "an=" + an +
                ", aut='" + aut + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Triangle {
    private float cote1;
    private float cote2;
    private float cote3;

    public Triangle(float cote1, float cote2, float cote3){
        this.cote1 = cote1;
        this.cote2 = cote2;
        this.cote3 = cote3;

    }

    public float getCote1() {
        return cote1;
    }

    public float getCote2() {
        return cote2;
    }

    public float getCote3() {
        return cote3;
    }

    public float getPerimetre(){
        return (cote1 + cote3 + cote2);
    }

    public float getSurface(){
        float p =  (getPerimetre()/2);
        float s = (float)Math.sqrt(p*(p-cote1)*(p-cote2)*(p-cote3));

        return s;

    }

    public String getNature(){
        // retourne la Nature du Triangle

        if ((cote3 == cote1) & (cote2 == cote3) & (cote2 == cote1)){
            return ("équilatéral");

        }

        else if (((cote1) == (cote2)) | ((cote1) == (cote3)) | ((cote3) == (cote2))){
            if (((cote1)*(cote1) + (cote2)*(cote2) == (cote3)*(cote3)) | ((cote1)*(cote1) == (cote2)*(cote2) + (cote3)*(cote3)) | ((cote1)*(cote1) +  (cote3)*(cote3) == (cote2)*(cote2))){
                return ("rectangle");
            }
            else{
                return ("isocèle");
            }
        }

        else if (((cote1)*(cote1) + (cote2)*(cote2) == (cote3)*(cote3)) | ((cote1)*(cote1) == (cote2)*(cote2) + (cote3)*(cote3)) | ((cote1)*(cote1) +  (cote3)*(cote3) == (cote2)*(cote2))){
            return ("rectangle");
        }

        else {
            return ("Triangle quelconque !");
        }
    }
}

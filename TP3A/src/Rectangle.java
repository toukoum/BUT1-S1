public class Rectangle {
    private float cote1;
    private float cote2;

    public Rectangle (float cote1, float cote2){
        this.cote1 = cote1;
        this.cote2 = cote2;
    }

    public float getCote1() {
        return cote1;
    }

    public float getCote2() {
        return cote2;
    }

    public float getPerimetre(){
        return (cote1*2 + cote2*2);
    }

    public float getSurface(){
        return (cote1 * cote2);
    }
}

public class ReleveMensuel {
    String mois;
    float concentrentration;

    public ReleveMensuel(String mois, float concentrentration){
        this.mois = mois;
        this.concentrentration = concentrentration;

    }

    public String getMois() {
        return mois;
    }

    public float getConcentrentration() {
        return concentrentration;
    }

    public String toString(){
        return mois + " : " + concentrentration;
    }
}

package Praktikum;

/**
 *
 * @author Zulvikar Harist
 */
public class Segitiga<AL,TG>{

    private AL alas;
    private TG tinggi;

    public Segitiga(AL alas, TG tinggi){
        setAlas(alas);
        setTinggi(tinggi);
    }

    public AL getAlas() {
        return alas;
    }

    public void setAlas(AL alas) {
        this.alas = alas;
    }

    public TG getTinggi() {
        return tinggi;
    }

    public void setTinggi(TG tinggi) {
        this.tinggi = tinggi;
    }

    public int getResultAsInt(){
        return 1 * (int)getAlas() * (int)getTinggi() / 2;
    }

    public double getResultAsDouble(){
        return 0.5 * (double)getAlas() * (double)getTinggi();
    }
}

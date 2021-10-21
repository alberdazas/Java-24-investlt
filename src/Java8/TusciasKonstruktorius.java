package Java8;

public class TusciasKonstruktorius {
    private String reiksme;

    public TusciasKonstruktorius(String reiksme) {
        this.reiksme = reiksme;
    }

    public TusciasKonstruktorius() {

    }

    public TusciasKonstruktorius(int a) {

    }
    public  TusciasKonstruktorius(String reiksme, int a) {

    }

    public String getReiksme() {
        return reiksme;
    }

    public void setReiksme(String reiksme) {
        this.reiksme = reiksme;
    }
}

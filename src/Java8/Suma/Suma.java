package Java8.Suma;

public class Suma {
    private int pirmasSkaicius;
    private int antrasSkaicius;

    public Suma() {

    }

    public Suma(int pirmasSkaicius, int antrasSkaicius) {
        this.pirmasSkaicius = pirmasSkaicius;
        this.antrasSkaicius = antrasSkaicius;
    }

    public String toString() {
//        return "Suma = " + (pirmasSkaicius + antrasSkaicius);
//        return "Suma = " + pirmasSkaicius + antrasSkaicius;
                return "Suma = " + suma();
    }

    private int suma() {
        return pirmasSkaicius + antrasSkaicius;
    }

}

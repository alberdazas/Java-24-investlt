package Java9.Zmogus;

public class Studentas extends Zmogus {
    private int kursas;
    private String studijuKryptis;

    public Studentas(String vardas, String pavarde, int amzius,
                     int kursas, String studijuKryptis) {
        super(vardas, pavarde, amzius);
        this.kursas = kursas;
        this.studijuKryptis = studijuKryptis;
    }

    public int getKursas() {
        return kursas;
    }

    public void setKursas(int kursas) {
        this.kursas = kursas;
    }

    public String getStudijuKryptis() {
        return studijuKryptis;
    }

    public void setStudijuKryptis(String studijuKryptis) {
        this.studijuKryptis = studijuKryptis;
    }

    public String gautiZmogausInformacija() {
        return getVardas() + " " + getPavarde() + " " + getAmzius();
    }

    // toString() ir panaudoti gautiZmogausInformacija()
}

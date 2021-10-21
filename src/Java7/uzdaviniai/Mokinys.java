package Java7.uzdaviniai;

public class Mokinys {
    private String vardas;
    private String pavarde;
    private String klase;
    private int[] pazymiuMasyvas;

    public Mokinys(String vardas, String pavarde, String klase, int[] pazymiuMasyvas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.pazymiuMasyvas = pazymiuMasyvas;
    }
    // Rugsejo 1 konstruktorius
    public Mokinys(String vardas, String pavarde, String klase) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase =klase;
        this.pazymiuMasyvas = new int[0];
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getKlase() {
        return klase;
    }

    public void setKlase(String klase) {
        this.klase = klase;
    }

    public int[] getPazymiuMasyvas() {
        return pazymiuMasyvas;
    }

    public void setPazymiuMasyvas(int[] pazymiuMasyvas) {
        this.pazymiuMasyvas = pazymiuMasyvas;
    }

    public String toString() {
        return "Vardas: " + vardas + " Pavarde: " + pavarde + " Klase: " + klase
                + " Pazymiu masyvas: " + pazymiuEilute() + " Vidurkis: " + vidurkis(); // 4 6 10 8
    }

    private String pazymiuEilute() {
        String tekstas = "";
        // for(int pazymys: pazymiuMasyvas) {
        //
        // }
        for (int i = 0; i < pazymiuMasyvas.length; i++) {
            tekstas = tekstas + pazymiuMasyvas[i] + " ";
        }
        return tekstas;
    }

    public double vidurkis() {
        int sum = 0;
        for(int i = 0; i < pazymiuMasyvas.length; i++) {
            sum = sum + pazymiuMasyvas[i];
        }
        Double vidurkis = 1.0 * sum / pazymiuMasyvas.length;
        return vidurkis;
    }
}

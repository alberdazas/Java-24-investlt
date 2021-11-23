package Uzdaviniai.SkaniausiSaldainiai;

public class Saldainis {
    private String pavadinimas;
    private Integer vertinimas;

    public Saldainis(String pavadinimas, Integer vertinimas) {
        this.pavadinimas = pavadinimas;
        this.vertinimas = vertinimas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Integer getVertinimas() {
        return vertinimas;
    }

    public void setVertinimas(Integer vertinimas) {
        this.vertinimas = vertinimas;
    }

    @Override
    public String toString() {
        return pavadinimas + " " + vertinimas;
    }
}

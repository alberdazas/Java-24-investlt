package Uzdaviniai.PrekybaElektronikosPrekemis;

public class Preke {
    private String id;
    private String pavadinimas;
    private Double kaina;
    private Integer kiekis;

    public Preke(String id, String pavadinimas, Double kaina) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
        this.kiekis = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }

    public Integer getKiekis() {
        return kiekis;
    }

    public void setKiekis(Integer kiekis) {
        this.kiekis = kiekis;
    }
}

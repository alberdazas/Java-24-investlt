package Java15.PopuliariausiosProgramavimoKalbos;

public class ProgramavimoKalba {
    private String pavadinimas;
    private Integer vieta2014;
    private Integer vieta2013;
    private Double reitingas;
    private Double pokytis;

    public ProgramavimoKalba(String pavadinimas, Integer vieta2014, Integer vieta2013,
                             Double reitingas, Double pokytis) {
        this.pavadinimas = pavadinimas;
        this.vieta2014 = vieta2014;
        this.vieta2013 = vieta2013;
        this.reitingas = reitingas;
        this.pokytis = pokytis;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Integer getVieta2014() {
        return vieta2014;
    }

    public void setVieta2014(Integer vieta2014) {
        this.vieta2014 = vieta2014;
    }

    public Integer getVieta2013() {
        return vieta2013;
    }

    public void setVieta2013(Integer vieta2013) {
        this.vieta2013 = vieta2013;
    }

    public Double getReitingas() {
        return reitingas;
    }

    public void setReitingas(Double reitingas) {
        this.reitingas = reitingas;
    }

    public Double getPokytis() {
        return pokytis;
    }

    public void setPokytis(Double pokytis) {
        this.pokytis = pokytis;
    }

    @Override
    // kalba 3 2 12 1
    public String toString() {
        return String.format("%-20s",pavadinimas) + " " + vieta2014 + " " + vieta2013 + " " +
                String.format("%-7s",reitingas+"%") + " " + String.format("%6s",pokytis + "%");
    }
}

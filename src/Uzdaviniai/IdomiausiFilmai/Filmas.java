package Uzdaviniai.IdomiausiFilmai;

import java.time.LocalTime;

public class Filmas {
    private Integer metai;
    private String pavadinimas;
    private LocalTime trukme;
    private Integer ziurovuSkaicius;

    public Filmas(Integer metai, String pavadinimas, String valandos,
                  String minutes, Integer ziurovuSkaicius) {
        this.metai = metai;
        this.pavadinimas = pavadinimas;
        int valandosSkaiciais = Integer.parseInt(valandos);
        int minutesSkaiciais = Integer.parseInt(minutes);
        this.trukme = LocalTime.of(valandosSkaiciais, minutesSkaiciais);
        this.ziurovuSkaicius = ziurovuSkaicius;
    }

    public Integer getMetai() {
        return metai;
    }

    public void setMetai(Integer metai) {
        this.metai = metai;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public LocalTime getTrukme() {
        return trukme;
    }

    public void setTrukme(LocalTime trukme) {
        this.trukme = trukme;
    }

    public Integer getZiurovuSkaicius() {
        return ziurovuSkaicius;
    }

    public void setZiurovuSkaicius(Integer ziurovuSkaicius) {
        this.ziurovuSkaicius = ziurovuSkaicius;
    }

    @Override
    public String toString() {
        return metai + " " + pavadinimas + " " + trukme + " " + ziurovuSkaicius;
    }
}

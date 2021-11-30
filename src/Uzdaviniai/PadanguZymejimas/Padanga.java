package Uzdaviniai.PadanguZymejimas;

import java.util.Objects;

public class Padanga {
    private String plotis;
    private String aukstis;
    private String skersmuo;
    private Double kaina;


    public Padanga(String plotis, String aukstis, String skersmuo, Double kaina) {
        this.plotis = plotis;
        this.aukstis = aukstis;
        this.skersmuo = skersmuo;
        this.kaina = kaina;
    }

    public Padanga(String plotis, String aukstis, String skersmuo) {
        this.plotis = plotis;
        this.aukstis = aukstis;
        this.skersmuo = skersmuo;
    }

    public String getPlotis() {
        return plotis;
    }

    public void setPlotis(String plotis) {
        this.plotis = plotis;
    }

    public String getAukstis() {
        return aukstis;
    }

    public void setAukstis(String aukstis) {
        this.aukstis = aukstis;
    }

    public String getSkersmuo() {
        return skersmuo;
    }

    public void setSkersmuo(String skersmuo) {
        this.skersmuo = skersmuo;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Padanga padanga = (Padanga) o;
        return Objects.equals(plotis, padanga.plotis)
                && Objects.equals(aukstis, padanga.aukstis)
                && Objects.equals(skersmuo, padanga.skersmuo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plotis, aukstis, skersmuo, kaina);
    }
}

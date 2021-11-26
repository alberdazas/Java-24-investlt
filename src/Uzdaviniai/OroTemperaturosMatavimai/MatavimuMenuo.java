package Uzdaviniai.OroTemperaturosMatavimai;

import java.util.List;

public class MatavimuMenuo {
    private String menuo;
    private List<Double> temperaturos;

    public MatavimuMenuo(String menuo, List<Double> temperaturos) {
        this.menuo = menuo;
        this.temperaturos = temperaturos;
    }

    public String getMenuo() {
        return menuo;
    }

    public void setMenuo(String menuo) {
        this.menuo = menuo;
    }

    public List<Double> getTemperaturos() {
        return temperaturos;
    }

    public void setTemperaturos(List<Double> temperaturos) {
        this.temperaturos = temperaturos;
    }
}

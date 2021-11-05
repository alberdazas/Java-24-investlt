package Java12.Masinos;

public class Car {
    private String gamintojas;
    private String modelis;
    private String metai;
    private double kaina;
    private double variklioTuris;
    private Kuras kuroTipas;

    public Car(String gamintojas, String modelis, String metai, double kaina,
               double variklioTuris, Kuras kuroTipas) {
        this.gamintojas = gamintojas;
        this.modelis = modelis;
        this.metai = metai;
        this.kaina = kaina;
        this.variklioTuris = variklioTuris;
        this.kuroTipas = kuroTipas;
    }

    public String getGamintojas() {
        return gamintojas;
    }

    public void setGamintojas(String gamintojas) {
        this.gamintojas = gamintojas;
    }

    public String getModelis() {
        return modelis;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public String getMetai() {
        return metai;
    }

    public void setMetai(String metai) {
        this.metai = metai;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public double getVariklioTuris() {
        return variklioTuris;
    }

    public void setVariklioTuris(double variklioTuris) {
        this.variklioTuris = variklioTuris;
    }

    public Kuras getKuroTipas() {
        return kuroTipas;
    }

    public void setKuroTipas(Kuras kuroTipas) {
        this.kuroTipas = kuroTipas;
    }

    @Override
    public String toString() {
        return "Car{" +
                "gamintojas='" + gamintojas + '\'' +
                ", modelis='" + modelis + '\'' +
                ", metai='" + metai + "'" +
                ", kaina=" + kaina +
                ", variklioTuris=" + variklioTuris +
                ", kuroTipas=" + kuroTipas +
                '}';
    }
}

package Java16.ButoPaieska;

public class Butas {
    private String butoNumeris;
    private String adresas;
    private int kambariuSkaicius;
    private double kvadratura;
    private int kaina;

    public Butas(String butoNumeris, String adresas,
                 int kambariuSkaicius, double kvadratura, int kaina) {
        this.butoNumeris = butoNumeris;
        this.adresas = adresas;
        this.kambariuSkaicius = kambariuSkaicius;
        this.kvadratura = kvadratura;
        this.kaina = kaina;
    }

    public String getButoNumeris() {
        return butoNumeris;
    }

    public void setButoNumeris(String butoNumeris) {
        this.butoNumeris = butoNumeris;
    }

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    public int getKambariuSkaicius() {
        return kambariuSkaicius;
    }

    public void setKambariuSkaicius(int kambariuSkaicius) {
        this.kambariuSkaicius = kambariuSkaicius;
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public int getKaina() {
        return kaina;
    }

    public void setKaina(int kaina) {
        this.kaina = kaina;
    }

    @Override
    public String toString() {
        return "Butas{" +
                "butoNumeris='" + butoNumeris + '\'' +
                ", adresas='" + adresas + '\'' +
                ", kambariuSkaicius=" + kambariuSkaicius +
                ", kvadratura=" + kvadratura +
                ", kaina=" + kaina +
                '}';
    }
}

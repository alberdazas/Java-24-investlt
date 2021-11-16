package Java16.ButoPaieska;

public class Butas implements Comparable<Butas>{
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
        return String.format("%-2s", butoNumeris) + " " +
                String.format("%-25s", adresas) + " " + kambariuSkaicius
                + " " + kvadratura + " " +
                kaina;
    }

    @Override
    public int compareTo(Butas o) {
        if(o == null) {
            return 1;
        }

//        Double kvadraturaWrapper = kvadratura;
//        Double oKvadraturaWrapper = o.getKvadratura();
//        return kvadraturaWrapper.compareTo(oKvadraturaWrapper);

        if(kvadratura > o.getKvadratura()) {
            return 1;
        } else if(kvadratura < o.getKvadratura()) {
            return -1;
        }
        return 0;
    }
}

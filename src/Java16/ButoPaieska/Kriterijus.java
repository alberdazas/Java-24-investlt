package Java16.ButoPaieska;

public class Kriterijus {
    private int minKambariuSkaicius;
    private int maxKambariuSkaicius;
    private double minKvadratura;
    private double maxKvadratura;
    private int minKaina;
    private int maxKaina;

    public Kriterijus(int minKambariuSkaicius, int maxKambariuSkaicius,
                      double minKvadratura, double maxKvadratura,
                      int minKaina, int maxKaina) {
        this.minKambariuSkaicius = minKambariuSkaicius;
        this.maxKambariuSkaicius = maxKambariuSkaicius;
        this.minKvadratura = minKvadratura;
        this.maxKvadratura = maxKvadratura;
        this.minKaina = minKaina;
        this.maxKaina = maxKaina;
    }

    public int getMinKambariuSkaicius() {
        return minKambariuSkaicius;
    }

    public void setMinKambariuSkaicius(int minKambariuSkaicius) {
        this.minKambariuSkaicius = minKambariuSkaicius;
    }

    public int getMaxKambariuSkaicius() {
        return maxKambariuSkaicius;
    }

    public void setMaxKambariuSkaicius(int maxKambariuSkaicius) {
        this.maxKambariuSkaicius = maxKambariuSkaicius;
    }

    public double getMinKvadratura() {
        return minKvadratura;
    }

    public void setMinKvadratura(double minKvadratura) {
        this.minKvadratura = minKvadratura;
    }

    public double getMaxKvadratura() {
        return maxKvadratura;
    }

    public void setMaxKvadratura(double maxKvadratura) {
        this.maxKvadratura = maxKvadratura;
    }

    public int getMinKaina() {
        return minKaina;
    }

    public void setMinKaina(int minKaina) {
        this.minKaina = minKaina;
    }

    public int getMaxKaina() {
        return maxKaina;
    }

    public void setMaxKaina(int maxKaina) {
        this.maxKaina = maxKaina;
    }
}

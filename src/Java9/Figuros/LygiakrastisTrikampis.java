package Java9.Figuros;

public class LygiakrastisTrikampis extends Figura {
    private double x;

    public LygiakrastisTrikampis(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Lygiakrascio trikampio perimetras: " + perimetras() + " plotas: " + plotas();
    }

    @Override
    public double perimetras() {
        return x * 3;
    }

    @Override
    public double plotas() {
        return x * x * Math.sqrt(3) / 4;
    }

    @Override
    public double ilgiausiaKrastine() {
        return x;
    }
}

package Java8.Figuros;

public class Kvadratas extends Figura {
    private double x;

    public Kvadratas(double x) {
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
        return "Kvadrato Perimetras = " + perimetras() + " Plotas = " + plotas();
    }

    @Override
    public double perimetras() {
        return x * 4;
    }

    @Override
    public double plotas() {
        return x * x;
//        return Math.pow(x, 2);
    }

}

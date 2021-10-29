package java10.Kvadratas;

public class Kvadratas implements Area, Perimeter {
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
    public double area() {
        return x * x;
    }

    @Override
    public double perimeter() {
        return 4 * x;
    }
}

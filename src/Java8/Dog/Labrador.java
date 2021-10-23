package Java8.Dog;

public class Labrador extends Dog {

    public Labrador(String name, String color, double weight) {
        super(name, color, weight);
    }

    @Override
    public void bark() {
        System.out.println("Labradoro lojimas");
    }
}

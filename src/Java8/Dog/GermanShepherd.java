package Java8.Dog;

public class GermanShepherd extends Dog {

    public GermanShepherd(String name, String color, double weight) {
        super(name, color, weight);
    }

    @Override
    public void bark() {
        System.out.println("Vokiecio aviganio lojimas");
    }
}

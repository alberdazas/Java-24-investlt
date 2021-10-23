package Java8.Dog;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog vardas", "bespalvis", 0d);
        GermanShepherd vokieciuAviganis = new GermanShepherd("Reksas", "Rudai juodas", 25.0);
        Labrador labradoras = new Labrador("Carlis", "Geltonas", 30.0);

        dog.bark();
        vokieciuAviganis.bark();
        labradoras.bark();
    }
}

package Java7.uzdaviniai;

public class DogMain {
    public static void main(String[] args) {
        Dog suo = new Dog("vilksunis", 7, "juodas");
        suo.bark();
        suo.sleep();
        System.out.println("-------------------------------");
        System.out.println(suo.getBreed());
        System.out.println(suo.getAge());
        System.out.println(suo.getColor());
        System.out.println("-------------------------------");
        System.out.println(suo.toString());
    }
}

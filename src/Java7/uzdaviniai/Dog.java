package Java7.uzdaviniai;

public class Dog {
    private String breed;
    private int age;
    private String color;

    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark() {
        System.out.println("bark()");
    }

    public void sleep() {
        System.out.println("sleep()");
    }

    public String toString() {
        return breed + " " + age + " " + color;
    }
}

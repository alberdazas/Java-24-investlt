package Java8.Animal;

public class Cat extends Animal {
    private boolean arTuriNagus;

    public boolean isArTuriNagus() {
        return arTuriNagus;
    }

    public void setArTuriNagus(boolean arTuriNagus) {
        this.arTuriNagus = arTuriNagus;
    }

    public String toString() {
        return "Meow";
    }
}

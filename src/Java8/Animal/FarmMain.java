package Java8.Animal;

public class FarmMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        Cow cow = new Cow();
        Dog dog = new Dog("Reksas");
        Sheep sheep = new Sheep();

        cow.setArTuriRagus(true);
        cow.setVardas("Zibute");

        Animal[] gyvunai = {cat, chicken, cow, sheep, dog, dog, cat, chicken};

        Farm ferma = new Farm(gyvunai);

        System.out.println(ferma);



        for (int i = 0; i < gyvunai.length; i++) {
            // Tikriname ar masyvo elementas kurio Tipas yra Animal yra istikruju Cow tipo
            if (gyvunai[i] instanceof Cow) {
                System.out.println("ar turi ragus? " + ((Cow) gyvunai[i]).isArTuriRagus());
            }
            if (gyvunai[i] instanceof Cat) {
                System.out.println("Ar turi nagus? " + ((Cat) gyvunai[i]).isArTuriNagus());
            }
        }

        System.out.println("Kiek yra sunu? " + kiekTurimeSunu(gyvunai));
    }

    public static int kiekTurimeSunu(Animal[] gyvunai) {
        int kiekSunu = 0;
        for (int i = 0; i < gyvunai.length; i++) {
            if (gyvunai[i] instanceof Dog) {
                kiekSunu = kiekSunu + 1;
//                kiekSunu++;
            }
        }
        return kiekSunu;
    }
}

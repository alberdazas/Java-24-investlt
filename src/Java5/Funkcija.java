package Java5;

public class Funkcija {

    public static void main(String[] args) {
        int didelisSkaicius = 99999;
        System.out.println("Pries sumazinima = " + didelisSkaicius);
        didelisSkaicius = sumazintiVienetu(didelisSkaicius);
        System.out.println("Po sumazinimo = " + didelisSkaicius);

        int mazasSkaicius = 0;
        System.out.println("Pries sumazinima = " + mazasSkaicius);
        mazasSkaicius = sumazintiVienetu(mazasSkaicius);
        System.out.println("Po sumazinimo = " + mazasSkaicius);

//        sumazintiVienetu(10);
    }

    static int sumazintiVienetu(int skaicius) {
        return skaicius - 1;
    }
}

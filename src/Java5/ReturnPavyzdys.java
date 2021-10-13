package Java5;

public class ReturnPavyzdys {
    public static void main(String[] args) {
        metodas(false);
        metodas(true);
    }

    static void metodas(boolean salyga) {
        if(salyga) {
            System.out.println("Spausdinti");
            return;
        }
        System.out.println("Po return");
    }

    static boolean arLyginis(int skaicius) {
//        return skaicius % 2 == 0;
        if(skaicius % 2 == 0) {
            return true;
        }
        return false;
    }
}

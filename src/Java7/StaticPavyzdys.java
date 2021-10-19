package Java7;

public class StaticPavyzdys {
    static String vardas = "Dziugas";
    String pavarde = "Molis";

    public String getPavarde() {
        return pavarde;
    }

    public static String getVardas() {
        return vardas;
    }

    public int sum(int[] array) {
        int sum = 0;
        for(int a: array) {
            sum = sum + a;
        }
        return sum;
    }

}

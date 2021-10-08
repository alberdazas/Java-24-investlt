package java3.uzduotys;

public class TreciaUzduotis {
    public static void main(String[] args) {
        int suma = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
            // suma += i;
            suma = suma + i;
        }
        System.out.println("Suma = " + suma);
    }
}

package Java5.uzduotys;

public class AntraUzduotis {

    public static void main(String[] args) {
        double x = 25.0;
        double y = 22.5;

        double ats = dviejuSkaiciuSuma(x, y);
        System.out.println("Suma = " +  ats);
        System.out.println("Suma = " + dviejuSkaiciuSuma(x, y));
    }


    static double dviejuSkaiciuSuma(double a, double b) {
        return a + b;
    }
}

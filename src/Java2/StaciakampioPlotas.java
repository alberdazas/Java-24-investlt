package Java2;

import java.util.Scanner;

public class StaciakampioPlotas {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite krastine a");
        double a = reader.nextDouble();
        System.out.println("Iveskite krastine b");
        double b = reader.nextDouble();
        reader.close();
        
        double perimetras = a * 2 + b * 2;
        double plotas = a * b;
        System.out.println("Perimetras = " + perimetras);
        System.out.println("Plotas = " + plotas);

    }
}

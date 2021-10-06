package Java2;

import java.util.Scanner;

public class ApskritimoPlotas {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite spinduly r");
        double r = reader.nextDouble();
        reader.close();

        // 2 * pi * r
        double perimetras = 2 * Math.PI * r;

        // pi * r * r
//        double plotas = Math.PI * r * r;
        double plotas = Math.PI * Math.pow(r, 2);

        System.out.println("Perimetras = " + String.format("%.2f",perimetras));
        System.out.println("Plotas = " + String.format("%.2f",plotas));
    }
}

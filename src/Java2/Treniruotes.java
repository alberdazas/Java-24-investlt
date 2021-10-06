package Java2;

import java.util.Scanner;

public class Treniruotes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kokios trukmes treniruote pirmadieni?");
        double trukmeValandomis = reader.nextDouble();
        System.out.println("Kokios trukmes treniruote antradieni?");
//        trukmeValandomis = trukmeValandomis + reader.nextDouble();
        trukmeValandomis += reader.nextDouble();
        System.out.println("Kokios trukmes treniruote treciadieni?");
        trukmeValandomis += reader.nextDouble();
        System.out.println("Kokios trukmes treniruote ketvirtadieni?");
        trukmeValandomis += reader.nextDouble();
        System.out.println("Kokios trukmes treniruote penktadieni?");
        trukmeValandomis += reader.nextDouble();
        reader.close();

        double trukmeMinutemis = trukmeValandomis * 60;
        System.out.println("Trukme valandomis = " + trukmeValandomis);
        System.out.println("Per savaite Andrius treniruojasi " + trukmeMinutemis + " minuciu.");
    }
}

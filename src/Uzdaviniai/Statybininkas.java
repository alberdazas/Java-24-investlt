package Uzdaviniai;

import java.util.Scanner;

public class Statybininkas {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sienos ilgis:");
        int a = reader.nextInt();
        System.out.println("Sienos aukstis:");
        int h = reader.nextInt();
        System.out.println("Plytos kaina:");
        double plytosKaina = reader.nextDouble();

        double plytosPlotas = 0.2 * 0.1;
        double sienosPlotas = a * h;

        int kiekis = (int) Math.round(sienosPlotas / plytosPlotas);
        System.out.println("Plytu kiekis: " + kiekis);
        double kaina = kiekis * plytosKaina;
        System.out.println("Plytos kainuos: " + kaina);
    }
}

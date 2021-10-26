package Java9;

import java.util.Scanner;

public class Eglutes {

    // Su Scanner nuskaityti kiek isviso egluciu
    // sukti cikla iki egluciu kiekio
    // kiekvieno ciklo metu nuskaityti vienos eglutes auksti
    // sudeti aukscius i viena kintamaji
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double auksciuSuma = 0;

        System.out.println("Kiek egluciu atvezta?");

        int egluciuKiekis = reader.nextInt();

        for(int i = 1; i <= egluciuKiekis; i++) {
            System.out.println("Iveskite " + i + " eglutes auksti:");
            double eglutesAukstis = reader.nextDouble();
            auksciuSuma = auksciuSuma + eglutesAukstis;
        }
        double vidurkis = auksciuSuma / egluciuKiekis;
        System.out.println("Eglutes aukscio vidurkis " + vidurkis);
        reader.close();
    }
}

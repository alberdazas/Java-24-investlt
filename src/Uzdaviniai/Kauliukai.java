package Uzdaviniai;

import java.util.Scanner;

public class Kauliukai {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite kauliuku kieki:");
        int n = reader.nextInt();

        int suma = 0;
        for(int i = 1; i <= n;i++) {
            System.out.println(i + "-o kauliuko tasku kiekis");
            int taskai = reader.nextInt();
            suma = suma + taskai;
        }
        int visaSuma = n * 6;
        System.out.println("Is viso buvo galima surinkti tasku: " + visaSuma);
        System.out.println("Tomas is viso surinkto: " + suma);
        System.out.println("Jo tasku vidurkis: " + (suma * 1.0 / n));

        if(suma > visaSuma / 2) {
            System.out.println("Loterija laimeta");
        } else {
            System.out.println("Loterija pralaimeta");
        }

    }
}

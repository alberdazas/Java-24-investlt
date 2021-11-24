package Uzdaviniai;

import java.util.Scanner;

public class Konkursas {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Iveskite intervalo pradzia: ");
        int a = reader.nextInt();
        System.out.println("Iveskite intervalo pabaiga: ");
        int b = reader.nextInt();

        int kiekDalinasi = 0;
        for(int i = a; i <= b; i++) {
            if(i % 6 == 0) {
                kiekDalinasi++;
            }
        }
        System.out.println("Reikalingu marskineliu skaicius: " + kiekDalinasi);
    }
}

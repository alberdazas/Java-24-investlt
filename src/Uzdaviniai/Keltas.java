package Uzdaviniai;

import java.util.Scanner;

public class Keltas {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Automobiliu skaicius: ");
        int k = reader.nextInt();

        System.out.println("Kiek telpa automobiliu: ");
        int m = reader.nextInt();

        int i = 0;
        while(k >= m) {
            k = k - m;
            i++;
        }
        System.out.println("Perkelta kartu: " + i);
        int liksNeperkelta = k;
        System.out.println("Liks neperkelta: " + liksNeperkelta);
    }
}

package Uzdaviniai;

import java.util.Scanner;

public class Karnavalas {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int mokiniuSkaicius = 0;
        int patekusiuSkaicius = 0;

        System.out.println("Iveskite kiek balu gavo mokinys");
        int balas = reader.nextInt();

        while (balas != 0) {
            mokiniuSkaicius++;
            if (balas >= 5) {
                patekusiuSkaicius++;
            }
            System.out.println("Iveskite kiek balu gavo mokinys");
            balas = reader.nextInt();
        }
        System.out.println("I karnavala ejo " + mokiniuSkaicius + " mokiniai, pateko " + patekusiuSkaicius);
    }
}

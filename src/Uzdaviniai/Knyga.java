package Uzdaviniai;

import java.util.Scanner;

public class Knyga {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite knygos skyriu skaiciu:");
        int skyriai = reader.nextInt();

        int perskaityta = 0;
        int dienuSkaicius = 0;

        while (skyriai >= perskaityta) {
            dienuSkaicius++;
            perskaityta = perskaityta + dienuSkaicius;
        }

        System.out.println("Tadas perskaitys knyga per " + dienuSkaicius + " dienas");
        double vid = skyriai * 1.0 / dienuSkaicius;
        System.out.println("Vidurkis = " + vid);
    }
}

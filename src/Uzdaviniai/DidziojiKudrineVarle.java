package Uzdaviniai;

import java.util.Scanner;

public class DidziojiKudrineVarle {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek sveria varle?");
        int svoris = reader.nextInt();
        System.out.println("Kiek varliu norima stebeti?");
        int kiekis = reader.nextInt();

        if(svoris * kiekis > 5000) {
            System.out.println("Varliu pakanka");
        } else {
            System.out.println("Varliu permazai");
        }
    }
}

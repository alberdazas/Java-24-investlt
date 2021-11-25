package Uzdaviniai;

import java.util.Scanner;

public class Voveryte {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Sukauptas riesutu kiekis=");
        int x = reader.nextInt();
        System.out.println("Voveriuku skaicius = ");
        int v = reader.nextInt();

        int dienuSkaicius = 0;

        while((v + 1) * 3 <= x) {
            x = x - (v + 1) * 3;
            dienuSkaicius++;
        }
        System.out.println("Riesutu sukaupta " + dienuSkaicius + " dienoms");
        if(dienuSkaicius >= 92) {
            System.out.println("Ziemai uztenka");
        } else {
            System.out.println("Ziemai neuztenka");
        }

    }
}

package Uzdaviniai;

import java.util.Scanner;

public class SnaigesUzLango {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek snaigiu nukrito per pirmaja sekunde");
        int k = reader.nextInt();

        System.out.println("Kiek sekundziu snigo?");
        int n = reader.nextInt();

        int s = 0;
        for(int i = 0; i < n; i++) {
            s = s + k;
            k = k * 2;
        }
        System.out.println(s);
    }
}

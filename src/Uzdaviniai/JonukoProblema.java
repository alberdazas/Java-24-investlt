package Uzdaviniai;

import java.util.Scanner;

public class JonukoProblema {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Iveskite uzduoties varianta: ");
        int variantas = reader.nextInt();

        System.out.println("Iveskite a reiksme");
        int a = reader.nextInt();

        System.out.println("Iveskite b reiksme");
        int b = reader.nextInt();

        Integer x = null;
        switch(variantas) {
            case 1:
                x = a * b +3;
                break;
            case 2:
                x = a + b;
                break;
            case 3:
                x = a - b;
                break;
            default:
                System.out.println("Nera tokios formules");
        }
        System.out.println("Atsakymas: x = " + x);

    }
}

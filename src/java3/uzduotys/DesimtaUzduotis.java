package java3.uzduotys;

import java.util.Scanner;

public class DesimtaUzduotis {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite dienos numeri");
        int diena = reader.nextInt();

        switch (diena) {
            case 1:
                System.out.println("Pirmadienis");
                break;
            case 2:
                System.out.println("Antradienis");
                break;
            case 3:
                System.out.println("Treciadienis");
                break;
            case 4:
                System.out.println("Ketvirtadienis");
                break;
            case 5:
                System.out.println("Penktadienis");
                break;
            case 6:
                System.out.println("Sestadienis");
                break;
            case 7:
                System.out.println("Sekmadienis");
                break;
            default:
                System.out.println("Tokios savaites dienos nera");
        }


    }
}

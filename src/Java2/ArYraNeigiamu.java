package Java2;

import java.util.Scanner;

public class ArYraNeigiamu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        double pirmas = reader.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double antras = reader.nextDouble();
        System.out.println("Iveskite trecia skaiciu");
        double trecias = reader.nextDouble();

        if(pirmas < 0 || antras < 0 || trecias < 0) {
            System.out.println("Yra neigiamu skaiciu");
        } else {
            System.out.println("Nera neigiamu skaiciu");
        }
//
//        if(pirmas < 0) {
//
//        } else if (antras < 0) {
//
//        } else {
//
//        }
    }
}

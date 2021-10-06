package Java2;

import java.util.Scanner;

public class DidziausiasSkaicius {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        double pirmas = reader.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double antras = reader.nextDouble();
        System.out.println("Iveskite trecia skaiciu");
        double trecias = reader.nextDouble();
        reader.close();

        if(pirmas > antras && pirmas > trecias) {
            System.out.println("Pirmas skaicius didziausias");
        } else if (antras > pirmas && antras > trecias) {
            System.out.println("Antras skaicius didziausias");
        } else {
            System.out.println("Trecias skaicius didziausias");
        }




    }
}

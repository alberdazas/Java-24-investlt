package Java2;

import java.util.Scanner;

public class SkaitymasIsEkrano {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");
        int skaicius = reader.nextInt();
        System.out.println("Iveskite nesveika skaiciu:");
        double nesveikasSkaicius = reader.nextDouble();
        System.out.println("Iveskite teksta");
        String tekstas = reader.next();
        reader.close();

        System.out.println("Musu nuskaitytas skaicius = " + skaicius);
        System.out.println("Musu nuskaitytas nesveikas skaicius = " + nesveikasSkaicius);
        System.out.println("Musu nuskaitytas tekstas = " +  tekstas);
    }
}

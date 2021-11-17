package Java17;

import java.util.Scanner;

public class Kurjeris {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 0; // skaiciu kiekis
        int suma = 0; // skaiciu suma
        double vid = 0; // vidurkis
        int virsijo100 = 0; // skaiciu kiekis kuris virsijo 100

        System.out.println("Iveskite suma");
        int skaicius = reader.nextInt();

        while(skaicius != 0) {
            n++; // padidiname vienetu skaiciu kieki
            suma += skaicius; // skaiciuojame suma kad galetume paskaiciuoti vidurki
            if(skaicius > 100) { // tikriname ar skaicius virsyja 100
                virsijo100++; // jei virsyja padidiname vienute skaiciu kieki
            }
            skaicius = reader.nextInt();
        }
        if(suma != 0) {
            vid = 1.0 * suma / n;
        }


        System.out.println("1. " + virsijo100);
        System.out.println("2. " + vid);
        System.out.println("3. " + n);


    }
}

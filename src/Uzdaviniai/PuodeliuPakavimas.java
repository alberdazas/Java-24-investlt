package Uzdaviniai;

import java.util.Scanner;

public class PuodeliuPakavimas {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Puodeliu, kuriuos reikia supakuoti skaicius:");
        int skaicius = reader.nextInt();

        int dezuciuSkaicius = skaicius / 3;
        int nesupakuotiPuodeliai = skaicius - (dezuciuSkaicius * 3);
        System.out.println("Pilnu dezuciu skaicius: " + dezuciuSkaicius);
        System.out.println("Nesupakuotu puodeliu skaicius: " + nesupakuotiPuodeliai);
    }
}

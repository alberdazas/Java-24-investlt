package java10;

import java.util.Scanner;

public class DrauguSkaiciai {

    public static void main(String[] args) {
        int lyginiuKiekis = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite draugu sugalvotus skaicius:");
        for(int i = 0; i < 10; i++) {
            int skaicius  = reader.nextInt();
            if(skaicius % 2 == 0) {
                lyginiuKiekis = lyginiuKiekis + 1;
            }
        }

        if(lyginiuKiekis > 0) {
            System.out.println("Atsakymas: " + lyginiuKiekis);
        } else {
            System.out.println("Atsakymas: Nera");
        }
    }
}

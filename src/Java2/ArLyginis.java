package Java2;

import java.util.Scanner;

public class ArLyginis {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        double skaicius = reader.nextDouble();
        reader.close();
        System.out.println("liekana = " + (skaicius % 3));
        if (skaicius % 2 == 0) {
            System.out.println("Skaicius yra lyginis");
        } else {
            System.out.println("Skaicius yra nelyginis");
        }
//        14 % 3
//        14 / 3 = 4.......
//        4 * 3 = 12
//    14 - 12 = 2
    }
}

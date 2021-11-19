package Java17;

import java.util.Scanner;

public class Degalai {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int kelintaDiena = 0;

        System.out.println("Iveskite kuro bako talpa: ");
        int talpa = reader.nextInt();
        System.out.println("Iveskite kuro sanaudas n:");
        int n = reader.nextInt();

        while (talpa > 0) {
            if (kelintaDiena % 2 == 0) {
                if (talpa < n) {
                    break;
                }
                talpa = talpa - n;

            } else {
                if (talpa < 2 * n) {
                    break;
                }
                talpa = talpa - 2 * n;
            }

            kelintaDiena++;
        }

        System.out.println("Keliauti bus galima " + kelintaDiena);


        System.out.println();
    }
}

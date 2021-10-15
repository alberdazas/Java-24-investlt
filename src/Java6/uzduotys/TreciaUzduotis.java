package Java6.uzduotys;

import java.util.Scanner;

public class TreciaUzduotis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = null;
        while(number == null) {
            System.out.println("Iveskite skaiciu");
            String text = scanner.next();
            try {
                number = Integer.parseInt(text);
                System.out.println("Jusu skaicius = " + number);
            } catch (NumberFormatException e) {
                System.out.println("Jus ivedete ne skaiciu, prasome iveskite skaiciu teisingu formatu");
            }
        }

    }
}

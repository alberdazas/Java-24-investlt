package Java2;

import java.util.Scanner;

public class Geles {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek geliu zydi?");
        int a = reader.nextInt();
        System.out.println("Kiek geliu prazysta kiekviena diena?");
        int b = reader.nextInt();
        System.out.println("Kiek dienu praejo?");
        int n = reader.nextInt();
        reader.close();

        int suma = a + b * n;
        System.out.println("Po " + n + " dienu zydes " + suma + " geliu.");
    }
}

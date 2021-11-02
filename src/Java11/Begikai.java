package Java11;

import java.util.Scanner;

public class Begikai {

    public static void main(String[] args) {
        double suma = 0;
        double minLaikas = Double.MAX_VALUE;

        Scanner reader = new Scanner(System.in);
        System.out.println("Kiek dalyvavo begiku:");
        int n = reader.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Iveskite " + i + " begiko laika");
            double laikas = reader.nextDouble();
            suma = suma + laikas;
            if(minLaikas > laikas) {
                minLaikas = laikas;
            }
        }
        reader.close();
        double vidurkis = suma / n;
        double geresnisUzVidurki = vidurkis - minLaikas;

        System.out.println("Greiciausio begiko laikas: " + minLaikas);
        System.out.println("Jis buvo " + geresnisUzVidurki + " sek geresnis uz vidurki");
    }
}

package Java12;

import java.util.Scanner;

public class Atvirukai {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Susikurti kintamaji saugoti kiek tinka atviruku
        int kiekTinka = 0;
        // Susikurti kintamaji m draugu kiekiui
        System.out.println("Keliems draugams Linas nori dovanoti atvirukus?");
        int m = reader.nextInt();
        // Susikurti kintamaji n atviruku rusiu kiekiui
        System.out.println("Kiek rusiu atviruku yra parduotuveje?");
        int n = reader.nextInt();
        // Nuskaityti atviruko rusies kieki
        for(int i = 0; i < n; i++) {
            System.out.println("Kiek yra " + (i + 1) + " rusies atviruku?");
            int kiekis = reader.nextInt();
            // Patikrinti ar uztenka
            if(kiekis >= m) {
                kiekTinka = kiekTinka + 1;
//                kiekTinka++;
//                kiekTinka += 1;
            }
        }

        System.out.println(kiekTinka + " rusiu atviruku uztektu visiems Lino draugams.");


    }
}

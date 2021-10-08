package java3.uzduotys;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AstuntaUzduotis {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/java3/uzduotys/astunta.txt"));
            int suma = 0;
            int kiekis = 0;
            String eilute = br.readLine();
            while(eilute != null) {
                System.out.println(eilute);
                suma = suma + Integer.parseInt(eilute);
                kiekis = kiekis + 1;
                eilute = br.readLine();
            }
            double vidurkis = 1.0 * suma / kiekis;
            System.out.println("Suma = " + suma);
            System.out.println("Vidurkis = " + String.format("%.2f",vidurkis));

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nerado failo");
        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }
    }
}

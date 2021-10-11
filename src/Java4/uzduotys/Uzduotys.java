package Java4.uzduotys;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Uzduotys {
    public static void main(String[] args) {
        BufferedReader br = null;
        int[] masyvas = new int[0];

        try {
            br = new BufferedReader(new FileReader("src/java4/uzduotys/duomenys.txt"));
            String line = br.readLine();
            while(line != null) {
                int skaicius = Integer.parseInt(line);
                masyvas = pridetiElementa(masyvas, skaicius);
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }

        for(int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
    }

    static int[] pridetiElementa(int[] masyvas, int reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }
}

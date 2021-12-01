package Uzdaviniai.IdomiausiFilmai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String duomenys = "src/Uzdaviniai/IdomiausiFilmai/duomenys.txt";
        List<Filmas> filmai = skaityti(duomenys);
    }

    static List<Filmas> skaityti(String failoKelias) {
        List<Filmas> f = new ArrayList<>();
        BufferedReader br;

        try {
            br= new BufferedReader(new FileReader(failoKelias));

            String line = br.readLine();
            int kiekis = Integer.parseInt(line);
            for(int i = 0; i < kiekis; i++) {
                line = br.readLine();
                Integer metai = Integer.parseInt(line.substring(0,4));
                String pavadinimas = line.substring(5, 30).trim();
                System.out.println(pavadinimas);
            }

        } catch(IOException e) {
            System.out.println("Netiketa klaida " + e);
        }

        return f;
    }

}

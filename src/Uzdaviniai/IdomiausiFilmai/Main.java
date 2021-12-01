package Uzdaviniai.IdomiausiFilmai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String duomenys = "src/Uzdaviniai/IdomiausiFilmai/duomenys.txt";
        List<Filmas> filmai = skaityti(duomenys);
        Collections.sort(filmai);

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
                String[] reiksmes = line.substring(30, 34).split("");
                String valandos = reiksmes[0];
                String minutes = reiksmes[1];
                Integer ziurovuSkaicius = Integer.parseInt(reiksmes[2]);

                Filmas filmas = new Filmas(metai, pavadinimas, valandos, valandos, Integer.parseInt(minutes));
                f.add(filmas);
            }

        } catch(IOException e) {
            System.out.println("Netiketa klaida " + e);
        }

        return f;
    }

}

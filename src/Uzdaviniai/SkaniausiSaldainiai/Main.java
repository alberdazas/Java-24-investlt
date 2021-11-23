package Uzdaviniai.SkaniausiSaldainiai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String duomenys = "src/Uzdaviniai/SkaniausiSaldainiai/duomenys.txt";
        List<Gamintojas> gamintojai = new ArrayList<>();
        skaityti(duomenys, gamintojai);
        System.out.println(gamintojai.size());
    }

    static void skaityti(String failoKelias, List<Gamintojas> a) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            int gamintojuKiekis = Integer.parseInt(line);

            for (int i = 0; i < gamintojuKiekis; i++) {
                line = br.readLine();
                String[] reiksmes = line.split(" ");
                String gamintojas = gautiPavadinima(reiksmes);
                Integer rusiuKiekis = Integer.parseInt(reiksmes[reiksmes.length - 1]);

                List<Saldainis> saldainiai = new ArrayList<>();
                for (int j = 0; j < rusiuKiekis; j++) {
                    line = br.readLine();
                    reiksmes = line.split(" ");
                    String pavadinimas = gautiPavadinima(reiksmes);
                    Integer vertinimas = Integer.parseInt(reiksmes[reiksmes.length - 1]);
                    Saldainis s = new Saldainis(pavadinimas, vertinimas);
                    saldainiai.add(s);
                }
                Gamintojas g = new Gamintojas(gamintojas, saldainiai);
                a.add(g);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }

    }

    static String gautiPavadinima(String[] reiksmes) {
        String pavadinimas = "";
        for (int i = 0; i < reiksmes.length - 1; i++) {
            if(i == 0) {
                pavadinimas = reiksmes[i];
            } else {
                pavadinimas = pavadinimas + " " + reiksmes[i];
            }
        }
        return pavadinimas;
    }
}

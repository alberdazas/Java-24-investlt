package Java16.ButoPaieska;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ButasMain {

    public static void main(String[] args) {
        String butuDuomenys = "src/Java16/ButoPaieska/Duomenys.txt";
        String kriterijuDuomenys = "src/Java16/ButoPaieska/Kriterijai.txt";
        List<Butas> butai = new ArrayList<>();
        skaitytiButus(butuDuomenys, butai);

        Kriterijus kriterijus = skaitytiKriterijus(kriterijuDuomenys);

        List<Butas> filtruotiButai = atfiltruotiButus(butai, kriterijus);
        Collections.sort(filtruotiButai);
        Collections.reverse(filtruotiButai);
        for(Butas b: filtruotiButai) {
            System.out.println(b);
        }
    }

    // cia suksim for cikla
    static void skaitytiButus(String failoKelias, List<Butas> x) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            int n = Integer.parseInt(line);

            for (int i = 0; i < n; i++) {
                line = br.readLine();
                String[] reiksmes = line.split(" ");

                String butoNr = reiksmes[0];
                String adresas = reiksmes[1] + " " + reiksmes[2] + " " + reiksmes[3];
                int kambariuSk = Integer.parseInt(reiksmes[4]);
                double kvadratura = Double.parseDouble(reiksmes[5]);
                int kaina = Integer.parseInt(reiksmes[6]);

                Butas b = new Butas(butoNr, adresas, kambariuSk, kvadratura, kaina);
                x.add(b);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("netiketa klaida butuose");
        }
    }

    // nereikia ciklo, tiesiog 3 kartus readLine()
    // Kiekviena karta split() ir isgauti norimas reiksmes
    // Sukurti objekta Kriterijus ir ji grazinti
    static Kriterijus skaitytiKriterijus(String failoKelias) {
        BufferedReader br;
        Kriterijus kriterijus = null;
        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            String[] reiksmes = line.split(" ");
            int minKambariuSk = Integer.parseInt(reiksmes[0]);
            int maxKambariuSk = Integer.parseInt(reiksmes[1]);

            line = br.readLine();
            reiksmes = line.split(" ");
            double minKvadratura = Double.parseDouble(reiksmes[0]);
            double maxKvadratura = Double.parseDouble(reiksmes[1]);

            line = br.readLine();
            reiksmes = line.split(" ");
            int minKaina = Integer.parseInt(reiksmes[0]);
            int maxKaina = Integer.parseInt(reiksmes[1]);

            kriterijus = new Kriterijus(minKambariuSk, maxKambariuSk, minKvadratura, maxKvadratura,
                    minKaina, maxKaina);
        } catch (IOException e) {
            System.out.println("netiketa klaida kriterjuose");
        }
        return kriterijus;
    }

    static List<Butas> atfiltruotiButus(List<Butas> y, Kriterijus k) {
        // susikuriam List<butas> filtruoti kad saugoti tinkamus butus
        List<Butas> filtruoti = new ArrayList<>();
        // sukam cikla
        for (int i = 0; i < y.size(); i++) {
            Butas b = y.get(i);
            // lyginsim kiekvieno buto reiksmes su kriterijais
            if (k.getMinKambariuSkaicius() <= b.getKambariuSkaicius() &&
                    k.getMaxKambariuSkaicius() >= b.getKambariuSkaicius() &&
                    k.getMinKvadratura() <= b.getKvadratura() &&
                    k.getMaxKvadratura() >= b.getKvadratura() &&
                    k.getMinKaina() <= b.getKaina() &&
                    k.getMaxKaina() >= b.getKaina()) {
                // atitinkancias reiksmes idedam add i laikina Lista
                filtruoti.add(b);
            }
        }
        // grazinsim reiksme
        return filtruoti;
    }
}

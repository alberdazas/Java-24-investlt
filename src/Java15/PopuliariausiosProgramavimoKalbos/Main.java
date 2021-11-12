package Java15.PopuliariausiosProgramavimoKalbos;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String failoKelias = "src/Java15/PopuliariausiosProgramavimoKalbos/duomenys.txt";
        String rezultatai = "src/Java15/PopuliariausiosProgramavimoKalbos/rezultatai.txt";
        ArrayList<ProgramavimoKalba> x =  skaityti(failoKelias);
        Collections.sort(x, (a, b) -> {
            int result = a.getPavadinimas().compareTo(b.getPavadinimas());
            if(result != 0) {
                return result;
            }
            return a.getPokytis().compareTo(b.getPokytis());
        });

        spausdinti(rezultatai, x);

    }

    static ArrayList<ProgramavimoKalba> skaityti(String kelias) {
        ArrayList<ProgramavimoKalba> kalbos = new ArrayList<>();
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(kelias));

            String line = br.readLine();
            int n = Integer.parseInt(line);

            for (int i = 0; i < n; i++) {
                line = br.readLine();
                String[] reiksmes = line.split(" ");
                String pavadinimas = reiksmes[0];
                Integer vieta2014 = Integer.parseInt(reiksmes[1]);
                Integer vieta2013 = Integer.parseInt(reiksmes[2]);
                Double reitingas = Double.parseDouble(reiksmes[3]);
                Double pokytis = Double.parseDouble(reiksmes[4]);

                ProgramavimoKalba kalba = new ProgramavimoKalba(pavadinimas, vieta2014, vieta2013,
                        reitingas, pokytis);
                kalbos.add(kalba);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }
        return kalbos;
    }

    static void spausdinti(String kelias, ArrayList<ProgramavimoKalba> y) {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(kelias));

            for(int i = 0; i < y.size(); i++) {
                bw.write(y.get(i).toString());
                bw.newLine();
            }

            bw.close();
        } catch(IOException e) {
            System.out.println("Netiketa klaida");
        }
    }
}

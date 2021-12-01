package Uzdaviniai.PrekybaElektronikosPrekemis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String duomenys = "src/Uzdaviniai/PrekybaElektronikosPrekemis/duomenys.txt";
        Map<String, Preke> prekes = skaityti(duomenys);
        Preke populiariausia = gautiPopuliariausia(prekes);
        System.out.println("Populiariausias: " + populiariausia);

        Preke pelningiausia = gautiPelningiausia(prekes);
        System.out.println("Pelningiausias: " + pelningiausia);

    }

    static Map<String, Preke> skaityti(String failoKelias) {
        Map<String, Preke> zemelapis = new HashMap<>();
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            int prekiuKiekis = Integer.parseInt(line);

            for(int i = 0; i < prekiuKiekis; i++) {
                line = br.readLine();
                int pirmoTarpoVieta = line.indexOf(" ");
                String id = line.substring(0, pirmoTarpoVieta);
                String pavadinimas = line.substring(pirmoTarpoVieta, pirmoTarpoVieta + 18).trim();
                Double kaina = Double.parseDouble(line.substring(pirmoTarpoVieta + 18));
                Preke p = new Preke(id, pavadinimas, kaina);
                zemelapis.put(id, p);
            }
            line = br.readLine();
            int pardavimuKiekis = Integer.parseInt(line);
            for(int i = 0; i < pardavimuKiekis; i++) {
                line = br.readLine();
                String[] reiksmes = line.split(" ");
                String id = reiksmes[0];
                int kiekis = Integer.parseInt(reiksmes[1]);
                Preke p = zemelapis.get(id);
                if(p != null) {
                    int galutinisKiekis = p.getKiekis() + kiekis;
                    p.setKiekis(galutinisKiekis);
                }
            }
            br.close();
        } catch(IOException e) {
            System.out.println("Netiketa klaida: " + e);
        }
        return zemelapis;
    }

    static Preke gautiPopuliariausia(Map<String, Preke> zemelapis) {
        Preke max = null;
        for (Preke preke : zemelapis.values()) {
            if(max == null) {
                max = preke;
                continue;
            }
            if(max.getKiekis() < preke.getKiekis()) {
                max = preke;
            }
        }
        return max;
    }

    static Preke gautiPelningiausia(Map<String, Preke> zemelapis) {
        Preke pelningiausia = null;
        for (Preke preke : zemelapis.values()) {
            if (pelningiausia == null) {
                pelningiausia = preke;
                continue;
            }
            if(pelningiausia.getSuma() < preke.getSuma()) {
                pelningiausia = preke;
            }
        }
        return pelningiausia;
    }

}

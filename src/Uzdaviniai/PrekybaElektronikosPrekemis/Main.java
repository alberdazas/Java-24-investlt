package Uzdaviniai.PrekybaElektronikosPrekemis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String duomenys = "src/Uzdaviniai/PrekybaElektronikosPrekemis/duomenys.txt";
        skaityti(duomenys);
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
//                System.out.println(pirmoTarpoVieta);
                String id = line.substring(0, pirmoTarpoVieta);
                System.out.println(id);
            }


        } catch(IOException e) {
            System.out.println("Netiketa klaida: " + e);
        }


        return zemelapis;
    }

}

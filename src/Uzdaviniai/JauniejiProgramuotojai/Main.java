package Uzdaviniai.JauniejiProgramuotojai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String duomenys = "src/Uzdaviniai/JauniejiProgramuotojai/duomenys.txt";
        List<JaunasisProgramuotojas> programuotojai = new ArrayList<>();
        Integer atrinktuSkaicius = skaityti(duomenys, programuotojai);
        Collections.sort(programuotojai);
        atrinktiGeriausius(programuotojai, atrinktuSkaicius);
        System.out.println("Sudarytos klases mokiniu sarasas:");
        for(JaunasisProgramuotojas laikinas: programuotojai) {
            System.out.println(laikinas);
        }
    }

    static Integer skaityti(String failoKelias, List<JaunasisProgramuotojas> x) {
        Integer priimamuSkaicius = 0;
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            String[] laikinas = line.split(" ");
            priimamuSkaicius = Integer.parseInt(laikinas[0]);
            int n = Integer.parseInt(laikinas[1]);

            for(int i = 0; i < n; i++) {
                line = br.readLine();
                laikinas = line.split(" ");
                Integer lygis = Integer.parseInt(laikinas[1]);
                laikinas = laikinas[0].split("_");
                String vardas = laikinas[0];
                String pavarde = laikinas[1];
                JaunasisProgramuotojas a = new JaunasisProgramuotojas(vardas, pavarde, lygis);
                x.add(a);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }
        return priimamuSkaicius;
    }

    static void atrinktiGeriausius(List<JaunasisProgramuotojas> b, Integer kiekPalikti) {
        Iterator itr = b.iterator();
        int i = 1;
        while(itr.hasNext()) {
            itr.next();
            if(i > kiekPalikti) {
                itr.remove();
            }
            i++;
        }
    }

    static void apkirptasSarasas(List<JaunasisProgramuotojas> x, Integer mokiniuSkaicius) {
        int skirtumas = x.size() - mokiniuSkaicius;
        for (int i = 0; i < skirtumas; i++) {
            x.remove(x.size() - 1);
        }
    }
}

package Uzdaviniai.JauniejiProgramuotojai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String duomenys = "src/Uzdaviniai/JauniejiProgramuotojai/duomenys.txt";
        List<JaunasisProgramuotojas> programuotojai = new ArrayList<>();
        Integer atrinktuSkaicius = skaityti(duomenys, programuotojai);
        System.out.println(atrinktuSkaicius);
        System.out.println(programuotojai.size());
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
}

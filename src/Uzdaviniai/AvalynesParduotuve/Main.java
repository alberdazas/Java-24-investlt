package Uzdaviniai.AvalynesParduotuve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String duomenys = "src/Uzdaviniai/AvalynesParduotuve/duomenys.txt";
        List<Avalyne> avalynesSarasas = new ArrayList<>();
        skaityti(duomenys, avalynesSarasas);
        List<Avalyne> moteriski = filtruotiPagalLyti(avalynesSarasas, Lytis.MOTERIS);
        List<Avalyne> vyriski = filtruotiPagalLyti(avalynesSarasas, Lytis.VYRAS);
        Double motSuma = suma(moteriski);
        Double motVidurkis = vidurkis(motSuma, moteriski.size());
        System.out.println("Moteriska avalyne:");
        System.out.println("Per diena parduota uz: " + String.format("%.2f",motSuma));
        System.out.println("Vidutiniskai viena batu pora kainavo: " + String.format("%.2f",motVidurkis));

        Double vyrSuma = suma(vyriski);
        Double vyrVidurkis = vidurkis(vyrSuma, vyriski.size());
        System.out.println("Vyriska avalyne:");
        System.out.println("Per diena parduota uz: " + String.format("%.2f",vyrSuma));
        System.out.println("Vidutiniskai viena batu pora kainavo: " + String.format("%.2f", vyrVidurkis) );

        System.out.println("Is viso per diena parduota avalynes uz: " + String.format("%.2f",suma(avalynesSarasas)));

    }

    static void skaityti(String failoKelias, List<Avalyne> x) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            Integer kiekPoru = Integer.parseInt(line);

            for(int i = 0; i < kiekPoru; i++) {
                line = br.readLine();
                String[] reiksmes = line.split(" ");
                Lytis lytis = gautiLyti(reiksmes[0]);
                Double kaina = Double.parseDouble(reiksmes[1]);
                Avalyne a = new Avalyne(kaina, lytis);
                x.add(a);
            }
            br.close();
        }catch(IOException e) {
            System.out.println("Netiketa klaida");
        }
    }

    static Lytis gautiLyti(String lytis) {
        switch(lytis.toUpperCase()) {
            case "V":
                return Lytis.VYRAS;
            case "M":
                return Lytis.MOTERIS;
            default:
                return null;
        }
    }

    static List<Avalyne> filtruotiPagalLyti(List<Avalyne> batai, Lytis norimaLytis) {
        List<Avalyne> filtruotasSarasas = new ArrayList<>();
        for(int i = 0; i < batai.size(); i++) {
            Lytis lytis = batai.get(i).getLytiesRusis();
            if(lytis.equals(norimaLytis)) {
                filtruotasSarasas.add(batai.get(i));
            }
        }
        return filtruotasSarasas;
    }

    static Double suma(List<Avalyne> batai) {
        Double suma = 0d;
        for(Avalyne a: batai) {
            suma = suma + a.getKaina();
        }
        return suma;
    }

    static Double vidurkis(Double suma, Integer kiekis) {
        return suma / kiekis;
    }

}

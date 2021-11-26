package Uzdaviniai.OroTemperaturosMatavimai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String duomenys = "src/Uzdaviniai/OroTemperaturosMatavimai/duomenys.txt";
        List<MatavimuMenuo> menesiai = new ArrayList<>();
        skaityti(duomenys, menesiai);

        Double bendraVidurkiuSuma = 0.0;
        for(int i = 0; i < menesiai.size(); i++) {
            Double vidurkis = vidurkis(menesiai.get(i).getTemperaturos());
            bendraVidurkiuSuma = bendraVidurkiuSuma + vidurkis;
            System.out.println(menesiai.get(i).getMenuo() + " " + String.format("%.2f", vidurkis));
        }
        Double bendrasVidurkis = bendraVidurkiuSuma / menesiai.size();
        System.out.println("Bendras matavimu vidurkis: " + String.format("%.2f", bendrasVidurkis));
    }

    static void skaityti(String failoKelias, List<MatavimuMenuo> x) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            String[] reiksmes = line.split(" ");
            int kiekMenesiu = Integer.parseInt(reiksmes[0]);
            int kiekKartuMatuota = Integer.parseInt(reiksmes[1]);

            for(int i = 0; i < kiekMenesiu; i++) {
                line = br.readLine();
                reiksmes = line.split(" ");

                String menuo = reiksmes[0];
                List<Double> t = new ArrayList<>();
                for(int j = 1; j < kiekKartuMatuota + 1; j++) {
                    Double temperatura = Double.parseDouble(reiksmes[j]);
                    t.add(temperatura);
                }
                MatavimuMenuo matavimas = new MatavimuMenuo(menuo, t);
                x.add(matavimas);
            }
            br.close();
        } catch(IOException e) {
            System.out.println("Netiketa klaida");
        }
    }

    static double vidurkis(List<Double> x) {
        Double suma = 0.0;
        for(Double skaicius: x) {
            suma = suma + skaicius;
        }
        return suma / x.size();
    }

}

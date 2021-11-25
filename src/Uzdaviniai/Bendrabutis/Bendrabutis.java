package Uzdaviniai.Bendrabutis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bendrabutis {
    public static void main(String[] args) {
        String duomenys = "src/Uzdaviniai/Bendrabutis/duomenys.txt";
        List<Integer> sarasas = new ArrayList<>();
        Double kwKaina = skaityti(duomenys, sarasas);

        List<Double> saskaituSarasas = apskaiciuotiSaskaitas(sarasas, kwKaina);
        for(int i = 0; i < saskaituSarasas.size(); i++) {
            System.out.println(i+1 + ". " + saskaituSarasas.get(i) + " LT");
        }

        Double sumaIsviso = gautiSaskaituSuma(saskaituSarasas);
        System.out.println("Is viso sunaudota: " +sumaIsviso + "LT");

        Double vienoKambarioSuma = gautiVienoKambarioSuma(sumaIsviso, saskaituSarasas.size());
        System.out.println("Vieno kambario gyventojai mokes: " + vienoKambarioSuma);
    }

    static Double skaityti(String failoKelias, List<Integer> x) {
        BufferedReader br;
        Double kaina = 0d;
        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            int kambSkaicius = Integer.parseInt(line);
            line = br.readLine();
            kaina = Double.parseDouble(line);
            for(int i = 0; i < kambSkaicius; i++) {
                line = br.readLine();
                Integer kw = Integer.parseInt(line);
                x.add(kw);
            }
            br.close();
        } catch(IOException e) {
            System.out.println("Netiketa klaia");
        }
        return kaina;
    }

    static List<Double> apskaiciuotiSaskaitas(List<Integer> y, Double kaina) {
        List<Double> saskaitos = new ArrayList<>();

        for(int i = 0; i < y.size(); i++) {
            double suma = y.get(i) * kaina;
            saskaitos.add(suma);
        }

        return saskaitos;
    }

    static Double gautiSaskaituSuma(List<Double> saskaitos) {
        Double suma = 0d;
        for(int i = 0; i < saskaitos.size(); i++) {
            suma = suma + saskaitos.get(i);
        }
        return suma;
    }

    static Double gautiVienoKambarioSuma(Double suma, Integer kambariuSkaicius) {
        return suma / kambariuSkaicius;
    }
}

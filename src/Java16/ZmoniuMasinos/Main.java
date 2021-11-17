package Java16.ZmoniuMasinos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String zmoniuDuomenys = "src/Java16/ZmoniuMasinos/DarbuotojuDuomenys.txt";
        String masinuDuomenys = "src/Java16/ZmoniuMasinos/Masinos.txt";

        List<Zmogus> zmones = skaitytiZmones(zmoniuDuomenys);
        System.out.println(zmones.size());

        List<Masina> masinos = skaitytiMasinas(masinuDuomenys);
        System.out.println(masinos.size());

        Map<String, List<Masina>> m = apjungimas(zmones, masinos);
        System.out.println(m);
    }

    static List<Zmogus> skaitytiZmones(String failoKelias) {
        List<Zmogus> x = new ArrayList<>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();

            while(line != null) {
                String[] reiksmes = line.split(" ");

                String asmensKodas = reiksmes[0];
                String vardas = reiksmes[1];
                String pavarde = reiksmes[2];
                String masinosNr = reiksmes[3];

                Zmogus zmogus = new Zmogus(asmensKodas, vardas, pavarde, masinosNr);
                x.add(zmogus);
                line = br.readLine();
            }
            br.close();

        } catch(IOException e) {
            System.out.println("Netiketa klaida zmonese");
        }
        return x;
    }

    static List<Masina> skaitytiMasinas(String failoKelias) {
        List<Masina> y = new ArrayList<>();
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader(failoKelias));

            String line = br.readLine();

            while(line != null) {
                String[] reiksmes = line.split(" ");

                String marke = reiksmes[0];
                String masinosNr = reiksmes[1];

                Masina masina = new Masina(marke, masinosNr);
                y.add(masina);
                line = br.readLine();
            }
            br.close();
        }catch(IOException e) {
            System.out.println("netiketa klaida masinose");
        }

        return y;
    }
    // raktas: asmens kodas
    // reiksme: masinu sarasas
    static Map<String, List<Masina>> apjungimas(List<Zmogus> x, List<Masina> y) {
        Map<String, List<Masina>> mapas = new HashMap<>();
        for(int i = 0; i < x.size(); i++) {
            Zmogus zmogus = x.get(i);
            Masina ieskomaMasina = gautiMasinaPagalNr(y, zmogus.getMasinosNr());
            if(ieskomaMasina == null) {
                continue;
            }
            if(mapas.containsKey(zmogus.getAsmensKodas())) {
                List<Masina> istrauktaReiksme = mapas.get(zmogus.getAsmensKodas());
                istrauktaReiksme.add(ieskomaMasina);
            } else {
                List<Masina> zmogausMasinos = new ArrayList<>();
                zmogausMasinos.add(ieskomaMasina);
                mapas.put(zmogus.getAsmensKodas(), zmogausMasinos);
            }
        }
        return mapas;
    }

    static Masina gautiMasinaPagalNr(List<Masina> masinos, String ieskomosMasinosNr) {
        for(int i = 0; i < masinos.size(); i++) {
            if(masinos.get(i).getNumeriai().equals(ieskomosMasinosNr)) {
                return masinos.get(i);
            }
        }
        return null;
    }

}

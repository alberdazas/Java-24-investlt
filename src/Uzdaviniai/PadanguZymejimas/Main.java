package Uzdaviniai.PadanguZymejimas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String duomenys = "src/Uzdaviniai/PadanguZymejimas/duomenys.txt";
        List<Padanga> padangos = new ArrayList<>();
        Padanga ieskoma = skaityti(duomenys, padangos);
        System.out.println(ieskoma.getKaina());
        List<Padanga> atrinktosPadangos = gautiTinkamasPadangas(padangos, ieskoma);
        System.out.println("Tinkamu padangu skaicius: " + atrinktosPadangos.size());
        Double kainuSuma = gautiSuma(atrinktosPadangos);
        System.out.println("Jos kainuotu: " + kainuSuma +" Lt");
    }

    static Padanga skaityti(String failoKelias, List<Padanga> p) {
        Padanga ieskomaPadanga = null;
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            ieskomaPadanga = sukurtiPadanga(line);

            line = br.readLine();
            int kiekis = Integer.parseInt(line);
            for(int i = 0; i < kiekis; i++) {
                line = br.readLine();
                Padanga padanga = sukurtiPadanga(line);
                p.add(padanga);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }

        return ieskomaPadanga;
    }

    static Padanga sukurtiPadanga(String eilute) {
        String[] reiksmes = eilute.split(" ");
        String plotis = reiksmes[0];
        String aukstis = reiksmes[1];
        String skersmuo = reiksmes[2];
        if(reiksmes.length == 3) {
            Padanga padanga = new Padanga(plotis, aukstis, skersmuo);
            return padanga;
        }
        Double kaina = Double.parseDouble(reiksmes[3]);
        return new Padanga(plotis, aukstis, skersmuo, kaina);
    }

    static List<Padanga> gautiTinkamasPadangas(List<Padanga> padangos,
                                               Padanga ieskomaPadanga) {
        // Sukurti lista kuri grazinsim
        List<Padanga> tinkamos = new ArrayList<>();
        // Sukam cikla
        for(int i = 0; i < padangos.size(); i++) {
            Padanga p = padangos.get(i);
            // tikrinam ar sutampa laukai
//            if(ieskomaPadanga.getPlotis().equals(p.getPlotis()) &&
//            ieskomaPadanga.getAukstis().equals(p.getAukstis()) &&
//            ieskomaPadanga.getSkersmuo().equals(p.getSkersmuo())) {
            if(ieskomaPadanga.equals(p)) {
                tinkamos.add(p);
            }
        }
        return tinkamos;
    }

    static Double gautiSuma(List<Padanga> padangos) {
        Double suma = 0d;
        for(int i = 0; i < padangos.size(); i++) {
            Padanga x = padangos.get(i);
            suma = suma + x.getKaina();
        }
        return suma;
    }
}

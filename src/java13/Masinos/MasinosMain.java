package java13.Masinos;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MasinosMain {

    public static void main(String[] args) {
        String failoKelias = "src/Java13/Masinos/duomenys.txt";
        String rezultatai = "src/Java13/Masinos/rezultatai.txt";
        ArrayList<Car> masinos = skaitytiFaila(failoKelias);
        System.out.println(masinos.size());
        rasyti(rezultatai, masinos);
    }
    // Car[] -> ArrayList<Car>
    static ArrayList<Car> skaitytiFaila(String kelias) {
        BufferedReader br;
        ArrayList<Car> masinos = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(kelias));
            String line = br.readLine();
            int masinuKiekis = Integer.parseInt(line);

            for (int i = 0; i < masinuKiekis; i++) {
                line = br.readLine();
                String[] reiksmes = line.split(" ");

                String gamintojas = reiksmes[0];
                String modelis = reiksmes[1];
                String metai = reiksmes[2];
                double kaina = Double.parseDouble(reiksmes[3]);
                double variklioTuris = Double.parseDouble(reiksmes[4]);
                Kuras kuras = resolveKuras(reiksmes[5]);

                Car masina = new Car(gamintojas, modelis, metai
                        , kaina, variklioTuris, kuras);
                masinos.add(masina);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }

        return masinos;
    }

    static public Kuras resolveKuras(String kuras) {
        switch (kuras) {
            case "B":
                return Kuras.BENZINAS;
            case "D":
                return Kuras.DYZELINAS;
            case "BD":
                return Kuras.BENZINAS_DUJOS;
            case "E":
                return Kuras.ELEKTRA;
            default:
                return Kuras.NEZINOMAS;
        }
    }

    static void rasyti(String failoKelias, ArrayList<Car> a) {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(failoKelias));
            bw.write("Masinos:");
            bw.newLine();
            for (int i = 0; i < a.size(); i++) {
                bw.write(a.get(i).toString());
                bw.newLine();
            }
            Car seniausia = seniausiaMasina(a);
            bw.write("Seniausia masina:");
            bw.newLine();
            bw.write(seniausia.toString());
            bw.newLine();
            Car naujausia = naujausiaMasina(a);
            bw.write("Naujausia masina:");
            bw.newLine();
            bw.write(naujausia.toString());
            bw.newLine();
            bw.write("Naujesnes masinos nei 2008:");
            bw.newLine();
            ArrayList<Car> naujesnesNei2008 = naujesnesNei(a, 2008);
            for (int i = 0; i < naujesnesNei2008.size(); i++) {
                bw.write(naujesnesNei2008.get(i).toString());
                bw.newLine();
            }

            bw.write("Pagamintos tarp 2000 ir 2008:");
            bw.newLine();
            ArrayList<Car> pagamintosTarp2000Ir2008 = pagamintosTarp(a, 2000, 2008);
            for (int i = 0; i < pagamintosTarp2000Ir2008.size(); i++) {
                bw.write(pagamintosTarp2000Ir2008.get(i).toString());
                bw.newLine();
            }
            bw.write("VW gamintojo masinos:");
            bw.newLine();
            ArrayList<Car> vwMasinos = gamintojoFiltras(a, "VW");
            for(int i = 0; i < vwMasinos.size(); i++) {
                bw.write(vwMasinos.get(i).toString());
                bw.newLine();
            }
            bw.write("Didziausia variklio turi turinti masina:");
            bw.newLine();
            Car didelisTuris = didziausiasVariklioTuris(a);
            bw.write(didelisTuris.toString());
            bw.newLine();
            int benzininiuKiekis = filtruotiPagalKura(a, Kuras.BENZINAS);
            bw.write("Benzininiu Masinu kiekis: " + benzininiuKiekis);
            bw.newLine();
            int dyzeliuKiekis = filtruotiPagalKura(a, Kuras.DYZELINAS);
            bw.write("Dyzeliniu Masinu kiekis: " + dyzeliuKiekis);
            bw.close();
        } catch (IOException e) {
            System.out.println("Nepavyko irasyti");
        }
    }

    static Car seniausiaMasina(ArrayList<Car> y) {
        if (y.size() == 0) {
            return null;
        }

        Car seniausia = y.get(0);
        for (int i = 1; i < y.size(); i++) {
            int seniausiosMetai = Integer.parseInt(seniausia.getMetai());
            int masinosMetai = Integer.parseInt(y.get(i).getMetai());
            if (seniausiosMetai > masinosMetai) {
                seniausia = y.get(i);
            }
        }
        return seniausia;
    }

    // Naujausios masinos metodas
    static Car naujausiaMasina(ArrayList<Car> y) {
        if (y.size() == 0) {
            return null;
        }

        Car naujausia = y.get(0);
        for (int i = 1; i < y.size(); i++) {
            int naujausiosMetai = Integer.parseInt(naujausia.getMetai());
            int masinosMetai = Integer.parseInt(y.get(i).getMetai());
            if (naujausiosMetai < masinosMetai) {
                naujausia = y.get(i);
            }
        }
        return naujausia;
    }

    static ArrayList<Car> naujesnesNei(ArrayList<Car> x, int metai) {
        ArrayList<Car> naujesnesMasinos = new ArrayList<>();

        for (int i = 0; i < x.size(); i++) {
            int masinosMetai = Integer.parseInt(x.get(i).getMetai());
            if (masinosMetai > metai) {
                naujesnesMasinos.add(x.get(i));
            }
        }
        return naujesnesMasinos;
    }

    // 2000 ir 2008
    static ArrayList<Car> pagamintosTarp(ArrayList<Car> b, int nuoMetai, int ikiMetai) {
        ArrayList<Car> pagamintosTarp = new ArrayList<>();
        // Sukam cikla
        for (int i = 0; i < b.size(); i++) {
            int masinosMetai = Integer.parseInt(b.get(i).getMetai());
            // Tikriname masinosMetai > nuoMetai && masinosMetai < ikiMetai
            if (masinosMetai > nuoMetai && masinosMetai < ikiMetai) {
                // pridedame i masyva su pridetiElementa
                pagamintosTarp.add(b.get(i));
            }
        }
        return pagamintosTarp;
    }

    static ArrayList<Car> gamintojoFiltras(ArrayList<Car> k, String ieskomasGamintojas) {
        ArrayList<Car> filtruotos = new ArrayList<>();
        for (int i = 0; i < k.size(); i++) {
            String gamintojas = k.get(i).getGamintojas();
            if (gamintojas.equals(ieskomasGamintojas)) {
                filtruotos.add(k.get(i));
            }
        }
        return filtruotos;
    }

    static Car didziausiasVariklioTuris(ArrayList<Car> e) {
        if(e.size() == 0) {
            return null;
        }

        Car didziausias = e.get(0);
        for(int i = 0; i < e.size(); i++) {
            if(e.get(i).getVariklioTuris() > didziausias.getVariklioTuris()) {
                didziausias = e.get(i);
            }
        }
        return didziausias;
    }

    static int filtruotiPagalKura(ArrayList<Car> q, Kuras ieskomasKuras) {
        int kiekis = 0;
        for(int i = 0; i < q.size(); i++) {
            if(q.get(i).getKuroTipas().equals(ieskomasKuras)) {
                kiekis = kiekis + 1;
//                kiekis += 1;
//                kiekis++;
            }
        }
        return kiekis;
    }

    static Car[] pridetiElementa(Car[] masyvas, Car naujaMasyvoMasina) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = naujaMasyvoMasina;
        return masyvas;
    }
}

package Java12.Masinos;

import java.io.*;
import java.util.Arrays;

public class MasinosMain {

    public static void main(String[] args) {
        String failoKelias = "src/Java12/Masinos/duomenys.txt";
        String rezultatai = "src/Java12/Masinos/rezultatai.txt";
        Car[] masinos = skaitytiFaila(failoKelias);
        System.out.println(masinos.length);
        rasyti(rezultatai, masinos);
    }

    static Car[] skaitytiFaila(String kelias) {
        BufferedReader br;
        Car[] masinos = new Car[0];
        try {
            br = new BufferedReader(new FileReader(kelias));
            String line = br.readLine();
            int masinuKiekis = Integer.parseInt(line);
            masinos = new Car[masinuKiekis];

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
                masinos[i] = masina;
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

    static void rasyti(String failoKelias, Car[] a) {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(failoKelias));
            bw.write("Masinos:");
            bw.newLine();
            for (int i = 0; i < a.length; i++) {
                bw.write(a[i].toString());
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
            Car[] naujesnesNei2008 = naujesnesNei(a, 2008);
            for (int i = 0; i < naujesnesNei2008.length; i++) {
                bw.write(naujesnesNei2008[i].toString());
                bw.newLine();
            }

            bw.write("Pagamintos tarp 2000 ir 2008:");
            bw.newLine();
            Car[] pagamintosTarp2000Ir2008 = pagamintosTarp(a, 2000, 2008);
            for (int i = 0; i < pagamintosTarp2000Ir2008.length; i++) {
                bw.write(pagamintosTarp2000Ir2008[i].toString());
                bw.newLine();
            }
            bw.write("VW gamintojo masinos:");
            bw.newLine();
            Car[] vwMasinos = gamintojoFiltras(a, "VW");
            for(int i = 0; i < vwMasinos.length; i++) {
                bw.write(vwMasinos[i].toString());
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

    static Car seniausiaMasina(Car[] y) {
        if (y.length == 0) {
            return null;
        }

        Car seniausia = y[0];
        for (int i = 1; i < y.length; i++) {
            int seniausiosMetai = Integer.parseInt(seniausia.getMetai());
            int masinosMetai = Integer.parseInt(y[i].getMetai());
            if (seniausiosMetai > masinosMetai) {
                seniausia = y[i];
            }
        }
        return seniausia;
    }

    // Naujausios masinos metodas
    static Car naujausiaMasina(Car[] y) {
        if (y.length == 0) {
            return null;
        }

        Car naujausia = y[0];
        for (int i = 1; i < y.length; i++) {
            int naujausiosMetai = Integer.parseInt(naujausia.getMetai());
            int masinosMetai = Integer.parseInt(y[i].getMetai());
            if (naujausiosMetai < masinosMetai) {
                naujausia = y[i];
            }
        }
        return naujausia;
    }

    static Car[] naujesnesNei(Car[] x, int metai) {
        Car[] naujesnesMasinos = new Car[0];

        for (int i = 0; i < x.length; i++) {
            int masinosMetai = Integer.parseInt(x[i].getMetai());
            if (masinosMetai > metai) {
                naujesnesMasinos = pridetiElementa(naujesnesMasinos, x[i]);
            }
        }
        return naujesnesMasinos;
    }

    // 2000 ir 2008
    static Car[] pagamintosTarp(Car[] b, int nuoMetai, int ikiMetai) {
        Car[] pagamintosTarp = new Car[0];
        // Sukam cikla
        for (int i = 0; i < b.length; i++) {
            int masinosMetai = Integer.parseInt(b[i].getMetai());
            // Tikriname masinosMetai > nuoMetai && masinosMetai < ikiMetai
            if (masinosMetai > nuoMetai && masinosMetai < ikiMetai) {
                // pridedame i masyva su pridetiElementa
                pagamintosTarp = pridetiElementa(pagamintosTarp, b[i]);
            }
        }
        return pagamintosTarp;
    }

    static Car[] gamintojoFiltras(Car[] k, String ieskomasGamintojas) {
        Car[] filtruotos = new Car[0];
        for (int i = 0; i < k.length; i++) {
            String gamintojas = k[i].getGamintojas();
            if (gamintojas.equals(ieskomasGamintojas)) {
                filtruotos = pridetiElementa(filtruotos, k[i]);
            }
        }
        return filtruotos;
    }

    static Car didziausiasVariklioTuris(Car[] e) {
        if(e.length == 0) {
            return null;
        }

        Car didziausias = e[0];
        for(int i = 0; i < e.length; i++) {
            if(e[i].getVariklioTuris() > didziausias.getVariklioTuris()) {
                didziausias = e[i];
            }
        }
        return didziausias;
    }

    static int filtruotiPagalKura(Car[] q, Kuras ieskomasKuras) {
        int kiekis = 0;
        for(int i = 0; i < q.length; i++) {
            if(q[i].getKuroTipas().equals(ieskomasKuras)) {
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

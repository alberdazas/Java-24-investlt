package Java9.Zmogus;

import Java9.Figuros.Figura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Zmones {
    private Zmogus[] zmogeliukai; // null

    public Zmones() {
        this.zmogeliukai = new Zmogus[0];
    }

    public Zmones(Zmogus[] zmogeliukai) {
        this.zmogeliukai = zmogeliukai;
    }

    public Zmogus[] getZmogeliukai() {
        return zmogeliukai;
    }

    public void setZmogeliukai(Zmogus[] zmogeliukai) {
        this.zmogeliukai = zmogeliukai;
    }

    public void spausdinti() {
        for(int i = 0; i < zmogeliukai.length; i++) {
            System.out.println(zmogeliukai[i].gautiZmogausInformacija());
        }
    }

    public void skaitytiFaila(String failoKelias) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(failoKelias));
            String line = br.readLine();
            while(line != null) {
                String[] perskirtosReiksmes = line.split(" ");
                if(perskirtosReiksmes[0].equals("S")) {
                    int amzius = Integer.parseInt(perskirtosReiksmes[3]);
                    int kursas = Integer.parseInt(perskirtosReiksmes[4]);
                    Studentas studentas = new Studentas(perskirtosReiksmes[1], perskirtosReiksmes[2],
                            amzius, kursas, perskirtosReiksmes[5]);
                    zmogeliukai = pridetiElementa(zmogeliukai, studentas);
                } else if(perskirtosReiksmes[0].equals("D")) {
                    int amzius = Integer.parseInt(perskirtosReiksmes[3]);
                    int stazas = Integer.parseInt(perskirtosReiksmes[4]);
                    Darbuotojas darbuotojas = new Darbuotojas(perskirtosReiksmes[1], perskirtosReiksmes[2],
                            amzius, stazas, perskirtosReiksmes[5]);
                    zmogeliukai = pridetiElementa(zmogeliukai, darbuotojas);
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Zmogus[] pridetiElementa(Zmogus[] masyvas, Zmogus reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }

    public Zmogus gautiVyriausiaZmogu() {
        Zmogus vyriausias = zmogeliukai[0];
        for (int i = 1; i < zmogeliukai.length; i++) {
            if(vyriausias.getAmzius() < zmogeliukai[i].getAmzius()) {
                vyriausias = zmogeliukai[i];
            }
        }
        return vyriausias;
    }
}

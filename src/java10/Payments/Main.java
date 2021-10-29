package java10.Payments;

import java10.Kvadratas.Kvadratas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Employee darbuotojas = new Employee("LT123", 500);
//        Client klientas = new Client("LT456", 999);
////        Kvadratas kvad = new Kvadratas(2);
//
//        Payment[] masyvas = {darbuotojas, klientas};
//        for(int i = 0; i < masyvas.length; i++) {
//            System.out.println(masyvas[i].getBankAccount());
//        }
        Client klientas1 = new Client("LT123", new double[]{200, 100, 50});
        Client klientas2 = new Client("LT456", new double[]{200, 100, 50, 99, 59});
        Client klientas3 = new Client("LT789", new double[]{200, 100, 50, 90});
        Client klientas4 = new Client("LT142", new double[]{200, 100, 50, 24, 22});
        Client klientas5 = new Client("LT173", new double[]{200, 100, 50, 1000});

        Client[] klientai = {klientas1, klientas2, klientas3, klientas4, klientas5};

        Client[] daugiausiaMokantys = daugiausiaMokejimu(klientai);
        System.out.println("Daugiausia kartu atlike mokejima:");
        spausdinti(daugiausiaMokantys);

        double mokejimuVidurkis = mokejimuVidurkis(klientai);
        System.out.println("Vidurkis = " + mokejimuVidurkis);

        Client[] duKartVidurkis = mokejimasVirsyjaVidurkiDuKartus(klientai);
        System.out.println("Klientai kuriu mokejimai virsyja visu mokejimu vidurki 2 kartus");
        spausdinti(duKartVidurkis);

    }

    static int didziausiasMokejimuKiekis(Client[] x) {
        int max = 0;
        for(int i = 0; i < x.length; i++) {
            if(max < x[i].getPayments().length) {
                max = x[i].getPayments().length;
            }
        }
        return max;
    }

    static Client[] daugiausiaMokejimu(Client[] y) {
        Client[] daugiausiaMokantys = new Client[0];
        int max = didziausiasMokejimuKiekis(y);
        for(int i = 0; i < y.length; i++) {
            if(max == y[i].getPayments().length) {
                daugiausiaMokantys = Arrays.copyOf(daugiausiaMokantys, daugiausiaMokantys.length + 1);
                daugiausiaMokantys[daugiausiaMokantys.length - 1] = y[i];
            }
        }

        return daugiausiaMokantys;
    }

    static void spausdinti(Client[] z) {
        for(int i = 0; i < z.length; i++) {
            System.out.println(z[i].getBankAccount() + " " + z[i].getPayments().length);
        }
    }

    static double mokejimuVidurkis(Client[] a) {
        double suma = 0;
        int kiekis = 0;

        for(int i = 0; i < a.length; i++) {
            suma = suma + a[i].getAmount();
            kiekis = kiekis + a[i].getPayments().length;
        }

        return suma / kiekis;
    }

    static Client[] mokejimasVirsyjaVidurkiDuKartus(Client[] b) {
        Client[] virsyjaVidurkiDuKartus = new Client[0];
        double vid = mokejimuVidurkis(b);

        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].getPayments().length; j++) {
                double mokejimas = b[i].getPayments()[j];
                if(mokejimas > vid * 2) {
                    virsyjaVidurkiDuKartus = Arrays.copyOf(virsyjaVidurkiDuKartus, virsyjaVidurkiDuKartus.length + 1);
                    virsyjaVidurkiDuKartus[virsyjaVidurkiDuKartus.length -1] = b[i];
                    break;
                }
            }
        }
        return virsyjaVidurkiDuKartus;
    }
}

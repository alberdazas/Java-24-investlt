package Java8;

import java.util.Scanner;

public class Savarankiskai {
    public static void main(String[] args) {
        String tekstas = "Labas rytas. Kaip sekasi?";
        int zodziuSkaicius = gautiZodziuSkaiciu(tekstas);
        System.out.println("Zodziu skaicius = " + zodziuSkaicius);
        System.out.println("-----------------------------");

        String slaptazodis = "123456789";
        boolean arGeras = tikrintiSlaptazodi(slaptazodis);
        System.out.println("Ar geras slaptazodis? " + arGeras);
        System.out.println("-----------------------------");
        int[] masyvas = {2, 3, 4, 5, 2, 3, 2, 2, 6, 8, 7};
        System.out.println("2 Kartojasi = " + kiekKartojasi(masyvas, 2));
        System.out.println("6 Kartojasi = " + kiekKartojasi(masyvas, 6));
        System.out.println("10 Kartojasi = " + kiekKartojasi(masyvas, 10));
        System.out.println("-----------------------------");
        System.out.println("Nuskaitytas skaicius = " + nuskaitytiSkaiciu());
        System.out.println("-----------------------------");
        int skaicius1 = 12;
        System.out.println("Ar " + skaicius1 + " palindromas? " + arPalindromas(skaicius1));
        int skaicius2 = 123;
        System.out.println("Ar " + skaicius2 + " palindromas? " + arPalindromas(skaicius2));
        int skaicius3 = 123454321;
        System.out.println("Ar " + skaicius3 + " palindromas?" + arPalindromas(skaicius3));
        System.out.println("-----------------------------");
        System.out.println("Ar dvigubai didesnis? " + arDvigubaiDidesnis(4, 2));
        System.out.println("Ar dvigubai didesnis? " + arDvigubaiDidesnis(5, 2));
        System.out.println("-----------------------------");
        String zodis = "qwertyuiop";
        System.out.println(zodis + " atsitiktine raide = " + gautiAtsitiktineZodzioRaide(zodis));

    }

    public static int gautiZodziuSkaiciu(String x) {
        String[] zodziai = x.split(" ");
        return zodziai.length;
    }

    public static boolean tikrintiSlaptazodi(String s) {
        return s.length() > 8;
//        if(s.length() > 8) {
//            return true;
//        }
//        return false;
    }

    public static int kiekKartojasi(int[] masyvas, int reiksme) {
        int kartojimuKiekis = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] == reiksme) {
//                kartojimuKiekis++;
//                kartojimuKiekis += 1;
                kartojimuKiekis = kartojimuKiekis + 1;
            }
        }
        return kartojimuKiekis;
    }

    public static int nuskaitytiSkaiciu() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int x = reader.nextInt();
        reader.close();
        return x;
    }

    // 12 21 = false
    // 121 121 = true
    public static boolean arPalindromas(int skaicius) {
        String skaiciusString = String.valueOf(skaicius);
        char[] simboliai = skaiciusString.toCharArray(); // .split("")
        String atvirksciasSkaicius = ""; // "2" "21"
        for (int i = simboliai.length - 1; i >= 0; i--) {
            atvirksciasSkaicius = atvirksciasSkaicius + simboliai[i];
        }
        return skaiciusString.equals(atvirksciasSkaicius);
    }
    // x = 4; y = 2; = true
    // x = 8; y = 3; = false
    public static boolean arDvigubaiDidesnis(int x, int y) {
        return x == y * 2;
    }

    public static int gautiAtsitiktiniSkaiciu(int min, int max) {
        return (int) ((Math.random() * (max - min) + min));
    }

    public static char gautiAtsitiktineZodzioRaide(String zodis) {
//        if(zodis.length() == 0) {
//            return '';
//        }
        // Labas - paskutinio elemento vieta 4
        int atsitiktinisSkaicius = gautiAtsitiktiniSkaiciu(0, zodis.length() - 1);
        return zodis.charAt(atsitiktinisSkaicius);
    }
}

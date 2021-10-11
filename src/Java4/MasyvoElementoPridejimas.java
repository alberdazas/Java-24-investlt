package Java4;

import java.util.Arrays;

public class MasyvoElementoPridejimas {

    public static void main(String[] args) {
        int[] a = new int[0];
        a = pridetiElementa(a, 10);
        a = pridetiElementa(a, 9999);
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    static int[] pridetiElementa(int[] masyvas, int reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }
}

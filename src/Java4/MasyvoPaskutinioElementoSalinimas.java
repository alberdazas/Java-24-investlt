package Java4;

import java.util.Arrays;

public class MasyvoPaskutinioElementoSalinimas {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        a = paskutinioElementoSalinimas(a);
        a = paskutinioElementoSalinimas(a);

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        double[] b = {3,4,5};
        b = paskutinioElementoSalinimas(b);
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

    static int[] paskutinioElementoSalinimas(int[] masyvas) {
        return Arrays.copyOf(masyvas, masyvas.length - 1);
    }

    static double[] paskutinioElementoSalinimas(double[] masyvas) {
        return Arrays.copyOf(masyvas, masyvas.length - 1);
    }
}

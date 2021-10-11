package Java4;

public class Masyvas {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};

//        System.out.println(a[1]);
//        System.out.println(a[a.length - 1]);

        a[1] = 99999;

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        double[] b = new double[5];
        b[0] = 2;
        b[3] = 888;

        int indeksas = 0;
        System.out.println(b[indeksas]);
//        System.out.println(b[0]);
    }
}

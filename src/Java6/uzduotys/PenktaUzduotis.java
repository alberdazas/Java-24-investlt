package Java6.uzduotys;

import Java5.uzduotys.PirmaUzduotis;

public class PenktaUzduotis {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array = iterptiElementa(array, 9, 10);
        printArray(array);
    }

    static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static int[] iterptiElementa(int[] masyvas, int reiksme, int vieta) {
        if(masyvas.length < vieta) {
//            Susikurti savo arba patikrinti jei toks exception egzistuoja
//            throws new ArrayNotBigEnoughException();
            System.out.println("Nera tokios vietos");
            return masyvas;
        }
        int[] laikinas = new int[masyvas.length + 1];
        int pridejimoVieta = 0;

        for(int i = 0; i < masyvas.length; i++) {
            if(i == vieta) {
                laikinas[pridejimoVieta] = reiksme;
                pridejimoVieta = pridejimoVieta + 1;
            }
            laikinas[pridejimoVieta] = masyvas[i];
            pridejimoVieta = pridejimoVieta + 1;

        }
        return laikinas;
    }
}

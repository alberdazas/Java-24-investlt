package Java4;

public class MasyvoElementoSalinimasPagalIndeksa {

    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,5};
        a = istrintiPagalIndeksa(a, 1);

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static int[] istrintiPagalIndeksa(int[] masyvas, int vieta) {
        int[] laikinas = new int[masyvas.length - 1];
        int salinamasIndeksas = 0;

        for(int i =0 ; i < masyvas.length;i++) {
            if(i != vieta) {
                laikinas[salinamasIndeksas] = masyvas[i];
                salinamasIndeksas = salinamasIndeksas + 1;
            }
        }

        return laikinas;
    }
}

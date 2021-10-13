package Java5;

public class MetoduSmagumynaiMasyvas {
    public static void main(String[] args) {
        int[] masyvasMaine = {1,2,3,4};
        spausdinti(masyvasMaine);
        metodas(masyvasMaine);
        spausdinti(masyvasMaine);
    }

    static void spausdinti(int[] masyvas) {
        System.out.println("Masyvas:");
        for(int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
    }

    static void metodas(int[] masyvas) {
        masyvas[0] = -1;
    }
}

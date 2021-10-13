package Java5;

public class Metodas {

    public static void main(String[] args) {
        int didelisSkacius = 10000;
        spausdintiReiksme(didelisSkacius, "Belekas");
        spausdintiReiksme(10, "Labas");
        spausdintiReiksme(padidintiVienetu(5/2), "bum bum");

        daugParametru(1, 2.5, "labas", "vakaras", "rytas", "bum");
    }

    static void spausdintiReiksme(int skaicius, String tekstas) {
        System.out.println(tekstas + skaicius);
    }

    static int padidintiVienetu(int skaicius) {
        return skaicius + 1;
    }

    static void daugParametru(int skaicius, double vidurkis, String... tekstai) {
        System.out.println("Skaicius = " + skaicius);
        System.out.println("Vidurkis = " + vidurkis);
        for(int i = 0; i < tekstai.length; i++) {
            System.out.println(tekstai[i]);
        }
    }
}

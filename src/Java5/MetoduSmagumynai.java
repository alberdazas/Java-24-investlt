package Java5;

public class MetoduSmagumynai {

    public static void main(String[] args) {
        int a = 100;
        System.out.println("Pries pakeitima = " + a);
        pakeistiReiksme(a);
        System.out.println("Po pakeitimo = " + a);

        Integer a2 = 50;
        System.out.println("Pries pakeitima = " + a2);
        pakeistiReiksme2(a2);
        System.out.println("Po pakeitimo = " + a2);
    }

    static void pakeistiReiksme(int skaicius) {
        skaicius = 0;
        System.out.println("pakeistiReiksme" + skaicius);
    }

    static void pakeistiReiksme2(Integer skaicius) {
        skaicius = 0;
    }
}

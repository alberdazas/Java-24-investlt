package Java5;

public class Stringai {
    public static void main(String[] args) {
        String tekstas = "Labas vakaras";
        String b = tekstas;

        changeString(tekstas);

        System.out.println(tekstas);
        System.out.println(b);

    }

    static void changeString(String a){
        a = a + " rytas";
    }

//    static void pakeistiNuliusIteigiamusSkaicius(int[] masyvas)

}

package Java2;

public class Kintamieji {

    public static void main(String[] args) {
        // KintamojoTipas kintamojoPavadinimas = reiksme;
        boolean buljonas = false;
        System.out.println("Reiksme = " + buljonas);

        Boolean geresnisBuljonas = null;
        System.out.println("Kita reiksme = " + geresnisBuljonas);

        int sveikasSkaicius = 5;
        System.out.println(sveikasSkaicius);

        Integer geresnisSveikasSkaicius = 6;
        System.out.println(geresnisSveikasSkaicius);

        double nesveikasSkaicius = 5d;
        System.out.println(nesveikasSkaicius);

        Double geresnisNesveikasSkaicius = 5.0;
        System.out.println(geresnisNesveikasSkaicius);

        Double suma = nesveikasSkaicius + geresnisNesveikasSkaicius;

        String tekstas = "Cia yra musu tekstas";
        String tekstas2 = "Kitas musu tekstas = ";
        String tarpas = " ";
        System.out.println(tekstas + tarpas + tekstas2 + suma);
        System.out.println(nesveikasSkaicius + geresnisNesveikasSkaicius + tekstas + tarpas + tekstas2);

        Character simbolis = 'a';
        System.out.println(simbolis);
    }
}

package Java9.Zmogus;

public class ZmonesMain {

    public static void main(String[] args) {
//        Studentas studentas = new Studentas("Antanas", "Antanauskas", 24, 3, "Vadyba");
//        Darbuotojas darbuotojas = new Darbuotojas("Jonas", "Jonauskas", 30, 5, "Stalius");
//
//        Zmogus[] masyvas = {studentas, darbuotojas};
//        Zmones konteineris = new Zmones(masyvas);
//        konteineris.spausdinti();

        String failoKelias = "src/Java9/Zmogus/duomenys.txt";
        Zmones konteineris = new Zmones();
        konteineris.skaitytiFaila(failoKelias);
        konteineris.spausdinti();

        System.out.println("Vyriausias zmogus:");
        Zmogus vyriausias = konteineris.gautiVyriausiaZmogu();
        System.out.println(vyriausias.gautiZmogausInformacija());

    }
}

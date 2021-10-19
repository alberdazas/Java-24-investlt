package Java7;

public class HumanNaudojimoPavyzdys {

    public static void main(String[] args) {
        Human zmogus = new Human();
        System.out.println(zmogus.getName());
        zmogus.setName("Andrius");
        zmogus.setLastName("Pavarde");
        zmogus.setPersonalId("333333");
        zmogus.setPersonalId("44444");
        System.out.println(zmogus.getName());

        Human zmogus2 = new Human();
        zmogus2.setName("Petras");
        System.out.println(zmogus2.getName());
        zmogus2.katu();

        Human[] zmoniuMasyvas = {zmogus, zmogus2, zmogus2, zmogus2, zmogus2, zmogus2};

        for (Human reiksme : zmoniuMasyvas) {
            System.out.println(reiksme);
        }

        Human zmogusSuVardu = new Human("KONSTRUKTORIAUS VARDAS");
        System.out.println("ZMOGUS SU VARDU: " + zmogusSuVardu);
        Human zmogusSuVisaisDuomenimis = new Human("KONSTRUKTORIAUS VARDAS", "KONSTRUKTORIAUS PAVARDE",
                "KONSTRUKTORIAUS ASMENS KODAS");

        System.out.println("ZMOGUS SU VISAIS DUOMENIMIS: " + zmogusSuVisaisDuomenimis);
    }
}

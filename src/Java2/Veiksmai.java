package Java2;

public class Veiksmai {

    public static void main(String[] args) {
        int ats = 7 / 4;
        System.out.println(ats);
        int pirmasSkaicius = 7;
        int antrasSkaicius = 4;
        double ats2 = pirmasSkaicius / (antrasSkaicius * 1.0);
        System.out.println(ats2);
        System.out.println("-----------------------------------------");
        int didinam = 1;

        System.out.println(didinam++);
        System.out.println(didinam);
        System.out.println(++didinam);
        System.out.println(didinam++);
        System.out.println(didinam);
        System.out.println(++didinam);

        System.out.println("-----------------------------------------");
        String tekstas = "Labas";
//        tekstas = tekstas + " vakaras";
        tekstas += " vakaras";

        System.out.println(tekstas);
    }
}

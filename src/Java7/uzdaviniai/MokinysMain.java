package Java7.uzdaviniai;

public class MokinysMain {
    public static void main(String[] args) {
        String vardas = "Andrius";
        String pavarde = "Andriauskas";
        String klase = "3a";
        int[] pazymiai = {4, 6, 7, 5, 4, 8};
        Mokinys mokinys1 = new Mokinys(vardas, pavarde, klase, pazymiai);
        Mokinys mokinys2 = new Mokinys("Jonas", "Jonaitis", "4a", new int[]{5,7,8,9,10,4});
        Mokinys mokinys3 = sukurtiMokini("Petras", "Petraitis", "5a", new int[]{4, 4, 4, 4});
        Mokinys mokinys4 = new Mokinys("Darius", "Darelis", "6c", new int[]{5, 8, 10, 9, 6, 4});
        Mokinys mokinys5 = new Mokinys("Onute", "Kazlauskiene", "11b", new int[]{4, 2, 6, 8, 10});

        Mokinys[] mokiniai = {mokinys1, mokinys2, mokinys3, mokinys4, mokinys5};

        System.out.println(mokiniai[2].vidurkis());
        System.out.println(mokiniai[4].vidurkis());

        Mokinys geriausiaiBesimokantis = gautiGeriausiaiBesimokanti(mokiniai);
        System.out.println(geriausiaiBesimokantis);
    }

    static Mokinys sukurtiMokini(String vardas, String pavarde, String klase, int[] pazymiai) {
        return new Mokinys(vardas, pavarde, klase, pazymiai);
    }

    static Mokinys gautiGeriausiaiBesimokanti(Mokinys[] mokiniai) {
        Mokinys geriausiaiBesimokantis = mokiniai[0];
        for(int i = 1; i < mokiniai.length; i++) {
            if(geriausiaiBesimokantis.vidurkis() < mokiniai[i].vidurkis()) {
                geriausiaiBesimokantis = mokiniai[i];
            }
        }
        return geriausiaiBesimokantis;
    }
}

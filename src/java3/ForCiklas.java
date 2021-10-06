package java3;

public class ForCiklas {
    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++) {
//            System.out.println("i lygu = " + i);
//            for(int j = 0; j < 10; j++) {
//                System.out.println("i lygu " + i);
//            }
//        }

        int skaicius = 2;
        int laipsnis = 4;
        int rezultatas = skaicius;
        for(int i = 0; i < laipsnis; i++) {
            rezultatas = rezultatas * skaicius;
        }

        System.out.println("Keltas skaicius = " + skaicius);
        System.out.println("Laipsnis = " + laipsnis);
        System.out.println("Rezultatas = " + rezultatas);

    }
}

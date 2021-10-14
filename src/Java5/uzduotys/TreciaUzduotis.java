package Java5.uzduotys;

public class TreciaUzduotis {

    public static void main(String[] args) {
        arLyginis(3);
        arLyginis(2);
    }

    static void arLyginis(int skaicius) {
        System.out.print("Skaicius " + skaicius + " yra ");
        if(skaicius % 2 == 0) {
            System.out.println("lyginis");
        } else {
            System.out.println("nelyginis");
        }
    }
}

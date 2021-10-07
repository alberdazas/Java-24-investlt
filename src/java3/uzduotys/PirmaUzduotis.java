package java3.uzduotys;

public class PirmaUzduotis {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        for(int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
        int i = 1;
        while(i <= 100) {
            System.out.println(i);
            i++;
        }
        i = 100;
        while(i > 0) {
            System.out.println(i);
            i--;
        }

        i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= 100);
        i = 100;
        do {
            System.out.println(i);
            i--;
        } while(i > 0);
    }
}

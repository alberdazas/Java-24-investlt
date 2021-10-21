package Java8;

public class Savarankiskai {
    public static void main(String[] args) {
        String tekstas = "Labas rytas. Kaip sekasi?";
        int zodziuSkaicius = gautiZodziuSkaiciu(tekstas);
        System.out.println("Zodziu skaicius = " + zodziuSkaicius);
        System.out.println("-----------------------------");

        String slaptazodis = "123456789";
        boolean arGeras = tikrintiSlaptazodi(slaptazodis);
        System.out.println("Ar geras slaptazodis? " + arGeras);
    }

    public static int gautiZodziuSkaiciu(String x) {
        String[] zodziai = x.split(" ");
        return zodziai.length;
    }

    public static boolean tikrintiSlaptazodi(String s) {
        return s.length() > 8;
//        if(s.length() > 8) {
//            return true;
//        }
//        return false;
    }
}

package java3.uzduotys;

public class KetvirtaUzduotis {
    public static void main(String[] args) {
        int suma = 0;
        int i = 0;
        while(suma < 12) {
            suma = suma + i;
            i++;
        }
//        for(int i = 0; i < 1000; i++) {
//            if(suma > 12) {
//                break;
//            }
//            suma = suma + i;
//        }
        System.out.println("Suma = " + suma);
    }
}

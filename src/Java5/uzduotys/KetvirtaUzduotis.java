package Java5.uzduotys;

public class KetvirtaUzduotis {

    public static void main(String[] args) {
        double[] array = {2d, 3.5, 99d, -13d};
        System.out.println("Average = " + average(array));
    }

    static double sum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
            sum += array[i];
        }
        return sum;
    }

    static double average(double[] array) {
//        double sum = sum(array);
//        return sum / array.length;
        return sum(array) / array.length;
    }
}

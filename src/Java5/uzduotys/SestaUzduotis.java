package Java5.uzduotys;

public class SestaUzduotis {

    public static void main(String[] args) {
        double[] array = {2d, -1d, 15.5, 13.3, 10.333, -1.1};
        System.out.println(minValue(array));
    }

    static double minValue(double[] array) {
        double min = Double.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}

package Java6.prisiminimui;

import Java4.uzduotys.Uzduotys;

import java.io.*;
import java.util.Arrays;

public class Prisiminimui {

    public static void main(String[] args) {
        int[] data = readFile("src/java6/prisiminimui/duomenys.txt");
        printArray(data);
        int suma = sum(data);
        System.out.println("Suma = " + suma);

        double vidurkis = average(suma, data.length);
        System.out.println("Vidurkis = " + vidurkis);

        int maziausia = minValue(data);
        int didziausia = maxValue(data);

        System.out.println("Maziausia reiksme = " + maziausia);
        System.out.println("Didziausia reiksme = " + didziausia);

        print("src/java6/prisiminimui/rezultatai.txt", data, suma, vidurkis,
                maziausia, didziausia);
    }

    static int[] readFile(String filePath) {
        int[] array = new int[0];

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            String[] values = line.split(",");

            for(String value: values) {
                int number = Integer.parseInt(value);
                array = pridetiElementa(array, number);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return array;
    }

    static int sum(int[] array) {
        int sum = 0;
        for(int a: array) {
            sum = sum + a;
        }
        return sum;
    }

    static double average(int sum, int count) {
        return 1.0 * sum / count;
    }

    static int maxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int a: array) {
            if(a > max) {
                max = a;
            }
        }
        return max;
    }

    static int minValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int a: array) {
            if(a < min) {
                min = a;
            }
        }
        return min;
    }

    static void print(String filePath, int[] array, int sum, double average,
                      int minValue, int maxValue) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            printArray(bw, array);
            bw.newLine();
            bw.write("Suma = " + sum);
            bw.newLine();
            bw.write("Vidurkis = " + average);
            bw.newLine();
            bw.write("Maziausia reiksme = " + minValue);
            bw.newLine();
            bw.write("Didziausia reiksme = " + maxValue);

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printArray(int[] array) {
        for(int a: array) {
            System.out.println(a + " ");
        }
    }

    static void printArray(BufferedWriter bufferedWriter, int[] array) throws IOException {
        for (int a: array) {
            bufferedWriter.write(a + " ");
        }
    }

    static int[] pridetiElementa(int[] masyvas, int reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }
}

package Java4.uzduotys;

import java.io.*;
import java.util.Arrays;

public class UzduotysSuFunkcijom {
    public static void main(String[] args) {
        String dataFile = "src/java4/uzduotys/duomenys.txt";
        String resultFile = "src/java4/uzduotys/atsakymai.txt";

        int[] masyvas = new int[0];
        int[] didesniSkaiciaiUzVidurki = new int[0];
        int[] neigiamiSkaiciai = new int[0];
        int[] pasikartojantysSkaiciai = new int[0];
        int[] surikiuotasMasyvas = new int[0];


        masyvas = readFile(dataFile);

//        Skaiciavimu vieta
        int suma = sum(masyvas);
        double vidurkis = average(suma, masyvas.length);

        int minIndeksas = minIndex(masyvas);
        int maxIndeksas = maxIndex(masyvas);

        didesniSkaiciaiUzVidurki = biggerThanAverage(masyvas, vidurkis);
        neigiamiSkaiciai = smallerThanZero(masyvas);

        pasikartojantysSkaiciai = repeatingValues(masyvas);

        int antrasMinIndeksas = secondMinIndex(masyvas, minIndeksas);
        int antrasMaxIndeksas = secondMaxIndex(masyvas, maxIndeksas);

        boolean arEgzistuojaTrys = doesNumberExistsInArray(masyvas, 3);

        surikiuotasMasyvas = Arrays.copyOf(masyvas, masyvas.length);
        bubbleSort(surikiuotasMasyvas);

        print(resultFile, masyvas, suma, vidurkis, minIndeksas,
                maxIndeksas, didesniSkaiciaiUzVidurki, neigiamiSkaiciai, pasikartojantysSkaiciai,
                antrasMinIndeksas, antrasMaxIndeksas, arEgzistuojaTrys, surikiuotasMasyvas);
    }

    static int[] readFile(String filePath) {
        int[] masyvas = new int[0];
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            while (line != null) {
                int skaicius = Integer.parseInt(line);
                masyvas = pridetiElementa(masyvas, skaicius);
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }
        return masyvas;
    }

    static int sum(int[] masyvas) {
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            suma = suma + masyvas[i];
        }
        return suma;
    }

    static double average(int sum, int count) {
        return 1.0 * sum / count;
    }

    static int minIndex(int[] masyvas) {
        int minIndeksas = 0;
        for (int i = 1; i < masyvas.length; i++) {
            if (masyvas[minIndeksas] > masyvas[i]) {
                minIndeksas = i;
            }
        }
        return minIndeksas;
    }

    static int maxIndex(int[] masyvas) {
        int maxIndeksas = 0;
        for (int i = 1; i < masyvas.length; i++) {
            if (masyvas[maxIndeksas] < masyvas[i]) {
                maxIndeksas = i;
            }
        }
        return maxIndeksas;
    }

    static int[] biggerThanAverage(int[] masyvas, double average) {
        int[] didesniSkaiciaiUzVidurki = new int[0];
        for (int i = 0; i < masyvas.length; i++) {
            if (average < masyvas[i]) {
                didesniSkaiciaiUzVidurki = pridetiElementa(didesniSkaiciaiUzVidurki, masyvas[i]);
            }
        }
        return didesniSkaiciaiUzVidurki;
    }

    static int[] smallerThanZero(int[] masyvas) {
        int[] neigiamiSkaiciai = new int[0];
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < 0) {
                neigiamiSkaiciai = pridetiElementa(neigiamiSkaiciai, masyvas[i]);
            }
        }
        return neigiamiSkaiciai;
    }

    static int[] repeatingValues(int[] masyvas) {
        int[] pasikartojantysSkaiciai = new int[0];
        boolean arPasikartoja = false;
        boolean arYraPasikartojanciuMasyve = false;
        for (int i = 0; i < masyvas.length; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] == masyvas[j]) {
                    arPasikartoja = true;
                    break;
                }
            }
            if (arPasikartoja) {
                for (int j = 0; j < pasikartojantysSkaiciai.length; j++) {
                    if (pasikartojantysSkaiciai[j] == masyvas[i]) {
                        arYraPasikartojanciuMasyve = true;
                        break;
                    }
                }
                if (!arYraPasikartojanciuMasyve) {
                    pasikartojantysSkaiciai = pridetiElementa(pasikartojantysSkaiciai, masyvas[i]);
                }
            }
            arPasikartoja = false;
            arYraPasikartojanciuMasyve = false;
        }
        return pasikartojantysSkaiciai;
    }

    static int secondMinIndex(int[] masyvas, int minIndeksas) {
        int antrasMinIndeksas = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > masyvas[minIndeksas] &&
                    masyvas[i] < masyvas[antrasMinIndeksas]) {
                antrasMinIndeksas = i;
            }
        }
        return antrasMinIndeksas;
    }

    static int secondMaxIndex(int[] masyvas, int maxIndeksas) {
        int antrasMaxIndeksas = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < masyvas[maxIndeksas] &&
                    masyvas[i] > masyvas[antrasMaxIndeksas]) {
                antrasMaxIndeksas = i;
            }
        }
        return antrasMaxIndeksas;
    }

    static boolean doesNumberExistsInArray(int[] masyvas, int reiksme) {
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] == reiksme) {
                return true;
            }
        }
        return false;
    }

    static void bubbleSort(int[] surikiuotasMasyvas) {
        int laikinas;
        for (int i = 0; i < surikiuotasMasyvas.length; i++) {
            for (int j = 1; j < surikiuotasMasyvas.length - i; j++) {
                if (surikiuotasMasyvas[j - 1] > surikiuotasMasyvas[j]) {
                    laikinas = surikiuotasMasyvas[j - 1];
                    surikiuotasMasyvas[j - 1] = surikiuotasMasyvas[j];
                    surikiuotasMasyvas[j] = laikinas;
                }
            }
        }
    }

    static void print(String filePath, int[] masyvas, int suma, double vidurkis,
                      int minIndeksas, int maxIndeksas, int[] didesniSkaiciaiUzVidurki,
                      int[] neigiamiSkaiciai, int[] pasikartojantysSkaiciai, int antrasMinIndeksas,
                      int antrasMaxIndeksas, boolean arEgzistuojaTrys, int[] surikiuotasMasyvas) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(filePath));
            printLn(bw, "Nuskaityti duomenys:");
            printArray(bw, masyvas);

            printLn(bw, "1. Apsuktas masyvas:");
            printArrayReversed(bw, masyvas);

            printLn(bw, "2. Suma ir Vidurkis:");
            printLn(bw, "Suma = " + suma);
            printLn(bw, "Vidurkis = " + vidurkis);

            printLn(bw, "3. Min ir Max:");
            printLn(bw, "Min = " + masyvas[minIndeksas]);
            printLn(bw, "Max = " + masyvas[maxIndeksas]);

            printLn(bw, "4. Reiksmes didesnes uz vidurki:");
            printArray(bw, didesniSkaiciaiUzVidurki);

            printLn(bw, "5. Neigiami skaiciai:");
            printArray(bw, neigiamiSkaiciai);

            printLn(bw, "6. Pasikartojancios reiksmes:");
            printArray(bw, pasikartojantysSkaiciai);

            printLn(bw,"7. Antra maziausia reiksme:");
            printLn(bw,"Antra maziausia reiksme = " + masyvas[antrasMinIndeksas]);

            printLn(bw,"8. Antra didziausia reiksme:");
            printLn(bw,"Antra didziausia reiksme = " + masyvas[antrasMaxIndeksas]);

            printLn(bw,"9. Ar egzistuoja skaicius 3 ?");
            if (arEgzistuojaTrys) {
                printLn(bw,"Taip");
            } else {
                printLn(bw,"Ne");
            }

            printLn(bw,"10. Surikiuotas masyvas:");
            printArray(bw, surikiuotasMasyvas);

            bw.close();
        } catch (IOException e) {
            System.out.println("Kazkas netiketo rasyme");
        }

    }

    static void printLn(BufferedWriter bw, String title) throws IOException {
        bw.write(title);
        bw.newLine();
    }

    static void printArray(BufferedWriter bw, int[] masyvas) throws IOException {
        for (int i = 0; i < masyvas.length; i++) {
            bw.write(masyvas[i] + " ");
        }
        bw.newLine();
    }

    static void printArrayReversed(BufferedWriter bw, int[] masyvas) throws IOException {
        for (int i = masyvas.length - 1; i >= 0; i--) {
            bw.write(masyvas[i] + " ");
        }
        bw.newLine();
    }

    static int[] pridetiElementa(int[] masyvas, int reiksme) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = reiksme;
        return masyvas;
    }
}

package Java15;

import java.util.Scanner;

public class Skaiciuotuvas {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite veiksma:");
        int veiksmas = reader.nextInt();

        int skaicius = reader.nextInt();
        int rezultatas = 0;
        int i = 0;

        while (skaicius != 0) {

            switch (veiksmas) {
                // Suma
                case 1: {
                    rezultatas = rezultatas + skaicius;
                    break;
                }
                // Atimtis
                case 2: {
                    if (i == 0) {
                        rezultatas = skaicius;
                    } else {
                        rezultatas = rezultatas - skaicius;
                    }
                    break;
                }
                // Daugyba
                case 3: {
                    if (i == 0) {
                        rezultatas = skaicius;
                    } else {
                        rezultatas = rezultatas * skaicius;
                    }
                    break;
                }
                // Max
                case 4: {
                    if (i == 0) {
                        rezultatas = skaicius;
                    } else {
                        if (rezultatas < skaicius) {
                            rezultatas = skaicius;
                        }
                    }
                    break;
                }
                // Min
                case 5: {
                    if (i == 0) {
                        rezultatas = skaicius;
                    } else {
                        if (rezultatas > skaicius) {
                            rezultatas = skaicius;
                        }
                    }
                    break;
                }
            }

            i++;
            skaicius = reader.nextInt();
        }
        System.out.println(rezultatas);
    }
}

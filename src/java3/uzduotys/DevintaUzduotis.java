package java3.uzduotys;

import java.io.*;

public class DevintaUzduotis {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("src/java3/uzduotys/devinta.txt"));
            bw = new BufferedWriter(new FileWriter("src/java3/uzduotys/devinta_atsakymai.txt"));
            String eilute = br.readLine();
            while(eilute != null) {
                if(eilute.isEmpty()) {
                   eilute = br.readLine();
                    continue;
                }
                int skaicius = Integer.parseInt(eilute);
                if(skaicius % 2 == 0) {
                    System.out.println(skaicius + " - lyginis");
                    bw.write(skaicius + " - lyginis");
                    bw.newLine();
                } else {
                    System.out.println(skaicius + " - nelyginis");
                    bw.write(skaicius + " - nelyginis");
                    bw.newLine();
                }

                eilute = br.readLine();
            }

            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nerasta");
        } catch (IOException e) {
            System.out.println("Netiketa");
        }
    }
}

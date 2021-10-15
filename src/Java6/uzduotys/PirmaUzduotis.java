package Java6.uzduotys;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PirmaUzduotis {

    public static void main(String[] args) {
        String fileContent = "";
        try {

            fileContent = readFile("neegzistuojantisKelias");
        } catch(IOException e) {
            System.out.println("Skaitomas atsarginis failas");

            try {
                fileContent = readFile("src/Java6/uzduotys/tekstas.txt");
            } catch(IOException ex) {
                System.out.println("Atsarginis failas nenuskaitomas");
            }

        }
        System.out.println(fileContent);
    }

    static String readFile(String filePath) throws IOException {
        String text = "";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine();
        while(line != null) {
            text = text + line;
            line = br.readLine();
        }
        br.close();
        return text;
    }
}

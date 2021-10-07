package java3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class RasymasIFaila {
    public static void main(String[] args) {
        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter("src/java3/atsakymai.txt"));

            bf.write("Labas rytas");

            bf.close();
        } catch(IOException ex) {
            System.out.println("Nepavyko irasyti i faila");
        }
    }
}

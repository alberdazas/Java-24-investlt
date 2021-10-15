package Java6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ZodisThrows {

    public static void main(String[] args) {
        try {
            readFile("src/java4/uzduotys/duomenys.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("null pointeris");
        } finally {
            System.out.println("ESU FINALLY BLOKE");
        }
        System.out.println("KODAS PO TRY CATCH");

    }

    public static String readFile(String filePath) throws FileNotFoundException, IOException {
        BufferedReader br = null;
        String allText = "";

        br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine();
        while (line != null) {
            allText = allText + line;
            line = br.readLine();
        }
        br.close();

        return allText;
    }

    public static String readFileWithException(String filePath)  {
        BufferedReader br = null;
        String allText = "";
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            while (line != null) {
                allText = allText + line;
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("TOLIAU EIS CIA");
        return allText;
    }
}

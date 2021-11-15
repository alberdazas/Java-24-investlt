package Java16.Studentai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentaiMain {

    public static void main(String[] args) {
        String duomenys = "src/Java16/Studentai/Studentai.txt";

        Map<String, List<Studentas>> grupes = new HashMap<>();
        skaityti(duomenys, grupes);
        System.out.println(grupes);

        System.out.println("Mapo raktai:");
        for (String key : grupes.keySet()) {
            System.out.println(key);
        }
        System.out.println("Mapo reiksmes: ");
        for (Map.Entry<String, List<Studentas>> belekas : grupes.entrySet()) {
            System.out.println(String.format("Key (name) is: %s, Value is : %s", belekas.getKey(), belekas.getValue()));
        }

        System.out.println("Vien reiksmes");
        for(List<Studentas> stud: grupes.values()) {
            System.out.println(stud);
        }
    }

    static void skaityti(String failoKelias, Map<String, List<Studentas>> zodynas) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(failoKelias));

            String line = br.readLine();
            while (line != null) {
                String[] reiksmes = line.split(" ");

                String vardas = reiksmes[0];
                String pavarde = reiksmes[1];
                String grupe = reiksmes[2];

                Studentas s = new Studentas(vardas, pavarde, grupe);

                if (zodynas.containsKey(grupe)) {
                    List<Studentas> studentai = zodynas.get(grupe);
                    studentai.add(s);
                } else {
                    List<Studentas> naujiStudentai = new ArrayList<>();
                    naujiStudentai.add(s);
                    zodynas.put(grupe, naujiStudentai);
                }

                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Netiketa klaida");
        }
    }
}

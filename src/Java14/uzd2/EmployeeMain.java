package Java14.uzd2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

    public static void main(String[] args) {
        String dataFilePath = "src/Java14/uzd2/duomenys.txt";
        ArrayList<Employee> employees = new ArrayList<>();
        readFile(dataFilePath, employees);
        System.out.println("Pradinis sarasas:");
        System.out.println(employees);
        System.out.println("Surikiuotas sarasas:");
        Collections.sort(employees);
        System.out.println(employees);
    }

    static void readFile(String path, ArrayList<Employee> x) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(path));

            String line = br.readLine();
            while(line != null) {
                String[] values = line.split(" ");
                String name = values[0];
                String lastName = values[1];
                String department = values[2];
                Double salary = Double.parseDouble(values[3]);

                Employee e = new Employee(name, lastName, department, salary);
                x.add(e);

                line = br.readLine();
            }

            br.close();

        } catch(IOException e) {
            System.out.println("Netiketa klaida");
        }
    }
}

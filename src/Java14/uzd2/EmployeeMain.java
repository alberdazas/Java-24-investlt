package Java14.uzd2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

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

        System.out.println("Daugiausia uzdirbantis: ");
        Employee richest = biggestSalary(employees);
        System.out.println(richest);

        System.out.println("Uzdirbantys daugiau nei 1000");
        ArrayList<Employee> algaDidesne1000 = earnsMore(employees, 1000);
        System.out.println(algaDidesne1000);

        System.out.println("Departamentu kiekis Map: ");
        Integer countMap = departmentCountMap(employees);
        System.out.println(countMap);

        System.out.println("Departamentu kiekis Set: ");
        Integer countSet = departmentCountSet(employees);
        System.out.println(countSet);
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

    static Employee biggestSalary(ArrayList<Employee> a) {
        if(a.size() == 0) {
            return null;
        }

        Employee max = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i).getSalary() > max.getSalary()) {
                max = a.get(i);
            }
        }
        return max;
    }

    static ArrayList<Employee> earnsMore(ArrayList<Employee> b, double wantedSalary) {
        ArrayList<Employee> filtered = new ArrayList<>();

        if(b == null) {
            return filtered;
        }

        for(int i = 0; i < b.size(); i++) {
            Employee e = b.get(i);
            if(e.getSalary() > wantedSalary) {
                filtered.add(e);
            }
        }
        return filtered;
    }

    static Integer departmentCountMap(ArrayList<Employee> q) {
        Map<String, Employee> map = new HashMap<>();
        for(int i = 0; i < q.size(); i++) {
            map.put(q.get(i).getDepartment(), q.get(i));
        }
        return map.size();
    }

    static Integer departmentCountSet(ArrayList<Employee> h) {
        Set<String> departments = new HashSet<>();
        for(int i = 0; i < h.size(); i++) {
            departments.add(h.get(i).getDepartment());
        }
        return departments.size();
    }
}

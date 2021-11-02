package Java11.Employee;

public class EmployeeMainas {

    public static void main(String[] args) {
        Employee darbuotojas1 = new Employee("Petras", 200,
                "Siauliai", "Vilniaus", "5");
        Employee darbuotojas2 = new Employee("Andrius", 500,
                "Vilnius", "Dvaro", "2");
        Employee darbuotojas3 = new Employee("Jonas", 1000,
                "Kaunas", "Pramones", "3");
        Employee darbuotojas4 = new Employee("Robertas", 300,
                "Klaipeda", "Vilniaus", "9");
        Employee darbuotojas5 = new Employee("Aloyzas", 600,
                "Panevezys", "Trumpoji", "8");

        Employee[] darbuotojai = {darbuotojas1, darbuotojas2, darbuotojas3, darbuotojas4, darbuotojas5};

//        increaseSalary(darbuotojai);
//        spausdinti(darbuotojai);

        Payment increaseTenPercent = new Payment() {
            @Override
            public double increaseSalary(double salary) {
                return salary * 1.1;
            }
        };

        increaseSalary(darbuotojai, increaseTenPercent);
        spausdinti(darbuotojai);

        // Parasyti anonimine klase kuri padidina atlyginima 100eu

    }

    static void spausdinti(Employee[] masyvas) {
        for(int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i].getSalary());
        }
    }

    static void increaseSalary(Employee[] x) {
        double pakelimas = 50;

        for(int i = 0; i < x.length; i++) {
            double naujaAlga = x[i].getSalary() + pakelimas;
            x[i].setSalary(naujaAlga);
        }
    }

    static void increaseSalary(Employee[] x, Payment y) {
        for(int i = 0; i < x.length; i++) {
            double naujaAlga = y.increaseSalary(x[i].getSalary());
            x[i].setSalary(naujaAlga);
        }
    }
}

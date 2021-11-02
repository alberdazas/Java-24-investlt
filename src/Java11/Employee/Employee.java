package Java11.Employee;

public class Employee {

    private String name;
    private double salary;
    private Address address;

    public Employee(String name, double salary,
                    String city, String street, String number) {
        this.name = name;
        this.salary = salary;
        this.address = new Address(city, street, number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    class Address {
        private String city;
        private String street;
        private String number;

        public Address(String city, String street, String number) {
            this.city = city;
            this.street = street;
            this.number = number;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }
}

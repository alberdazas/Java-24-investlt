package Java14.uzd2;

public class Employee implements Comparable<Employee> {
    private String name;
    private String lastName;
    private String department;
    private Double salary;

    public Employee(String name, String lastName, String department, Double salary){
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}' + "\n";
    }

    @Override
    public int compareTo(Employee o) {
        if(o == null) {
            return 1;
        }
        int result = name.compareTo(o.getName());
        if(result != 0) {
            return result;
        }
        return lastName.compareTo(o.getLastName());
    }
}

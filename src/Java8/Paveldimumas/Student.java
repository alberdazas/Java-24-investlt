package Java8.Paveldimumas;

// public class Computer extends Product {

public class Student extends Human {
    private String className;

    public Student(String name, String lastName, String className) {
        super(name, lastName);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return getName() + getLastName() + getClassName();
    }
}

package Java7;

public class Human {
    private String personalId;
    private String name;
    private String lastName = "Defaultine reiksme";

    // Default konstruktorius
    public Human() {
    }

    //    Konstruktorius
    public Human(String name) {
        this.name = name;
    }

    //    Konstruktorius
    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //    Konstruktorius
    public Human(String name, String lastName, String personalId) {
        this.name = name;
        this.lastName = lastName;
        this.personalId = personalId;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
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

    public void katu() {
        System.out.println("iskvieciau is klases vidaus");
    }

    public String toString() {
        return "Vardas: " + getName() + " Pavarde: " + getLastName() + " asmens kodas: " + getPersonalId();
    }

}

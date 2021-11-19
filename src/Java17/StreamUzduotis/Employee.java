package Java17.StreamUzduotis;

public class Employee {

    private String asmensKodas;
    private String vardas;
    private String pavarde;
    private Salary alga;

    public Employee(String asmensKodas, String vardas, String pavarde,
                    Double alga, String data) {
        this.asmensKodas = asmensKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.alga = new Salary(alga, data);
    }

    public String getAsmensKodas() {
        return asmensKodas;
    }

    public void setAsmensKodas(String asmensKodas) {
        this.asmensKodas = asmensKodas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Salary getAlga() {
        return alga;
    }

    public void setAlga(Salary alga) {
        this.alga = alga;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "asmensKodas='" + asmensKodas + '\'' +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", alga=" + alga +
                '}';
    }
}

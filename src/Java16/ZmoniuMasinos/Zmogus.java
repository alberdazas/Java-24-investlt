package Java16.ZmoniuMasinos;

public class Zmogus {
    private String asmensKodas;
    private String vardas;
    private String pavarde;
    private String masinosNr;

    public Zmogus(String asmensKodas, String vardas, String pavarde, String masinosNr) {
        this.asmensKodas = asmensKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.masinosNr = masinosNr;
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

    public String getMasinosNr() {
        return masinosNr;
    }

    public void setMasinosNr(String masinosNr) {
        this.masinosNr = masinosNr;
    }
}

package Uzdaviniai.JauniejiProgramuotojai;

public class JaunasisProgramuotojas {
    private String vardas;
    private String pavarde;
    private Integer lygis;

    public JaunasisProgramuotojas(String vardas, String pavarde, Integer lygis) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.lygis = lygis;
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

    public Integer getLygis() {
        return lygis;
    }

    public void setLygis(Integer lygis) {
        this.lygis = lygis;
    }

    @Override
    public String toString() {
        return vardas + " " + pavarde + " " + lygis;
    }
}

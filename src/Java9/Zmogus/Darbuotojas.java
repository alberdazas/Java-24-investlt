package Java9.Zmogus;

public class Darbuotojas extends Zmogus {
    private int stazas;
    private String specialybe;

    public Darbuotojas(String vardas, String pavarde, int amzius,
                       int stazas, String specialybe) {
        super(vardas, pavarde, amzius);
        this.stazas = stazas;
        this.specialybe = specialybe;
    }

    public int getStazas() {
        return stazas;
    }

    public void setStazas(int stazas) {
        this.stazas = stazas;
    }

    public String getSpecialybe() {
        return specialybe;
    }

    public void setSpecialybe(String specialybe) {
        this.specialybe = specialybe;
    }

    @Override
    public String gautiZmogausInformacija() {
        return getVardas() + " " + getPavarde() + " " + getAmzius()
                + " " + getSpecialybe() + " " + getStazas();
    }
}

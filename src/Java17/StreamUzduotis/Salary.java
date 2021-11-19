package Java17.StreamUzduotis;

import java.time.LocalDate;

public class Salary {
    private Double alga;
    private LocalDate data;
    // "2000-10-12"
    public Salary(Double alga, String data) {
        this.alga = alga;
        this.data = LocalDate.parse(data);
    }

    public Double getAlga() {
        return alga;
    }

    public void setAlga(Double alga) {
        this.alga = alga;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "alga=" + alga +
                ", data=" + data +
                '}';
    }
}

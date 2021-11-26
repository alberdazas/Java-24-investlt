package Uzdaviniai.AvalynesParduotuve;

public class Avalyne {
    private Double kaina;
    private Lytis lytiesRusis;

    public Avalyne(Double kaina, Lytis lytiesRusis) {
        this.kaina = kaina;
        this.lytiesRusis = lytiesRusis;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }

    public Lytis getLytiesRusis() {
        return lytiesRusis;
    }

    public void setLytiesRusis(Lytis lytiesRusis) {
        this.lytiesRusis = lytiesRusis;
    }


}

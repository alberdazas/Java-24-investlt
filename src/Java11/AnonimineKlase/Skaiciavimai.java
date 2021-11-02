package Java11.AnonimineKlase;

public interface Skaiciavimai {
    void suma(Integer a, Integer b);

    default Double plotas(Integer a, Integer b) {
        return 1.0 * a * b;
    }
}

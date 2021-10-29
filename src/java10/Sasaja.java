package java10;

interface Sasaja {

    int suma = 20;

    // Sis metodas skirtas atspausdinti rezultatus
    void spausdinti();

    String gautiPavadinima();

    double suma();

    double vidurkis();

    default double kvadratas(double skaicius) {
        return skaicius * skaicius;
    }


}

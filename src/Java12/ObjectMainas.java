package Java12;

import java10.Kvadratas.Kvadratas;

public class ObjectMainas {
    public static void main(String[] args) {
        Object tekstas = "labas vakaras";
//        Object skaicius = 2;
        Object arTiesa = true;
//        Object objectKvadratas = new Kvadratas(3);
//        ((Kvadratas)objectKvadratas).getX();

        BendrineKlase<String> saugykla = new BendrineKlase<String>("tekstas");
        System.out.println(saugykla.getKintamasis());

        Kvadratas kvadratas = new Kvadratas(2);
        BendrineKlase<Kvadratas> kvad = new BendrineKlase<Kvadratas>(kvadratas);
        System.out.println(kvad.getKintamasis().getX());

        Number skaicius = 1;
        Number nesveikasSkaicius = 2.5;

        System.out.println(skaicius);
        System.out.println(nesveikasSkaicius);
    }
}

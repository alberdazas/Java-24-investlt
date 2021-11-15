package Java16;

import java.util.HashMap;

public class Mapas {

    public static void main(String[] args) {
        HashMap<String, Integer> zodynas = new HashMap<>();

        zodynas.put(null, 1);

        Integer reiksme = zodynas.get(null);
        System.out.println(reiksme);
    }
}

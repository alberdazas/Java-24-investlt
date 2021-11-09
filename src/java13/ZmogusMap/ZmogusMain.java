package java13.ZmogusMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ZmogusMain {
    public static void main(String[] args) {
        Map<String, Zmogus> zodynas = new HashMap<>();

        Zmogus zmogus1 = new Zmogus("Petras", "Petraitis", "007");
        Zmogus zmogus2 = new Zmogus("Jonas", "Jonaitas", "008");
        Zmogus zmogus3 = new Zmogus("Jonas", "Jonaitas", "123");
        Zmogus zmogus4 = new Zmogus("Jonas", "Jonaitas", "999");

        zodynas.put(zmogus1.getAsmensKodas(), zmogus1);
        zodynas.put(zmogus2.getAsmensKodas(), zmogus2);
        zodynas.put(zmogus3.getAsmensKodas(), zmogus3);
        zodynas.put(zmogus4.getAsmensKodas(), zmogus4);

        System.out.println(zodynas);

        zodynas.put("007", zmogus2);

        Zmogus norimasZmogus = zodynas.get("007");
        System.out.println("Norimas zmogus");
        System.out.println(norimasZmogus);


        System.out.println(zodynas);

        TreeMap<String, Zmogus> medis = new TreeMap<>();
        medis.putAll(zodynas);
        System.out.println("Surikiuotas zodynas paga rakta");
        System.out.println(medis);
    }
}

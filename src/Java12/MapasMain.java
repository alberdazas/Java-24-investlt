package Java12;

public class MapasMain {
    public static void main(String[] args) {
        Mapas map = new Mapas();

        map.add("397", 5);
        map.add("497", 9);

        Object reiksme = map.getValueByKey("497");

        System.out.println(reiksme);
    }
}

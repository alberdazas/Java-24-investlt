package Java7;

public class StaticNaudojimoPavyzdys {

    public static void main(String[] args) {
        System.out.println(StaticPavyzdys.vardas);
        System.out.println(StaticPavyzdys.getVardas());
        StaticPavyzdys obj = new StaticPavyzdys();
        System.out.println(obj.pavarde);
        System.out.println(obj.getPavarde());
        System.out.println("-------------------------------------");

        StaticPavyzdys.vardas = "Almantas";
        System.out.println(StaticPavyzdys.vardas);

        System.out.println("-------------------------------------");



    }
}

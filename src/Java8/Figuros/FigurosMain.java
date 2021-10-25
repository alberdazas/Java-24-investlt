package Java8.Figuros;

public class FigurosMain {

    public static void main(String[] args) {
        String failoKelias = "src/Java8/Figuros/figuros.txt";
        Figuros konteineris = new Figuros();
        konteineris.skaitytiFaila(failoKelias);
        konteineris.spausdinti();

        // Didziausia plota turincia figura
//        Figura didziausiasPlotas = ???
        System.out.println("Didziausia plota turinti figura:");
        Figura didziausiasPlotas = konteineris.didziausiasPlotas();
        System.out.println(didziausiasPlotas);
    }
}

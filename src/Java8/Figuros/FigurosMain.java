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

        System.out.println("Didziausia perimetra turinti figura:");
        Figura didziausiasPerimetras = konteineris.didziausiasPerimetras();
        System.out.println(didziausiasPerimetras);

        System.out.println("Ilgiausia krastine turinti figura:");
        Figura ilgiausiaKrastine = konteineris.ilgiausiaKrastine();
        System.out.println(ilgiausiaKrastine);

        System.out.println("Ilgiausia krastine geresniu budu:");
        Figura ilgiausiaKrastineGeresnis = konteineris.ilgiausiaKrastineGeresnis();
        System.out.println(ilgiausiaKrastineGeresnis);
    }
}

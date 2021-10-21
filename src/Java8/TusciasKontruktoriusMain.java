package Java8;

public class TusciasKontruktoriusMain {
    public static void main(String[] args) {
        TusciasKonstruktorius musuObjektas = new TusciasKonstruktorius();

        System.out.println(musuObjektas.getReiksme());

        musuObjektas.setReiksme("musu kazkokia reiksme");

        System.out.println(musuObjektas.getReiksme());
    }
}

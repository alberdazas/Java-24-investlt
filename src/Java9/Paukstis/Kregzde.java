package Java9.Paukstis;

public class Kregzde extends Paukstis {
    @Override
    public String gautiPavadinima() {
        return "Kregzde";
    }

    @Override
    public int gautiGyvenimoAmziu() {
        return 3;
    }

    @Override
    public double gautiSvori() {
        return 0.2;
    }

    public void kregzdesMetodas() {
        System.out.println("Kregzdes metodas");
    }
}

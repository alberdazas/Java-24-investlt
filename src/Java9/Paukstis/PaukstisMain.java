package Java9.Paukstis;

public class PaukstisMain {

    public static void main(String[] args) {
        Kregzde kregzde = new Kregzde();

        kregzde.kregzdesMetodas();

        Paukstis kregzde2 = new Kregzde();
        ((Kregzde)kregzde2).kregzdesMetodas();
        Kregzde nucastintaKregzde = (Kregzde) kregzde2;

        Varna varna = new Varna();
        Zvirblis zvirblis = new Zvirblis();

        Paukstis[] pauksciai = {kregzde, kregzde2, varna, zvirblis};

        for (int i = 0; i < pauksciai.length; i++) {
            System.out.println(pauksciai[i].gautiPavadinima());
        }
    }
}

package Java12.Enum;

public class EnumMain {
    public static void main(String[] args) {

        int serverioReiksme = 10;
        for(int i = 0; i < MetuLaikai.values().length; i++) {
            if(MetuLaikai.values()[i].getIndex() == serverioReiksme) {
                System.out.println(MetuLaikai.values()[i]);
            }
        }
    }
}

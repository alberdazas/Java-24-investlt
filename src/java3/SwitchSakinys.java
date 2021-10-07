package java3;

public class SwitchSakinys {
    public static void main(String[] args) {
        int skaicius = 2;

        switch(skaicius) {
            case 1: // skaicius == 1
                System.out.println("Vienetas");
                break;
            case 2: // skaicius == 2
                System.out.println("Dvejetas");
                break;
            case 3: // skaicius == 3
                System.out.println("Trejetas");
                break;
            default:
                System.out.println("Nera tokio skaiciaus");
        }
    }
}

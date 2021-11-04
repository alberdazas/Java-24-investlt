package Java12.Enum;

import java.util.Scanner;

public class KortelesTipas {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite korteles numeri");
        String cardNumber = reader.nextLine();

        if(Card.VISA.isCorrectType(cardNumber)){
            System.out.println("Kortele VISA");
        } else if(Card.MASTERCARD.isCorrectType(cardNumber)) {
            System.out.println("Kortele MASTERCARD");
        } else if(Card.NAUJAS_TIPAS.isCorrectType(cardNumber)) {
            System.out.println("Kortele NAUJAS_TIPAS");
        }
        else {
            System.out.println("Kortele neatpazinta");
        }
    }
}

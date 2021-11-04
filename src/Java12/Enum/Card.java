package Java12.Enum;

public enum Card {
    VISA(new String[]{"4"}),
    MASTERCARD(new String[]{"51", "52", "53", "54", "55"}),
    NAUJAS_TIPAS(new String[]{"12"});

    private String[] startsWith;

    Card(String[] startsWith) {
        this.startsWith = startsWith;
    }
    // 4242424242424242
    // 4242 4242 4242 4242
    public boolean isCorrectType(String cardNumber) {
        if(cardNumber == null || cardNumber.length() == 0) {
            return false;
        }
        String cardNumberWithoutSpace = cardNumber.replaceAll(" ", "");
        if(cardNumberWithoutSpace.length() != 16) {
            return false;
        }

        for(int i = 0; i < startsWith.length; i++) {
            if(cardNumberWithoutSpace.startsWith(startsWith[i])) {
                return true;
            }
        }
        return false;
    }
}

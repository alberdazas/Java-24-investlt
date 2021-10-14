package Java5.uzduotys;

public class PenktaUzduotis {
    public static void main(String[] args) {
        System.out.println(middleCharacter("testas"));
        System.out.println(middleCharacter("Cepelinai"));
    }

    // testas
    // 't','e','s','t','a','s'
    static char middleCharacter(String word) {
        char[] symbols = word.toCharArray();
        int middleSymbolIndex = (int) Math.ceil(1.0 * symbols.length / 2);
        return symbols[middleSymbolIndex - 1];
    }
}

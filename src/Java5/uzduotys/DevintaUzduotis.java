package Java5.uzduotys;

public class DevintaUzduotis {
    public static void main(String[] args) {
        String[] words = {"abc", "labas", "zalgiris", "laimes"};

        String longestWord = longestWord(words);
        System.out.println("ilgiausias zodis = " + longestWord);

        System.out.println("ilgiausias zodis = " + longestWord(words));
    }

    static String longestWord(String[] words) {
        String longestWord = "";
//        String longestWord = null;
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }
}

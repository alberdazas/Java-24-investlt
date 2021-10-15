package Java6;

public class PatysThrowinam {

    public static void main(String[] args) {
        try {
            System.out.println(getWordLength("Labas"));
        } catch (Exception e) {
            System.out.println("klaida");
        }

        try {
            System.out.println(getWordLength(null));
        } catch (MusuException e) {
            System.out.println(" MusuException klaida");
        }

        try {
            System.out.println(getWordLength(null));
        } catch (Exception e) {
            System.out.println(" MusuException klaida");
        }

    }

    static int getWordLength(String word) throws MusuException {
        if(word == null) {
            throw new MusuException("Word is null");
        }
        return word.length();
    }

    static boolean validateCredentials(String username, String password) throws Exception {
        if(username == null || password == null) {
            throw new Exception("Credentials not valid");
        }
//        ....
        return true;
    }


}

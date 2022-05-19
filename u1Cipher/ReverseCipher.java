package u1Cipher;

public abstract class ReverseCipher {
    public static String reverseCipher(String cipher){
        StringBuilder reversedWord = new StringBuilder(cipher);

        reversedWord.reverse();

        return reversedWord.toString();
    }
}

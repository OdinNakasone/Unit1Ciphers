package u1Cipher;

import java.util.Random;

public abstract class SpaceBreakCipher {

    public static String decodeSpaceBreakCipher(String cipher){

        return cipher.replaceAll("\\s+", "");
    }

    public static String encodeSpaceBreakCipher(String message, int space){
        Random randSpace = new Random();

        int rand = randSpace.nextInt(space);

        char[] encodedMessage = message.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < encodedMessage.length; i++){

        }

        return null;

    }
}

package unit3Cipher;

import java.util.Arrays;

public abstract class MultiplicativeCipher {

    public static String generateMultiplicativeAlphabet(int key){
        char[] originalLetters = CaesarCipher.ALPHABET.toCharArray();

        //Generate a new char array that will hold the new alphabet
        char[] newLetters = new char[originalLetters.length];

        //Iterate through the original ALPHABET
        for(int i = 0; i < originalLetters.length; i++){

            //If the key is greater than 26, keep modding the key until it less than 26
            while(key > 26){
                key = key % 26;
            }

            //Checking for IndexOutOfBoundsException, looping back to the start of the alphabet
            if(i * key >= 25){
                newLetters[i] = originalLetters[(i * key) % 26];

                //Else, add the letter to the newLetters array
            }else{
                newLetters[i] = originalLetters[i * key];
            }

        }

        return Arrays.toString(newLetters);
    }
}

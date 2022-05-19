package unit3Cipher;

import java.util.Arrays;

public abstract class CaesarCipher {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    /*
      This method will return a new String that represents a Caesar shifted alphabet based on the key
     */
    public static String getCaesarAlphabet(int key){
        //Generate a char array based off of the plain alphabet
        char[] originalLetters = ALPHABET.toCharArray();

        //Generate a new char array that will hold the new alphabet
        char[] newLetters = new char[originalLetters.length];

        //Iterate through the original ALPHABET
        for(int i = 0; i < originalLetters.length; i++){

            //If the key is greater than 26, keep modding the key until it less than 26
            while(key > 26){
                key = key % 26;
            }

            //Checking for IndexOutOfBoundsException, looping back to the start of the alphabet
            if(i + key >= 25){
                newLetters[i] = originalLetters[(i + key) % 26];

            //Else, add the letter to the newLetters array
            }else{
                newLetters[i] = originalLetters[i + key];
            }

        }

        //Return a string representing the shifted alphabet
        return Arrays.toString(newLetters);
    }

    public static String encode(String message, int key){
        //Generate char array based off of the message
        char[] originalMessage = message.toCharArray();

        char[] originalAlphabet = ALPHABET.toCharArray();

        //Generate char array based off of the shifted alphabet
        char[] shiftedAlphabet = getCaesarAlphabet(key).toCharArray();




        return Arrays.toString(originalMessage);
    }
}

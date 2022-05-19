import unit3Cipher.CaesarCipher;
import unit3Cipher.MultiplicativeCipher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static u1Cipher.BaconCipher.decodeBacon;
import static u1Cipher.ReverseCipher.reverseCipher;
import static u1Cipher.SpaceBreakCipher.*;

public class Main {

    public static void main(String[] args) {
       //String test = "Alietoldoftenenoughbecomesthetruth";


//        System.out.println("Original Text: " + Arrays.toString(CaesarCipher.ALPHABET.toCharArray()));
//        System.out.println("Cipher Text:   " + MultiplicativeCipher.generateMultiplicativeAlphabet(5));

        System.out.println(MultiplicativeCipher.generateMultiplicativeAlphabet(9));

    }


}
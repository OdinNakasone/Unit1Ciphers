import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //System.out.println(decodeBacon("dIdsOmEbodySaYbaCoNthEResnOThInGMoReDEliciOus"));
        //System.out.println(decodeBacon("TaKEmeDOwNTotHEpARaDIsEcityWherEtHEgrAssisGrEeNandTheGIrlSareprETtYOhWoNtYouPlEasetakEmehoMegnR"));




    }

    public static String decodeBacon(String cipher){
        List<String> results = splittingString(cipher, 5);

        StringBuilder tempResult = new StringBuilder();

        StringBuilder finalResult = new StringBuilder();

        for(String result : results){
            char[] letter = result.toCharArray();
            for(char l : letter){
                if(Character.isUpperCase(l)){
                    tempResult.append("1");
                }else{
                    tempResult.append("0");
                }
            }
        }

        List<String> binary = splittingString(tempResult.toString(), 5);

        for(String bin : binary){
            finalResult.append(convertBinaryToLetters(bin));
        }


        return finalResult.toString();
    }

    public static String encodeBacon(String code){
        return null;
    }

    public static List<String> splittingString(String cipher, int n){
        String[] results = cipher.split("(?<=\\G.{" + n + "})");

        return Arrays.asList(results);
    }

    public static String convertBinaryToLetters(String binary){
        return switch (binary) {
            case "00000" -> "A";
            case "00001" -> "B";
            case "00010" -> "C";
            case "00011" -> "D";
            case "00100" -> "E";
            case "00101" -> "F";
            case "00110" -> "G";
            case "00111" -> "H";
            case "01000" -> "I/J";
            case "01001" -> "K";
            case "01010" -> "L";
            case "01011" -> "M";
            case "01100" -> "N";
            case "01101" -> "O";
            case "01110" -> "P";
            case "01111" -> "Q";
            case "10000" -> "R";
            case "10001" -> "S";
            case "10010" -> "T";
            case "10011" -> "U/V";
            case "10100" -> "W";
            case "10101" -> "X";
            case "10110" -> "Y";
            case "10111" -> "Z";
            default -> null;
        };
    }
}
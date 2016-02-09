package com.company;
import java.util.Arrays;

/**
 * Created by Nathaniel on 2/8/2016.
 */
public class Anagram {
    public static boolean anagramCheck(String firstString, String secondString){
        firstString = firstString.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        secondString = secondString.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        char[] firstCharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();

        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);

        return Arrays.equals(firstCharArray, secondCharArray);
    }

    public static boolean anagramCheck2(String first, String second){
        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();

        return Arrays.equals(getLettersArray(firstCharArray), getLettersArray(secondCharArray));
    }

    public static Integer[] getLettersArray(char[] stringCharArray){
        Integer[] lettersArray = new Integer[26];
        Arrays.fill(lettersArray, 0);

        for (char a : stringCharArray) {
            if(a >= 97 && a <= 122){
                lettersArray[a-97]++;
            }
            else if(a >= 65 && a <= 90){
                lettersArray[a-65]++;
            }
        }

        return lettersArray;
    }
}

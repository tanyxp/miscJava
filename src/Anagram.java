package com.company;

import java.util.Arrays;

/**
 * Created by Nathaniel on 2/8/2016.
 */
public class Anagram {
    public static boolean AnagramCheck(String firstString, String secondString){
        firstString = firstString.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        secondString = secondString.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        char[] firstCharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();

        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);

        return Arrays.equals(firstCharArray, secondCharArray);
    }
    public static boolean AnagramCheck2(String first, String second){
        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();
        Integer[] firstsLetters = new Integer[26];
        Integer[] secondsLetters = new Integer[26];
        Arrays.fill(firstsLetters, 0);
        Arrays.fill(secondsLetters, 0);

        for (char a : firstCharArray) {
            if(a >= 97 && a <= 122){
                firstsLetters[a-97]++;
            }
            else if(a >= 65 && a <= 90){
                firstsLetters[a-65]++;
            }
        }

        for (char a : secondCharArray) {
            if(a >= 97 && a <= 122){
                secondsLetters[a-97]++;
            }
            else if(a >= 65 && a <= 90){
                secondsLetters[a-65]++;
            }
        }
        return Arrays.equals(firstsLetters, secondsLetters);
    }
}

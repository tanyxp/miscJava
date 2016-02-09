package com.company;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Nathaniel on 2/8/2016.
 */
public class AnagramTests {

    @Test
    public void testAnagram(){
        assertTrue(Anagram.anagramCheck("strainer","terrains"));
        assertTrue(Anagram.anagramCheck2("fneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmf","fneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmf"));
        assertTrue(Anagram.anagramCheck("notTheSameWord", "WordNotTheSame"));
        assertTrue(Anagram.anagramCheck("iHaveSpecialCharacters!@!#^&(%#)$*12312@#()$@#*&((*#@$","iHaveSpecialCharacters+)(*_)*(_3123(_"));
        assertFalse(Anagram.anagramCheck("wayDifferentLengths", "waaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayDifferentLengths"));
    }

    @Test
    public void testAnagram2(){
        assertTrue(Anagram.anagramCheck2("strainer","terrains"));
        assertTrue(Anagram.anagramCheck2("fneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmf","fneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmf"));
        assertTrue(Anagram.anagramCheck2("notTheSameWord", "WordNotTheSame"));
        assertTrue(Anagram.anagramCheck2("iHaveSpecialCharacters!@!#^&(%#)$*12312@#()$@#*&((*#@$","iHaveSpecialCharacters+)(*_)*(_3123(_"));
        assertFalse(Anagram.anagramCheck2("wayDifferentLengths", "waaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayDifferentLengths"));
    }
}

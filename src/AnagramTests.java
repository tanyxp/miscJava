package com.company;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Nathaniel on 2/8/2016.
 */
public class AnagramTests {

    @Test
    public void testAnagram(){
        assertTrue(Anagram.AnagramCheck("strainer","terrains"));
        assertTrue(Anagram.AnagramCheck2("fneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmf","fneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmf"));
        assertTrue(Anagram.AnagramCheck("notTheSameWord", "WordNotTheSame"));
        assertTrue(Anagram.AnagramCheck("iHaveSpecialCharacters!@!#^&(%#)$*12312@#()$@#*&((*#@$","iHaveSpecialCharacters+)(*_)*(_3123(_"));
        assertFalse(Anagram.AnagramCheck("wayDifferentLengths", "waaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayDifferentLengths"));
    }

    @Test
    public void testAnagram2(){
        assertTrue(Anagram.AnagramCheck2("strainer","terrains"));
        assertTrue(Anagram.AnagramCheck2("fneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmf","fneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmffneinfgreignresigsnrgisrgnksgrsasfnaejkfnreskjgsbrjksergbsrewjhfbeawfhjwaebfawejkbaewkgsdmf"));
        assertTrue(Anagram.AnagramCheck2("notTheSameWord", "WordNotTheSame"));
        assertTrue(Anagram.AnagramCheck2("iHaveSpecialCharacters!@!#^&(%#)$*12312@#()$@#*&((*#@$","iHaveSpecialCharacters+)(*_)*(_3123(_"));
        assertFalse(Anagram.AnagramCheck2("wayDifferentLengths", "waaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayDifferentLengths"));
    }
}

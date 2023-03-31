package sandro.week04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringSubStringUnittestTest {
    @Test
    public void testLongestSubstring() {
        String test1 = "Hallo wie gehts?";
        String test2 = "öaöswlekrjllo waöwoeiöflkjhasdf";
        String expected = "llo w";
        String result = StringSubStringUnittest.longestSubString(test1,test2);

        Assertions.assertEquals(expected, result, "Longest substring is incorrect!");
    }
}

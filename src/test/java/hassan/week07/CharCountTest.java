package hassan.week07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharCountTest {

    @Test
    void countChars() {
        Assertions.assertEquals(15, CharCount.countChars("abcdawerasdfasvacadfasdf1111"), "Char count does not match");
    }

    @Test
    void countChar() {
    }

    @Test
    void countCharArr() {
    }
}
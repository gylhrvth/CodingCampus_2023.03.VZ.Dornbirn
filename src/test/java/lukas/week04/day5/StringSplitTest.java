package lukas.week04.day5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringSplitTest {

    @Test
    public void testSplit() {
        String input = "Hallo\n\n\n\n   wie    \n gehts     \tdir?\nHeute sehr gut! Danke!\n";
        String[] expected = new String[]{"Hallo", "wie","gehts", "dir?", "Heute", "sehr", "gut!", "Danke!"};

        String[] result = StringSplit.split(input);

        //Weak
        Assertions.assertEquals(8, result.length, "Split array length does not match");

        //Good
        Assertions.assertArrayEquals(expected, result, "Split arrays don't match");
    }
}

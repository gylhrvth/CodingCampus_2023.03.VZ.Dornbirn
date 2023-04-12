package benjamin.week04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubStringTest {

    @Test
    public void testSameSub() {
        String sub1 = "Hallo";
        String sub2 = "Hallo";
        String expected = "Hallo";
        String result = Substring.printSubstring(sub1, sub2);
        Assertions.assertEquals(expected, result, "Substring is wrong");
    }

    @Test
    public void testNotSameSub() {
        String sub1 = "Hallo";
        String sub2 = "Test";
        String excepted = "";
        String result = Substring.printSubstring(sub1, sub2);
        Assertions.assertEquals(excepted, result, "Substring is wrong");
    }

    @Test
    public void testContainsSub() {
        String sub1 = "HollaHallodi";
        String sub2 = "HalliHallofri";
        String expected = "Hallo";
        String result = Substring.printSubstring(sub1, sub2);
        Assertions.assertEquals(expected, result, "Substring is wrong");
    }

    @Test
    public void testContainsDiffLongSub(){
        String sub1 = "Teigwarenhaus";
        String sub2 = "Wir waren spazieren";
        String expected = "waren";
        String result = Substring.printSubstring(sub1,sub2);
        Assertions.assertEquals(expected, result, "Substring is wrong");
    }
    @Test
    public void testEmptySub(){
        String sub1 = "";
        String sub2 = "";
        String expected = "";
        String result = Substring.printSubstring(sub1,sub2);
        Assertions.assertEquals(expected, result, "Substring is wrong");
    }

}

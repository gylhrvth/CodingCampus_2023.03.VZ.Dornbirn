package lukas.week04.day5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubStringTest {

    @Test
    public void test2CharCrop() {
        String example = "YY";
        String excepted = "";
        String result = SubString.crop(example);
        Assertions.assertEquals(excepted, result, "String was not cropped correctly");
    }

    @Test
    public void test1CharCrop() {
        String example = "X";
        String excepted = "";
        String result = SubString.crop(example);
        Assertions.assertEquals(excepted, result, "String was not cropped correctly");
    }

    @Test
    public void testEmptyCrop() {
        String example = "";
        String excepted = "";
        String result = SubString.crop(example);
        Assertions.assertEquals(excepted, result, "String was not cropped correctly");
    }
        @Test
    public void testRegularCrop() {
        String example = "Hallo wie gehts?";
        String excepted = "allo wie gehts";
        String result = SubString.crop(example);
        Assertions.assertEquals(excepted, result, "String was not cropped correctly");
    }
}

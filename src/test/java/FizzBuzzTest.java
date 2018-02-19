import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {
    @Test
    @Parameters({"1, 1",
            "2, 2",
            "4, 4",
            "7, 7",
            "8, 8",
            "11, 11",
            "13, 13"})

    public void เลขใดๆ(int expected, String actual) {
        assertEquals(new FizzBuzz().calResult(expected), actual);
    }

    @Test
    @Parameters({"3, Fizz",
            "6, Fizz",
            "9, Fizz",
            "12, Fizz" })

    public void เลขใดหารสามลงตัวแสดงFizz(int expected, String actual) {
        assertEquals(new FizzBuzz().calResult(expected), actual);
    }


    @Test
    @Parameters({"5, Buzz",
            "10, Buzz" })

    public void เลขใดหารห้าลงตัวแสดงฺBuzz(int expected, String actual) {
        assertEquals(new FizzBuzz().calResult(expected), actual);
    }

    @Test
    @Parameters({"15, FizzBuzz",
            "30, FizzBuzz" })

    public void เลขใดหารสามและห้าลงตัวแสดงฺFizzBuzz(int expected, String actual) {
        assertEquals(new FizzBuzz().calResult(expected), actual);
    }
}

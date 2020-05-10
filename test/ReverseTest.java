import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    @Test
    void testNumberReverse1() {
        int[] numbers = new int[]{12, 34, 55, 75, 23 , 66};
        int[] expected = new int[]{66, 23, 75, 55, 34, 12};

        int[] result = Reverse.numberReverse(numbers);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void testNumberReverse2() {
        int[] numbers = new int[]{1, 2, 3, 4, 5 , 6, 7, 8, 9, 10};
        int[] expected = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] result = Reverse.numberReverse(numbers);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void testStringReverse1() {
        String string = "qwertyuiop";
        String expected = "poiuytrewq";

        String result = Reverse.stringReverse(string);
        assertEquals(expected, result);
    }

    @Test
    void testStringReverse2() {
        String string = "Hello World";
        String expected = "dlroW olleH";

        String result = Reverse.stringReverse(string);
        assertEquals(expected, result);
    }
}
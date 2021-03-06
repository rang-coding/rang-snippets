package com.rang.snippets.math.sum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * This is the test-class for all methods of {@link ArraySumCalculator} handling arrays of primitive int.
 */
public class ArraySumCalculatorIntTest {

    /* ***** ***** ***** Tests of method sumIntLoop() ***** ***** ***** */

    @Test
    public void sumIntLoopWithPositiveValues() {
        int[] values = {
                4, 17, 21
        };
        int sum = ArraySumCalculator.sumIntLoop(values);
        assertEquals(42, sum);
    }

    @Test
    public void sumIntLoopWithNegativeValues() {
        int[] values = {
                -4, -17, -21
        };
        int sum = ArraySumCalculator.sumIntLoop(values);
        assertEquals(-42, sum);
    }

    @Test
    public void sumIntLoopWithMixedValues() {
        int[] values = {
                4, 17, -21
        };
        int sum = ArraySumCalculator.sumIntLoop(values);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntLoopWithZeroValues() {
        int[] values = {
                0, 0, 0
        };
        int sum = ArraySumCalculator.sumIntLoop(values);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntLoopWithNullValues() {
        int[] values = new int[4];
        values[0] = 4;
        values[3] = 21;
        int sum = ArraySumCalculator.sumIntLoop(values);
        assertEquals(25, sum);
    }

    @Test
    public void sumIntLoopWithMaxOverflow() {
        int[] values = {
                Integer.MAX_VALUE, 17
        };
        int sum = ArraySumCalculator.sumIntLoop(values);
        assertTrue(sum < 0); // Overflow caused
    }

    @Test
    public void sumIntLoopWithMinOverflow() {
        int[] values = {
                Integer.MIN_VALUE, -17
        };
        int sum = ArraySumCalculator.sumIntLoop(values);
        assertTrue(sum > 0); // Overflow caused
    }

    @Test
    public void sumIntLoopWithEmtpyArray() {
        int[] values = new int[0];
        int sum = ArraySumCalculator.sumIntLoop(values);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntLoopWithNullArray() {
        try {
            ArraySumCalculator.sumIntLoop(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

    /* ***** ***** ***** Tests of method sumIntStream() ***** ***** ***** */

    @Test
    public void sumIntStreamWithPositiveValues() {
        int[] values = {
                4, 17, 21
        };
        int sum = ArraySumCalculator.sumIntStream(values);
        assertEquals(42, sum);
    }

    @Test
    public void sumIntStreamWithNegativeValues() {
        int[] values = {
                -4, -17, -21
        };
        int sum = ArraySumCalculator.sumIntStream(values);
        assertEquals(-42, sum);
    }

    @Test
    public void sumIntStreamWithMixedValues() {
        int[] values = {
                4, 17, -21
        };
        int sum = ArraySumCalculator.sumIntStream(values);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntStreamWithZeroValues() {
        int[] values = {
                0, 0, 0
        };
        int sum = ArraySumCalculator.sumIntStream(values);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntStreamWithNullValues() {
        int[] values = new int[4];
        values[0] = 4;
        values[3] = 21;
        int sum = ArraySumCalculator.sumIntStream(values);
        assertEquals(25, sum);
    }

    @Test
    public void sumIntStreamWithMaxOverflow() {
        int[] values = {
                Integer.MAX_VALUE, 17
        };
        int sum = ArraySumCalculator.sumIntStream(values);
        assertTrue(sum < 0); // Overflow caused
    }

    @Test
    public void sumIntStreamWithMinOverflow() {
        int[] values = {
                Integer.MIN_VALUE, -17
        };
        int sum = ArraySumCalculator.sumIntStream(values);
        assertTrue(sum > 0); // Overflow caused
    }

    @Test
    public void sumIntStreamWithEmtpyArray() {
        int[] values = new int[0];
        int sum = ArraySumCalculator.sumIntStream(values);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntStreamWithNullArray() {
        try {
            ArraySumCalculator.sumIntStream(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

    /* ***** ***** ***** Tests of method sumIntVarargsLoop() ***** ***** ***** */

    @Test
    public void sumIntVarargsLoopWithPositiveValues() {
        int sum = ArraySumCalculator.sumIntVarargsLoop(4, 17, 21);
        assertEquals(42, sum);
    }

    @Test
    public void sumIntVarargsLoopWithNegativeValues() {
        int sum = ArraySumCalculator.sumIntVarargsLoop(-4, -17, -21);
        assertEquals(-42, sum);
    }

    @Test
    public void sumIntVarargsLoopWithMixedValues() {
        int sum = ArraySumCalculator.sumIntVarargsLoop(4, 17, -21);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntVarargsLoopWithZeroValues() {
        int sum = ArraySumCalculator.sumIntVarargsLoop(0, 0, 0);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntVarargsLoopWithFilledArray() {
        int[] values = {
                4, 17, 21
        };
        int sum = ArraySumCalculator.sumIntVarargsLoop(values);
        assertEquals(42, sum);
    }

    @Test
    public void sumIntVarargsLoopWithMaxOverflow() {
        int[] values = {
                Integer.MAX_VALUE, 17
        };
        int sum = ArraySumCalculator.sumIntVarargsLoop(values);
        assertTrue(sum < 0); // Overflow caused
    }

    @Test
    public void sumIntVarargsLoopWithMinOverflow() {
        int[] values = {
                Integer.MIN_VALUE, -17
        };
        int sum = ArraySumCalculator.sumIntVarargsLoop(values);
        assertTrue(sum > 0); // Overflow caused
    }

    @Test
    public void sumIntVarargsLoopWithEmtpyArray() {
        int[] values = new int[0];
        int sum = ArraySumCalculator.sumIntVarargsLoop(values);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntVarargsLoopWithNullArray() {
        try {
            ArraySumCalculator.sumIntVarargsLoop(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

    /* ***** ***** ***** Tests of method sumIntVarargsStream() ***** ***** ***** */

    @Test
    public void sumIntVarargsStreamWithPositiveValues() {
        int sum = ArraySumCalculator.sumIntVarargsStream(4, 17, 21);
        assertEquals(42, sum);
    }

    @Test
    public void sumIntVarargsStreamWithNegativeValues() {
        int sum = ArraySumCalculator.sumIntVarargsStream(-4, -17, -21);
        assertEquals(-42, sum);
    }

    @Test
    public void sumIntVarargsStreamWithMixedValues() {
        int sum = ArraySumCalculator.sumIntVarargsStream(4, 17, -21);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntVarargsStreamWithZeroValues() {
        int sum = ArraySumCalculator.sumIntVarargsStream(0, 0, 0);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntVarargsStreamWithFilledArray() {
        int[] values = {
                4, 17, 21
        };
        int sum = ArraySumCalculator.sumIntVarargsStream(values);
        assertEquals(42, sum);
    }

    @Test
    public void sumIntVarargsStreamWithMaxOverflow() {
        int[] values = {
                Integer.MAX_VALUE, 17
        };
        int sum = ArraySumCalculator.sumIntVarargsStream(values);
        assertTrue(sum < 0); // Overflow caused
    }

    @Test
    public void sumIntVarargsStreamWithMinOverflow() {
        int[] values = {
                Integer.MIN_VALUE, -17
        };
        int sum = ArraySumCalculator.sumIntVarargsStream(values);
        assertTrue(sum > 0); // Overflow caused
    }

    @Test
    public void sumIntVarargsStreamWithEmtpyArray() {
        int[] values = new int[0];
        int sum = ArraySumCalculator.sumIntVarargsStream(values);
        assertEquals(0, sum);
    }

    @Test
    public void sumIntVarargsStreamWithNullArray() {
        try {
            ArraySumCalculator.sumIntVarargsStream(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

}

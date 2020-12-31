package com.rang.snippets.math.sum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * This is the test-class for all methods of {@link ArraySumCalculator} handling arrays of Integer-objects.
 */
public class ArraySumCalculatorIntegerTest {

    /* ***** ***** ***** Tests of method sumIntegerLoop() ***** ***** ***** */

    @Test
    public void sumIntegerLoopWithPositiveValues() {
        Integer[] values = {
                4, 17, 21
        };
        Integer sum = ArraySumCalculator.sumIntegerLoop(values);
        assertEquals(42, sum.intValue());
    }

    @Test
    public void sumIntegerLoopWithNegativeValues() {
        Integer[] values = {
                -4, -17, -21
        };
        Integer sum = ArraySumCalculator.sumIntegerLoop(values);
        assertEquals(-42, sum.intValue());
    }

    @Test
    public void sumIntegerLoopWithMixedValues() {
        Integer[] values = {
                4, 17, -21
        };
        Integer sum = ArraySumCalculator.sumIntegerLoop(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumIntegerLoopWithZeroValues() {
        Integer[] values = {
                0, 0, 0
        };
        Integer sum = ArraySumCalculator.sumIntegerLoop(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumIntegerLoopWithNullValues() {
        Integer[] values = new Integer[4];
        values[0] = 4;
        values[3] = 21;
        Integer sum = ArraySumCalculator.sumIntegerLoop(values);
        assertEquals(25, sum.intValue());
    }

    @Test
    public void sumIntegerLoopWithMaxOverflow() {
        Integer[] values = {
                Integer.MAX_VALUE, 17
        };
        Integer sum = ArraySumCalculator.sumIntegerLoop(values);
        assertTrue(sum.intValue() < 0); // Overflow caused
    }

    @Test
    public void sumIntegerLoopWithMinOverflow() {
        Integer[] values = {
                Integer.MIN_VALUE, -17
        };
        Integer sum = ArraySumCalculator.sumIntegerLoop(values);
        assertTrue(sum.intValue() > 0); // Overflow caused
    }

    @Test
    public void sumIntegerLoopWithEmtpyArray() {
        Integer[] values = new Integer[0];
        Integer sum = ArraySumCalculator.sumIntegerLoop(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumIntegerLoopWithNullArray() {
        try {
            ArraySumCalculator.sumIntegerLoop(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

    /* ***** ***** ***** Tests of method sumIntegerStream() ***** ***** ***** */

    @Test
    public void sumIntegerStreamWithPositiveValues() {
        Integer[] values = {
                4, 17, 21
        };
        Integer sum = ArraySumCalculator.sumIntegerStream(values);
        assertEquals(42, sum.intValue());
    }

    @Test
    public void sumIntegerStreamWithNegativeValues() {
        Integer[] values = {
                -4, -17, -21
        };
        Integer sum = ArraySumCalculator.sumIntegerStream(values);
        assertEquals(-42, sum.intValue());
    }

    @Test
    public void sumIntegerStreamWithMixedValues() {
        Integer[] values = {
                4, 17, -21
        };
        Integer sum = ArraySumCalculator.sumIntegerStream(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumIntegerStreamWithZeroValues() {
        Integer[] values = {
                0, 0, 0
        };
        Integer sum = ArraySumCalculator.sumIntegerStream(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumIntegerStreamWithNullValues() {
        Integer[] values = new Integer[4];
        values[0] = 4;
        values[3] = 21;
        Integer sum = ArraySumCalculator.sumIntegerStream(values);
        assertEquals(25, sum.intValue());
    }

    @Test
    public void sumIntegerStreamWithMaxOverflow() {
        Integer[] values = {
                Integer.MAX_VALUE, 17
        };
        Integer sum = ArraySumCalculator.sumIntegerStream(values);
        assertTrue(sum.intValue() < 0); // Overflow caused
    }

    @Test
    public void sumIntegerStreamWithMinOverflow() {
        Integer[] values = {
                Integer.MIN_VALUE, -17
        };
        Integer sum = ArraySumCalculator.sumIntegerStream(values);
        assertTrue(sum.intValue() > 0); // Overflow caused
    }

    @Test
    public void sumIntegerStreamWithEmtpyArray() {
        Integer[] values = new Integer[0];
        Integer sum = ArraySumCalculator.sumIntegerStream(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumIntegerStreamWithNullArray() {
        try {
            ArraySumCalculator.sumIntegerStream(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

}

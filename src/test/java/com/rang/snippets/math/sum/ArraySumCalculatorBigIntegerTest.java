package com.rang.snippets.math.sum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

/**
 * This is the test-class for all methods of {@link ArraySumCalculator} handling arrays of BigInteger.
 */
public class ArraySumCalculatorBigIntegerTest {

    /* ***** ***** ***** Tests of method sumBigIntegerLoop() ***** ***** ***** */

    @Test
    public void sumBigIntegerLoopWithPositiveValues() {
        BigInteger[] values = {
                BigInteger.valueOf(4), BigInteger.valueOf(17), BigInteger.valueOf(21)
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerLoop(values);
        assertEquals(42, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithNegativeValues() {
        BigInteger[] values = {
                BigInteger.valueOf(-4), BigInteger.valueOf(-17), BigInteger.valueOf(-21)
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerLoop(values);
        assertEquals(-42, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithMixedValues() {
        BigInteger[] values = {
                BigInteger.valueOf(4), BigInteger.valueOf(17), BigInteger.valueOf(-21)
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerLoop(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntLoopWithZeroValues() {
        BigInteger[] values = {
                BigInteger.ZERO, BigInteger.ZERO, BigInteger.ZERO
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerLoop(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithNullValues() {
        BigInteger[] values = new BigInteger[4];
        values[0] = BigInteger.valueOf(4);
        values[3] = BigInteger.valueOf(21);
        BigInteger sum = ArraySumCalculator.sumBigIntegerLoop(values);
        assertEquals(25, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopHigherThanMaxInteger() {
        BigInteger[] values = {
                BigInteger.valueOf(Integer.MAX_VALUE), BigInteger.valueOf(17)
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerLoop(values);
        assertEquals(new BigInteger("2147483664"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerLoopLowerThanMinInteger() {
        BigInteger[] values = {
                BigInteger.valueOf(Integer.MIN_VALUE), BigInteger.valueOf(-17)
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerLoop(values);
        assertEquals(new BigInteger("-2147483665"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerLoopWithEmtpyArray() {
        BigInteger[] values = new BigInteger[0];
        BigInteger sum = ArraySumCalculator.sumBigIntegerLoop(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithNullArray() {
        try {
            ArraySumCalculator.sumBigIntegerLoop(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

    /* ***** ***** ***** Tests of method sumBigIntegerStream() ***** ***** ***** */

    @Test
    public void sumBigIntegerStreamWithPositiveValues() {
        BigInteger[] values = {
                BigInteger.valueOf(4), BigInteger.valueOf(17), BigInteger.valueOf(21)
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerStream(values);
        assertEquals(42, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithNegativeValues() {
        BigInteger[] values = {
                BigInteger.valueOf(-4), BigInteger.valueOf(-17), BigInteger.valueOf(-21)
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerStream(values);
        assertEquals(-42, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithMixedValues() {
        BigInteger[] values = {
                BigInteger.valueOf(4), BigInteger.valueOf(17), BigInteger.valueOf(-21)
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerStream(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithZeroValues() {
        BigInteger[] values = {
                BigInteger.ZERO, BigInteger.ZERO, BigInteger.ZERO
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerStream(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithNullValues() {
        BigInteger[] values = new BigInteger[4];
        values[0] = BigInteger.valueOf(4);
        values[3] = BigInteger.valueOf(21);
        BigInteger sum = ArraySumCalculator.sumBigIntegerStream(values);
        assertEquals(25, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamHigherThanMaxInteger() {
        BigInteger[] values = {
                BigInteger.valueOf(Integer.MAX_VALUE), BigInteger.valueOf(17)
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerStream(values);
        assertEquals(new BigInteger("2147483664"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerStreamLowerThanMinInteger() {
        BigInteger[] values = {
                BigInteger.valueOf(Integer.MIN_VALUE), BigInteger.valueOf(-17)
        };
        BigInteger sum = ArraySumCalculator.sumBigIntegerStream(values);
        assertEquals(new BigInteger("-2147483665"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerStreamWithEmtpyArray() {
        BigInteger[] values = new BigInteger[0];
        BigInteger sum = ArraySumCalculator.sumBigIntegerStream(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithNullArray() {
        try {
            ArraySumCalculator.sumBigIntegerStream(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

}

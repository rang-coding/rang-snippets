package com.rang.snippets.math.sum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.jupiter.api.Test;

/**
 * This is the test-class for all methods of {@link CollectionSumCalculator} handling collections of BigInteger.
 */
public class CollectionSumCalculatorBigIntegerTest {

    /* ***** ***** ***** Tests of method sumBigIntegerLoop() ***** ***** ***** */

    @Test
    public void sumBigIntegerLoopWithPositiveValues() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(4), BigInteger.valueOf(17),
                BigInteger.valueOf(21));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerLoop(values);
        assertEquals(42, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithNegativeValues() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(-4), BigInteger.valueOf(-17),
                BigInteger.valueOf(-21));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerLoop(values);
        assertEquals(-42, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithMixedValues() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(4), BigInteger.valueOf(17),
                BigInteger.valueOf(-21));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerLoop(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntLoopWithZeroValues() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.ZERO, BigInteger.ZERO, BigInteger.ZERO);
        BigInteger sum = CollectionSumCalculator.sumBigIntegerLoop(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithNullValues() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(4), null, null, BigInteger.valueOf(21));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerLoop(values);
        assertEquals(25, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopHigherThanMaxInteger() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(Integer.MAX_VALUE), BigInteger.valueOf(17));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerLoop(values);
        assertEquals(new BigInteger("2147483664"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerLoopLowerThanMinInteger() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(Integer.MIN_VALUE), BigInteger.valueOf(-17));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerLoop(values);
        assertEquals(new BigInteger("-2147483665"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerLoopWithEmtpyArray() {
        Collection<BigInteger> values = Collections.emptyList();
        BigInteger sum = CollectionSumCalculator.sumBigIntegerLoop(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithNullArray() {
        try {
            CollectionSumCalculator.sumBigIntegerLoop(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

    /* ***** ***** ***** Tests of method sumBigIntegerStream() ***** ***** ***** */

    @Test
    public void sumBigIntegerStreamWithPositiveValues() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(4), BigInteger.valueOf(17),
                BigInteger.valueOf(21));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerStream(values);
        assertEquals(42, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithNegativeValues() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(-4), BigInteger.valueOf(-17),
                BigInteger.valueOf(-21));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerStream(values);
        assertEquals(-42, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithMixedValues() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(4), BigInteger.valueOf(17),
                BigInteger.valueOf(-21));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerStream(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntLoopStreamZeroValues() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.ZERO, BigInteger.ZERO, BigInteger.ZERO);
        BigInteger sum = CollectionSumCalculator.sumBigIntegerStream(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithNullValues() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(4), null, null, BigInteger.valueOf(21));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerStream(values);
        assertEquals(25, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamHigherThanMaxInteger() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(Integer.MAX_VALUE), BigInteger.valueOf(17));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerStream(values);
        assertEquals(new BigInteger("2147483664"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerStreamLowerThanMinInteger() {
        Collection<BigInteger> values = Arrays.asList(BigInteger.valueOf(Integer.MIN_VALUE), BigInteger.valueOf(-17));
        BigInteger sum = CollectionSumCalculator.sumBigIntegerStream(values);
        assertEquals(new BigInteger("-2147483665"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerStreamWithEmtpyArray() {
        Collection<BigInteger> values = Collections.emptyList();
        BigInteger sum = CollectionSumCalculator.sumBigIntegerStream(values);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithNullArray() {
        try {
            CollectionSumCalculator.sumBigIntegerStream(null);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

}

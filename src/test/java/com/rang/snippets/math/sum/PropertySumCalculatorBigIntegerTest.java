package com.rang.snippets.math.sum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.jupiter.api.Test;

/**
 * This is the test-class for all methods of {@link PropertySumCalculator} handling a property of type BigInteger.
 */
public class PropertySumCalculatorBigIntegerTest {

    /*
     * ***** ***** ***** Tests of method sumBigIntegerIntegerLoop() ***** ***** *****
     */

    @Test
    public void sumBigIntegerLoopWithPositiveValues() throws Exception {
        Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(17), new TestObject(21));
        BigInteger sum = PropertySumCalculator.sumBigIntegerLoop(values,
                TestObject.class.getMethod("getBigIntegerField"));
        assertEquals(42, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithNegativeValues() throws Exception {
        Collection<TestObject> values = Arrays.asList(new TestObject(-4), new TestObject(-17), new TestObject(-21));
        BigInteger sum = PropertySumCalculator.sumBigIntegerLoop(values,
                TestObject.class.getMethod("getBigIntegerField"));
        assertEquals(-42, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithMixedValues() throws Exception {
        Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(17), new TestObject(-21));
        BigInteger sum = PropertySumCalculator.sumBigIntegerLoop(values,
                TestObject.class.getMethod("getBigIntegerField"));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopZeroValues() throws Exception {
        Collection<TestObject> values = Arrays.asList(new TestObject(BigInteger.ZERO), new TestObject(BigInteger.ZERO),
                new TestObject(BigInteger.ZERO));
        BigInteger sum = PropertySumCalculator.sumBigIntegerLoop(values,
                TestObject.class.getMethod("getBigIntegerField"));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithNullValues() throws Exception {
        Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(null), new TestObject(null),
                new TestObject(21));
        BigInteger sum = PropertySumCalculator.sumBigIntegerLoop(values,
                TestObject.class.getMethod("getBigIntegerField"));
        assertEquals(25, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopHigherThanMaxInteger() throws Exception {
        Collection<TestObject> values = Arrays.asList(new TestObject(Integer.MAX_VALUE), new TestObject(17));
        BigInteger sum = PropertySumCalculator.sumBigIntegerLoop(values,
                TestObject.class.getMethod("getBigIntegerField"));
        assertEquals(new BigInteger("2147483664"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerLoopLowerThanMinInteger() throws Exception {
        Collection<TestObject> values = Arrays.asList(new TestObject(Integer.MIN_VALUE), new TestObject(-17));
        BigInteger sum = PropertySumCalculator.sumBigIntegerLoop(values,
                TestObject.class.getMethod("getBigIntegerField"));
        assertEquals(new BigInteger("-2147483665"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerLoopWithEmtpyArray() throws Exception {
        Collection<TestObject> values = Collections.emptyList();
        BigInteger sum = PropertySumCalculator.sumBigIntegerLoop(values,
                TestObject.class.getMethod("getBigIntegerField"));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithNullObjects() throws Exception {
        Collection<TestObject> values = Arrays.asList(new TestObject(4), null, null, new TestObject(21));
        BigInteger sum = PropertySumCalculator.sumBigIntegerLoop(values,
                TestObject.class.getMethod("getBigIntegerField"));
        assertEquals(25, sum.intValue());
    }

    @Test
    public void sumBigIntegerLoopWithNullArray() throws Exception {
        try {
            PropertySumCalculator.sumBigIntegerLoop(null, TestObject.class.getMethod("getBigIntegerField"));
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

    /*
     * ***** ***** ***** Tests of method sumBigIntegerIntegerStream() ***** ***** *****
     */

    @Test
    public void sumBigIntegerStreamWithPositiveValues() {
        Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(17), new TestObject(21));
        BigInteger sum = PropertySumCalculator.sumBigIntegerStream(values, TestObject::getBigIntegerField);
        assertEquals(42, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithNegativeValues() {
        Collection<TestObject> values = Arrays.asList(new TestObject(-4), new TestObject(-17), new TestObject(-21));
        BigInteger sum = PropertySumCalculator.sumBigIntegerStream(values, TestObject::getBigIntegerField);
        assertEquals(-42, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithMixedValues() {
        Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(17), new TestObject(-21));
        BigInteger sum = PropertySumCalculator.sumBigIntegerStream(values, TestObject::getBigIntegerField);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamZeroValues() {
        Collection<TestObject> values = Arrays.asList(new TestObject(BigInteger.ZERO), new TestObject(BigInteger.ZERO),
                new TestObject(BigInteger.ZERO));
        BigInteger sum = PropertySumCalculator.sumBigIntegerStream(values, TestObject::getBigIntegerField);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithNullValues() {
        Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(null), new TestObject(null),
                new TestObject(21));
        BigInteger sum = PropertySumCalculator.sumBigIntegerStream(values, TestObject::getBigIntegerField);
        assertEquals(25, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamHigherThanMaxInteger() {
        Collection<TestObject> values = Arrays.asList(new TestObject(Integer.MAX_VALUE), new TestObject(17));
        BigInteger sum = PropertySumCalculator.sumBigIntegerStream(values, TestObject::getBigIntegerField);
        assertEquals(new BigInteger("2147483664"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerStreamLowerThanMinInteger() {
        Collection<TestObject> values = Arrays.asList(new TestObject(Integer.MIN_VALUE), new TestObject(-17));
        BigInteger sum = PropertySumCalculator.sumBigIntegerStream(values, TestObject::getBigIntegerField);
        assertEquals(new BigInteger("-2147483665"), sum); // No overflow
    }

    @Test
    public void sumBigIntegerStreamWithEmtpyArray() {
        Collection<TestObject> values = Collections.emptyList();
        BigInteger sum = PropertySumCalculator.sumBigIntegerStream(values, TestObject::getBigIntegerField);
        assertEquals(0, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithNullObjects() {
        Collection<TestObject> values = Arrays.asList(new TestObject(4), null, null, new TestObject(21));
        BigInteger sum = PropertySumCalculator.sumBigIntegerStream(values, TestObject::getBigIntegerField);
        assertEquals(25, sum.intValue());
    }

    @Test
    public void sumBigIntegerStreamWithNullArray() {
        try {
            PropertySumCalculator.sumBigIntegerStream(null, TestObject::getBigIntegerField);
            fail("NullPointerException expected");
        } catch (NullPointerException e) {
            // The method is not null-safe for easier understanding
        }
    }

    /* ***** ***** ***** Test-Class ***** ***** ***** */
    private class TestObject {

        private final BigInteger bigIntegerField;

        public TestObject(BigInteger i) {
            bigIntegerField = i;
        }

        public TestObject(int i) {
            bigIntegerField = BigInteger.valueOf(i);
        }

        public BigInteger getBigIntegerField() {
            return bigIntegerField;
        }

    }

}

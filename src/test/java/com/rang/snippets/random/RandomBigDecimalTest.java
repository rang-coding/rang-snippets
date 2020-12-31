package com.rang.snippets.random;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class RandomBigDecimalTest {

    /* ***** ***** ***** Tests of method generateRandomDecimal() ***** ***** ***** */

    @Test
    public void generateRandom() {
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal();
            assertTrue(BigDecimal.ZERO.compareTo(random) != 1);
            assertTrue(BigDecimal.ONE.compareTo(random) != -1);
        }
    }

    /* ***** ***** ***** Tests of method generateRandomDecimal(int) ***** ***** ***** */

    @Test
    public void generateRandomWithPositiveMaxIntValue() {
        int max = 50;
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(max);
            assertTrue(BigDecimal.ZERO.compareTo(random) != 1);
            assertTrue(BigDecimal.valueOf(max).compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithNegativeMaxIntValue() {
        int max = -50;
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(max);
            assertTrue(BigDecimal.ZERO.compareTo(random) != -1);
            assertTrue(BigDecimal.valueOf(max).compareTo(random) != 1);
        }
    }

    @Test
    public void generateRandomWithMaxIntValueZero() {
        int max = 0;
        try {
            RandomBigDecimal.generateRandomDecimal(max);
            fail("IllegalArgumentException excepted");
        } catch (IllegalArgumentException e) {
            // Zero as parameter is not allowed
        }
    }

    /* ***** ***** ***** Tests of method generateRandomDecimal(BigDecimal) ***** ***** ***** */

    @Test
    public void generateRandomWithPositiveMaxValue() {
        BigDecimal max = new BigDecimal("50.05");
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(max);
            assertTrue(BigDecimal.ZERO.compareTo(random) != 1);
            assertTrue(max.compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithNegativeMaxValue() {
        BigDecimal max = new BigDecimal("-50.05");
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(max);
            assertTrue(BigDecimal.ZERO.compareTo(random) != -1);
            assertTrue(max.compareTo(random) != 1);
        }
    }

    @Test
    public void generateRandomWithMaxValueZero() {
        BigDecimal max = BigDecimal.ZERO;
        try {
            RandomBigDecimal.generateRandomDecimal(max);
            fail("IllegalArgumentException excepted");
        } catch (IllegalArgumentException e) {
            // Zero as parameter is not allowed
        }
    }

    /* ***** ***** ***** Tests of method generateRandomDecimal(int, int) ***** ***** ***** */

    @Test
    public void generateRandomWithMinIntValueZeroAndMaxIntValuePositive() {
        int min = 0;
        int max = 50;
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(min, max);
            assertTrue(BigDecimal.valueOf(min).compareTo(random) != 1);
            assertTrue(BigDecimal.valueOf(max).compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithMinIntValueNegativeAndMaxIntValuePositive() {
        int min = -50;
        int max = 50;
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(min, max);
            assertTrue(BigDecimal.valueOf(min).compareTo(random) != 1);
            assertTrue(BigDecimal.valueOf(max).compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithMinIntValuePositiveAndMaxIntValuePositive() {
        int min = 50;
        int max = 100;
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(min, max);
            assertTrue(BigDecimal.valueOf(min).compareTo(random) != 1);
            assertTrue(BigDecimal.valueOf(max).compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithMinIntValueNegativeAndMaxIntValueZero() {
        int min = -50;
        int max = 0;
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(min, max);
            assertTrue(BigDecimal.valueOf(min).compareTo(random) != 1);
            assertTrue(BigDecimal.valueOf(max).compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithMinIntValueNegativeAndMaxIntValueNegative() {
        int min = -100;
        int max = -50;
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(min, max);
            assertTrue(BigDecimal.valueOf(min).compareTo(random) != 1);
            assertTrue(BigDecimal.valueOf(max).compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithMinIntValueGreaterThanMaxIntValue() {
        int min = 100;
        int max = 50;
        try {
            RandomBigDecimal.generateRandomDecimal(min, max);
            fail("IllegalArgumentException excepted");
        } catch (IllegalArgumentException e) {
            // max must be greater than min
        }
    }

    /* ***** ***** ***** Tests of method generateRandomDecimal(BigDecimal, BigDecimal) ***** ***** ***** */

    @Test
    public void generateRandomWithMinValueZeroAndMaxValuePositive() {
        BigDecimal min = BigDecimal.ZERO;
        BigDecimal max = new BigDecimal("50.05");
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(min, max);
            assertTrue(min.compareTo(random) != 1);
            assertTrue(max.compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithMinValueNegativeAndMaxValuePositive() {
        BigDecimal min = new BigDecimal("-50.05");
        BigDecimal max = new BigDecimal("50.05");
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(min, max);
            assertTrue(min.compareTo(random) != 1);
            assertTrue(max.compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithMinValuePositiveAndMaxValuePositive() {
        BigDecimal min = new BigDecimal("50.05");
        BigDecimal max = new BigDecimal("100.10");
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(min, max);
            assertTrue(min.compareTo(random) != 1);
            assertTrue(max.compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithMinValueNegativeAndMaxValueZero() {
        BigDecimal min = new BigDecimal("-50.05");
        BigDecimal max = BigDecimal.ZERO;
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(min, max);
            assertTrue(min.compareTo(random) != 1);
            assertTrue(max.compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithMinValueNegativeAndMaxValueNegative() {
        BigDecimal min = new BigDecimal("-100.10");
        BigDecimal max = new BigDecimal("-50.05");
        for (int i = 0; i < 100; i++) {
            BigDecimal random = RandomBigDecimal.generateRandomDecimal(min, max);
            assertTrue(min.compareTo(random) != 1);
            assertTrue(max.compareTo(random) != -1);
        }
    }

    @Test
    public void generateRandomWithMinValueGreaterThanMaxValue() {
        BigDecimal min = new BigDecimal("100.10");
        BigDecimal max = new BigDecimal("50.05");
        try {
            RandomBigDecimal.generateRandomDecimal(min, max);
            fail("IllegalArgumentException excepted");
        } catch (IllegalArgumentException e) {
            // max must be greater than min
        }
    }

}

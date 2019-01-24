package com.rang.snippets.math.sum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * This is the test-class for all methods of {@link ArraySumCalculator} handling arrays of BigDecimal.
 */
public class ArraySumCalculatorBigDecimalTest {

	/* ***** ***** ***** Tests of method sumBigDecimalLoop() ***** ***** ***** */

	@Test
	public void sumBigDecimalLoopWithPositiveValues() {
		BigDecimal[] values = { BigDecimal.valueOf(4.04), BigDecimal.valueOf(17.17), BigDecimal.valueOf(21.21) };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("42.42"), sum);
	}

	@Test
	public void sumBigDecimalLoopWithNegativeValues() {
		BigDecimal[] values = { BigDecimal.valueOf(-4.04), BigDecimal.valueOf(-17.17), BigDecimal.valueOf(-21.21) };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("-42.42"), sum);
	}

	@Test
	public void sumBigDecimalLoopWithMixedValues() {
		BigDecimal[] values = { BigDecimal.valueOf(4.04), BigDecimal.valueOf(17.17), BigDecimal.valueOf(-21.21) };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("0.00"), sum);
	}

	@Test
	public void sumBigDecimalLoopWithZeroValues() {
		BigDecimal[] values = { BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalLoop(values);
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalLoopWithNullValues() {
		BigDecimal[] values = new BigDecimal[4];
		values[0] = BigDecimal.valueOf(4.04);
		values[3] = BigDecimal.valueOf(21.21);
		BigDecimal sum = ArraySumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("25.25"), sum);
	}

	@Test
	public void sumBigDecimalLoopHigherThanMaxInteger() {
		BigDecimal[] values = { BigDecimal.valueOf(Integer.MAX_VALUE), BigDecimal.valueOf(17.17) };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("2147483664.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalLoopLowerThanMinInteger() {
		BigDecimal[] values = { BigDecimal.valueOf(Integer.MIN_VALUE), BigDecimal.valueOf(-17.17) };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("-2147483665.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalLoopWithEmtpyArray() {
		BigDecimal[] values = new BigDecimal[0];
		BigDecimal sum = ArraySumCalculator.sumBigDecimalLoop(values);
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalLoopWithNullArray() {
		try {
			ArraySumCalculator.sumBigDecimalLoop(null);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// The method is not null-safe for easier understanding
		}
	}

	/* ***** ***** ***** Tests of method sumBigDecimalStream() ***** ***** ***** */

	@Test
	public void sumBigDecimalStreamWithPositiveValues() {
		BigDecimal[] values = { BigDecimal.valueOf(4.04), BigDecimal.valueOf(17.17), BigDecimal.valueOf(21.21) };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("42.42"), sum);
	}

	@Test
	public void sumBigDecimalStreamWithNegativeValues() {
		BigDecimal[] values = { BigDecimal.valueOf(-4.04), BigDecimal.valueOf(-17.17), BigDecimal.valueOf(-21.21) };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("-42.42"), sum);
	}

	@Test
	public void sumBigDecimalStreamWithMixedValues() {
		BigDecimal[] values = { BigDecimal.valueOf(4.04), BigDecimal.valueOf(17.17), BigDecimal.valueOf(-21.21) };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("0.00"), sum);
	}

	@Test
	public void sumBigDecimalStreamWithZeroValues() {
		BigDecimal[] values = { BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalStream(values);
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalStreamWithNullValues() {
		BigDecimal[] values = new BigDecimal[4];
		values[0] = BigDecimal.valueOf(4.04);
		values[3] = BigDecimal.valueOf(21.21);
		BigDecimal sum = ArraySumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("25.25"), sum);
	}

	@Test
	public void sumBigDecimalStreamHigherThanMaxInteger() {
		BigDecimal[] values = { BigDecimal.valueOf(Integer.MAX_VALUE), BigDecimal.valueOf(17.17) };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("2147483664.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalStreamLowerThanMinInteger() {
		BigDecimal[] values = { BigDecimal.valueOf(Integer.MIN_VALUE), BigDecimal.valueOf(-17.17) };
		BigDecimal sum = ArraySumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("-2147483665.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalStreamWithEmtpyArray() {
		BigDecimal[] values = new BigDecimal[0];
		BigDecimal sum = ArraySumCalculator.sumBigDecimalStream(values);
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalStreamWithNullArray() {
		try {
			ArraySumCalculator.sumBigDecimalStream(null);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// The method is not null-safe for easier understanding
		}
	}

}

package com.rang.snippets.math.sum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

/**
 * This is the test-class for all methods of {@link CollectionSumCalculator}
 * handling collections of BigDecimal.
 */
public class CollectionSumCalculatorBigDecimalTest {

	/* ***** ***** ***** Tests of method sumBigDecimalLoop() ***** ***** ***** */

	@Test
	public void sumBigDecimalLoopWithPositiveValues() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(4.04), BigDecimal.valueOf(17.17),
				BigDecimal.valueOf(21.21));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("42.42"), sum);
	}

	@Test
	public void sumBigDecimalLoopWithNegativeValues() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(-4.04), BigDecimal.valueOf(-17.17),
				BigDecimal.valueOf(-21.21));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("-42.42"), sum);
	}

	@Test
	public void sumBigDecimalLoopWithMixedValues() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(4.04), BigDecimal.valueOf(17.17),
				BigDecimal.valueOf(-21.21));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("0.00"), sum);
	}

	@Test
	public void sumBigDecimalLoopWithZeroValues() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO);
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalLoop(values);
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalLoopWithNullValues() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(4.04), null, null, BigDecimal.valueOf(21.21));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("25.25"), sum);
	}

	@Test
	public void sumBigDecimalLoopHigherThanMaxInteger() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(Integer.MAX_VALUE), BigDecimal.valueOf(17.17));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("2147483664.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalLoopLowerThanMinInteger() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(Integer.MIN_VALUE),
				BigDecimal.valueOf(-17.17));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalLoop(values);
		assertEquals(new BigDecimal("-2147483665.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalLoopWithEmtpyArray() {
		Collection<BigDecimal> values = Collections.emptyList();
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalLoop(values);
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalLoopWithNullArray() {
		try {
			CollectionSumCalculator.sumBigDecimalLoop(null);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// The method is not null-safe for easier understanding
		}
	}

	/* ***** ***** ***** Tests of method sumBigDecimalStream() ***** ***** ***** */

	@Test
	public void sumBigDecimalStreamWithPositiveValues() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(4.04), BigDecimal.valueOf(17.17),
				BigDecimal.valueOf(21.21));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("42.42"), sum);
	}

	@Test
	public void sumBigDecimalStreamWithNegativeValues() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(-4.04), BigDecimal.valueOf(-17.17),
				BigDecimal.valueOf(-21.21));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("-42.42"), sum);
	}

	@Test
	public void sumBigDecimalStreamWithMixedValues() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(4.04), BigDecimal.valueOf(17.17),
				BigDecimal.valueOf(-21.21));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("0.00"), sum);
	}

	@Test
	public void sumBigDecimalStreamWithZeroValues() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO);
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalStream(values);
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalStreamWithNullValues() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(4.04), null, null, BigDecimal.valueOf(21.21));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("25.25"), sum);
	}

	@Test
	public void sumBigDecimalStreamHigherThanMaxInteger() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(Integer.MAX_VALUE), BigDecimal.valueOf(17.17));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("2147483664.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalStreamLowerThanMinInteger() {
		Collection<BigDecimal> values = Arrays.asList(BigDecimal.valueOf(Integer.MIN_VALUE),
				BigDecimal.valueOf(-17.17));
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalStream(values);
		assertEquals(new BigDecimal("-2147483665.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalStreamWithEmtpyArray() {
		Collection<BigDecimal> values = Collections.emptyList();
		BigDecimal sum = CollectionSumCalculator.sumBigDecimalStream(values);
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalStreamWithNullArray() {
		try {
			CollectionSumCalculator.sumBigDecimalStream(null);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// The method is not null-safe for easier understanding
		}
	}

}

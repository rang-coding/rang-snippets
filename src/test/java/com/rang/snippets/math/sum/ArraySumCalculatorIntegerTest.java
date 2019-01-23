package com.rang.snippets.math.sum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * This is the test-class for all methods of {@link ArraySumCalculator} handling
 * arrays of Integer-objects.
 */
public class ArraySumCalculatorIntegerTest {

	/* ***** ***** ***** Tests of method sumIntLoop() ***** ***** ***** */

	@Test
	public void sumIntegerLoopWithPositiveValues() {
		Integer[] values = { 4, 17, 21 };
		Integer sum = ArraySumCalculator.sumIntegerLoop(values);
		assertEquals(42, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithNegativeValues() {
		Integer[] values = { -4, -17, -21 };
		Integer sum = ArraySumCalculator.sumIntegerLoop(values);
		assertEquals(-42, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithMixedValues() {
		Integer[] values = { 4, 17, -21 };
		Integer sum = ArraySumCalculator.sumIntegerLoop(values);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithZeroValues() {
		Integer[] values = { 0, 0, 0 };
		Integer sum = ArraySumCalculator.sumIntegerLoop(values);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithNullValues() {
		Integer[] values = new Integer[3];
		values[0] = 4;
		values[2] = 21;
		Integer sum = ArraySumCalculator.sumIntegerLoop(values);
		assertEquals(25, sum.intValue());
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
			// The method is not nullsafe for easier understanding
		}
	}

	/* ***** ***** ***** Tests of method sumIntStream() ***** ***** ***** */

	@Test
	public void sumIntegerStreamWithPositiveValues() {
		Integer[] values = { 4, 17, 21 };
		Integer sum = ArraySumCalculator.sumIntegerStream(values);
		assertEquals(42, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithNegativeValues() {
		Integer[] values = { -4, -17, -21 };
		Integer sum = ArraySumCalculator.sumIntegerStream(values);
		assertEquals(-42, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithMixedValues() {
		Integer[] values = { 4, 17, -21 };
		Integer sum = ArraySumCalculator.sumIntegerStream(values);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithZeroValues() {
		Integer[] values = { 0, 0, 0 };
		Integer sum = ArraySumCalculator.sumIntegerStream(values);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithNullValues() {
		Integer[] values = new Integer[3];
		values[0] = 4;
		values[2] = 21;
		Integer sum = ArraySumCalculator.sumIntegerStream(values);
		assertEquals(25, sum.intValue());
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
			// The method is not nullsafe for easier understanding
		}
	}

}

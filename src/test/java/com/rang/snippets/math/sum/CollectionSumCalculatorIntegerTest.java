package com.rang.snippets.math.sum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

/**
 * This is the test-class for all methods of {@link CollectionSumCalculator} handling collections of Integer-objects.
 */
public class CollectionSumCalculatorIntegerTest {

	/* ***** ***** ***** Tests of method sumIntegerLoop() ***** ***** ***** */

	@Test
	public void sumIntegerLoopWithPositiveValues() {
		Collection<Integer> values = Arrays.asList(4,17,21);
		Integer sum = CollectionSumCalculator.sumIntegerLoop(values);
		assertEquals(42, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithNegativeValues() {
		Collection<Integer> values = Arrays.asList(-4,-17,-21);
		Integer sum = CollectionSumCalculator.sumIntegerLoop(values);
		assertEquals(-42, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithMixedValues() {
		Collection<Integer> values = Arrays.asList(4,17,-21);
		Integer sum = CollectionSumCalculator.sumIntegerLoop(values);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithZeroValues() {
		Collection<Integer> values = Arrays.asList(0,0,0);
		Integer sum = CollectionSumCalculator.sumIntegerLoop(values);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithNullValues() {
		Collection<Integer> values = Arrays.asList(4,null,null,21);
		Integer sum = CollectionSumCalculator.sumIntegerLoop(values);
		assertEquals(25, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithMaxOverflow() {
		Collection<Integer> values = Arrays.asList(Integer.MAX_VALUE,17);
		Integer sum = CollectionSumCalculator.sumIntegerLoop(values);
		assertTrue(sum.intValue() < 0); // Overflow caused
	}

	@Test
	public void sumIntegerLoopWithMinOverflow() {
		Collection<Integer> values = Arrays.asList(Integer.MIN_VALUE,-17);
		Integer sum = CollectionSumCalculator.sumIntegerLoop(values);
		assertTrue(sum.intValue() > 0); // Overflow caused
	}

	@Test
	public void sumIntegerLoopWithEmtpyArray() {
		Collection<Integer> values = Collections.emptyList();
		Integer sum = CollectionSumCalculator.sumIntegerLoop(values);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithNullArray() {
		try {
			CollectionSumCalculator.sumIntegerLoop(null);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// The method is not null-safe for easier understanding
		}
	}

	/* ***** ***** ***** Tests of method sumIntegerStream() ***** ***** ***** */

	@Test
	public void sumIntegerStreamWithPositiveValues() {
		Collection<Integer> values = Arrays.asList(4,17,21);
		Integer sum = CollectionSumCalculator.sumIntegerStream(values);
		assertEquals(42, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithNegativeValues() {
		Collection<Integer> values = Arrays.asList(-4,-17,-21);
		Integer sum = CollectionSumCalculator.sumIntegerStream(values);
		assertEquals(-42, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithMixedValues() {
		Collection<Integer> values = Arrays.asList(4,17,-21);
		Integer sum = CollectionSumCalculator.sumIntegerStream(values);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithZeroValues() {
		Collection<Integer> values = Arrays.asList(0,0,0);
		Integer sum = CollectionSumCalculator.sumIntegerStream(values);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithNullValues() {
		Collection<Integer> values = Arrays.asList(4,null,null,21);
		Integer sum = CollectionSumCalculator.sumIntegerStream(values);
		assertEquals(25, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithMaxOverflow() {
		Collection<Integer> values = Arrays.asList(Integer.MAX_VALUE,17);
		Integer sum = CollectionSumCalculator.sumIntegerStream(values);
		assertTrue(sum.intValue() < 0); // Overflow caused
	}

	@Test
	public void sumIntegerStreamWithMinOverflow() {
		Collection<Integer> values = Arrays.asList(Integer.MIN_VALUE,-17);
		Integer sum = CollectionSumCalculator.sumIntegerStream(values);
		assertTrue(sum.intValue() > 0); // Overflow caused
	}

	@Test
	public void sumIntegerStreamWithEmtpyArray() {
		Collection<Integer> values = Collections.emptyList();
		Integer sum = CollectionSumCalculator.sumIntegerStream(values);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithNullArray() {
		try {
			CollectionSumCalculator.sumIntegerStream(null);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// The method is not null-safe for easier understanding
		}
	}

}

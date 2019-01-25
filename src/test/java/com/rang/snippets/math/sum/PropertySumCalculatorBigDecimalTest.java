package com.rang.snippets.math.sum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

import lombok.Data;

/**
 * This is the test-class for all methods of {@link PropertySumCalculator}
 * handling a property of type BigDecimal.
 */
public class PropertySumCalculatorBigDecimalTest {

	/*
	 * ***** ***** ***** Tests of method sumBigDecimalIntegerLoop() ***** *****
	 * *****
	 */

	@Test
	public void sumBigDecimalLoopWithPositiveValues() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject("4.04"), new TestObject("17.17"),
				new TestObject("21.21"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalLoop(values,
				TestObject.class.getMethod("getBigDecimalField"));
		assertEquals(new BigDecimal("42.42"), sum);
	}

	@Test
	public void sumBigDecimalLoopWithNegativeValues() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject("-4.04"), new TestObject("-17.17"),
				new TestObject("-21.21"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalLoop(values,
				TestObject.class.getMethod("getBigDecimalField"));
		assertEquals(new BigDecimal("-42.42"), sum);
	}

	@Test
	public void sumBigDecimalLoopWithMixedValues() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject("4.04"), new TestObject("17.17"),
				new TestObject("-21.21"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalLoop(values,
				TestObject.class.getMethod("getBigDecimalField"));
		assertEquals(new BigDecimal("0.00"), sum);
	}

	@Test
	public void sumBigDecimalLoopZeroValues() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject(BigDecimal.ZERO), new TestObject(BigDecimal.ZERO),
				new TestObject(BigDecimal.ZERO));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalLoop(values,
				TestObject.class.getMethod("getBigDecimalField"));
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalLoopWithNullValues() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject("4.04"), new TestObject(), new TestObject(),
				new TestObject("21.21"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalLoop(values,
				TestObject.class.getMethod("getBigDecimalField"));
		assertEquals(new BigDecimal("25.25"), sum);
	}

	@Test
	public void sumBigDecimalLoopHigherThanMaxInteger() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject("2147483647"), new TestObject("17.17"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalLoop(values,
				TestObject.class.getMethod("getBigDecimalField"));
		assertEquals(new BigDecimal("2147483664.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalLoopLowerThanMinInteger() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject("-2147483648"), new TestObject("-17.17"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalLoop(values,
				TestObject.class.getMethod("getBigDecimalField"));
		assertEquals(new BigDecimal("-2147483665.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalLoopWithEmtpyArray() throws Exception {
		Collection<TestObject> values = Collections.emptyList();
		BigDecimal sum = PropertySumCalculator.sumBigDecimalLoop(values,
				TestObject.class.getMethod("getBigDecimalField"));
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalLoopWithNullObjects() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject("4.04"), null, null, new TestObject("21.21"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalLoop(values,
				TestObject.class.getMethod("getBigDecimalField"));
		assertEquals(new BigDecimal("25.25"), sum);
	}

	@Test
	public void sumBigDecimalLoopWithNullArray() throws Exception {
		try {
			PropertySumCalculator.sumBigDecimalLoop(null, TestObject.class.getMethod("getBigDecimalField"));
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// The method is not null-safe for easier understanding
		}
	}

	/*
	 * ***** ***** ***** Tests of method sumBigDecimalIntegerStream() ***** *****
	 * *****
	 */

	@Test
	public void sumBigDecimalStreamWithPositiveValues() {
		Collection<TestObject> values = Arrays.asList(new TestObject("4.04"), new TestObject("17.17"),
				new TestObject("21.21"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalStream(values, TestObject::getBigDecimalField);
		assertEquals(new BigDecimal("42.42"), sum);
	}

	@Test
	public void sumBigDecimalStreamWithNegativeValues() {
		Collection<TestObject> values = Arrays.asList(new TestObject("-4.04"), new TestObject("-17.17"),
				new TestObject("-21.21"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalStream(values, TestObject::getBigDecimalField);
		assertEquals(new BigDecimal("-42.42"), sum);
	}

	@Test
	public void sumBigDecimalStreamWithMixedValues() {
		Collection<TestObject> values = Arrays.asList(new TestObject("4.04"), new TestObject("17.17"),
				new TestObject("-21.21"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalStream(values, TestObject::getBigDecimalField);
		assertEquals(new BigDecimal("0.00"), sum);
	}

	@Test
	public void sumBigDecimalStreamZeroValues() {
		Collection<TestObject> values = Arrays.asList(new TestObject(BigDecimal.ZERO), new TestObject(BigDecimal.ZERO),
				new TestObject(BigDecimal.ZERO));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalStream(values, TestObject::getBigDecimalField);
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalStreamWithNullValues() {
		Collection<TestObject> values = Arrays.asList(new TestObject("4.04"), new TestObject(), new TestObject(),
				new TestObject("21.21"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalStream(values, TestObject::getBigDecimalField);
		assertEquals(new BigDecimal("25.25"), sum);
	}

	@Test
	public void sumBigDecimalStreamHigherThanMaxInteger() {
		Collection<TestObject> values = Arrays.asList(new TestObject("2147483647"), new TestObject("17.17"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalStream(values, TestObject::getBigDecimalField);
		assertEquals(new BigDecimal("2147483664.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalStreamLowerThanMinInteger() {
		Collection<TestObject> values = Arrays.asList(new TestObject("-2147483648"), new TestObject("-17.17"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalStream(values, TestObject::getBigDecimalField);
		assertEquals(new BigDecimal("-2147483665.17"), sum); // No overflow
	}

	@Test
	public void sumBigDecimalStreamWithEmtpyArray() {
		Collection<TestObject> values = Collections.emptyList();
		BigDecimal sum = PropertySumCalculator.sumBigDecimalStream(values, TestObject::getBigDecimalField);
		assertEquals(BigDecimal.ZERO, sum);
	}

	@Test
	public void sumBigDecimalStreamWithNullObjects() {
		Collection<TestObject> values = Arrays.asList(new TestObject("4.04"), null, null, new TestObject("21.21"));
		BigDecimal sum = PropertySumCalculator.sumBigDecimalStream(values, TestObject::getBigDecimalField);
		assertEquals(new BigDecimal("25.25"), sum);
	}

	@Test
	public void sumBigDecimalStreamWithNullArray() {
		try {
			PropertySumCalculator.sumBigDecimalStream(null, TestObject::getBigDecimalField);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// The method is not null-safe for easier understanding
		}
	}

	/* ***** ***** ***** Test-Class ***** ***** ***** */

	@Data
	private class TestObject {
		private final BigDecimal bigDecimalField;

		public TestObject() {
			bigDecimalField = null;
		}

		public TestObject(BigDecimal i) {
			bigDecimalField = i;
		}

		public TestObject(String i) {
			bigDecimalField = new BigDecimal(i);
		}
	}

}

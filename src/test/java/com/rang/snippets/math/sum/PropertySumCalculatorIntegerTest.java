package com.rang.snippets.math.sum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;

import lombok.Data;

/**
 * This is the test-class for all methods of {@link PropertySumCalculator}
 * handling a property of type Integer-object.
 */
public class PropertySumCalculatorIntegerTest {

	/* ***** ***** ***** Tests of method sumIntegerLoop() ***** ***** ***** */

	@Test
	public void sumIntegerLoopWithPositiveValues() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(17), new TestObject(21));
		Integer sum = PropertySumCalculator.sumIntegerLoop(values, TestObject.class.getMethod("getIntegerField"));
		assertEquals(42, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithNegativeValues() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject(-4), new TestObject(-17), new TestObject(-21));
		Integer sum = PropertySumCalculator.sumIntegerLoop(values, TestObject.class.getMethod("getIntegerField"));
		assertEquals(-42, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithMixedValues() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(17), new TestObject(-21));
		Integer sum = PropertySumCalculator.sumIntegerLoop(values, TestObject.class.getMethod("getIntegerField"));
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithZeroValues() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject(0), new TestObject(0), new TestObject(0));
		Integer sum = PropertySumCalculator.sumIntegerLoop(values, TestObject.class.getMethod("getIntegerField"));
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithNullValues() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(null), new TestObject(null),
				new TestObject(21));
		Integer sum = PropertySumCalculator.sumIntegerLoop(values, TestObject.class.getMethod("getIntegerField"));
		assertEquals(25, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithMaxOverflow() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject(Integer.MAX_VALUE), new TestObject(17));
		Integer sum = PropertySumCalculator.sumIntegerLoop(values, TestObject.class.getMethod("getIntegerField"));
		assertTrue(sum.intValue() < 0); // Overflow caused
	}

	@Test
	public void sumIntegerLoopWithMinOverflow() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject(Integer.MIN_VALUE), new TestObject(-17));
		Integer sum = PropertySumCalculator.sumIntegerLoop(values, TestObject.class.getMethod("getIntegerField"));
		assertTrue(sum.intValue() > 0); // Overflow caused
	}

	@Test
	public void sumIntegerLoopWithEmtpyArray() throws Exception {
		Collection<TestObject> values = Collections.emptyList();
		Integer sum = PropertySumCalculator.sumIntegerLoop(values, TestObject.class.getMethod("getIntegerField"));
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithNullObjects() throws Exception {
		Collection<TestObject> values = Arrays.asList(new TestObject(4), null, null, new TestObject(21));
		Integer sum = PropertySumCalculator.sumIntegerLoop(values, TestObject.class.getMethod("getIntegerField"));
		assertEquals(25, sum.intValue());
	}

	@Test
	public void sumIntegerLoopWithNullArray() throws Exception {
		try {
			PropertySumCalculator.sumIntegerLoop(null, TestObject.class.getMethod("getIntegerField"));
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// The method is not null-safe for easier understanding
		}
	}

	/* ***** ***** ***** Tests of method sumIntegerStream() ***** ***** ***** */

	@Test
	public void sumIntegerStreamWithPositiveValues() {
		Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(17), new TestObject(21));
		Integer sum = PropertySumCalculator.sumIntegerStream(values, TestObject::getIntegerField);
		assertEquals(42, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithNegativeValues() {
		Collection<TestObject> values = Arrays.asList(new TestObject(-4), new TestObject(-17), new TestObject(-21));
		Integer sum = PropertySumCalculator.sumIntegerStream(values, TestObject::getIntegerField);
		assertEquals(-42, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithMixedValues() {
		Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(17), new TestObject(-21));
		Integer sum = PropertySumCalculator.sumIntegerStream(values, TestObject::getIntegerField);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithZeroValues() {
		Collection<TestObject> values = Arrays.asList(new TestObject(0), new TestObject(0), new TestObject(0));
		Integer sum = PropertySumCalculator.sumIntegerStream(values, TestObject::getIntegerField);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithNullValues() {
		Collection<TestObject> values = Arrays.asList(new TestObject(4), new TestObject(null), new TestObject(null),
				new TestObject(21));
		Integer sum = PropertySumCalculator.sumIntegerStream(values, TestObject::getIntegerField);
		assertEquals(25, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithMaxOverflow() {
		Collection<TestObject> values = Arrays.asList(new TestObject(Integer.MAX_VALUE), new TestObject(17));
		Integer sum = PropertySumCalculator.sumIntegerStream(values, TestObject::getIntegerField);
		assertTrue(sum.intValue() < 0); // Overflow caused
	}

	@Test
	public void sumIntegerStreamWithMinOverflow() {
		Collection<TestObject> values = Arrays.asList(new TestObject(Integer.MIN_VALUE), new TestObject(-17));
		Integer sum = PropertySumCalculator.sumIntegerStream(values, TestObject::getIntegerField);
		assertTrue(sum.intValue() > 0); // Overflow caused
	}

	@Test
	public void sumIntegerStreamWithEmtpyArray() {
		Collection<TestObject> values = Collections.emptyList();
		Integer sum = PropertySumCalculator.sumIntegerStream(values, TestObject::getIntegerField);
		assertEquals(0, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithNullObjects() {
		Collection<TestObject> values = Arrays.asList(new TestObject(4), null, null, new TestObject(21));
		Integer sum = PropertySumCalculator.sumIntegerStream(values, TestObject::getIntegerField);
		assertEquals(25, sum.intValue());
	}

	@Test
	public void sumIntegerStreamWithNullArray() {
		try {
			PropertySumCalculator.sumIntegerStream(null, TestObject::getIntegerField);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// The method is not null-safe for easier understanding
		}
	}

	/* ***** ***** ***** Test-Class ***** ***** ***** */

	@Data
	private class TestObject {
		private final Integer integerField;
	}

}

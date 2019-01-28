package com.rang.snippets.random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class RandomDoubleTest {

	@Test
	public void generateRandom() {
		for (int i = 0; i < 100; i++) {
			double random = RandomDouble.generateRandomDouble();
			assertTrue(random >= 0);
			assertTrue(random <= 1);
		}
	}

	@Test
	public void generateRandomWithPositiveMaxValue() {
		int max = 50;
		for (int i = 0; i < 100; i++) {
			double random = RandomDouble.generateRandomDouble(max);
			assertTrue(random >= 0);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithNegativeMaxValue() {
		int max = -50;
		for (int i = 0; i < 100; i++) {
			double random = RandomDouble.generateRandomDouble(max);
			assertTrue(random <= 0);
			assertTrue(random >= max);
		}
	}

	@Test
	public void generateRandomWithMaxValueZero() {
		int max = 0;
		try {
			RandomDouble.generateRandomDouble(max);
			fail("IllegalArgumentException excepted");
		} catch (IllegalArgumentException e) {
			// Zero as parameter is not allowed
		}
	}

	@Test
	public void generateRandomWithMinValueZeroAndMaxValuePositive() {
		int min = 0;
		int max = 50;
		for (int i = 0; i < 100; i++) {
			double random = RandomDouble.generateRandomDouble(min, max);
			assertTrue(random >= min);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithMinValueNegativeAndMaxValuePositive() {
		int min = -50;
		int max = 50;
		for (int i = 0; i < 100; i++) {
			double random = RandomDouble.generateRandomDouble(min, max);
			assertTrue(random >= min);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithMinValuePositiveAndMaxValuePositive() {
		int min = 50;
		int max = 100;
		for (int i = 0; i < 100; i++) {
			double random = RandomDouble.generateRandomDouble(min, max);
			assertTrue(random >= min);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithMinValueNegativeAndMaxValueZero() {
		int min = -50;
		int max = 0;
		for (int i = 0; i < 100; i++) {
			double random = RandomDouble.generateRandomDouble(min, max);
			assertTrue(random >= min);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithMinValueNegativeAndMaxValueNegative() {
		int min = -100;
		int max = -50;
		for (int i = 0; i < 100; i++) {
			double random = RandomDouble.generateRandomDouble(min, max);
			assertTrue(random >= min);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithMinValueGreaterThanMaxValue() {
		int min = 100;
		int max = 50;
		try {
			RandomDouble.generateRandomDouble(min, max);
			fail("IllegalArgumentException excepted");
		} catch (IllegalArgumentException e) {
			// Negative parameter is not allowed
		}
	}

}

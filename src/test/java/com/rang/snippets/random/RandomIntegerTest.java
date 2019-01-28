package com.rang.snippets.random;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class RandomIntegerTest {

	@Test
	public void generateRandom() {
		int prevRandom = 0;
		for (int i = 0; i < 100; i++) {
			int random = RandomInteger.generateRandomInt();
			// FIXME Assert random
			assertNotEquals(prevRandom, random);
			prevRandom = random;
		}
	}

	@Test
	public void generateRandomWithMaxValue() {
		int max = 50;
		for (int i = 0; i < 100; i++) {
			int random = RandomInteger.generateRandomInt(max);
			assertTrue(random >= 0);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithNegativeMaxValue() {
		int max = -50;
		try {
			RandomInteger.generateRandomInt(max);
			fail("IllegalArgumentException excepted");
		} catch (IllegalArgumentException e) {
			// Negative parameter is not allowed
		}
	}

	@Test
	public void generateRandomWithMinValueZeroAndMaxValuePositive() {
		int min = 0;
		int max = 50;
		for (int i = 0; i < 100; i++) {
			int random = RandomInteger.generateRandomInt(min, max);
			assertTrue(random >= min);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithMinValueNegativeAndMaxValuePositive() {
		int min = -50;
		int max = 50;
		for (int i = 0; i < 100; i++) {
			int random = RandomInteger.generateRandomInt(min, max);
			assertTrue(random >= min);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithMinValuePositiveAndMaxValuePositive() {
		int min = 50;
		int max = 100;
		for (int i = 0; i < 100; i++) {
			int random = RandomInteger.generateRandomInt(min, max);
			assertTrue(random >= min);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithMinValueNegativeAndMaxValueZero() {
		int min = -50;
		int max = 0;
		for (int i = 0; i < 100; i++) {
			int random = RandomInteger.generateRandomInt(min, max);
			assertTrue(random >= min);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithMinValueNegativeAndMaxValueNegative() {
		int min = -100;
		int max = -50;
		for (int i = 0; i < 100; i++) {
			int random = RandomInteger.generateRandomInt(min, max);
			assertTrue(random >= min);
			assertTrue(random <= max);
		}
	}

	@Test
	public void generateRandomWithMinValueGreaterThanMaxValue() {
		int min = 100;
		int max = 50;
		try {
			RandomInteger.generateRandomInt(min, max);
			fail("IllegalArgumentException excepted");
		} catch (IllegalArgumentException e) {
			// Negative parameter is not allowed
		}
	}

}

package com.rang.snippets.random;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RandomBigDecimal {

	/**
	 * Generates a random decimal between 0.00 and 1.00.
	 * 
	 * @return random decimal
	 */
	public static BigDecimal generateRandomDecimal() {
		BigDecimal randomBigDecimal = new BigDecimal(Math.random());
		return randomBigDecimal.setScale(2, RoundingMode.HALF_UP);
	}

	/**
	 * Generates a random decimal between 0 and the value of the given parameter.
	 * 
	 * @param max highest possible value
	 * @return random decimal
	 */
	public static BigDecimal generateRandomDecimal(int max) {
		if (max == 0) {
			throw new IllegalArgumentException("max must not be zero.");
		}
		BigDecimal randomBigDecimal = new BigDecimal(Math.random()).multiply(new BigDecimal(max));
		return randomBigDecimal.setScale(2, RoundingMode.HALF_UP);
	}

	/**
	 * Generates a random decimal between 0 and the value of the given parameter.
	 * 
	 * @param max highest possible value
	 * @return random decimal
	 */
	public static BigDecimal generateRandomDecimal(BigDecimal max) {
		if (BigDecimal.ZERO.compareTo(max) == 0) {
			throw new IllegalArgumentException("max must not be zero.");
		}
		BigDecimal randomBigDecimal = new BigDecimal(Math.random()).multiply(max);
		return randomBigDecimal.setScale(2, RoundingMode.HALF_UP);
	}

	/**
	 * Generates a random decimal between the values of the two given parameters.
	 * 
	 * @param min lowest possible value
	 * @param max highest possible value
	 * @return random decimal
	 */
	public static BigDecimal generateRandomDecimal(int min, int max) {
		if (max <= min) {
			throw new IllegalArgumentException("max must be greater than min.");
		}
		BigDecimal randomBigDecimal = new BigDecimal(min)
				.add(new BigDecimal(Math.random()).multiply(new BigDecimal(max - min)));
		return randomBigDecimal.setScale(2, RoundingMode.HALF_UP);
	}

	/**
	 * Generates a random decimal between the values of the two given parameters.
	 * 
	 * @param min lowest possible value
	 * @param max highest possible value
	 * @return random decimal
	 */
	public static BigDecimal generateRandomDecimal(BigDecimal min, BigDecimal max) {
		if (min.compareTo(max) != -1) {
			throw new IllegalArgumentException("max must be greater than min.");
		}
		BigDecimal randomBigDecimal = min.add(new BigDecimal(Math.random()).multiply(max.subtract(min)));
		return randomBigDecimal.setScale(2, RoundingMode.HALF_UP);
	}

	/**
	 * Runner demonstrating usage of above methods.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {

		int loopCount = 10;

		System.out.println("Random decimals between 0 and 1:");
		for (int i = 0; i < loopCount; i++) {
			System.out.println((i + 1) + ": " + generateRandomDecimal());
		}

		int max = 50;
		System.out.println();
		System.out.println("Random decimals between 0 and " + max + ":");
		for (int i = 0; i < loopCount; i++) {
			System.out.println((i + 1) + ": " + generateRandomDecimal(max));
		}

		BigDecimal maxDecimal = BigDecimal.TEN;
		System.out.println();
		System.out.println("Random decimals between 0 and " + maxDecimal + ":");
		for (int i = 0; i < loopCount; i++) {
			System.out.println((i + 1) + ": " + generateRandomDecimal(maxDecimal));
		}

		int min = 50;
		max = 100;
		System.out.println();
		System.out.println("Random decimals between " + min + " and " + max + ":");
		for (int i = 0; i < loopCount; i++) {
			System.out.println((i + 1) + ": " + generateRandomDecimal(min, max));
		}

		BigDecimal minDecimal = new BigDecimal("-1.50");
		maxDecimal = new BigDecimal("1.50");
		System.out.println();
		System.out.println("Random decimals between " + minDecimal + " and " + maxDecimal + ":");
		for (int i = 0; i < loopCount; i++) {
			System.out.println((i + 1) + ": " + generateRandomDecimal(minDecimal, maxDecimal));
		}

	}

}

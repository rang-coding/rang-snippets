package com.rang.snippets.random;

import java.util.Random;

public class RandomInteger {

	/**
	 * Generates a random integer using integers full range from -2,147,483,648 to
	 * +2,147,483,647.
	 * 
	 * @return random int
	 */
	public static int generateRandomInt() {
		return new Random().nextInt();
	}

	/**
	 * Generates a random integer between 0 (inclusive) and the value of the given
	 * parameter (inclusive).
	 * 
	 * @param max highest possible value. Must be greater than zero.
	 * @return random int
	 */
	public static int generateRandomInt(int max) {
		if (max <= 0) {
			throw new IllegalArgumentException("max must be greater than zero.");
		}
		return new Random().nextInt(max + 1);
	}

	/**
	 * Generates a random integer between the values of the two given parameters
	 * (inclusive).
	 * 
	 * @param min lowest possible value
	 * @param max highest possible value
	 * @return random int
	 */
	public static int generateRandomInt(int min, int max) {
		if (max <= min) {
			throw new IllegalArgumentException("max must be greater than min.");
		}
		return new Random().nextInt((max - min) + 1) + min;
	}

	/**
	 * Runner demonstrating usage of above methods.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {

		int loopCount = 10;

		System.out.println("Random integers:");
		for (int i = 0; i < loopCount; i++) {
			System.out.println((i + 1) + ": " + generateRandomInt());
		}

		int max = 50;
		System.out.println();
		System.out.println("Random integers between 0 and " + max + ":");
		for (int i = 0; i < loopCount; i++) {
			System.out.println((i + 1) + ": " + generateRandomInt(max));
		}

		int min = 50;
		max = 100;
		System.out.println();
		System.out.println("Random integers between " + min + " and " + max + ":");
		for (int i = 0; i < loopCount; i++) {
			System.out.println((i + 1) + ": " + generateRandomInt(min, max));
		}

		min = -50;
		max = 50;
		System.out.println();
		System.out.println("Random integers between " + min + " and " + max + ":");
		for (int i = 0; i < loopCount; i++) {
			System.out.println((i + 1) + ": " + generateRandomInt(min, max));
		}

	}
}

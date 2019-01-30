package com.rang.snippets.math.average;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayAvgCalculator {

	public static int averageIntLoop(int[] values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		int avg = sum / values.length;
		return avg;
	}

	public static double averageIntStream(int[] values) {
		OptionalDouble avg = Arrays.stream(values).average();
		return avg.getAsDouble();
	}

	/**
	 * Runner demonstrating usage of above methods.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {

		// Array of primitive int
		int[] intValues = { 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		int intAvgLoop = averageIntLoop(intValues);
		double intAvgStream = averageIntStream(intValues);
		System.out.println("Case 1 - Average of int[]        - " //
				+ "loop: " + intAvgLoop + "     " //
				+ "stream: " + intAvgStream);

	}

}

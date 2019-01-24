package com.rang.snippets.math.sum;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;

/**
 * This class contains multiple examples of how to form a sum over an array of numbers.
 *
 * @see {@link CollectionSumCalculator} for more examples regarding Collections.
 * @see {@link PropertySumCalculator} for more examples regarding properties of objects.
 */
public class ArraySumCalculator {

	/**
	 * Forms the sum over an array of primitive int (int[]) by using a conventional for-loop. Sums higher than
	 * 2147483647 or lower than -2147483648 will cause integer overflow.
	 * 
	 * @param values Values as array of primitive int
	 * @return Sum as primitive int
	 */
	public static int sumIntLoop(int[] values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}

	/**
	 * Forms the sum over an array of primitive int (int[]) under the usage of streams. Sums higher than 2147483647 or
	 * lower than -2147483648 will cause integer overflow.
	 *
	 * @param values Values as array of primitive int
	 * @return Sum as primitive int
	 * @since 1.8
	 */
	public static int sumIntStream(int[] values) {
		int sum = Arrays.stream(values).sum();
		return sum;
	}

	/**
	 * Forms the sum over an arbitrary number of primitive int (int...) by using a conventional for-loop. Sums higher
	 * than 2147483647 or lower than -2147483648 will cause integer overflow.
	 *
	 * @param values Values as varargs of primitive int
	 * @return Sum as primitive int
	 */
	public static int sumIntVarargsLoop(int... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}

	/**
	 * Forms the sum over an arbitrary number of primitive int (int...) under the usage of streams. Sums higher than
	 * 2147483647 or lower than -2147483648 will cause integer overflow.
	 *
	 * @param values Values as varargs of primitive int
	 * @return Sum as primitive int
	 * @since 1.8
	 */
	public static int sumIntVarargsStream(int... values) {
		int sum = Arrays.stream(values).sum();
		return sum;
	}

	/**
	 * Forms the sum over an array of Integer-objects (Integer[]) by using a conventional for-loop. Sums higher than
	 * 2147483647 or lower than -2147483648 will cause integer overflow. Null values within the array will be ignored.
	 *
	 * @param values Values as array of Integer-objects
	 * @return Sum as Integer-object
	 */
	public static Integer sumIntegerLoop(Integer[] values) {
		int sum = 0;
		for (Integer value : values) {
			if (value == null) {
				continue;
			}
			sum += value.intValue();
		}
		return Integer.valueOf(sum);
	}

	/**
	 * Forms the sum over an array of Integer-objects (Integer[]) under the usage of streams. Sums higher than
	 * 2147483647 or lower than -2147483648 will cause integer overflow. Null values within the array will be ignored.
	 *
	 * @param values Values as array of Integer-objects
	 * @return Sum as Integer-object
	 * @since 1.8
	 */
	public static Integer sumIntegerStream(Integer[] values) {
		int sum = Arrays.stream(values).filter(Objects::nonNull).mapToInt(Integer::intValue).sum();
		return Integer.valueOf(sum);
	}

	/**
	 * Forms the sum over an array of BigInteger (BigInteger[]) by using a conventional for-loop. Null values within the
	 * array will be ignored.
	 *
	 * @param values Values as array of BigInteger
	 * @return Sum as BigInteger
	 */
	public static BigInteger sumBigIntegerLoop(BigInteger[] values) {
		BigInteger sum = BigInteger.ZERO;
		for (BigInteger value : values) {
			if (value == null) {
				continue;
			}
			sum = sum.add(value);
		}
		return sum;
	}

	/**
	 * Forms the sum over an array of BigInteger (BigInteger[]) under the usage of streams. Null values within the array
	 * will be ignored.
	 *
	 * @param values Values as array of BigInteger
	 * @return Sum as BigInteger
	 * @since 1.8
	 */
	public static BigInteger sumBigIntegerStream(BigInteger[] values) {
		BigInteger sum = Arrays.stream(values).filter(Objects::nonNull).reduce(BigInteger.ZERO, BigInteger::add);
		return sum;
	}

	/**
	 * Forms the sum over an array of BigDecimal (BigDecimal[]) by using a conventional for-loop. Null values within the
	 * array will be ignored.
	 *
	 * @param values Values as array of BigDecimal
	 * @return Sum as BigDecimal
	 */
	public static BigDecimal sumBigDecimalLoop(BigDecimal[] values) {
		BigDecimal sum = BigDecimal.ZERO;
		for (BigDecimal value : values) {
			if (value == null) {
				continue;
			}
			sum = sum.add(value);
		}
		return sum;
	}

	/**
	 * Forms the sum over an array of BigDecimal (BigDecimal[]) under the usage of streams. Null values within the array
	 * will be ignored.
	 *
	 * @param values Values as array of BigDecimal
	 * @return Sum as BigDecimal
	 * @since 1.8
	 */
	public static BigDecimal sumBigDecimalStream(BigDecimal[] values) {
		BigDecimal sum = Arrays.stream(values).filter(Objects::nonNull).reduce(BigDecimal.ZERO, BigDecimal::add);
		return sum;
	}

	/**
	 * Runner demonstrating usage of above methods.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {

		// Array of primitive int
		int[] intValues = { 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		int intSumLoop = sumIntLoop(intValues);
		int intSumStream = sumIntStream(intValues);
		System.out.println("Case 1 - Sum of int[]        - " //
				+ "loop: " + intSumLoop + "     " //
				+ "stream: " + intSumStream);

		// Arbitrary number of primitive int
		int varargsSumLoop = sumIntVarargsLoop(1, 1, 2, 3, 5, 8, 13, 21, 34);
		int varargsSumStream = sumIntVarargsStream(1, 1, 2, 3, 5, 8, 13, 21, 34);
		System.out.println("Case 2 - Sum of int varargs  - " //
				+ "loop: " + varargsSumLoop + "     " //
				+ "stream: " + varargsSumStream);

		// Array of Integer-object
		Integer[] integerValues = { 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		Integer integerSumLoop = sumIntegerLoop(integerValues);
		Integer integerSumStream = sumIntegerStream(integerValues);
		System.out.println("Case 3 - Sum of Integer[]    - " //
				+ "loop: " + integerSumLoop + "     "//
				+ "stream: " + integerSumStream);

		// Array of BigInteger
		BigInteger[] bigIntegerValues = { BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(2),
				BigInteger.valueOf(3), BigInteger.valueOf(5), BigInteger.valueOf(8), BigInteger.valueOf(13),
				BigInteger.valueOf(21), BigInteger.valueOf(34), };
		BigInteger bigIntegerSumLoop = sumBigIntegerLoop(bigIntegerValues);
		BigInteger bigIntegerSumStream = sumBigIntegerStream(bigIntegerValues);
		System.out.println("Case 4 - Sum of BigInteger[] - " //
				+ "loop: " + bigIntegerSumLoop + "     " //
				+ "stream: " + bigIntegerSumStream);

		// Array of BigDecimal
		BigDecimal[] bigDecimalValues = { BigDecimal.valueOf(1.01), BigDecimal.valueOf(1.01), BigDecimal.valueOf(2.02),
				BigDecimal.valueOf(3.03), BigDecimal.valueOf(5.05), BigDecimal.valueOf(8.08), BigDecimal.valueOf(13.13),
				BigDecimal.valueOf(21.21), BigDecimal.valueOf(34.34) };
		BigDecimal bigDecimalSumLoop = sumBigDecimalLoop(bigDecimalValues);
		BigDecimal bigDecimalSumStream = sumBigDecimalStream(bigDecimalValues);
		System.out.println("Case 5 - Sum of BigDecimal[] - " //
				+ "loop: " + bigDecimalSumLoop + "  " //
				+ "stream: " + bigDecimalSumStream);
	}

}

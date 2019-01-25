package com.rang.snippets.math.sum;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.rang.snippets.domain.LegoSet;
import com.rang.snippets.domain.LegoSetFixtures;

/**
 * This class contains multiple examples of how to form a sum over a specific
 * number-property of an object in a collection.
 *
 * @see {@link ArraySumCalculator} for more examples regarding Arrays.
 * @see {@link CollectionSumCalculator} for more examples regarding Collections.
 */
public class PropertySumCalculator {

	/**
	 * Forms the sum over a given {@link Integer}-property of an object in a
	 * collection by using a conventional for-loop. Sums higher than 2147483647 or
	 * lower than -2147483648 will cause integer overflow. Null values within the
	 * collection will be ignored.
	 * 
	 * @param values A collection of objects
	 * @param getter Getter-method of Integer-property
	 * @return Sum as Integer-object
	 * @throws IllegalAccessException    Method is not accessible
	 * @throws IllegalArgumentException  Wrong method-arguments
	 * @throws InvocationTargetException Method-invocation fails
	 */
	public static <T> Integer sumIntegerLoop(Collection<T> values, Method getter)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int sum = 0;
		for (T value : values) {
			if (value == null) {
				continue;
			}
			Integer fieldValue = (Integer) getter.invoke(value);
			if (fieldValue == null) {
				continue;
			}
			sum += fieldValue.intValue();
		}
		return Integer.valueOf(sum);

	}

	/**
	 * Forms the sum over a given {@link Integer}-property of an object in a
	 * collection under the usage of streams. Sums higher than 2147483647 or lower
	 * than -2147483648 will cause integer overflow. Null values within the
	 * collection will be ignored.
	 * 
	 * @param values A collection of objects
	 * @param getter Getter-function of Integer-property
	 * @return Sum as Integer-object
	 * @since 1.8
	 */
	public static <T> Integer sumIntegerStream(Collection<T> values, Function<? super T, Integer> getter) {
		int sum = values.stream() //
				.filter(Objects::nonNull) //
				.filter(value -> getter.apply(value) != null) //
				.mapToInt(value -> getter.apply(value).intValue()).sum();
		return Integer.valueOf(sum);
	}

	/**
	 * Forms the sum over a given {@link BigInteger}-property of an object in a
	 * collection under the usage of streams. Null values within the collection will
	 * be ignored.
	 * 
	 * @param values A collection of objects
	 * @param getter Getter-method of BigInteger-property
	 * @return Sum as BigInteger
	 * @throws IllegalAccessException    Method is not accessible
	 * @throws IllegalArgumentException  Wrong method-arguments
	 * @throws InvocationTargetException Method-invocation fails
	 */
	public static <T> BigInteger sumBigIntegerLoop(Collection<T> values, Method getter)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BigInteger sum = BigInteger.ZERO;
		for (T value : values) {
			if (value == null) {
				continue;
			}
			BigInteger fieldValue = (BigInteger) getter.invoke(value);
			if (fieldValue == null) {
				continue;
			}
			sum = sum.add(fieldValue);
		}
		return sum;
	}

	/**
	 * Forms the sum over a given {@link BigInteger}-property of an object in a
	 * collection under the usage of streams. Null values within the collection will
	 * be ignored.
	 * 
	 * @param values A collection of objects
	 * @param getter Getter-function of BigInteger-property
	 * @return Sum as BigInteger
	 * @since 1.8
	 */
	public static <T> BigInteger sumBigIntegerStream(Collection<T> values, Function<? super T, BigInteger> getter) {
		BigInteger sum = values.stream() //
				.filter(Objects::nonNull) //
				.filter(value -> getter.apply(value) != null)
				.collect(Collectors.reducing(BigInteger.ZERO, value -> getter.apply(value), BigInteger::add));
		return sum;
	}

	/**
	 * Forms the sum over a given {@link BigDecimal}-property of an object in a
	 * collection under the usage of streams. Null values within the collection will
	 * be ignored.
	 * 
	 * @param values A collection of objects
	 * @param getter Getter-method of BigDecimal-property
	 * @return Sum as BigDecimal
	 * @throws IllegalAccessException    Method is not accessible
	 * @throws IllegalArgumentException  Wrong method-arguments
	 * @throws InvocationTargetException Method-invocation fails
	 */
	public static <T> BigDecimal sumBigDecimalLoop(Collection<T> values, Method getter)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BigDecimal sum = BigDecimal.ZERO;
		for (T value : values) {
			if (value == null) {
				continue;
			}
			BigDecimal fieldValue = (BigDecimal) getter.invoke(value);
			if (fieldValue == null) {
				continue;
			}
			sum = sum.add(fieldValue);
		}
		return sum;
	}

	/**
	 * Forms the sum over a given {@link BigDecimal}-property of an object in a
	 * collection under the usage of streams. Null values within the collection will
	 * be ignored.
	 * 
	 * @param values A collection of objects
	 * @param getter Getter-function of BigDecimal-property
	 * @return Sum as BigDecimal
	 * @since 1.8
	 */
	public static <T> BigDecimal sumBigDecimalStream(Collection<T> values, Function<? super T, BigDecimal> getter) {
		BigDecimal sum = values.stream() //
				.filter(Objects::nonNull) //
				.filter(value -> getter.apply(value) != null)
				.collect(Collectors.reducing(BigDecimal.ZERO, value -> getter.apply(value), BigDecimal::add));
		return sum;
	}

	/**
	 * Runner demonstrating usage of above methods.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) throws Exception {

		// Collection of example-objects with number-properties
		Collection<LegoSet> legoSets = Arrays.asList( //
				LegoSetFixtures.BUGATTI_CHIRON, //
				LegoSetFixtures.DOWNTOWN_DINER, //
				LegoSetFixtures.FIRST_RESPONDER, //
				LegoSetFixtures.GREAT_WALL_OF_CHINA, //
				LegoSetFixtures.HEAVY_CARGO_TRANSPORT);

		// Sum over Integer-property
		Integer integerSumLoop = sumIntegerLoop(legoSets, LegoSet.class.getMethod("getPartsAsInteger"));
		Integer integerSumStream = sumIntegerStream(legoSets, LegoSet::getPartsAsInteger);
		System.out.println("Case 1 - Sum of Integer-property    - " //
				+ "loop: " + integerSumLoop + "    " //
				+ "stream: " + integerSumStream);

		// Sum over BigInteger-property
		BigInteger bigIntegerSumLoop = sumBigIntegerLoop(legoSets, LegoSet.class.getMethod("getParts"));
		BigInteger bigIntegerSumStream = sumBigIntegerStream(legoSets, LegoSet::getParts);
		System.out.println("Case 2 - Sum of BigInteger-property - " //
				+ "loop: " + bigIntegerSumLoop + "    "//
				+ "stream: " + bigIntegerSumStream);

		// Sum over BigDecimal-property
		BigDecimal bigDecimalSumLoop = sumBigDecimalLoop(legoSets, LegoSet.class.getMethod("getPrice"));
		BigDecimal bigDecimalSumStream = sumBigDecimalStream(legoSets, LegoSet::getPrice);
		System.out.println("Case 3 - Sum of BigDecimal-property - " //
				+ "loop: " + bigDecimalSumLoop + "  "//
				+ "stream: " + bigDecimalSumStream);
	}

}

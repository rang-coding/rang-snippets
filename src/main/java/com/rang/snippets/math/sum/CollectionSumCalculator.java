package com.rang.snippets.math.sum;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * This class contains multiple examples of how to form a sum over a collection of numbers.
 *
 * @see {@link ArraySumCalculator} for more examples regarding Arrays.
 * @see {@link PropertySumCalculator} for more examples regarding properties of objects.
 */
public class CollectionSumCalculator {

    /**
     * Forms the sum over a collection of Integer-objects ({@code Collection<Integer>}) by using a conventional
     * for-loop. Sums higher than 2147483647 or lower than -2147483648 will cause integer overflow. Null values within
     * the collection will be ignored.
     *
     * @param values Values as collection of Integer-objects
     * @return Sum as Integer-object
     */
    public static Integer sumIntegerLoop(Collection<Integer> values) {
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
     * Forms the sum over a collection of Integer-objects ({@code Collection<Integer>}) under the usage of streams. Sums
     * higher than 2147483647 or lower than -2147483648 will cause integer overflow. Null values within the collection
     * will be ignored.
     *
     * @param values Values as collection of Integer-objects
     * @return Sum as Integer-object
     * @since 1.8
     */
    public static Integer sumIntegerStream(Collection<Integer> values) {
        Integer sum = values.stream().filter(Objects::nonNull).reduce(Integer.valueOf(0), Integer::sum);
        // int sum =
        // values.stream().filter(Objects::nonNull).collect(Collectors.summingInt(Integer::intValue));
        // int sum =
        // values.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).sum();
        return Integer.valueOf(sum);
    }

    /**
     * Forms the sum over a collection of BigInteger ({@code Collection<BigInteger>}) by using a conventional for-loop.
     * Null values within the collection will be ignored.
     *
     * @param values Values as collection of BigInteger
     * @return Sum as BigInteger
     */
    public static BigInteger sumBigIntegerLoop(Collection<BigInteger> values) {
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
     * Forms the sum over a collection of BigInteger ({@code Collection<BigInteger>}) under the usage of streams. Null
     * values within the collection will be ignored.
     *
     * @param values Values as collection of BigInteger
     * @return Sum as BigInteger
     * @since 1.8
     */
    public static BigInteger sumBigIntegerStream(Collection<BigInteger> values) {
        BigInteger sum = values.stream().filter(Objects::nonNull).reduce(BigInteger.ZERO, BigInteger::add);
        return sum;
    }

    /**
     * Forms the sum over a collection of BigDecimal ({@code Collection<BigDecimal>}) by using a conventional for-loop.
     * Null values within the collection will be ignored.
     *
     * @param values Values as collection of BigDecimal
     * @return Sum as BigDecimal
     */
    public static BigDecimal sumBigDecimalLoop(Collection<BigDecimal> values) {
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
     * Forms the sum over a collection of BigDecimal ({@code Collection<BigDecimal>}) under the usage of streams. Null
     * values within the collection will be ignored.
     *
     * @param values Values as collection of BigDecimal
     * @return Sum as BigDecimal
     * @since 1.8
     */
    public static BigDecimal sumBigDecimalStream(Collection<BigDecimal> values) {
        BigDecimal sum = values.stream().filter(Objects::nonNull).reduce(BigDecimal.ZERO, BigDecimal::add);
        return sum;
    }

    /**
     * Runner demonstrating usage of above methods.
     *
     * @param args unused
     */
    public static void main(String[] args) {

        // Collection of Integer-object
        Collection<Integer> integerValues = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34);
        Integer integerSumLoop = sumIntegerLoop(integerValues);
        Integer integerSumStream = sumIntegerStream(integerValues);
        System.out.println("Case 1 - Sum of Collection<Integer>    - " //
                + "loop: " + integerSumLoop + "     "//
                + "stream: " + integerSumStream);

        // Collection of BigInteger
        Collection<BigInteger> bigIntegerValues = Arrays.asList(BigInteger.valueOf(1), BigInteger.valueOf(1),
                BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(5), BigInteger.valueOf(8),
                BigInteger.valueOf(13), BigInteger.valueOf(21), BigInteger.valueOf(34));
        BigInteger bigIntegerSumLoop = sumBigIntegerLoop(bigIntegerValues);
        BigInteger bigIntegerSumStream = sumBigIntegerStream(bigIntegerValues);
        System.out.println("Case 2 - Sum of Collection<BigInteger> - " //
                + "loop: " + bigIntegerSumLoop + "     " //
                + "stream: " + bigIntegerSumStream);

        // Collection of BigDecimal
        Collection<BigDecimal> bigDecimalValues = Arrays.asList(BigDecimal.valueOf(1.01), BigDecimal.valueOf(1.01),
                BigDecimal.valueOf(2.02), BigDecimal.valueOf(3.03), BigDecimal.valueOf(5.05), BigDecimal.valueOf(8.08),
                BigDecimal.valueOf(13.13), BigDecimal.valueOf(21.21), BigDecimal.valueOf(34.34));
        BigDecimal bigDecimalSumLoop = sumBigDecimalLoop(bigDecimalValues);
        BigDecimal bigDecimalSumStream = sumBigDecimalStream(bigDecimalValues);
        System.out.println("Case 3 - Sum of Collection<BigDecimal> - " //
                + "loop: " + bigDecimalSumLoop + "  " //
                + "stream: " + bigDecimalSumStream);
    }

}

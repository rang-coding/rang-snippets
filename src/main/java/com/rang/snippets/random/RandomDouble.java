package com.rang.snippets.random;

import java.util.Random;

public class RandomDouble {

    /**
     * Generates a random double between 0 and 1.
     * 
     * @return random double
     */
    public static double generateRandomDouble() {
        return new Random().nextDouble();
    }

    /**
     * Generates a random double between 0 and the value of the given parameter.
     * 
     * @param max highest possible value. Is allowed to be negative.
     * @return random double
     */
    public static double generateRandomDouble(int max) {
        if (max == 0) {
            throw new IllegalArgumentException("max must not be zero.");
        }
        return new Random().nextDouble() * max;
    }

    /**
     * Generates a random double between the values of the two given parameters.
     * 
     * @param min lowest possible value
     * @param max highest possible value
     * @return random double
     */
    public static double generateRandomDouble(int min, int max) {
        if (max <= min) {
            throw new IllegalArgumentException("max must be greater than min.");
        }
        return new Random().nextDouble() * (max - min) + min;
    }

    /**
     * Runner demonstrating usage of above methods.
     * 
     * @param args unused
     */
    public static void main(String[] args) {

        int loopCount = 10;

        System.out.println("Random doubles:");
        for (int i = 0; i < loopCount; i++) {
            System.out.println((i + 1) + ": " + generateRandomDouble());
        }

        int max = 50;
        System.out.println();
        System.out.println("Random doubles between 0 and " + max + ":");
        for (int i = 0; i < loopCount; i++) {
            System.out.println((i + 1) + ": " + generateRandomDouble(max));
        }

        int min = 50;
        max = 100;
        System.out.println();
        System.out.println("Random doubles between " + min + " and " + max + ":");
        for (int i = 0; i < loopCount; i++) {
            System.out.println((i + 1) + ": " + generateRandomDouble(min, max));
        }

        min = -50;
        max = 50;
        System.out.println();
        System.out.println("Random doubles between " + min + " and " + max + ":");
        for (int i = 0; i < loopCount; i++) {
            System.out.println((i + 1) + ": " + generateRandomDouble(min, max));
        }

    }

}

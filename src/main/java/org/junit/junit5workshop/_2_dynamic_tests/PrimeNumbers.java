package org.junit.junit5workshop._2_dynamic_tests;

import java.util.stream.LongStream;

public class PrimeNumbers {

    public static boolean isPrime(long n) {
        return LongStream.range(2, n / 2)
                .map(i -> n % i)
                .noneMatch(remainder -> remainder == 0);
    }
}

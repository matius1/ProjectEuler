package problem_1;

import java.util.stream.IntStream;

public class Problem1 {
/*
    Multiples of 3 and 5
    Problem 1
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
*/

    public static void main(String[] args) {

        int result = IntStream
                .range(1, 1000)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();

        System.out.println("Sum of all the multiples of 3 or 5 below 1000: " + result);
    }
}

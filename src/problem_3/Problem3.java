package problem_3;

/*      Largest prime factor
        Problem 3

        The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ?
 */

import java.util.ArrayList;
import java.util.List;

public class Problem3 {

    public static void main(String[] args) {
        long number = Long.valueOf("600851475143");
        System.out.println("Largest prime factor of: " + number + " is:" + findMaxPrimeFactor(number));
    }

    private static long findMaxPrimeFactor(long number) {
        List<Long> primeFactors = primeFactors(number);
        return primeFactors.stream().mapToLong(n -> n).max().getAsLong();
    }

    private static List<Long> primeFactors(long n) {
        List<Long> factors = new ArrayList<>();
        for (long i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

}

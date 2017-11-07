package problem_4_palindromic_number;

/*
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    Find the largest palindrome made from the product of two 3-digit numbers.
 */

import java.util.ArrayList;
import java.util.List;

public class Problem4 {

    public static void main(String[] args) {
        List<Integer> palidromes = findPalidromesInRangeOfMaxProduct(999);
        int result = palidromes.stream().mapToInt(n -> n).max().getAsInt();
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + result);
    }

    private static List<Integer> findPalidromesInRangeOfMaxProduct(int maxProductValue) {
        List<Integer> palidromes = new ArrayList<>();

        for (int i = 1; i <= maxProductValue; i++) {
            for (int j = 1; j <= maxProductValue; j++) {
                int n = i * j;
                if (isPalindrome(n))
                    palidromes.add(n);
            }
        }
        return palidromes;
    }

    private static boolean isPalindrome(int n) {
        String intStr = String.valueOf(n);
        return intStr.equals(new StringBuilder(intStr).reverse().toString());
    }

}

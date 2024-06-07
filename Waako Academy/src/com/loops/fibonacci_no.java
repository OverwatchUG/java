package com.loops;

import java.util.Scanner;

public class fibonacci_no {
/*    The fibonacci number is a sequence of numbers where
    the first two numbers in the sequence are 1 and 1

    Then each fibonacci number is the sum of the two previous
    numbers in the sequence

    1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = s.nextInt();

        int result = 0, v1 = 1, v2 = 1;
        for (int i = 1; i <= n - 2; i++) {
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }
        System.out.println("Result = " + (result == 0 ? 1 : result));
    }
}

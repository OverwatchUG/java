package com.loops;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");

        boolean isPrime = true;
        int n = s.nextInt();
        for (int i = 2; i <= n/2; i++)
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        System.out.println(isPrime ? "Prime" : "Not prime");

//        int sum = 1;
//        for (int i = 2; i <= n/2; i++)
//            if (n % i == 0)
//                sum += i;
//        System.out.println(sum == 1 ? "Prime" : "Not prime");

    }
}

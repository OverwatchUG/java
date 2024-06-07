package com.loops;

import java.util.Scanner;

public class sum_100 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int sum = 0;
        while (sum <= 100) {
            System.out.print("Enter a number: ");
            sum += m.nextInt();
        }
        System.out.println("Done " + sum);
    }
}

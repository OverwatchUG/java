package com.loops;

import java.util.Scanner;

public class between_do {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            n = m.nextInt();
        }while (!(n > 1 && n <= 10));
        System.out.println(n + " is between 1 and 10");
    }
}

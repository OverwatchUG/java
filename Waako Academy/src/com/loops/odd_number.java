package com.loops;

public class odd_number {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 20; i >= 1; i--) {
            if (i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}

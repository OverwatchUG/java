package com.loops;

import java.util.Scanner;

public class between {
    public static void main(String[] args) {
        System.out.print("Enter a number betweeen 1 and 10: ");
        Scanner m = new Scanner(System.in);
        int i = m.nextInt();
        while (i < 1 || i > 10) {
            System.out.print(i + " is not between 1 and 10. Try again: ");
            i = m.nextInt();
        }
        System.out.println(i + " is between 1 and 10🥰");
    }
}

package com.loops;

import java.util.Scanner;

public class pos_n {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the integers: ");

        int n = s.nextInt();
        int max = n, min = n;

        if (n > 0) {
            while (true) {
                n = s.nextInt();
                if (n < 0)
                    break;

                max = n > max ? n : max;
                min = n < min ? n : min;

//                if (n > max)
//                    max = n;
//                if (n < min)
//                    min = n;
            }
            System.out.println("Min = " + min + ", Max = " + max);
        } else
            System.out.println(n + " is invalid");
    }
}

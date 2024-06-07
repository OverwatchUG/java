package com.WaakoAcademy;

import java.util.Scanner;

public class greater_than {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        if (n > 10)
            System.out.println(n + " is greater than 10");
        else if (n == 10)
            System.out.println(n + " is equal to 10");
        else
            System.out.println(n + " is less than 10");
    }
}

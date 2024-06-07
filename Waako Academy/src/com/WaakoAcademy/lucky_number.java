package com.WaakoAcademy;

import java.util.Scanner;

public class lucky_number {
    public static void main(String[] args) {
        System.out.print("Enter a four digit number: ");
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();

        if( !(n>999 && n<10000))
            System.out.println(n + " is not a four digit number");
        else {
            // ABCD
            int fourthDigit = n % 10; // D
            int thirdDigit = (n / 10) % 10; // ABC % 10 = C
            int secondDigit = (n / 100) % 10; // AB % 10 = B
            int firstDigit = (n / 1000) % 10; // A % 10 = A
            if ((firstDigit + secondDigit) == (thirdDigit + fourthDigit))
                System.out.println(n + " is a lucky number");
            else
                System.out.println(n + " is not a lucky number");
        }
    }
}

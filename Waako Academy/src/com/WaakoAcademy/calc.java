package com.WaakoAcademy;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        System.out.print("Enter you calculation: ");

        Scanner s = new Scanner(System.in);
        double d1 = s.nextInt();
        char c1 = s.next().charAt(0);
        double d2 = s.nextDouble();
        if (c1 == '+')
            System.out.println((int)(d1 + d2));
        else if (c1 == '-')
            System.out.println((int)(d1 - d2));
        else if (c1 == '*')
            System.out.println((int)(d1 * d2));
        else if (c1 == '/')
            System.out.println(d1 / d2);
        else
            System.out.println("Invalid operator");
    }
}

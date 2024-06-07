package com.WaakoAcademy;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        System.out.print("Enter the integer: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is an even number");
        else
            System.out.println(n + " is an odd number");

//ANOTHER WAY
        /*
        int n = s.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is an even number");
        if ( !(n % 2 == 0) )
            System.out.println(n + " is an odd number");
        */
    }
}

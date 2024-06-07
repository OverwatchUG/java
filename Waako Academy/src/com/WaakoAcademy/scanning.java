package com.WaakoAcademy;

import java.util.Scanner;

public class scanning {
    public static void main(String[] args) {
        Scanner nameAge = new Scanner(System.in);
        System.out.print("Enter your name an age: ");
        System.out.println(nameAge.next() + "! You are "+ nameAge.nextInt() + " years old");
    }
}

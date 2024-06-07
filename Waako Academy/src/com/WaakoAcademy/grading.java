package com.WaakoAcademy;

import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        System.out.print("Enter marks: ");
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        switch (n) {
            case 80:
                System.out.println(n + " = Grade A");
                break;
            case 75:
                System.out.println(n + " = Grade B+");
                break;
            case 70:
                System.out.println(n + " = Grade B");
                break;
            case 65:
                System.out.println(n + " = Grade C+");
                break;
            case 60:
                System.out.println(n + " = Grade C");
                break;
            case 55:
                System.out.println(n + " = Grade D");
                break;
            default:
                System.out.println(n + " = Grade F9");
        }
    }
}

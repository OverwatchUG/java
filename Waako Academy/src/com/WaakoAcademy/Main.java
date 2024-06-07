package com.WaakoAcademy;

public class Main {
//    public static void main(String[] args) {
//        final String COMPANY_NAME = "Waako Academy";
//        System.out.println(COMPANY_NAME);
//    }
public static void main(String[] args) {
    byte b1 = 5; // -128, 127
    short s1 = 20; //-32768, 32767
    int i1 = 100;
    long l1 = 999l;

    System.out.println(b1 - i1);
    System.out.println(s1 - b1);
    System.out.println(i1 - l1);

    l1 = i1;
    System.out.println(i1);
    System.out.println(l1);
}
}
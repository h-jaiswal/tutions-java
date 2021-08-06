package com.company.Lecture1;

public class MethodsVeryBasic {
    public static void sum(int num1, int num2) {
        int result = num1 = num2;

        System.out.printf("Add %d + %d = %d", num1, num2, result);
    }


    public static int add(int num1, int num2) {
        return  num1 + num2;

//        OR this way --->>>>>

//        int result = num1 + num3;
//        return result;
    }

    public static boolean isEqual(int val1, int val2) {
        if (val1 == val2) {
            return true;
        }

        return false;


//        OR this way --->>>>>

//        boolean result = false;
//
//        if (val1 == val2) {
//            result = true;
//        }
//        return result;

    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

//        BELOW IS NOT ALLOWED  (ERROR)
//        int c = d = 20;

//        BELOW IS ALLOWED

        int c = 10, d = 10;

        int e = 50, f = 60;

//        calling the sum method

        sum(a, b);

        System.out.println();
//        calling the add method

        int result = add(a, b);
        System.out.printf("Add %d + %d = %d", a, b, result);

        System.out.println();
//        calling the isEqual method

        if (isEqual(c, d)) {
            System.out.printf("Both have equal values");
        }


    }
}

package com.company.Lecture2;

// NOTE the import
import java.util.Arrays;
import java.util.Scanner;

public class InputUsingScanner {

//    NOTE - use only one scanner object
//    Always close it at the end

    public static Scanner scanner = new Scanner(System.in);  // NOTE the import  // class variable

    public static void solve1() {

        int var1 = scanner.nextInt();    // similarly, nextByte() and nextShort() and nextLong()
        float var2 = scanner.nextFloat();
        double var3 = scanner.nextDouble();

        String var4 = scanner.next();
        String var5 = scanner.nextLine();

        char var6 = scanner.next().charAt(0);
        char var7 = scanner.nextLine().charAt(0);

        boolean var8 = scanner.nextBoolean();

    }

    public static void solve2() {

//        inputting a String immediately after inputting a number or other type

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();  // or scanner.next() whichever needed

        System.out.println(num);

        System.out.println(str);
        System.out.println("END");

    }

    public static void solve3() {

//        input a string and store it as StringBuilder object

        StringBuilder str = new StringBuilder( scanner.nextLine() );

//        String temp = scanner.nextLine();
//        StringBuilder str = new StringBuilder( temp );

        System.out.println( str );


//        input an int array

//        Values are separated by single space
        int[] arr = Arrays.stream( scanner.nextLine().split(" ") ).mapToInt(Integer::parseInt).toArray();
        System.out.println( Arrays.toString(arr) );


//        values are separated by comma+space
        arr = Arrays.stream( scanner.nextLine().split(", ") ).mapToInt(Integer::parseInt).toArray();
        System.out.println( Arrays.toString(arr) );


//        values are separated by a comma only
        arr = Arrays.stream( scanner.nextLine().split(",") ).mapToInt(Integer::parseInt).toArray();
        System.out.println( Arrays.toString(arr) );




//        input a double array

        double[] heights = Arrays.stream( scanner.nextLine().split( " " ) ).mapToDouble(Double::parseDouble).toArray();
        System.out.println( Arrays.toString(heights) );

    }
    public static void main(String[] args) {
//
//
//        int var1 = scanner.nextInt();    // similarly, nextByte() and nextShort() and nextLong()
//        float var2 = scanner.nextFloat();
//        double var3 = scanner.nextDouble();
//
//        String var4 = scanner.next();
//        String var5 = scanner.nextLine();
//
//        char var6 = scanner.next().charAt(0);
//        char var7 = scanner.nextLine().charAt(0);
//
//        boolean var8 = scanner.nextBoolean();
//
//        solve1();
//
//        solve2();

        solve3();

//        closing the scanner in the last
        scanner.close();
    }
}

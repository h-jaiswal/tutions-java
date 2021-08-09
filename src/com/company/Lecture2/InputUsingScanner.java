package com.company.Lecture2;

// NOTE the import
import java.util.Arrays;
import java.util.Scanner;

public class InputUsingScanner {

//    NOTE - use only one scanner object
//    Always close it at the end

    public static Scanner scanner = new Scanner(System.in);  // NOTE the import

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

//        inputting a String after inputting a number or other type

        int num = scanner.nextInt();

        scanner.nextLine();

        String str = scanner.nextLine();  // or scanner.next() whichever needed
    }

    public static void solve3() {

//        for Later

//
//        StringBuilder str = new StringBuilder( scanner.nextLine() );


//
        int[] arr = Arrays.stream( scanner.nextLine().split(" ") ).mapToInt(Integer::parseInt).toArray();

        System.out.println(Arrays.toString(arr));


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

package com.company.Lecture1;

// Needed to use Locale.US and LocaleITALY
import java.util.Date;
import java.util.Locale;

// import java.util.*;

public class OutputFormatting2 {
    public static void solve1() {

        /*
        *  d - works with byte short int long and BigInteger
        *
        * */
        int a = 10000000;
        System.out.printf("%d %n", a);

        int b = 10_000_000;    // NOTE - Underscore is ignored
        System.out.printf("%d %n", b);


//        flag :    , (comma)

        System.out.printf("%,d", a);
        System.out.printf("%n");

        System.out.printf(Locale.US,"%,d", a);
        System.out.printf("%n");

        System.out.printf(Locale.ITALY,"%,d", a);
        System.out.printf("%n");


        a = 10;
        b = 20;
        int c = a + b;

        System.out.printf("%d + %d = %d%n", a, b, c);


//        width

        System.out.printf("%15s %n", "Kapoor");

        System.out.printf("%15d %n", a);

        System.out.printf("%,15d %n", 100000000 );
//        System.out.printf("    .%n");

        System.out.printf("'%-15d' %n", a);

        System.out.printf("'%,-15d' %n", 100000000 );

//        order of flags don't matter
        System.out.printf("'%-,15d' %n", 100000000 );


//        precision don't work with %d

    }
    public static void solve2() {
         /*
         *
         * conversion-character  f  works with float and double
         *
         *  %n is for Line Separator aka New Line
         *
         * */

        float a = 5.192f;
        System.out.printf("%f%n", a);   // by default, precision is 6 IF not set

        double c = 5.192d;
        System.out.printf("%f%n", c);  // by default, precision is 6 IF not set

        float aa = 5.1234567f;
        System.out.printf("%f %n", aa);

        double b = 5.1924757457;
        System.out.printf("%f%n", b);  // by default, precision is 6 IF not set



//        width (also called padding)
//        flag, - flag can be used to right justify
//        precision can be used to limit the number of digits after decimal point

        System.out.printf("'%6f'", a);
        System.out.printf("%n");

        System.out.printf("'%6f'", a);
        System.out.printf("%n");

        System.out.printf("'%10f'", a);
        System.out.printf("%n");

        System.out.printf("'%10f'", a);
        System.out.printf("%n");


        System.out.printf("'%-6.3f'", a);
        System.out.printf("%n");

        System.out.printf("'%-10.3f'", a);
        System.out.printf("%n");


//        notice the rounding off happening when we set precision value for floating point types

        double num = 5.1473;

        System.out.printf("%4.2f%n", num);

        System.out.printf("%5.2f%n", num);

        System.out.printf("%.3f%n", num);

//        scientific notation ( NOTE we use e as conversion-character here)

        System.out.printf("%e %n", num);
        System.out.printf("%.2e %n", num);
        System.out.printf("%.3e %n", num);

    }

    public static void solve3() {
//        conversion-character b is used with boolean types
//        %B for uppercase formatting.

        System.out.printf("%b%n", null);
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 5.3);
        System.out.printf("%b%n", "random text");

    }

    public static void solve4() {
//        conversion-character c is used with characters

        char ch = 'f';

        System.out.printf("%c %n", ch);
        System.out.printf("%C %n", ch);

    }

    public static void solve5() {

//        t is the conversion character used for formatting objects of Date class


//        Time Formatting

        /*
        *
        *
        * Suffix character comes after the conversion-character
        *
        * H, M, S characters are responsible for extracting the hours, minutes and seconds from the input Date.
        * L, N represent the time in milliseconds and nanoseconds accordingly.
        * p adds a.m./p.m. formatting.
        * z prints out the time-zone offset.
        *
        **/

        Date date = new Date();

        System.out.println(System.currentTimeMillis()); // NOTE

        System.out.printf("%tT %n", date);



        System.out.printf("%s - %tH %tM %tS %n", "Time now - ", date, date, date);



//        repetition of date as argument above can be annoying so we use ->>

//        <number>$ is an argument placeholder

        System.out.printf("%1$tH %1$tM %1$tS %n", date);

        System.out.printf("%s - %2$tH %2$tM %2$tS %2$tp %2$tz %n", "Time now - ", date);




//        DATE formatting
    /*

        • A prints out the full day of the week.
        • d formats a two-digit day of the month.
        • B is for the full month name.
        • m formats a two-digit month.
        • Y outputs a year in four digits.
        • y outputs the last two digits of the year.

    */
        System.out.printf("%1$tA, %1$tB %1$tY %n", date);

        System.out.printf("%1$td.%1$tm.%1$ty %n", date);

    }

    public static void main(String[] args) {
        solve1();
        System.out.println();
        solve2();
        System.out.println();
//        solve3();
//        System.out.println();
//        solve4();
//        System.out.println();
//        solve5();
    }
}

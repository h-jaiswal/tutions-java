package com.company.Lecture3;


import java.util.Arrays;
import java.util.Locale;

public class UsingStringClass {
    public static void solve1() {
        String str = "My name is mimi momo";

        int size = str.length();
        System.out.println(size);



        System.out.println(str.charAt(0));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(str.length() - 1));



        str.indexOf("m");
        str.indexOf("mi");
        str.indexOf("mi", 14);
        str.indexOf( "mi", str.indexOf("mi") ); // second occurrence


        str.lastIndexOf("mi");
        str.lastIndexOf("mi", 13);




        String s1 = "Harshit";
        String s2 = "Jaiswal";
        String s3 = s1.concat(s2);
        System.out.println( s1 );
        System.out.println( s2 );
        System.out.println( s3 );


    }


    public static void solve2() {
        String str = "My name is mimi momo";

        String s1 = str.substring( 5 );
        System.out.println(s1);

        str.substring(6, 10);

        str.substring(6, str.length() );


        str.substring( str.indexOf("mimi") );   // from first occurrence of "mimi" till end

//        etc.

    }
    public static void solve3() {
        String s1 = "Harshit jaiswal";

        System.out.println( s1.toLowerCase() );

        System.out.println( s1.toUpperCase() );

        System.out.println( s1 );

        s1 = s1.trim();

        System.out.println(s1);
    }

    public static void solve4() {
        String s1 = "Harshit";
        String s2 = "Harshit";

        String s3 = new String("Harshit");

        String s4 = new String("Harshit");

        System.out.println( s1 == s2 );
        System.out.println( s3 == s4 );

        System.out.println( s1 == s3 );

        System.out.println( s1.equals(s2) );
        System.out.println( s3.equals(s4) );

        System.out.println( s1.equals(s3) );


        String str1 = "Aaron";
        String str2 = "Aaesha";

        System.out.println( str1.compareTo(str2) );
        System.out.println( str2.compareTo(str1) );

        str1 = "High";
        str2 = "high";

        System.out.println( str1.equalsIgnoreCase(str2) );
        System.out.println( str2.equalsIgnoreCase(str1) );

        System.out.println( str1.compareToIgnoreCase(str2) );
        System.out.println( str2.compareToIgnoreCase(str1) );
    }
    public static void main(String[] args) {

//        Creating strings using String class aka String objects

//        String, StringBuilder and StringBuffer class are present in the default java.lang package
//        StringTokenizer and StringJoiner are present in java.util package

        String s1 = "Harshit";
        String s2 = "Harshit";

        String s3 = new String("Harshit");

        String s4 = new String("Harshit");

        char[] chArr = {'R', 'a', 'j'};
        String s5 = new String( chArr );

        StringBuilder strBuilderObject = new StringBuilder("Harshit");
        String s6 = new String( strBuilderObject );

        StringBuffer stringBufferObject = new StringBuffer("Harshit");
        String s7 = new String(stringBufferObject);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);

//        This method converts a String object to a character array
        char[] chArr2 = s5.toCharArray();
        System.out.println( "\n" + Arrays.toString( chArr2 ) + "\n");

        solve1();

        solve2();

        solve3();

        solve4();
    }
}

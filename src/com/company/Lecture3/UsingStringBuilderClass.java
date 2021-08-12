package com.company.Lecture3;

import java.util.Arrays;

public class UsingStringBuilderClass {

    public static void solve1() {

        /*
        * IMP
        int capacity(): This method returns the current capacity.

        int length(): This method returns the length (character count).

        String toString(): This method returns a string representing the data in this sequence.

        void setLength(int newLength): This method sets the length of the character sequence.
        *
        * NOT SO IMP
        void trimToSize(): This method attempts to reduce storage used for the character sequence.

        void ensureCapacity(int minimumCapacity): This method ensures that the capacity is at least equal to the specified minimum.
        *
        * */

        StringBuilder s1 = new StringBuilder("Harshit Jaiswal");

        StringBuilder s2 = new StringBuilder(500);
        s2.append("Harshit Jaiswal");

        System.out.println(s2.capacity());


        s1.trimToSize();
        /* NOTE -
        *  trimToSize()
        *  Attempts to reduce storage used for the character sequence. If the buffer is larger than necessary to hold its current sequence of characters, then it may be resized to become more space efficient. Calling this method may, but is not required to, affect the value returned by a subsequent call to the capacity() method
        */
        System.out.println(s2.capacity());


        s2.setLength(10);
        System.out.println(s2);

    }
    public static void solve2() {
/*
        char charAt(int index): This method returns the char value in this sequence at the specified index.

        void setCharAt(int index, char ch): In this method, the character at the specified index is set to ch.

        StringBuilder deleteCharAt(int index): This method removes the char at the specified position in this sequence.
*/

        StringBuilder s1 = new StringBuilder("Harshit Jaiswal");

        System.out.println(s1.charAt(6));

        s1.deleteCharAt(6);  // inplace + returned
        System.out.println(s1);

        s1.setCharAt(6, 'T');
        System.out.println(s1);


//        StringBuilder insert(): This method inserts the string representation of the char argument into this sequence.
        s1.insert(7, " ");  // inplace + returned
        System.out.println(s1);


/*
        int indexOf(): This method returns the index within this string of the first occurrence of the specified substring.

        int lastIndexOf(): This method returns the index within this string of the last occurrence of the specified substring.
*/

        System.out.println(s1.indexOf("a"));
        System.out.println("mimi momo".indexOf("mi"));
        System.out.println("mimi momo".lastIndexOf("mi"));
    }
    public static void solve3() {

//        StringBuilder append(X x): This method appends the string representation of the X type argument to the sequence.
//        We can append object of any type to a StringBuilder object using append method

        StringBuilder str = new StringBuilder("Harshit");
        System.out.println(str);

        str.append(" Jaiswal");
        System.out.println(str);

/*
        String substring(): This method returns a new String that contains a subsequence of characters currently contained in this character sequence.

        StringBuilder delete(int start, int end): This method removes the characters in a substring of this sequence.
*/

        String s = str.substring(8);   // NOTE: return type is String
        System.out.println(s);

        s = str.substring(4, 10);
        System.out.println(s);

        System.out.println(str);
        str.delete(4, 10);   // in-place and returned
        System.out.println(str);

//        void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin): This method characters are copied from this sequence into the destination character array dst.

        str = new StringBuilder("Harshit Jaiswal");
        char[] chArr = new char[50]; // enough size or more
        str.getChars(4, 10, chArr, 0);
        System.out.println(Arrays.toString(chArr));



/*
        StringBuilder replace(int start, int end, String str): This method replaces the characters in a substring of this sequence with characters in the specified String.

        StringBuilder reverse(): This method causes this character sequence to be replaced by the reverse of the sequence.
*/


    }


    public static void main(String[] args) {

//    StringBuilder in mutable, single-thread use only, and faster in performance

//    Creating objects of StringBuilder class

        StringBuilder s1 = new StringBuilder();
        System.out.println( s1.capacity() );
        System.out.println( s1.length() );


        int capacity = 50;
        StringBuilder s2 = new StringBuilder(capacity);
        System.out.println( s2.capacity() );
        System.out.println( s2.length() );


        String str = "Harshit";
        StringBuilder s3 = new StringBuilder(str);
        System.out.println(s3);
        System.out.println( s3.capacity() );
        System.out.println( s3.length() );


//        Important methods
        System.out.println();
        solve1();

        System.out.println();
        solve2();

        System.out.println();
        solve3();


        CharSequence str2 = "Harshit";
        StringBuilder s4 = new StringBuilder(str2);
    }
}

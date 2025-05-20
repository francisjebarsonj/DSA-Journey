package com.dsa.code.Striver.Basics;

import java.util.Scanner;

public class StringsAndArray {
    public static void main(String[] arg) {

        // It is a combination of characters

        // String Types are immutable , not eligible for thread safe

        String str1 = "I am String!"; // String literals
        String str2 = "I am String!"; // String literals

        //Common methods include charAt(), substring(), concat(),
        // indexOf(), equals(), equalsIgnoreCase(), length(), toLowerCase(),
        // toUpperCase(), trim(), split(), startsWith(), endsWith(),
        // contains(), replace(), isEmpty()

       
        System.out.println("str1 == str2 "+(str1==str2)+" str1.equals(str2) "+str1.equals(str2));

        String str3 = new String("I am String!"); // Initialized using "new" keyword


        System.out.println("str1 == str3 "+(str1==str3)+" str1.equals(str3) "+str1.equals(str3));

        // String Builders are mutable , has methods to modify the sequence of characters and not thread safe.
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("I am String!");

        System.out.println("Reversed String: "+stringBuilder.reverse());

        // String StringBuffer are mutable , has methods to modify the sequence of characters and its thread safe.

        //Thread-safe, meaning multiple threads can access and modify a StringBuffer instance without data corruption.

        //Operations like append(), insert(), delete(),
        // and replace() modify the existing StringBuffer object.

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("I am String!");

        System.out.println("Reversed String: "+stringBuffer.reverse());

        // Array is a collection elements with same datatypes
        // stored in sequential order in memory boxes

        // i.e
        // index [0] holds First element
        // index [1] holds Second
        // .. and so on


        int[] numbers = new int[5]; // it can store 5 integer type values
        char[] character = new char[5];
        String[] strings = new String[5];
        double[] doubleValue =new double[5];
        float[] floatValue = new float[5];

        System.out.println("Length of the number array: "+numbers.length);









    }
}

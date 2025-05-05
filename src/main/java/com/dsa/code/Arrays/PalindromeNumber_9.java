package com.dsa.code.Arrays;

public class PalindromeNumber_9 {

    // Convert number to text.
    // Reverse the text and compare with the original text.
    public static boolean solution1(int x){
        StringBuilder sb=new StringBuilder(String.valueOf(x));
        return sb.reverse().toString().equals(String.valueOf(x));
    }

    // Check using math.
    public static boolean solution2(int x){
        int reversedNum = 0;
        int originalNum = x;

        while(x > 0){
            // Get the last number.
            int lastDigit = x % 10;
            // Build the reversed number.
            reversedNum = reversedNum * 10 + lastDigit ;
            // Move to the next number.
            x = x / 10;
        }

        return (reversedNum == originalNum);

    }

    public static void main(String[] args) {
        // Program starts here.

        System.out.println(solution1(121));
        System.out.println(solution2(121));


    }

}

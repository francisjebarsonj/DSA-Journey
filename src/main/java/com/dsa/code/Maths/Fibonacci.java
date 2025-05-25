package com.dsa.code.Maths;

import java.util.Scanner;

public class Fibonacci {

    /*
     * What is Fibonacci
     *
     * It is a series of number formed by current number and the previous number.
     *
     * Example
     *
     * Series looks like this
     *
     * 0 1 1 2 3 5 8 13
     *
     * If you see here, summing up 0th and 1st position numbers = 1 (which is the number at 3rd position)
     *
     *
     * */

    public static long[] fibonacciCache;

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Calling Brute Force implementation
        // System.out.println(fibo(n));


        //Now creating cache array for memoization
        fibonacciCache = new long[n + 1];

        // Calling after memoization implementation
        // System.out.println(fibonacci(n));

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    // Below code is not efficient when we give input like 50, takes more time due to call stack.
    /*
     * Why?
     * f(4) = f(3) + f(2)
     * f(3) = f(2) + f(1)
     * ..it goes on
     *
     *
     *  Time Complexity: Worst/Average/Best: O(2^n)
     *
     *  Space Complexity: O(n) (due to call stack)
     *
     *  Very inefficient for large n
     *
     * So function calling chained(call stack) to build the end result , in the above steps , we calculating  f(2) twice , which has to be reduced
     * by memoization
     * */

    private static long fibo(int n) {
        //base case
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    //For memoization created long array to store already calculated values

    /*
     * Time Complexity: Best/Worst/Average: O(n)
     *
     * Space Complexity: O(n) (memo + call stack)
     */

    private static long fibonacci(int n) {
        //base case
        if (n <= 1) {
            return n;
        }

        //If we cache[n] contains any value on nth position we are just returning stored value.
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;

    }


}

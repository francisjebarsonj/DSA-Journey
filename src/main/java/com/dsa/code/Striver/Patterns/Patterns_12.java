package com.dsa.code.Striver.Patterns;

public class Patterns_12 {
    public static void main(String[] args) {

        /*

        1                 1
        1 2             2 1
        1 2 3         3 2 1
        1 2 3 4     4 3 2 1
        1 2 3 4 5 5 4 3 2 1


        * */

        int N = 5;
        int spaces = 8;
        for (int i = 1; i<=N; i++) {
            for (int j = 1; j <= i ; j++) {
                   System.out.print(j+" ");
            }
            for (int j = 1; j <= spaces ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j+" ");
            }
            spaces -= 2;
            System.out.println();
        }
    }
}

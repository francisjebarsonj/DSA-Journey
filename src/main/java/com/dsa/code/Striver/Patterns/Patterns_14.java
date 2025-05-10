package com.dsa.code.Striver.Patterns;

import java.awt.geom.QuadCurve2D;
import java.util.Scanner;

public class Patterns_14 {
    public static void main(String[] args) {

        /*
         * A
         * A B
         * A B C
         * A B C D
         * A B C D E
         *
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value here :");
        int N = sc.nextInt();
        char[] c = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }
}

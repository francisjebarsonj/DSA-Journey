package com.dsa.code.Striver.Patterns;

import java.util.Scanner;

/*
* 4 4 4 4 4 4 4
* 4 3 3 3 3 3 4
* 4 3 2 2 2 3 4
* 4 3 2 1 2 3 4
* 4 3 2 2 2 3 4
* 4 3 3 3 3 3 4
* 4 4 4 4 4 4 4
*
* */
public class Patterns_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 7 ;
        int middle = size / 2 ;
        for (int i = 0; i < size; i++) {
             int rowDifferenceFromMiddle = Math.abs(i - (middle));
            for (int j = 0; j < size; j++) {
                int columnDifferenceFromMiddle  = Math.abs(j - (middle));
                int value = Math.max(rowDifferenceFromMiddle, columnDifferenceFromMiddle) + 1;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

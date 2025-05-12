package com.dsa.code.Striver.Patterns;

public class Patterns_19 {
    public static void main(String[] args) {

        for (int j = 0; j <= 5; j++) {
            for (int k = 5; k >= j; k--) {
                System.out.print("*");
            }
            for (int s = 0; s < j; s++) {
                System.out.print(" ");
            }
            for (int s = j; s > 0; s--) {
                System.out.print(" ");
            }
            for (int k = 5; k >= j; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 0; j <= 5; j++) {

            for (int k = 0; k <= j; k++) {
                System.out.print("*");
            }
            for (int s = 5; s > j; s--) {
                System.out.print(" ");
            }
            for (int s = 5; s>j; s--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

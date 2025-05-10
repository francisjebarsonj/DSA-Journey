package com.dsa.code.Striver.Patterns;

public class Patterns_8 {
    public static void main(String[] args) {

        /*
          *********
           ******
            ***
             *
        * */

        for (int i = 3; i >=1; i--) {

            for (int j = 6 - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = i*3; j >=1; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int x = 0; x <=5; x++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();

    }
}

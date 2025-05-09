package com.dsa.code.Striver.Patterns;

public class Patterns_13 {
    public static void main(String[] args) {

        int num=0;
        for (int i = 1; i<=5; i++) {
            for (int j = 1; j <= i ; j++) {
                num =  num + 1;
                System.out.print( (num)+ " ");
            }
            System.out.println();
        }

    }
}

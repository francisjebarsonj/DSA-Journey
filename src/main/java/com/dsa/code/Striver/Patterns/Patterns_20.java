package com.dsa.code.Striver.Patterns;

public class Patterns_20 {
    public static void main(String[] args) {


        for(int i=0;i<5;i++){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j<4;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

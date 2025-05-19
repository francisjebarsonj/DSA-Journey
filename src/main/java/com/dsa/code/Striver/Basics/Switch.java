package com.dsa.code.Striver.Basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();
        switch (number) {
            case 1: {
                System.out.println("one");
                break;
            }
            case 2: {
                System.out.println("two");
                break;
            }
            default: {
                System.out.println("I don't know the number that you entered :( ");
                break;
            }
        }

        System.out.println("Enter any character:");
        String ch = sc.next();
        switch (ch) {
            case "A": {
                System.out.println("You typed A");
                break;
            }
            case "B": {
                System.out.println("You typed B");
                break;
            }
            default: {
                System.out.println("I don't know the character that you entered :( ");
                break;
            }
        }
    }
}

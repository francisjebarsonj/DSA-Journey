package com.dsa.code.Striver.Basics;

import java.util.Scanner;

public class InputsAndOutputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        // To get Boolean Value
        System.out.println("Enter Boolean Value:");
        boolean flag = sc.nextBoolean();
        System.out.println("Enter Long Value:");
        // To get Long value
        long longVal = sc.nextLong();
        System.out.println("Enter Any Float Value:");

        // To get decimal float values
        float floatVal = sc.nextFloat();

        System.out.println("Flag:"+flag+" Long Value:"+longVal+" Float Value:"+floatVal);

    }
}

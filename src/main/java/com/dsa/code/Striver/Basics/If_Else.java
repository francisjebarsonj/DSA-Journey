package com.dsa.code.Striver.Basics;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // If condition satisfied , control will not goes to next condition
        if(number>10){
            System.out.println("Number is greater than 10");
        }else if(number == 10){
            System.out.println("Number is equals to 10");
        }
        else{
            System.out.println("Number is either equals nor greater than 10");
        }
    }
}

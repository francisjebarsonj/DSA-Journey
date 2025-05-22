package com.dsa.code.Striver.Basics;

public class WhileLoop {
    public static void main(String[] arg){
        int i = 0;
        // it validates the condition first, if satisfied , then goes to code block
        // else control comes out of the while loop
        while(i<10){
            if(i%5==0){
                System.out.println(i+" is divisible by 5");
            }
            i++;
        }
        i = 0;
        // it validates the condition after executing code block
        // if condition becames false, control comes out of the while loop
        do{
            if(i%2==0){
                System.out.println(i+" is divisible by 2");
            }
            i++;
        }while (i< 10);
    }
}

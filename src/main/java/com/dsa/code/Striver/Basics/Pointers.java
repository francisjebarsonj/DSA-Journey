package com.dsa.code.Striver.Basics;

public class Pointers {
    public static void main(String[] arg){
        
        int numberOne = 12;
        int numberTwo;
        numberTwo = numberOne;
        System.out.println("Number One:"+numberOne);
        System.out.println("Number Two:"+numberTwo);

        System.out.println("-- Changing value of One --");
        // Reassigning variable "numberOne" with some other value

        numberOne = 13;

        System.out.println("Number One:"+numberOne);
        System.out.println("Number Two:"+numberTwo);



    }
}

package com.dsa.code.Striver.Basics;

import java.util.HashMap;

public class Pointers {
    public static void main(String[] arg){

        //Without Pointers
        int numberOne = 12;
        int numberTwo;
        numberTwo = numberOne;
        System.out.println("Number One:"+numberOne);
        System.out.println("Number Two:"+numberTwo);

        System.out.println("--After Changing value of One --");
        // Reassigning variable "numberOne" with some other value

        numberOne = 13;

        System.out.println("Number One:"+numberOne);
        System.out.println("Number Two:"+numberTwo);


        //With Pointers

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("value",10);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2 = map1;

        System.out.println("Map one :"+map1+" Map two:"+map2);

        System.out.println("--After Changing value of Map one --");

        map1.put("value",11);

        System.out.println("Map one :"+map1+" Map two:"+map2);

    }
}

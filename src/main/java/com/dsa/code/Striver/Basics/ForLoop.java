package com.dsa.code.Striver.Basics;

public class ForLoop {

    public static void main(String[] arg) {

        /*
         *  for ( initialization ; condition ; increment / decrement )
         *
         * Initialization: You declare and initialize a variable that serves as a counter. This step only happens once at the beginning.
         *
         * Condition: You specify a condition that determines when the loop should stop executing.
         * */


        for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {

            System.out.println(i + " -- " + j);

        }

    }
}

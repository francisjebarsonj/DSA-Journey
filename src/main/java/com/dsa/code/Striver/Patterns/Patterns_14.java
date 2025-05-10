package com.dsa.code.Striver.Patterns;

public class Patterns_14 {
    public static void main(String[] args) {

         /*
         * A
         * A B
         * A B C
         * A B C D
         * A B C D E
         *
         * */
        char[] c=new char[]{'A','B','C','D','E','F'};

         for(int i=0; i<c.length; i++){
             for(int j=0; j<=i; j++){
                 System.out.print(c[j]);
             }
             System.out.println();
         }
    }
}

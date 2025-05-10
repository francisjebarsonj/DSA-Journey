package com.dsa.code.Striver.Patterns;

public class Patterns_15 {
    public static void main(String[] args) {

         /*
         * A B C D E
         * A B C D
         * A B C
         * A B
         * A
         * */
        char[] c = new char[]{'A','B','C' ,'D', 'E'};
        for(int i=4;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }

    }
}

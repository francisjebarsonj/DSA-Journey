package com.dsa.code.Striver.Patterns;

public class Patterns_16 {
    public static void main(String[] args) {

         /*
         * A
         * B B
         * C C C
         * D D D D
         * E E E E E
         * */
        char[] c = new char[]{'A','B','C' ,'D', 'E'};

        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c[i]+" ");
            }
            System.out.println();
        }

    }
}

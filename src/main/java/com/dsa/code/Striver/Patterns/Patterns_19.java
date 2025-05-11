package com.dsa.code.Striver.Patterns;

public class Patterns_19 {
    public static void main(String[] args) {

         /*
 
         * */
        char[] c = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int index = 4;
        for(int i=0;i<5;i++){
            for(int j=i;j>=0;j--){
                // Trick is to find reversal order so we are subtracting with 'j'
                System.out.print(c[index-j]);
            }
            System.out.println();
        }
    }
}

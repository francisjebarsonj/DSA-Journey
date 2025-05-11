package com.dsa.code.Striver.Patterns;

public class Patterns_17 {
    public static void main(String[] args) {

         /*
         *    A
         *   ABA
         *  ABCBA
         * ABCDCBA
         * */
        char[] c = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        // spaces
        int spaces = 5 ;
        int numOfTime = 2 ;
        for(int i=5;i>=1;i--){
            for(int j=spaces;j>=1;j--){
                System.out.print(" ");
            }
            if(numOfTime==1){
                System.out.print(c[0]);
            }else{
                // Forward Traversal
                for(int j= 0 ;j<numOfTime-2;j++){
                    System.out.print(c[j]);
                }
                // Reverse Traversal
                int reverse = numOfTime-2;
                for(int j=reverse ;j>=0;j--){
                    System.out.print(c[j]);
                }

            }


            for(int j=spaces;j>=1;j--){
                System.out.print(" ");
            }
            spaces-= 1;
            numOfTime+= 1;
            System.out.println();
        }
    }
}

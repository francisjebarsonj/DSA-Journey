package com.dsa.code.DynamicProgramming;

public class ClimbingStairs_70
{

    public int climbStairs(int n) {
        // If few steps (1 or 2), ways = steps.
        if (n <= 2) {
            return n;
        }
        // Ways to reach step 1.
        int first = 1;
        // Ways to reach step 2.
        int second = 2;
        // Go from step 3 to the top.
        for (int i = 3; i <= n; i++) {
            // Ways to reach current step = ways to reach last step + ways to reach step before last.
            int third = first + second;
            // Now, last step becomes step before last.
            first = second;
            // And current step becomes the new last step.
            second = third;
        }
        // Final answer is ways to reach the top.
        return second;
    }

    public static void main(String args[]){
        ClimbingStairs_70 obj = new ClimbingStairs_70();
        System.out.println(obj.climbStairs(4));
    }
}

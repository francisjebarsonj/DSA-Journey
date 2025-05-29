package com.dsa.code.Arrays;

import java.util.HashMap;

class LargestElement {
    public static int largestElement(int[] nums) {
        int largestElement = 0;
        for(int i:nums){
            if(largestElement<i){
                largestElement = i;
            }
        }
        return largestElement;
    }

    public static void main(String[] args) {
        System.out.println(largestElement(new int[]{14, 2, 3, 3}));

    }
}
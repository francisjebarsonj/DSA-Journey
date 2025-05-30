package com.dsa.code.Arrays;

class SecondLargestElement {
    public static int secondLargestElement(int[] nums) {
        int first = 0;
        int second = 0;
        for(int i:nums){
            if(first<i){
                first = i;
            }
            else if (second < first && second < i){
                second = i;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondLargestElement(new int[]{3, 4, 10, 1}));

    }
}
package com.dsa.code.Arrays;

//Time Complexity: O(n), as we are traversing the array only once.
//Auxiliary space: O(1)
class SecondLargestElement {
    public static int secondLargestElement(int[] nums) {
        int first = 0;
        int second = 0;
        for(int i=0 ; i < nums.length; i++){
            if(first<nums[i]){
                second = first;
                first = nums[i];
            }
            else if (second < nums[i] && first > nums[i] ){
                second = nums[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondLargestElement(new int[]{10, 12, 10, 10}));

    }
}
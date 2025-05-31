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

    //Implementation - 2
    // Worst case O(2n) = O(n) , because we used 2 loops here.
    // Space Complexity = O(1) not extra spaces required.
    public static int secondLargestElm(int[] nums){

        int largest = 0;
        int nextLargest = 0;

        for(int i =0 ;i < nums.length ; i++){
            if(largest<nums[i]){
                largest = nums[i];
            }
        }

        for(int j =0; j< nums.length; j++){
            if(nextLargest<nums[j] && nums[j]!=largest){
                nextLargest = nums[j];
            }

        }
        return nextLargest;
    }

    public static void main(String[] args) {
      //  System.out.println(secondLargestElement(new int[]{10, 12, 10, 10}));

        System.out.println(secondLargestElm(new int[]{10, 12, 11, 10}));

    }
}
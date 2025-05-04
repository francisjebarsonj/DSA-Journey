package com.dsa.code.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    //O(n)
    public static int[] twoSumOn(int[] nums, int target) {
        //Use Hashmap to store Number and Index
        Map<Integer,Integer> numberMap=new HashMap<>();
        int len=nums.length;
        // Iterate throw array
        for(int i=0;i<len;i++){

            //Find the remainder by subtracting element from target
            int remainder=target-nums[i];

            // Check that Remainder already Present in the Map
            if(numberMap.containsKey(remainder)){
                //If contains return the number's index and current index
                return new int[]{numberMap.get(remainder),i};
            }
            else{
                // if not contains store the current number and its index.
                numberMap.put(nums[i],i);
            }
        }

        // return zero's if no index found
        return new int[]{0,0};
    }

    //O(n²) - Brute Force Solution
    public static int[] twoSum(int[] nums, int target) {
        // iterate through elements , check nums[i]+nums[j]=target ?
        //if yes return the indices
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(ele->
                System.out.print(ele+" "));
        Arrays.stream(twoSumOn(new int[]{2, 7, 11, 15}, 9)).forEach(ele->
                System.out.print(ele+" "));
    }
}

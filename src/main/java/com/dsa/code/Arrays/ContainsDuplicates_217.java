package com.dsa.code.Arrays;

import java.util.HashMap;

class ContainsDuplicates_217 {
    public static boolean containsDuplicate(int[] nums) {
        // Create a HashMap to store each number encountered in the array
        // as a key. The value (Long in this case) is used to track if we've seen the number.
        HashMap<Integer, Long> dupCount = new HashMap<>();

        // Iterate through each element in the input array 'nums'.
        for (int i = 0; i < nums.length; i++) {
            // Check if the current number (nums[i]) is already a key in our 'dupCount' map.
            if (!dupCount.containsKey(nums[i])) {
                // If the number is not yet in the map, it's the first time we're encountering it.
                // Add the number as a key to the map with an initial count of 0.
                // Note: The count itself isn't strictly necessary for detecting duplicates;
                // the presence of the key is what matters.
                dupCount.put(nums[i], 0L);
            } else {
                // If the 'containsKey' check returns true, it means we have already encountered
                // this number during a previous iteration. Therefore, the array contains a duplicate.
                return true;
            }
        }

        // If the loop completes without finding any duplicates (i.e., the 'return true'
        // statement inside the 'else' block was never executed), it means all elements
        // in the array are unique. In this case, we return false.
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 3}));

    }
}
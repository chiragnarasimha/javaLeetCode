package com.chirag.learnJava.easy.twosum;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 */

import java.util.HashMap;


public class TwoSum {
    /*
    This solution is from leetcode
    This method is faster as we are searching from forwards and backwards at the same time
     */
    public int[] twoSum(int[] nums, int target) {

        // This map will store all the previously seen arrays and then store them into the
        HashMap<Integer, Integer> previousValues = new HashMap<>();

        int indexCurrentValue, targetCompliment;

        for (int i = 0; i < nums.length; i++) {
            targetCompliment = target - nums[i];
            indexCurrentValue = i;
            if (previousValues.containsKey(targetCompliment)) {
                return new int[]{previousValues.get(targetCompliment), indexCurrentValue};
            }
            else {
                previousValues.put(nums[i], i);
            }

        }
        throw new IllegalArgumentException("No two sum solution");

    }

    /*
    This solution is from leetcode
    This method is faster as we are searching from forwards and backwards at the same time
     */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();
        for (int i = 0, j = nums.length - 1; i <= j; i++, j--) {
            int anotherNum = target - nums[i];
            if (numIndexMap.containsKey(anotherNum)) {
                return new int[]{numIndexMap.get(anotherNum), i};
            }
            else {
                numIndexMap.put(nums[i], i);
            }


            anotherNum = target - nums[j];
            if (numIndexMap.containsKey(anotherNum)) {
                return new int[]{numIndexMap.get(anotherNum), j};
            }
            else {
                numIndexMap.put(nums[j], j);
            }

        }

        return null;
    }
}

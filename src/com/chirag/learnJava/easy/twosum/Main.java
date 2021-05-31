package com.chirag.learnJava.easy.twosum;

import com.google.common.base.Stopwatch;

public class Main {

    public static void main(String[] args) {
//        // write your code here
//        int[] nums1 = {1, 2, 3};
////        int[] nums2 = {2, 3, 60};
//        int[] nums2 = {4, 5, 6};
//
//        Solution solution = new Solution();
//
//
//        System.out.println(solution.findMedianSortedArrays(nums1, nums2));

//        List<Integer> l1 = Arrays.asList(1, 2, 3);
//        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
//        int test = addTwoNumbers.parseList(l1);
//        System.out.println(test);

        Stopwatch timer = Stopwatch.createUnstarted();
        TwoSum test = new TwoSum();
        int[] result;

        timer.start();
        result = test.twoSum(new int[]{2, 7, 11, 15}, 9);
        printIntListItems(result);


        result = test.twoSum(new int[]{3, 2, 4}, 6);
        printIntListItems(result);
        System.out.println("The first solution took " + timer.stop());

        timer.start();
        result = test.twoSum2(new int[]{2, 7, 11, 15}, 9);
        printIntListItems(result);


        result = test.twoSum2(new int[]{3, 2, 4}, 6);
        printIntListItems(result);

        System.out.println("The second solution took " + timer.stop());
    }

    public static void printIntListItems(int[] listToPrint) {

        System.out.print("The items in the list are: ");
        for (int i : listToPrint) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


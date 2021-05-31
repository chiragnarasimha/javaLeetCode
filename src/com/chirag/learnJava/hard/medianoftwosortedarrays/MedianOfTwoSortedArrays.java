package com.chirag.learnJava.hard.medianoftwosortedarrays;


public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeArrays(nums1, nums2);
        return findMedianOfArray(mergedArray);
    }

    private int[] mergeArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int[] mergedArray = new int[nums1Length + nums2Length];

        int nums1Position = 0, nums2Position = 0, mergedArrayPosition = 0;

        // If we the position is less than the length, then we need to keep comparing the two arrays
        while (nums1Position < nums1Length && nums2Position < nums2Length) {
            // The first if statement will be entered as long as the element in the first array is still smaller than the element in the second array
            if (nums1[nums1Position] < nums2[nums2Position]) {
                mergedArray[mergedArrayPosition] = nums1[nums1Position];
                mergedArrayPosition++;
                nums1Position++;
            }
            else {
                mergedArray[mergedArrayPosition] = nums2[nums2Position];
                mergedArrayPosition++;
                nums2Position++;

            }
        }
        // At the end of the first while loop, we will reach the end of one of the arrays
        while (nums1Position < nums1Length) {
            mergedArray[mergedArrayPosition++] = nums1[nums1Position++];
        }

        while (nums2Position < nums2Length) {
            mergedArray[mergedArrayPosition] = nums2[nums2Position];
            mergedArrayPosition++;
            nums2Position++;
        }

        return mergedArray;
    }

    private double findMedianOfArray(int[] array) {
        double arrayLength = array.length;
        System.out.println(arrayLength);
        double median = 0;
        // Account for array length is odd number
        if (arrayLength % 2 != 0) {
//          array length = 5. 5/2 = 2. median is array[2] which is 3rd element in the array
            median = array[(int) ((arrayLength) / 2)];
        }
        else {
            double temp = arrayLength / 2;
            median = ((double) (array[(int) (temp - 0.5)] + array[(int) (temp + 0.5)])) / 2;
        }

        return median;
    }
}

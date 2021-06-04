package com.chirag.learnJava;

import com.chirag.learnJava.medium.ListNode;

/**
 * <h1>ChiragHelperFunctions</h1>
 * <p>
 * 1. This class includes all the commonly used methods during the dev phase.
 * </p>
 * <p>
 * 2. These methods are mostly just used for debugging/code optimisation phase
 * </p>
 * <br>
 * <h1>Note:</h1>
 * <p>Please do not include these methods to the code that will be submitted to Leet Code</p>
 *
 * @author Chirag Narasimha Murthy
 * @since 31 May 2021
 */
public class ChiragHelperFunctions {
    /**
     * <h1>printList</h1>
     * <p>
     * Will take the first node in a linked list and print all the next nodes
     * </p>
     *
     * @param node The first node of the linked list
     * @author Chirag Narasimha Murthy
     */
    public static void printList(ListNode node) {
        System.out.print("The list contains ");
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    /**
     * <h1>printRunTime</h1>
     * <p>
     * Will take the start time in nano seconds and then output the execution time in milli seconds
     * </p>
     *
     * @param startTime double startTime = System.nanoTime();
     * @author Chirag Narasimha Murthy
     */
    public static void printRunTime(double startTime) {
        System.out.println("Code Execution Time ->> " + ((System.nanoTime() - startTime) * 1e-6) + " ms");
    }
}

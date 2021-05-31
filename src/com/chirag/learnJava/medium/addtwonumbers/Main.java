package com.chirag.learnJava.medium.addtwonumbers;

import com.chirag.learnJava.medium.ListNode;

import static com.chirag.learnJava.ChiragHelperFunctions.printList;
import static com.chirag.learnJava.ChiragHelperFunctions.printRunTime;

public class Main {
    public static void main(String[] args) {

//        Stopwatch timer = Stopwatch.createUnstarted();

        double startTime;


        ListNode l1_4 = new ListNode(5, null);
        ListNode l1_3 = new ListNode(5, l1_4);
        ListNode l1_2 = new ListNode(4, l1_3);
        ListNode l1_1 = new ListNode(2, l1_2);

        ListNode l2_4 = new ListNode(6, null);
        ListNode l2_3 = new ListNode(5, l2_4);
        ListNode l2_2 = new ListNode(6, l2_3);
        ListNode l2_1 = new ListNode(4, l2_2);


        printList(l1_1);
        printList(l2_1);

        AddTwoNumbers add = new AddTwoNumbers();

        startTime = System.nanoTime();
        printList(add.addTwoNumbersChirag(l1_1, l2_1));
        printRunTime(startTime);

        startTime = System.nanoTime();
        printList(add.addTwoNumbersLeetcode(l1_1, l2_1));
        printRunTime(startTime);


    }


}

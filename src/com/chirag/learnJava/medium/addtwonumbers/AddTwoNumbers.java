package com.chirag.learnJava.medium.addtwonumbers;
/*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single
    digit. Add the two numbers and return the sum as a linked list.

    You may assume the two numbers do not contain any leading zero, except the
    number 0 itself.

    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.

    Input: l1 = [0], l2 = [0]
    Output: [0]

    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Output: [8,9,9,9,0,0,0,1]

 */


import com.chirag.learnJava.medium.ListNode;

public class AddTwoNumbers {
    //    public int parseList(List<Integer> list) {
//        String listToString = "";
//        for (int i : list) {
//            listToString += i;
//        }
//        return Integer.parseInt(listToString);
//    }
    public ListNode addTwoNumbersChirag(ListNode l1, ListNode l2) {
        int carry = 0, sum;
        // This node will indicate the start of the node
        ListNode sumListNode = new ListNode();
        ListNode currentSumListNode = sumListNode;

        // Handle the scenario when the lists are equal to each other
        while (l1 != null || l2 != null) {
            int val1 = 0;
            int val2 = 0;

            // To account for the fact that we dont know which list will be bigger.
            // Say l1 is smaller, and then it will cause errors with the l1 = l1.next as
            // l1 is equal to null. null.next does not exist
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;

            }

            // Do the basic maths
            sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            // Store the results in the sumList
            currentSumListNode.val = sum;

            // Only create the new nodes if we need to
            if (l1 != null || l2 != null) {
                currentSumListNode.next = new ListNode();
                currentSumListNode = currentSumListNode.next;
            }
        }

        if (carry != 0) {
            currentSumListNode.next = new ListNode();
            currentSumListNode = currentSumListNode.next;
            currentSumListNode.val = carry;

        }


        return sumListNode;
    }

    //    public ListNode addTwoNumbersLeetcode(ListNode l1, ListNode l2) {
//        int carry = 0, sum = 0, l1Val = 0, l2Val = 0;
//        ListNode sumListNode = new ListNode();
//        ListNode previousSumListNode = sumListNode;
//        while (l1 != null || l2 != null) {
//            // If l1 is not null, then assign l1.val, else assign 0
////            int l1Val = (l1 != null) ? l1.val : 0;
////            int l2Val = (l2 != null) ? l2.val : 0;
//            l1Val = 0;
//            l2Val = 0;
//            if (l1 != null) {
//                l1Val = l1.val;
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                l2Val = l2.val;
//                l2 = l2.next;
//            }
//            sum = l1Val + l2Val + carry;
//            carry = sum / 10;
//            sum = sum % 10;
//
//            ListNode currentNode = new ListNode(sum);
//            currentNode.next = null;
//
//            previousSumListNode.next = currentNode;
//            previousSumListNode = currentNode;
//
////            l1 = (l1 != null) ? l1.next : null;
////            l2 = (l2 != null) ? l2.next : null;
//
//
//        }
//        if (carry == 1) {
//            previousSumListNode.next = new ListNode(carry);
//        }
//        return sumListNode;
//    }
    public ListNode addTwoNumbersLeetcode(ListNode l1, ListNode l2) {
        int carry = 0, sum;
        ListNode head = null;
        ListNode prev = null;
        while (l1 != null || l2 != null) {
            sum = 0;
            sum += (l1 != null) ? l1.val : 0;
            sum += (l2 != null) ? l2.val : 0;
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode currNode = new ListNode(sum);
            if (prev != null) {
                prev.next = currNode;
            }
            if (head == null) {
                head = currNode;
            }
            prev = currNode;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        if (carry == 1) {
            prev.next = new ListNode(1);
        }


        return head;
    }

}

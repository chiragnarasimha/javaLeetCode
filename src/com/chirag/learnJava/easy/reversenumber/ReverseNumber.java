package com.chirag.learnJava.easy.reversenumber;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverse(123));
        System.out.println(reverseNumber.reverse(-123));
    }

    public int reverse(int x) {
        int reversedNumber = 0;
        while (x != 0) {
            reversedNumber = 10 * reversedNumber + (x % 10);
            x /= 10;
        }
        return reversedNumber;
    }
}
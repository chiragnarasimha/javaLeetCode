package com.chirag.learnJava.easy.reversenumber;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverse(123));
        System.out.println(reverseNumber.reverse(-123));
        System.out.println(reverseNumber.reverse(1534236469));
        System.out.println(1056389759 < Math.pow(2, 31) - 1);

    }

    public int reverse(int x) {
        int reversedNumber = 0;
        int pop;
        while (x != 0) {
            pop = x % 10;
            reversedNumber = 10 * reversedNumber + pop;
            if (reversedNumber > Integer.MAX_VALUE / 10 || (reversedNumber == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (reversedNumber < Integer.MIN_VALUE / 10 || (reversedNumber == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            x /= 10;
        }
        return reversedNumber;
    }
}

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
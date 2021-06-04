package com.chirag.learnJava.medium.Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>Longest Substring Without Repeating Characters</h1>
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 * </p>
 * <br>
 * <h1>Examples</h1>
 * <p>
 * Input: s = "abcabcbb" <br>
 * Output: 3 <br>
 * Explanation: The answer is "abc", with the length of 3. <br>
 * <p>
 * Input: s = "bbbbb" <br>
 * Output: 1 <br>
 * Explanation: The answer is "b", with the length of 1. <br>
 * <p>
 * Input: s = "pwwkew" <br>
 * Output: 3 <br>
 * Explanation: The answer is "wke", with the length of 3. <br>
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. <br>
 * <p>
 * Input: s = "" <br>
 * Output: 0 <br>
 * </p>
 *
 * <h1>Solution</h1>
 * Need to use a sliding window approach
 */

public class LongestSubstringWithoutRepeatingCharacters {
    //    public int lengthOfLongestSubstring(String s) {
    public int lengthOfLongestSubstringChirag(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }
        else {
            char[] charArray = s.toCharArray();
            int iCounter = 0, jCounter = 0, max = 0, slidingWindowLength = 0;
            boolean seenBefore;
            char character;
            Set<Character> sequence = new HashSet<Character>();
            for (iCounter = 0; iCounter < charArray.length; iCounter++) {
                character = charArray[iCounter];
                seenBefore = sequence.contains(character);
                if (!seenBefore) {
                    sequence.add(character);
                    slidingWindowLength = iCounter - jCounter + 1; // Since we are dealing with indices, we need to add 1 to get the actual value
                    max = Math.max(slidingWindowLength, max);
                }
                else {
                    character = charArray[jCounter];
                    sequence.remove(character);
                    jCounter++;
                    iCounter--;

                }
            }
            return max;
        }

    }

    public int lengthOfLongestSubstringLeetCode(String s) {
        if (s.length() == 0) {
            return 0;
        }
        else {
            char sChar;
            int sLength = s.length();
            int leftCounter = 0, rightCounter = 0, maxLength = 0;
            Set<Character> characterSet = new HashSet<Character>();
            while (rightCounter < sLength) {
                sChar = s.charAt(rightCounter);

                // Check if we have already seen these values before
                while (characterSet.contains(sChar)) {
                    characterSet.remove(s.charAt(leftCounter));
                    leftCounter++;
                }
                characterSet.add(sChar);
                maxLength = Math.max(maxLength, rightCounter - leftCounter + 1);
                rightCounter++;
            }
            return maxLength;
        }


    }
//        return 1;
}




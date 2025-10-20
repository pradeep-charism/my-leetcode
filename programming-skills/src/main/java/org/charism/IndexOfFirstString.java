package org.charism;

/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
*/


public class IndexOfFirstString {


    public static void main(String[] args) {
        IndexOfFirstString index = new IndexOfFirstString();
        System.out.println(index.strStr("", ""));
        System.out.println(index.strStr("sadbutsad", "sad"));
        System.out.println(index.strStr("leetcode", "leeto"));
    }

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.isEmpty() || needle.isEmpty() || needle.length() > Math.pow(10, 4)) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}

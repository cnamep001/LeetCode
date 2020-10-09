package com.m.palindrome_number.solution2;


import java.util.ArrayList;


public class Solution2 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        ArrayList<Character> arrayList = new ArrayList<>();
        while (x > 0) {
            arrayList.add((char) (x % 10));
            x /= 10;
        }
        for (int i = 0; i <= arrayList.size() / 2; i++) {
            if (arrayList.get(i) != arrayList.get(arrayList.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
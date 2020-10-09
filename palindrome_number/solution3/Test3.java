package com.m.palindrome_number.solution3;

public class Test3 {
    public static void main(String[] args) {

        int [] arr = new int[]{5, 1, 5, 5, 1, 5};

        Solution3 solution3 = new Solution3();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <arr.length ; i++) {
            stringBuilder.append(arr[i]);
        }

        System.out.println(solution3.isPalindrome(Integer.parseInt(stringBuilder.toString())));   //true

    }
}

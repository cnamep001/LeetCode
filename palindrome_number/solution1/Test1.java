package com.m.palindrome_number.solution1;


public class Test1 {
    public static void main(String[] args) {

        int [] arr = new int[]{1, 0, 1, 1, 0, 1};

        Solution1 solution1 = new Solution1();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <arr.length ; i++) {
            stringBuilder.append(arr[i]);
        }

        System.out.println(solution1.isPalindrome(Integer.parseInt(stringBuilder.toString())));   //true

    }
}

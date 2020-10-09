package com.m.palindrome_number.solution2;


public class Test2 {
    public static void main(String[] args) {

        int [] arr = new int[]{2, 1, 2, 2, 1, 2};

        Solution2 solution2 = new Solution2();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <arr.length ; i++) {
            stringBuilder.append(arr[i]);
        }

        System.out.println(solution2.isPalindrome(Integer.parseInt(stringBuilder.toString())));   //true

    }
}

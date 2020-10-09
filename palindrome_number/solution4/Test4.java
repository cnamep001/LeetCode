package com.m.palindrome_number.solution4;

public class Test4 {
    public static void main(String[] args) {

        int [] arr = new int[]{6, 2, 6, 6, 2, 6};

        Solution4 solution4 = new Solution4();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <arr.length ; i++) {
            stringBuilder.append(arr[i]);
        }

        System.out.println(solution4.isPalindrome(Integer.parseInt(stringBuilder.toString())));   //true

    }
}

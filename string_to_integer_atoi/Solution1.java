package com.m.string_to_integer_atoi;


public class Solution1 {

    public int myAtoi(String str) {
        int n = str.length();
        int i = 0;
        while(i < n && str.charAt(i) == ' ') {
            i++;
        }
        if(i == n || !((str.charAt(i) == '+') || (str.charAt(i) == '-') ||(str.charAt(i) >= '0' && str.charAt(i) <= '9'))) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if(str.charAt(i) == '-') {
            stringBuilder.append('-');
            i++;
        }else if(str.charAt(i) == '+') {
            i++;
        }
        if(i == n || !(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
            return 0;
        }
        while(i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            stringBuilder.append(str.charAt(i));
            i++;
        }
        try {
            return Integer.valueOf(stringBuilder.toString());
        }catch (Exception e) {
            if(stringBuilder.substring(0, 1).equals("-")) {
                return Integer.MIN_VALUE;
            }else {
                return Integer.MAX_VALUE;
            }
        }
    }

}

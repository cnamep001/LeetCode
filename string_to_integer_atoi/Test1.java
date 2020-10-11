package com.m.string_to_integer_atoi;


public class Test1 {
    public static void main(String[] args) {
        String [] strings = new String[]
                {"  42 "," -4 2", " 4 hello 2 world","hello 42","-91283472332"};
        Solution1 solution1 = new Solution1();
        int temp;
        for (int i = 0; i <strings.length ; i++) {
            System.out.print("字符串是:"+strings[i]+"\t");
            temp = solution1.myAtoi(strings[i]);
            System.out.println("结果是:"+temp);
        }
    }
}

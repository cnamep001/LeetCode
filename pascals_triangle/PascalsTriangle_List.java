package com.m.pascals_triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle_List {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
        int n = scanner.nextInt();
        for (List<Integer> list : generate(n)) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> generate(int numRows) {

        if (numRows <= 0) {
            throw new NumberFormatException(numRows + "<=0");
        }

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        lists.get(0).add(1);

        if (numRows == 0) {
            return lists;
        }

        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            List<Integer> preList = lists.get(i - 1);
            list.add(1);

            for (int j = 1; j < i; j++) {
                int result = preList.get(j - 1) + preList.get(j);
                list.add(result);
            }

            list.add(1);
            lists.add(list);

        }
        return lists;
    }

}




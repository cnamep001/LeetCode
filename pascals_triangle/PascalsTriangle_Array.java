package com.m.pascals_triangle;


import java.util.Scanner;

public class PascalsTriangle_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请属于一个大于0的整数:");
        int n = scanner.nextInt();
        if (n <= 0) {
            throw new NumberFormatException(n + "<=0");
        }
        test(n);
    }

    public static void test(int n) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            a[i][0] = 1;
            a[i][i] = 1;
        }
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }

        }

        //4、打印结果
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.printf("\n");
        }
    }

}




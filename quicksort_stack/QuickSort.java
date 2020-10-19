package com.m.quicksort_stack;

import java.util.Arrays;
import java.util.Stack;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, -3, 4, 5, 6};
        quickSort1(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort1(int[] arr, int left, int right) {
        Stack<Integer> stack = new Stack<>();
        if(left<right){
            stack.add(left);
            stack.add(right);
            while (!stack.isEmpty()){
                int ri = stack.pop();
                int le = stack.pop();
                int k =quickSort(arr,le,ri);
                if(le<k-1){
                    stack.push(le);
                    stack.push(k-1);
                }
                if(ri > k+1){
                    stack.push(k+1);
                    stack.push(ri);
                }
            }
        }
    }

    public static int quickSort(int[] arr, int left, int right) {
        dealPivot(arr, left, right);

        int pivot = right-1;
        int i = left;
        int j = right-1;

        while (true){
            while (i<right && arr[++i]>arr[pivot]){}
            while (j>left && arr[--j]<arr[pivot]){}

            if (i<j){
                swap(arr,i,j);
            }else {
                break;
            }
        }

        if(i<right){
            swap(arr,i,right-1);
        }
//            quickSort(arr,left,i-1);
//            quickSort(arr,i+1,right);

        return i;
    }

    public static void dealPivot(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (arr[left] < arr[right]) {
            swap(arr, left, right);
        }
        if (arr[left] < arr[mid]) {
            swap(arr, left, mid);
        }
        if (arr[mid] < arr[right]) {
            swap(arr, mid, right);
        }
        swap(arr, mid, right - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

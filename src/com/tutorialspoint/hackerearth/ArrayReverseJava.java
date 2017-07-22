package com.tutorialspoint.hackerearth;

import java.util.Scanner;

public class ArrayReverseJava {

    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] anArray = new int[n];
        for (int i = 0; i < n; i++) {
            int j = scanner.nextInt();
            anArray[i] = j;
        }
        reverseArray(anArray,0,n-1);
        for (int anAnArray : anArray) {
            System.out.println(anAnArray);
        }
    }
}

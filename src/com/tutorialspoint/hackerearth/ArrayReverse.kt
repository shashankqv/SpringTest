package com.tutorialspoint.hackerearth

import java.util.Scanner

object ArrayReverse {

    internal fun reverseArray(arr: IntArray, start: Int, end: Int) {
        val temp: Int
        if (start >= end)
            return
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        reverseArray(arr, start + 1, end - 1)
    }

    @JvmStatic fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val n = scanner.nextInt()
        val anArray = IntArray(n)
        for (i in 0..n - 1) {
            val j = scanner.nextInt()
            anArray[i] = j
        }
        reverseArray(anArray, 0, n - 1)
        for (anAnArray in anArray) {
            println(anAnArray)
        }
    }
}
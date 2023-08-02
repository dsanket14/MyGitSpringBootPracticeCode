package com.dsa.sortingandserarching;
//find a pair with a given difference
/*
L = 6, N = 78
arr[] = {5, 20, 3, 2, 5, 80}
Output: 1
Explanation: (2, 80) have difference of 78.
*/
public class PGM4 {

    public static void main(String[] args) {
        int n = 23;
        int arr[] = {1, 9,4,5,6,3,2,8,7,10};
        getArray(arr,arr.length,n);
    }

    private static void getArray(int[] arr, int length,int n) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= length && j != i; j++) {
                for (int k = 0; k <= length && k != j; k++) {
                    for (int l = 0; l <= length && l != k; l++) {
                        if (n == arr[i] + arr[j] + arr[k] + arr[l]) {
                            System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " " + arr[l]);
                        }
                    }
                }
            }
        }
    }
}

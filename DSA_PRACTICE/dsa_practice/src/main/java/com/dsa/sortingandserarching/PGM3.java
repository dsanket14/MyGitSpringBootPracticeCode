package com.dsa.sortingandserarching;
//find a pair with a given difference
/*
L = 6, N = 78
arr[] = {5, 20, 3, 2, 5, 80}
Output: 1
Explanation: (2, 80) have difference of 78.
*/
public class PGM3 {

    public static void main(String[] args) {
        int n = 78;
        int arr[] = {5, 20, 3, 2, 5, 80};
        getArray(arr,arr.length,n);
    }

    private static void getArray(int[] arr, int length,int n) {
        for(int i=0;i<length;i++){
            for(int j=0;j<=length && j!=i;j++)
                if(n==arr[i]-arr[j]){
                    System.out.println(arr[j]+" "+arr[i]);
                }
            }
        }
}

package com.dsa.array;

public class PGM1 {
    public static void main(String[] args) {
        int arr[] = {1, 9,4,5,6,3,2,8,7,10};
        reverseArray(arr,arr.length);
    }

    private static void reverseArray(int[] arr, int length) {
        for(int i=length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

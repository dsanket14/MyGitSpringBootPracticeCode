package com.dsa.sortingandserarching;
//Find a Fixed Point (Value equal to index) in a given array
/*input:
        n=9, x=5
        arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
        Output:  2 5
        Explanation: First occurrence of 5 is at index 2 and last
        occurrence of 5 is at index 5.*/
public class PGM2 {

    public static void main(String[] args) {
        int []arr={ 1, 3, 5, 5, 5, 6, 67, 123, 125 };
        System.out.println(getArray(arr,arr.length));
    }

    private static int getArray(int[] arr, int length) {
        for(int i=0;i<length;i++){
            if(arr[i]==i){
                return i;
            }
            }
        return -1;
        }
}

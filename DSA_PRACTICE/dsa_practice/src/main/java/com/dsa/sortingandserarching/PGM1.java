package com.dsa.sortingandserarching;
//Find first and last positions of an element in a sorted array
/*input:
        n=9, x=5
        arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
        Output:  2 5
        Explanation: First occurrence of 5 is at index 2 and last
        occurrence of 5 is at index 5.*/
public class PGM1 {

    public static void main(String[] args) {
        int []arr={ 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int x=5;
        getArray(arr,arr.length,x);
    }

    private static void getArray(int[] arr, int length,int x) {
        int first=-1,last=-1;
        for(int i=0;i<length;i++){
            if(x!=arr[i]){
                continue;
            }else {
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }

        if(first==-1)
            System.out.println(x+" Not Found");
        else
            System.out.println(first+" "+last);
    }
}

package com.dsa.array;

public class PGM2 {
    public static void main(String[] args) {
        int arr[] = {1, 9,4,5,6,3,2,8,7,10};
        maxMin(arr,arr.length);
    }

    private static void maxMin(int[] arr, int length) {
        int max=arr[0];
        int min=arr[0];
        for(int i=length-1;i>=0;i--){
            if(max<=arr[i]){
                max=arr[i];
            }
            if(min>=arr[i]){
                min=arr[i];
            }
        }
        System.out.println("MAX: "+max+" & MIN: "+min);
    }
}

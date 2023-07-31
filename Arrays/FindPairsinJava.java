package com.Arrays;

public class FindPairsinJava {
    //pairs in array
    public static void pairsinarray(int[] arr, int n) {
        n = arr.length;
        for (int i = 0; i < n; i++) {
            int current = arr[i];//1,2,3,4,5
            //for pairs
            for (int j = i; j < n; j++) {
                System.out.println("(" + current + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int []nums={1,2,3,4};
        int n = nums.length;
        //Printing Array
        System.out.println("The Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        pairsinarray(nums,n);
    }
}

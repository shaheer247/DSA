package com.Arrays;

public class Removeduplicates {
    //Remove duplicates
    public static int removeduplicates(int[] arr, int n) {
        n = arr.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int [] nums={1,1,2,2,3,3,4,4,5,5};
        int n = nums.length;
        //Printing Array
        System.out.println("The Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Array after removing duplicates:");
        int result=removeduplicates(nums,n);
        for(int i=0;i<result;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}

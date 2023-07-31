package com.Arrays;
public class LinearSearch {
    public static int linearsearch(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
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
       int result= linearsearch(nums,n,3);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index of Array:"+result);
        }
    }
}

package com.Arrays;
public class Seclargestele{
    //sec largest
    public static void seclargest(int[] arr, int n) {
        n = arr.length;
        if (n < 2) {
            System.out.println("invalid array");
        }
        int large = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > large)
            {
                seclarge = large;
                large = arr[i];

            } else if (arr[i] > seclarge && arr[i] != large) {
                seclarge = arr[i];
            }
        }
        System.out.println("The second largest element in array:" + seclarge);
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
        seclargest(nums,n);
    }

}

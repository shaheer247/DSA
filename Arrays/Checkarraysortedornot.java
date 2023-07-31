package com.Arrays;
public class Checkarraysortedornot {
    //Array sorted or not
    public static boolean sortedornot(int[] arr, int n) {
        n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};//sorted or not
        int n = nums.length;
        //Printing Array
        System.out.println("The Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println(sortedornot(nums, n));
    }
}

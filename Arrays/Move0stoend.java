package com.Arrays;
public class Move0stoend {
    //move 0's to end of array
    public static void move0end(int[] arr, int n) {
        n = arr.length;
        int temp = 0;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != 0) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int [] nums={0,2,3,4,0,5,7};
        int n = nums.length;
        //Printing Array
        System.out.println("The Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        move0end(nums,n);
        System.out.println(java.util.Arrays.toString(nums));
    }
}


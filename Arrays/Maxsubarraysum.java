package com.Arrays;

public class Maxsubarraysum {
    //max sub array sum
   public static void maxsubarraysum(int arr[], int n) {
       n = arr.length;
       int maxsum = Integer.MIN_VALUE;
       for (int i = 0; i < n; i++) {
           int start = i;
           for (int j = i; j < n; j++) {
               int end = j;
               int sum = 0;

               for (int k = start; k <= end; k++) {
                   sum += arr[k];
                   maxsum = Math.max(maxsum, sum);
               }
           }

       }
       System.out.println("Max subarray sum:" + maxsum);
   }
    //kadanes algorithm
        public static void kadanes(int arr[], int n) {
            n = arr.length;
            int maxsum = Integer.MIN_VALUE;
            int sum = 0;
            int start = 0;
            int ansStart = 0, ansEnd = 0;

            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum < 0) {
                    sum = 0;
                    start = i + 1;
                } else if (sum > maxsum) {
                    maxsum = sum;
                    ansStart = start;
                    ansEnd = i;
                }
            }
            //printing
            System.out.print("The subarray is: [");
            for (int i = ansStart; i <= ansEnd; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.print("]");
            System.out.println();
            System.out.println("Max subarray sum:" + maxsum);
        }

    public static void main(String[] args) {
        int [] nums={ -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = nums.length;
        //Printing Array
        System.out.println("The Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
      //  maxsubarraysum(nums,n);
        kadanes(nums,n);
    }
}

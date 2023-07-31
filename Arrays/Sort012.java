package com.Arrays;

public class Sort012 {

    //sort 0's,1's and 2's
    public static void sort012(int[]arr,int n) {
        //Dutch National flag algorithm.
        n= arr.length;
        int temp=0;
        int low=0;int mid=0;int high=n-1;
        for(int i=0;i<n;i++){
            if(arr[mid]==0){
                temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int []nums={2,0,2,1,1,0};
        int n= nums.length;
        sort012(nums,n);
        System.out.println(java.util.Arrays.toString(nums));
    }
}

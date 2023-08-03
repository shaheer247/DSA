package com.Arrays;

public class Peakelement {
    public static void peakele(int []arr,int n){
        n= arr.length;
        int start=0,end=n-1;
        int mid=start+(end-start)/2;
        while (start<end){
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
            mid=start+(end-start)/2;
        }
        System.out.println("The peak element in  mountain array at index:"+start);

    }
    public static void main(String[] args) {
        int[] nums={0,7,8,2,1};
        int n=nums.length;
        peakele(nums,n);

    }
}

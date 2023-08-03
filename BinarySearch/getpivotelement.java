package com.Arrays;

public class getpivotelement {
    public static void getpivotele(int []arr,int n){
        n= arr.length;
        int start=0,end=n-1,mid=start+(end-start)/2;
        while (start<end){
            if(arr[mid]>=arr[0]){
                start=mid+1;
            }
            else{
                end=mid;
            }
            mid=start+(end-start)/2;
        }
        System.out.println("The pivot element in array at index:"+start);
    }

    public static void main(String[] args) {
        int []nums={3,8,10,17,1};
        int n=nums.length;
        getpivotele(nums,n);
    }
}

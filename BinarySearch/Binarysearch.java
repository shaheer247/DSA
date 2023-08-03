package com.Arrays;

public class Binarysearch {
    public static int Binarysearch(int []arr,int n,int x){
        n= arr.length;
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        while (start<=end){
            if(arr[mid]==x){
                return mid;
            }
            else if(x>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[]nums={1,10,30,50,70,90,100};
        int n=nums.length;
        int result=Binarysearch(nums,n,1);
        if(result==-1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index:"+result);
        }
    }
}

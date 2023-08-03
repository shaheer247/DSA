package com.Arrays;

public class firstandlastoccurrenceele {
    public static int firstoccurele(int []arr,int n,int k){
        n= arr.length;
        int start=0,end=n-1;
        int mid=start+(end-start)/2;
        int ans=-1;
        while (start<=end){
            if(arr[mid]==k){
                ans=mid;
                end=mid-1;
                //end=mid-1;
            }
            else if(k>arr[mid]){
                start=mid+1;
            }
            else{
                end=end-1;
            }
            mid=start+(end-start)/2;

        }
        return ans;
    }
    public static int lastoccurele(int []arr,int n,int k){
        n= arr.length;
        int start=0,end=n-1;
        int mid=start+(end-start)/2;
        int ans=-1;
        while (start<=end){
            if(arr[mid]==k){
                ans=mid;
                start=mid+1;
            }
            else if(k>arr[mid]){
                start=mid+1;
            }
            else{
                end=end-1;
            }
            mid=start+(end-start)/2;

        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,3,3,3,3,4,5};
        int n=nums.length;
        int result=firstoccurele(nums,n,3);
        System.out.println("First occurrence of element at index:"+result);
        int result2=lastoccurele(nums,n,3);
        System.out.println("Last occurrence of element at index:"+result2);
    }
    }


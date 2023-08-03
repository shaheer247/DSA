package com.Arrays;

public class Searchinrotatedsortedarray {
    public static int Searchinrotatedsortedarray(int arr[],int n,int k){
      int pivot=getpivotele(arr,n);//Getting Pivot Element
      if(k>=arr[pivot] && k<=arr[n-1]){
          //Binary search on second line
          return Binarysearch(arr,n,pivot,n-1,k);
      }
      else{
          //Binary search on first line
          return Binarysearch(arr,n,0,pivot-1,k);
      }

    }
    public static int getpivotele(int []arr,int n){
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
        return start;
    }
    public static int Binarysearch(int []arr,int n,int s,int e,int x){
        n= arr.length;
        int start=s;
        int end=e;
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
        int []nums={7,9,1,2,3};
        int n=nums.length;
        int result=Searchinrotatedsortedarray(nums,n,2);
        System.out.println("The element found at index:"+result);
    }
}

package com.Arrays;

public class PaintersProblem {
    public static boolean ispossiblesol(int[] arr, int n, int m, int mid) {
        int painterCount = 1;
        int wallsum = 0;
        for (int i = 0; i < n; i++) {
            if (wallsum + arr[i] <= mid) {
                wallsum += arr[i];
            } else {
                painterCount++;
                if (painterCount > 2 || arr[i] > mid) {
                    return false;
                }
                wallsum = arr[i];
            }
        }
        return true;
        }

    public static int painterpartition(int []arr,int n,int m){
        n= arr.length;
        int start=0;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        int end=sum;
        int ans=-1;
        int mid=start+(end-start)/2;
        while (start<=end){
            if(ispossiblesol(arr,n,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] walls={5,5,5,5};
        int n= walls.length;
        int result=painterpartition(walls,n,2);
        System.out.println("The answer is:"+result);
    }
}

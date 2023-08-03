package com.Arrays;

import java.util.Arrays;

public class AggresiveCows {
    public static boolean ispossiblessol(int []stalls,int n,int m,int mid){
        int cowCount=1;
        int lastpos=stalls[0];
        for (int i=0;i<n;i++){
            if(stalls[i]-lastpos>=mid){
                cowCount++;
                lastpos=stalls[i];
            }
            if(cowCount>=m){
                return true;
            }
        }
        return false;
    }
    public static int Aggcows(int []stalls,int n,int m) {
        n= stalls.length;
        Arrays.sort(stalls);
        int start=0;
        int max=-1;
        for(int i=0;i<n;i++){
            max=Math.max(max,stalls[i]);
        }
        int  end=max;
        int ans=-1;
        int mid=start+(end-start)/2;
        while (start<=end){
            if(ispossiblessol(stalls,n,m,mid)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
            return ans;
    }

    public static void main(String[] args) {
        int [] Stalls={1,2,3,4,6};
        int n=Stalls.length;
        int result=Aggcows(Stalls,n,2);
        System.out.println("The maximum possible distance between cows is:"+result);
    }
}

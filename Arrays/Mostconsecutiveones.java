package com.Arrays;

public class Mostconsecutiveones {
    //most consecutive one,s
    public static void mostrepeated1(int []arr,int n){
        int count=1;
        int maxcount=1;
        for (int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxcount=Math.max(maxcount,count);
        }
        System.out.println("The most consecutive one's are:"+maxcount);
    }

    public static void main(String[] args) {
        int []nums={ 1, 1, 0, 1, 1, 1 ,1};
        int n= nums.length;
        mostrepeated1(nums,n);
    }
}

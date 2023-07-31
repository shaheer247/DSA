package com.Arrays;

public class Missingnumber {
    //missing number in array
    public  static int missingnum(int []arr,int n){
        n= arr.length;
        int sumN=(n+1)*(n+2)/2;
        for(int i=0;i<n;i++){
            sumN-=arr[i];
        }

        return sumN;
    }

    public static void main(String[] args) {
        int []nums={1,2,3,5};
        int n = nums.length;
        //Printing Array
        System.out.println("The Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int result= missingnum(nums,n);
        System.out.println("The missing number:"+result);
    }

}
